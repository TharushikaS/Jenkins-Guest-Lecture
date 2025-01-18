pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Clone the GitHub repository
                git 'https://github.com/TharushikaS/Jenkins-Guest-Lecture.git'
            }
        }
        stage('Run Python Script') {
            steps {
                // Run the Python script
                sh 'python3 hello_world.py'
            }
        }
    }
}
