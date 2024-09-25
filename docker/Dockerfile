# 使用官方的 JDK 8 运行时作为基础镜像
FROM openjdk:8-jdk

# 将 JAR 文件复制到容器中
COPY app.jar /app/app.jar

# 设置工作目录
WORKDIR /app

# 暴露应用程序使用的端口（如果需要）
EXPOSE 8888

# 运行 JAR 文件
ENTRYPOINT ["java", "-jar", "app.jar"]
