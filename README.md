# Project Web Automation Testing
Proyek web automation testing untuk menguji fitur login dan logout pada web https://www.saucedemo.com/. Proyek ini dikembangkan menggunakan bahasa java (pembuatan script test) dan Maven (build tools).


# Build With
Proyek pengujian otomatis melibatkan 6 buah dependency dan 1 buah plugin yang dibutuhkan.
## Dependency:
- webdrivermanager
- selenium-java
- cucumber-java
- cucumber-junit-platform-engine
- junit-platform-suite
- junit-jupiter
## Plugin:
- maven-surefire-plugin


# Getting Started


## Prerequisite
Sebelum menjalankan proyek ini, diperlukan persyaratan environment yang harus disiapkan pada device eksekusi proyek
1. JDK diatas versi 8
2. Maven


## Installation
Proses instalasi proyek ini pada local environment
1. Clone repository github ini
2. Buka IDE pemrograman. Misalnya Visual Studio Code
3. Buka folder hasil clone pada Visual Studio Code
4. Buka terminal
5. Ketikan perintah di bawah ini untuk eksekusi test script dan generate test report
```
mvn test
```
6. Buka hasil test report pada file yang berada pada path target/cucumber-reports/
- Timeline: `target/cucumber-reports/CucumberTimeline/index.html`
- HTML: `target/cucumber-reports/Cucumber.html`
- JSON: `target/cucumber-reports/Cucumber.json`
- XML: `target/cucumber-reports/Cucumber.xml`


## File Configuration
Proses konfigurasi project menggunakan build automation pada file pom.xml
1. Semua dependency yang dibutuhkan harus ditambahkan di dalam dependencies pada pom.xml. Berikut dependency yang dibutuhkan:
   
a. webdrivermanager, menyediakan utilitas untuk mengelola driver browser otomatis
   ```
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.8.0</version>
        </dependency>

   ```
 	b. selenium-java, menyediakan API untuk mengotomatisasi browser
   ```
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.20.0</version>
        </dependency>

   ```
c. cucumber-java, menyediakan integrasi Java untuk Cucumber
   ```    
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <scope>test</scope>
        </dependency>

   ```
d. cucumber-junit-platform-engine, menyediakan integrasi dengan JUnit Platform
   ```
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit-platform-engine</artifactId>
            <scope>test</scope>
        </dependency>

   ```
e. junit-platform-suite, menyediakan kerangka kerja untuk menjalankan pengujian dengan JUnit Platform
```
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-suite</artifactId>
            <scope>test</scope>
        </dependency>


```
f. junit-jupiter, menyediakan API dan implementasi untuk JUnit Jupiter, bagian dari JUnit 5
```
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
```

2. Tambahkan plugin yang dibutuhkan dalam plugins pada pom.xml. Berikut plugin yang dibutuhkan:


a. maven-surefire-plugin, plugin untuk menjalankan unit test menggunakan Surefire, biasanya digunakan untuk menjalankan test pada fase test dari siklus build Maven
```
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M8</version>
            </plugin>
```
