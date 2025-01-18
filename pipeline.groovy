pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/TharushikaS/Jenkins-Guest-Lecture.git'
            }
        }
        stage('Run Python Script') {
            steps {
                sh 'python3 hello_world.py'
            }
        }
    }
}
