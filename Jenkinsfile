pipeline {
    agent {
            docker {
                image 'maven:3.8.1-adoptopenjdk-11'
            }
        }

    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }

        stage('Verify') {
        steps {
                        sh 'mvn -B -DskipTests verify'
                    }
        }
    }
}