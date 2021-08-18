pipeline {
environment {
 JAVA_TOOL_OPTIONS = "-Duser.home=/home/jenkins"
}
    agent none

    stages {
        stage('Build') {
            agent {
                      docker {
                          image 'maven:3.8.1-adoptopenjdk-11'
                          args "-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2"
                      }
                  }
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }

        stage('Verify') {
             agent {
                      docker {
                          image 'maven:3.8.1-adoptopenjdk-11'
                          args "-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2"
                      }
                  }
            steps {
                 sh 'mvn -B  verify'
            }
        }

        stage('Pack') {
            agent any
            steps {
                sh 'docker build -t mvcstuff:${env.BUILD_ID} .'
            }
        }
    }
}