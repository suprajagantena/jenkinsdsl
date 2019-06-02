pipelineJob("$ENV/test-dsl"){

	definition{
		cpsScm{
			scm{
				git {
					remote {
						url('https://github.com/suprajagantena/jenkinsdsl.git')
						credentials('None')
					}
					branch('*/master')
				}
			}
			scriptPath("pipelines/test-dsl.groovy")
		}
	
	}

}