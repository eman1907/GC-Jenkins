pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }

        stage('Testes') {
            steps {
                sh 'mvn -B test -Dmaven.test.failure.ignore=true'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Cobertura') {
            steps {
                recordCoverage(tools: [[parser: 'JACOCO', pattern: 'target/site/jacoco/jacoco.xml']])
            }
        }
    }

    post {
        success  { echo 'Build e testes OK.' }
        unstable { echo 'Build OK, mas ha testes falhando.' }
        failure  { echo 'Build falhou.' }
    }
}