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
   ```xml
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.8.0</version>
        </dependency>
   ```
b. selenium-java, menyediakan API untuk mengotomatisasi browser
   ```xml
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.20.0</version>
        </dependency>

   ```
c. cucumber-java, menyediakan integrasi Java untuk Cucumber
   ```xml
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <scope>test</scope>
        </dependency>

   ```
d. cucumber-junit-platform-engine, menyediakan integrasi dengan JUnit Platform
   ```xml
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit-platform-engine</artifactId>
            <scope>test</scope>
        </dependency>

   ```
e. junit-platform-suite, menyediakan kerangka kerja untuk menjalankan pengujian dengan JUnit Platform
```xml
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-suite</artifactId>
            <scope>test</scope>
        </dependency>


```
f. junit-jupiter, menyediakan API dan implementasi untuk JUnit Jupiter, bagian dari JUnit 5
```xml
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
```

2. Tambahkan plugin yang dibutuhkan dalam plugins pada pom.xml. Berikut plugin yang dibutuhkan:


a. maven-surefire-plugin, plugin untuk menjalankan unit test menggunakan Surefire, biasanya digunakan untuk menjalankan test pada fase test dari siklus build Maven
```xml
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M8</version>
            </plugin>
```

# Structure Project Test

Tujuan project adalah proses pengujian automation web https://www.saucedemo.com/, sehingga kode program tersimpan dalam folder test. Berikut struktur proyek:

```
ppl-praktik-automatic-web-testing
  src
    test
      java/com/ppl
        hooks
        	Hooks.java
        pages
        	LoginPage.java
        	LogoutPage.java
        stepdefinitions
        	LoginStepDefinition.java
        	LogoutStepDefinition.java
        RunTest.java
      resources
        login.feature
        logout.feature
  target
    classes
    cucumber-reports
    	CucumberTimeline
    	Cucumber.html
    	Cucumber.json
    	Cucumber.xml
    generated-test-sources
    maven-status
    surefire-reports
    test-classes
README.md
pom.xml
```

- package test berisi class page factory untuk halaman login dan logout, setup driver selenium menggunakan chromedriver, test scenario, dan step definition
- package target berisi hasil generate test report dengan cucumber


# Workflow
Langkah pembuatan test script
1. Buat scenario pengujian pada file feature untuk masing-masing fungsionalitas login dan logout.
2. Buat step definition untuk step-step yang ada pada skenario di masing-masing file feature seperti given, when, then.
3. Import library-library yang dibutuhkan di tiap file step definition, yaitu: cucumber, assertTrue dari JUnit, dan WebDriver dari selenium.
4. Buat method untuk tiap step pada scenario dengan menggunakan notasi-notasi yang sesuai seperti @Given, @When, dsb.


# How to Run Execution Testing
Berikut proses untuk menjalankan eksekusi tes pada program melalui terminal
```
mvn test
```


# Software Under test
Pengujian dilakukan untuk web SWAG LABS yang dapat diakses pada https://www.saucedemo.com/
* Fitur Login
* Fitur Logout


# Test Case
Pembuatan test case meliputi test positif dan test negatif, yaitu


## Test Case Login
    1. Login dengan username dan password yang terdaftar pada sistem
    2. Login dengan username yang terdaftar dan password tidak sesuai
    3. Login dengan username yang tidak terdaftar
    4. Login dengan username tidak terisi dan password terisi
    5. Login dengan username terisi dan password tidak terisi
    6. Login dengan username dan password tidak terisi


## Test Case Logout
    1. Pengguna logout dari aplikasi


Note. Pendekatan pengujian menggunakan black box testing dengan metode Decision Table.
Satuan unit adalah fitur atau fungsi software


# Author
<span style="font-size:0.7em;">
Jovan Shelomo</br>
Mey Meizia Galtiady</br>
Rahma Alia Latifa</br>
Kelompok B6 PPL</br>
Jurusan Teknik Komputer dan Informatika</br>
Politeknik Negeri Bandung</br>
</span>


# Reference
Daftar resource yang dapat dipelajari
- <a href="https://www.saucedemo.com/">Sauce Demo Web</a>
- <a href="https://cucumber.io/docs/cucumber/">Cucumber documentation</a>
- <a href="https://www.selenium.dev/documentation/">Selenium documentation</a>
