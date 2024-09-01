package com.itheima.demoitias.service;

import com.itheima.demoitias.pojo.PageBean;

/**
 * 员工管理
 */
public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(Integer page, Integer pageSize);
}
//<?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
//    <modelVersion>4.0.0</modelVersion>
//    <groupId>com.itheima</groupId>
//    <artifactId>demoitias</artifactId>
//    <version>0.0.1-SNAPSHOT</version>
//    <name>demoitias</name>
//    <description>demoitias</description>
//    <properties>
//        <java.version>1.8</java.version>
//        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
//        <spring-boot.version>2.6.13</spring-boot.version>
//    </properties>
//    <dependencies>
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-web</artifactId>
//        </dependency>
//        <dependency>
//            <groupId>org.mybatis.spring.boot</groupId>
//            <artifactId>mybatis-spring-boot-starter</artifactId>
//            <version>2.2.2</version>
//        </dependency>
//
//        <dependency>
//            <groupId>com.mysql</groupId>
//            <artifactId>mysql-connector-j</artifactId>
//            <scope>runtime</scope>
//        </dependency>
//        <dependency>
//            <groupId>org.projectlombok</groupId>
//            <artifactId>lombok</artifactId>
//            <optional>true</optional>
//        </dependency>
//        <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-test</artifactId>
//            <scope>test</scope>
//        </dependency>
//    </dependencies>
//    <dependencyManagement>
//        <dependencies>
//            <dependency>
//                <groupId>org.springframework.boot</groupId>
//                <artifactId>spring-boot-dependencies</artifactId>
//<version>${spring-boot.version}</version>
//                <type>pom</type>
//                <scope>import</scope>
//            </dependency>
//        </dependencies>
//    </dependencyManagement>
//
//    <build>
//        <plugins>
//            <plugin>
//                <groupId>org.apache.maven.plugins</groupId>
//                <artifactId>maven-compiler-plugin</artifactId>
//                <version>3.8.1</version>
//                <configuration>
//                    <source>1.8</source>
//                    <target>1.8</target>
//                    <encoding>UTF-8</encoding>
//                </configuration>
//            </plugin>
//            <plugin>
//                <groupId>org.springframework.boot</groupId>
//                <artifactId>spring-boot-maven-plugin</artifactId>
//<version>${spring-boot.version}</version>
//                <configuration>
//                    <mainClass>com.itheima.demoitias.DemoitiasApplication</mainClass>
//                    <skip>true</skip>
//                </configuration>
//                <executions>
//                    <execution>
//                        <id>repackage</id>
//                        <goals>
//                            <goal>repackage</goal>
//                        </goals>
//                    </execution>
//                </executions>
//            </plugin>
//        </plugins>
//    </build>
//
//</project>
