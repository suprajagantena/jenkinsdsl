pipelineJob("create-spring-api-deploy"){
 
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
			scriptPath("pipelines/spring-api-deploy.groovy")
		}
	
	}

}
