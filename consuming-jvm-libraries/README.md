https://guides.gradle.org/consuming-jvm-libraries/

1. Add dependency
2. Run `gradlew build`, it will generate ready for distribution app inside          build/distributions
3. Application plugin gives us useful `installDist` task which installs             distribution inside build/install 
4. We can go then to build/install/\<app name\>/bin and run our app [in this        case `consuming-jvm-libraries <args>`]