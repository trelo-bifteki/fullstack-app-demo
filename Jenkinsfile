pipeline {
  agent any
  stages {

    stage('Check for vulnerabilities') {
      steps {
        dir('ui') {
          sh 'npm audit --parseable --production'
        }
      }
    }

    stage('build') {
      steps {
        sh './gradlew build'
      }
    }


    stage('download dependencies') {
      steps {
        sh './gradlew build'
      }
    }

    stage('Check unit:test') {
      steps {
        sh 'npm run test:unit -- --ci --coverage'
      }
      post {
        always {
          junit 'junit.xml'
          cobertura coberturaReportFile: 'coverage/cobertura-coverage.xml'
        }
      }
    }

    stage('Build') {
      steps {
        sh 'npm run build'
      }
    }

    stage('Check unit:e2e') {
      steps {
        sh 'npm run test:e2e -- --headless --url https://www.trelobifteki.com --config video=false'
      }
    }
  }
}
