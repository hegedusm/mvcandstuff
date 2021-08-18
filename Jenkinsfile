pipeline {
environment {
 JAVA_TOOL_OPTIONS = "-Duser.home=/home/jenkins"
}
    agent {
            docker {
                image 'maven:3.8.1-adoptopenjdk-11'
                args "-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2"
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
                 sh 'mvn -B  verify'
            }
        }

    }
}