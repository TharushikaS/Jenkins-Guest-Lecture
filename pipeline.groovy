pipeline {
    agent any
    stages {
        stage('Create Directory') {
            steps {
                script {
                    def dirPath = "/path/to/your/directory"
                    sh "mkdir -p ${dirPath}"
                }
            }
        }
    }
}
