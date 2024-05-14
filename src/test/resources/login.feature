Feature: Login Functionality

  Scenario: Login dengan username dan password yang terdaftar pada sistem
    Given Pengguna sudah berada pada halaman login
    When Pengguna memasukan username "standard_user"
    And Pengguna memasukan password "secret_sauce"
    And Pengguna menekan tombol login
    Then Aplikasi menampilkan halaman dashboard

  Scenario: Login dengan username yang terdaftar dan password tidak sesuai
    Given Pengguna sudah berada pada halaman login
    When Pengguna memasukan username "standard_user"
    And Pengguna memasukan password "wrong_password"
    And Pengguna menekan tombol login
    Then Aplikasi menampilkan pesan error "Epic sadface: Username and password do not match any user in this service"
  
  Scenario: Login dengan username yang tidak terdaftar
    Given Pengguna sudah berada pada halaman login
    When Pengguna memasukan username "customer"
    And Pengguna memasukan password "secret_sauce"
    And Pengguna menekan tombol login
    Then Aplikasi menampilkan pesan error "Username and password do not match any user in this service !"
  
  Scenario: Login dengan username tidak terisi dan password terisi
    Given Pengguna sudah berada pada halaman login
    When Pengguna memasukan password "secret_sauce"
    And Pengguna menekan tombol login
    Then Aplikasi menampilkan pesan error "You need Username !"