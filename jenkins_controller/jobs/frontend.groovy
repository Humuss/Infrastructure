pipelineJob('job-dsl-frontend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Humuss/Frontend.git')
          }
          branch('main')
        }
      }
      lightweight()
    }
  }
}