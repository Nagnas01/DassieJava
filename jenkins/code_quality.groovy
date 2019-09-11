@Library('jenkins-shared-groovy-library@feature/helm') _
code_quality {

    appconfig = "jenkins/build.yaml"
    reply_to = "darren@kineticskunk.com"
    recipients = "darren@kineticskunk.com"
    build_type = "maven"
    jenkins_node = "cicd-maven"
    source_repository_url = "http://bitbucket.vodacom.co.za/scm/vcdc/cicd-templates.git"
    source_repository_ref = "feature/deploy"
    ssl_verify = false
    git_credentials_id = "jenkins-bitbucket"
    do_generate_submodule_configurations = false
}
