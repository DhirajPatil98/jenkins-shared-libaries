def call(String project, String imageTag){
                  echo 'this is deploying'
                sh "docker run -d -p 8000:8000 ${project}:${imageTag} "
}
