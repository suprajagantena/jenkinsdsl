import groovy.json.JsonSlurperClassic 

@NonCPS
def jsonParse(def json) {
    new groovy.json.JsonSlurperClassic().parseText(json)
}

//def jsonParse(def json){
//	new groovy.json.JsonSlurper().parseText(json)
//}

node() {

 stage('prepare'){
	 
	 checkout([
		$class: 'GitSCM',
		branches: [[name: env.GIT_BRANCH]],
		extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: '.']],
		userRemoteConfigs: [[url: 'https://github.com/suprajagantena/jenkinsdsl.git']]
	 ])
 }
 
 def dslJobs = jsonParse(readFile('dsl.json'))
 
 for (item in dslJobs.items){
	 if(item.folders.contains(env.ENV.toUpperCase())){
		 stage(item.name){
			 step([
				 $class: 'ExecuteDslScripts',
				 targets: item.target,
				 lookupStrategy: 'SEED_JOB'
			 ])
		 }
	 }
 }

}