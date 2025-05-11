pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/MichalCzajkowski123/ZIO_Java_Zadanie.git'
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
        stage('Test Report') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
