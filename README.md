模仿乐税宝项目和前期做的第三方接口项目，搭建框架
这是一个 Maven 管理的项目，用到了 spring boot 、 mybatis 等技术

Maven
```
http://maven.apache.org
Apache Maven is a software project management and comprehension tool
```

controller层
```
编写接口api
1. config包
	- JerseyConfig.java
		配置 请求的根目录 // todo
	- JerseyResourceConfig.java
		配置controller包，被Jersey扫描到
2. xxxController.java 文件
	接口的编写
```

dao层
```
数据库的映射层
```

dto层
```
```

model层
```
根据业务调用 dao 层，从而达到对数据库的处理（增删改查）
```

util
```
工具类层
```

Application.java
```
主配置类，启动类
```

