#!/bin/sh

# for remote debug
export MAVEN_OPTS='-Xmx2048m -Xms2048m -Xmn1024m -Xss512k -XX:PermSize=256m -XX:MaxPermSize=256m -XX:+CMSClassUnloadingEnabled -XX:+CMSClassUnloadingEnabled -XX:+UseConcMarkSweepGC -Xdebug -Xrunjdwp:transport=dt_socket,address=1317,suspend=n,server=y -Dcashbus.env=DEV'

mvn clean
mvn dependency:copy-dependencies
mvn package

# run jetty server
#mvn jetty:run
mvn spring-boot:run

