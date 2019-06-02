pipelineJob('test-dsl'){

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
			scritPath("pipelines/test-dsl.groovy")
		}
	
	}

}