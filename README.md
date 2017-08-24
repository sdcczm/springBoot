# springBoot
构架springBoot项目，集成mybatis，包括简单构造restful,mybatis基础增删改查，简单的ajax测试页面

mybatis个性化设置
在application.properties配置文件中增加mybatis.config-locations
   =classpath:com/sdczzm/mybatis/mybatis-config.xml

0731 增加MyBatis查询结果自定义数据映射TypeHandler
               增加动态SQL功能，@SelectProvider(type = UserDynaSqlProvider.class,method = "selectUserByConditions")

0802 增加动态SQL查询

0823 MyBatis整合log4j2打印日志
              注意：springboot默认使用的是logback日志框架，所以要去除logback依赖包，增加log4j2依赖spring-boot-starter-log4j2
     
	增加SQL打印，网上看了很多方法都不行，主要是配置文件和自己的项目不匹配，结合自己的项目目录和框架类，在log4j2.xml中增加
	<logger name="com.sdczzm.mapper" level="DEBUG"  additivity="true"/> 
	程序的mapper包下所有的SQL都会打印出来

    mybatis-config.xml 配置文件中不加<setting name="logImpl" value="LOG4J2" />也能打印SQL
    
           输出日志到文件 ：增加appenders--RollingFile 
 
 待增加功能          
  分页
 事务         
