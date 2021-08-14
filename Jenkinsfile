pipeline {
    agent any

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