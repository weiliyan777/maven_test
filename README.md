# maven_test

##开发过程

#######环境依赖

eclipse 2019

###########目录结构描述
├── Readme.md                 

│   ├── .settings                

│   ├── src

│   	   ├── main

│   		   ├── java

│   	 		  ├── com

│   	 			  ├── slc

│   					   ├── test

│   					 	  ├──maven_test

│	  						 ├── Apach.java       //软件主体函数

│   	   ├── test

│   		   ├── java

│   	 		  ├── com

│   	 			  ├── slc

│   					   ├── test

│   					 	  ├──maven_test

│	  						 ├── AllTest1.java      //集成测试文件

│	  						 ├── ApachTest1.java   //单元测试文件

│	  						 ├── DowntoupTest.java  //自底向上测试文件

│	  						 ├── UptodownTest.java  //自顶向下测试文件

│   ├── target

│   	   ├──calsses

│   	   ├──maven-archiver

│   	   ├──maven-status/maven-compiler-plugin

│   	   ├──surefire-reports

│   	   ├──test-classes/com/slc/test/maven_test

│   	   ├──maven_test-0.0.1-SNAPSHOT.jar

│   ├── .classpath

│   ├── .gitattributes

│   ├── .project

│   └──  pom.xml



###

Apach.java 中存放着主体函数内容，里面有着各种

可以通过运行test/java/com/slc/test/maven_test的测试文件进行运行或测试

测试工具Jenkins和缺陷管理工具jira安装在ubuntu上，并已经建立好对应得账号

Jenkins：

登录网站：http://localhost:8080/loginError

账号：

密码：123456

测试步骤，打开Jenkins，创建任务，填写GitHub上项目对应的链接，完成创建，然后选择立即构建进行项目测试，等待测试结果，查看测试结果。

jira：

登录网站：http://localhost:8080

账号：

密码：123456

缺陷管理选择使用jira，填写缺陷信息。

对应的GitHub：

网站：https://github.com/

账号：

密码：123456

