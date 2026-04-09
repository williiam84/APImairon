# Dockerfile para Spring Boot com Maven e JDK 17
FROM eclipse-temurin:17-jdk-alpine

# Define diretório de trabalho
WORKDIR /app

# Instala Maven e dependências básicas do Alpine
RUN apk add --no-cache maven bash git

# Copia todos os arquivos do projeto para o container
COPY . .

# Build do projeto
RUN mvn clean install -DskipTests

# Expõe a porta que o Spring Boot vai rodar
EXPOSE 8080

# Comando para iniciar a aplicação
CMD ["java", "-jar", "target/avaliacoes-0.0.1-SNAPSHOT.jar"]