FROM livingobjects/jre8
VOLUME /tmp
ADD ace-auth.jar app.jar
EXPOSE 8080   #暴露的端口号
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
