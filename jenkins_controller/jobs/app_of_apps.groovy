pipelineJob('job-dsl-app_of_apps') {
    parameters {
            stringParam('backendDockerTag')
            stringParam('frontendDockerTag')
        }
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Humuss/App_of_apps.git')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}