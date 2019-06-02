piplineJob('test-dsl'){

	definition{
		cpsScm{
			scm{
				git {
					remote {
						url('https://github.com/suprajagantena/jenkinsdsl.git')
					}
					branch('*/master')
				}
			}
			scritpath("pipelines/test-dsl.groovy")
		}
	
	}

}