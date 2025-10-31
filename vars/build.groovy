def call(String projectName, String image){

  sh "docker build -t ${projectName}:${imageTag} ."
}
