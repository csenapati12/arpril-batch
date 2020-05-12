node(){
 asd
         stage("clone code"){
             echo "clone" 
             checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/csenapati12/maven-samples.git']]]
         }
          stage("Maven builde"){
             echo "Maven build" 
             sh label: '', script: 'mvn package'
         }
          stage("Sonar analysis"){
             echo "Sonar analysis" 
         }
          stage("Upload to nexus"){
             echo "Upload to nexus" 
         }
          stage("create docker image"){
             echo "create docker image" 
         }
    
}
