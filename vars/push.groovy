def call(String project, String imageTag)
{
echo 'pushing code to docker hub'
                withCredentials([usernamePassword(credentialsId:'dockerHubCreds', passwordVariable:"dockerHubPass", usernameVariable:"dockerHubUser")]){
                sh "docker tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${env.dockerHubUser}/${project}:${imageTag}"
                }

}
