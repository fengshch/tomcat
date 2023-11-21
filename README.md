# Tomcat source code run in idea

### 1. download tomcat
```
git  clone git@github.com:fengshch/tomcat.git
```
### 2. select branch
```
cd tomcat
git tag
git checkout 10.1.16
git checkout -b 10.1.16

or
git checkout -b 10.1.x origin/10.1.x

or
git checkout 10.1.x

or
git checkout --track origin/dev
```
### 3. create idea project and build tomcat
```
ant ide-intellij

ant deploy
```
then get output directory:
```
output
    |--build
        |--bin
        |--conf
        |--lib
        |--logs
        |--temp
        |--webapps
        |--webapps-javaee
        |--work
```
### 4. create directory catalina in tomcat source root, then copy output/build/* except bin to catalina
```
mkdir catalina
copy ../output/build/* . -R
rm -rf bin
```
### 5.config appBase
Modify tomcat/catalina/conf/server.xml
```
<Host name="localhost" appBase="/home/bill/jworkspaces/tomcat/catalina/webapps" unpackWARs="true" autoDeploy="true">
```
### 6.add lib to project dependencies
add tomcat/catalina/lib to project structure/project settings/Modules/Dependencies

### 7. Edit Configurations -> add a Application
```
Main Class:
    org.apache.catalina.startup.Bootstrap

VM Options:
    -Djdk.tls.ephemeralDHKeySize=2048
    -Djava.protocol.handler.pkgs=org.apache.catalina.webresources
    -Dignore.endorsed.dirs=
    -Dcatalina.base=/home/bill/jworkspaces/tomcat/catalina
    -Dcatalina.home=/home/bill/jworkspaces/tomcat/catalina
    -Djava.io.tmpdir=/home/bill/jworkspaces/tomcat/catalina/temp

Program argument:
    start
```
