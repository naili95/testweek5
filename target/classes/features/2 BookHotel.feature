Feature: Customer Pesan Hotel
  Scenario: Testing Pesan Hotel Customer
		When Customer masuk url hotel
    Then Berhasil masuk menu hotel
    Then Customer memilih hotel
    And Customer mengisi form bayar
    Then Customer mendapatkan invoice