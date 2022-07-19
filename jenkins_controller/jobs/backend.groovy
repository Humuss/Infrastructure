pipelineJob('job-dsl-backend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Humuss/Backend.git')
          }
          branch('main')
        }
      }
      lightweight()
    }
  }
}