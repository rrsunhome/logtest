# 日志框架搭建-demo


> [配置文件](https://github.com/m15201373116/logtest/blob/master/src/main/resources/log4j2.xml)

### jar包
```xml
  <!-- slf4j核心包-->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.25</version>
        </dependency>

        <!--slf4j对应log4j2的中间件,即桥接，告诉slf4j使用log4j2-->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j-impl</artifactId>
            <version>2.10.0</version>
        </dependency>

        <!--log4j2核心包-->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.10.0</version>
        </dependency>

        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.10.0</version>
        </dependency>
```


## 参考文档

[https://blog.csdn.net/guoquanyou/article/details/5689652](https://blog.csdn.net/guoquanyou/article/details/5689652)

[https://www.cnblogs.com/yeyang/p/7944899.html](https://www.cnblogs.com/yeyang/p/7944899.html)







