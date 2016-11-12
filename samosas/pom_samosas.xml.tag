<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

  <modelVersion>4.0.0</modelVersion>

  <artifactId>samosas</artifactId>
  <groupId>com.snacks.namkeen</groupId>
  <version>4.1.0</version>
  <name>samosas</name>
  <url>http://maven.apache.org</url>
  <packaging>pom</packaging>

  <modules>
        <module>pakodas</module>
  </modules>

  <scm>
    <url>https://github.com/farhan-mosaixsoft/Adraq-Chai/</url>
    <connection>scm:git:https://github.com/farhan-mosaixsoft/Adraq-Chai.git</connection>
    <developerConnection>scm:git:git@github.com:farhan-mosaixsoft/Adraq-Chai.git</developerConnection>
    <tag>v4.1.0</tag>
  </scm>

  <inceptionYear>2016</inceptionYear>
  <organization>
    <name>MosaixSoft, Inc.</name>
    <url>http://www.mosaixsoft.com/</url>
  </organization>

  <dependencyManagement>
    <dependencies>
      <!-- Third Party dependencies -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.eclipse.jdt</groupId>
        <artifactId>org.eclipse.jdt.annotation</artifactId>
        <version>2.0.0</version>
        <optional>true</optional>
      </dependency>
      <!-- Test dependencies -->
    </dependencies>
  </dependencyManagement>

    <distributionManagement>
    <repository>
      <uniqueVersion>false</uniqueVersion>
      <id>repo1</id>
      <name>Corporate Repository</name>
      <url>file://10.50.50.73/repo1</url>
      <layout>default</layout>
    </repository>
    </distributionManagement>  

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-release-plugin</artifactId>
                <version>2.5.3</version>
                <configuration>
                    <useReleaseProfile>false</useReleaseProfile>
                    <goals>deploy</goals>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.apache.maven.scm</groupId>
                        <artifactId>maven-scm-provider-gitexe</artifactId>
                        <version>1.9.5</version>
                    </dependency>
                </dependencies>
            </plugin>
       </plugins>
    </build>

   <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>


</project>
