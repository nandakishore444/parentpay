#parentpay
#Installation and project run instructions 
1) Install Java and set environment path
#Ref https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/ 

2) Download maven and set the environment path 

#Ref https://www.mkyong.com/maven/how-to-install-maven-in-windows/

3) Install mysql and mysql workbench
Note: set password as "MyAdmin123" to avoid unnecessary issues. 

4) Import database backup
	a) back up path location in drive Project -> App Development -> DB Files -> MySQLDump -> SQL YOG -> mysql backup dumps
	b) after downloading it launch mysql workbench
	c) use import database feature in mysql workbench
	d) verify whether database "schooldb" and corresponding tables with columns and rows are displayed in database. 

5) Download Eclipse and Tomcat
6) Download and Project running instruction
	A) 
		1) Download Project latest version from drive Project -> App Development -> code base -> latest version 
		2) extract file
		3) launch eclipse
		4) File -> import -> existinsg maven project -> 'select the extracted project folder' -> Next   
		   #Ref https://stackoverflow.com/questions/2061094/importing-maven-project-into-eclipse
		5) Set jdk build path in eclipse
		   #Ref https://stackoverflow.com/questions/13635563/setting-jdk-in-eclipse (path needs to be set to install java jdk folder)
		6) right click on project and select maven -> clean
		7) right click on project and select maven -> install
		8) Add Server tomcat in Eclipse
		9) Add the project to tomcat 
		10) Start tomcat and check whether tomcat is started successfully by using link http://localhost:8080/
		11) If launch is successful then use this link http://localhost:8080/MySchool  (MySchool is war file name) or Right click on project run as -> run on server -> follow the dialogue screen It will open the home page. 
	
	B)
		1) Open the downloaded project and copy the war file from path SchoolMgmt-> Target -> MySchool.war.
		2) Navigate to Tomcat directory on local .... \Apache Tomcat\apache-tomcat-9.0.0.M21\webapps folder. version depends on the your download. 
		3) Now paste the war file in webapps folder and start the tomcat [you can do it from eclipse or from command line]. Check the successful start of tomcat using http://localhost:8080/ 
		4) After successful launch of tomcat, use the url http://localhost:8080/MySchool to launch the project. 
		
	
	
    
		
	
	
	
