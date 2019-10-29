# spring-boot-web-jdk11-sample
* sample spring boot web application using gradle
* It is able to create a minimal self contained image using a third party plugin "https://github.com/beryx/badass-runtime-plugin"

## Use below gradle command to create spring boot fat jar.<pre>gradlew build</pre> 
The distributable jar is generated at build/distributions/spring-boot-web-jdk11-sample-boot.tar
## Use below gradle command to create minimal self contained image. <pre>gradlew runtimeZip</pre>
The self contained image is generated at build/image.zip
## Use image/bin/spring-boot-web-jdk11-sample to start the application.


##### References
* [5 Gradle plugins for working with modular Java projects](http://andresalmiray.com/5-gradle-plugins-for-working-with-modular-java-projects/)
* [Custom Spring PetClinic with self contained JRE](https://github.com/beryx-gist/badass-runtime-spring-petclinic)
