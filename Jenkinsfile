pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Maxiiminus2/calc.git'
                sh './mvnw clean compile'
            }
        }
    }
}
