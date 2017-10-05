FROM jenkins/jenkins:lts
MAINTAINER Slava Pavlovich
ENV JAVA_OPTS -Djava.awt.headless=true -Djenkins.install.runSetupWizard=false
ENV JENKINS_OPTS --argumentsRealm.passwd.admin=admin --argumentsRealm.roles.user=admin --argumentsRealm.roles.admin=admin

# install plugins
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt