# Use uma imagem base do OpenJDK
FROM openjdk:21-jdk-slim

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo JAR gerado pela aplicação (ajuste o nome conforme necessário)
COPY target/pitila-0.0.1-SNAPSHOT.jar /app/pitila.jar

# Exponha a porta que o Spring Boot irá rodar (geralmente 8080 ou conforme seu `application.properties`)
EXPOSE 8080

# Comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "/app/pitila.jar"]
