# spring-boot-jsp

#### 介绍
springboot jsp 例子

#### 软件架构
springboot、jsp


#### 整合jsp步骤
- pom.xml文件中将 `<packaging>war</packaging>` 打包方式变为war
- 将内置的嵌入式servlet容器tomcat依赖的scope为provided
  ```
    <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
  ```
- 编写一个SpringBootServletInitializer子类,并调用configure方法,将主类传入
  ```
    public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootJspApplication.class);
    }

    }
  ```
- 配置外部的tomcat,运行

注意：
1. springboot内置的嵌入式servlet容器如tomcat不支持jsp,所以要使用jsp需使用外部的tomcat容器
2. 不要使用启动springboot主程序来运行，需启动外部tomcat