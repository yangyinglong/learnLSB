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
注解：
	@Path("/authorize")
	@CrossOrigin
	@Path("/login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
@Path("")
@PathParam和@QueryParam区别

```

dao层
```
数据库的映射层
1. entity
	把数据库中每个表的映射成一个个单独的类
2. mapper 
	根据 entity 中映射成的类，实现增删改查方法
注解：
	@Entity
	@Id
	@GeneratedValue
	@Column
	@Mapper
	@Select
	@Results
	@Insert
	@Update
	@Delete
	@Param
```

dto层
```
定义逻辑实现部分所需要的类，用来临时保存数据
注解：
	@Component
```

model层
```
根据业务调用 dao 层，从而达到对数据库的处理（增删改查）
定义一个接口，然后通过类来实现接口，在实现中达到对数据库的操作
	-- IShowService
		定义方法，在 controller 层调用该接口中的方法，然后实现对数据库的操作
	-- ShowModelImp
		实现接口，调用 dao 层中 XXXMapper 中的方法
注解：
	@Service
	@Autowired
```

util
```
工具类层
```

Application.java
```
主配置类，启动类，继承 SpringBootServletInitializer 类，重写了 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) 方法
注解：
	@SpringBootApplication

```

