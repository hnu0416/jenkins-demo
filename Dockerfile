FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.8.0
MAINTAINER hnu0416@qq.com
COPY target/app.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
