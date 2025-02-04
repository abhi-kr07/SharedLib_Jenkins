def call(String ProjectName) {
    sh "trivy image ${ProjectName}"
}
