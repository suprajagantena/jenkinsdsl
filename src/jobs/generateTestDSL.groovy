piplineJob('test-dsl'){

	definition{
		cpsScm{
			scm{
				git {
					remote {
						url('')
					}
					branch('*/master')
				}
			}
			scritpath("pipelines/test-dsl.groovy")
		}
	
	}

}