# Imagem base do JDK 21
FROM openjdk:21-jdk-slim

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar o arquivo JAR gerado para dentro do contêiner
COPY target/pitila-0.0.1-SNAPSHOT.jar /app/pitila.jar

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/pitila.jar"]
