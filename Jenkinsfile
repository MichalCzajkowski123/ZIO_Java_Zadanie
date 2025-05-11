pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/twoje-konto/calculator-java-app.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
