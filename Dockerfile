FROM eclipse-temurin:17
COPY target/myjenkins.jar jenkin.jar
CMD ["java", "-jar", "jenkin.ja2r"]