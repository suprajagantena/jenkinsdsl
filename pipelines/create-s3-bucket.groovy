@Library('sharedlibs') _

import awscli

node() {
    
    def aws = new awscli(this)
    aws.creates3bucket(env.BUCKET_NAME)

}
