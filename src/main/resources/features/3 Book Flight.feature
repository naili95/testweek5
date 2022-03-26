Feature: Customer Pesan Pesawat
  Scenario: Testing Pesan Pesawat Customer
		When Customer masuk url pesawat
    Then Berhasil masuk menu pesawat
    Then Customer memilih rute
		And Customer mengisi form datadiri
		Then Customer mendapatkan invoice