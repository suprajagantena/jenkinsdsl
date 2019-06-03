pipelineJob("$ENV/create-s3-bucket"){

    parameters {
        stringParam('BUCKET_NAME','','emter bucket name')
    }
    
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
			scriptPath("pipelines/create-s3-bucket.groovy")
		}
	
	}

}