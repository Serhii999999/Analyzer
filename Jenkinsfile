pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Serhii999999/Analyzer.git'
            }
        }
        stage('Build and Test') {
            steps {
                sh 'mvn test -Dtest=CheckLogTests#checkAllValuesAreCorrect'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}