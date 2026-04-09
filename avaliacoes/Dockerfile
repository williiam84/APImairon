# Usa imagem oficial Java 17
FROM eclipse-temurin:17-jdk-alpine

# Cria pasta do app
WORKDIR /app

# Copia todos os arquivos
COPY . .

# Instala Maven
RUN apk add --no-cache maven

# Builda o projeto
RUN mvn clean install

# Expõe a porta que o Spring Boot vai rodar
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "target/*.jar"]