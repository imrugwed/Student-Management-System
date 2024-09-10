FROM openjdk:17

WORKDIR /usr/src/

COPY target/student-management-0.0.1-SNAPSHOT.jar /usr/src/Student-Management-System/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Student-Management-System-0.0.1-SNAPSHOT.jar"]
