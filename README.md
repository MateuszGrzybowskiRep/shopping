## Opis
Ten projekt to internetowa aplikacja do zakupów online, opracowana w języku JAVA, z wykorzystaniem języka Java jako interfejsu użytkownika.

Głównym celem „ZAKUPÓW ONLINE” jest usprawic uslugi Klientów i Sprzedawców. Zachowuje szczegóły płatności klientów, przyjęcia produktów, dodawania nowych klientów, produktów, a także aktualizuje, usuwa je. Przechowuje również szczegóły faktur wygenerowanych przez klienta i dokonanych przez niego płatności wraz ze wszystkimi szczegółami płatności, takimi jak karta kredytowa.

PRZEGLĄD ZAKUPÓW ONLINE:

Centralną koncepcją aplikacji jest umożliwienie klientowi wirtualnego robienia zakupów przez Internet i umożliwienie klientom kupowania w sklepie dowolnych towarów i artykułów. Informacje dotyczące produktów są przechowywane na ???h2 po stronie serwera (sklepu). Serwer przetwarza klientów, a towary są wysyłane na podany przez nich adres.

Aplikacja została zaprojektowana w dwóch modułach, najpierw jest przeznaczona dla klientów, którzy chcą kupić artykuły. Drugi jest przeznaczony dla właścicieli sklepów, którzy utrzymują i aktualizują informacje dotyczące artykułów i klientów.

Użytkownikiem końcowym tego produktu jest dom towarowy, w którym aplikacja jest hostowana w Internecie, a administrator utrzymuje bazę danych. Aplikacja, która jest wdrażana w bazie danych klientów, szczegóły pozycji są przenoszone z bazy danych do podglądu klienta na podstawie wyboru poprzez menu, a baza danych wszystkich produktów jest aktualizowana na koniec każdej transakcji.

Wprowadzanie danych do aplikacji odbywa się poprzez różne ekrany przeznaczone dla różnych poziomów użytkowników. Gdy upoważniony personel wprowadzi odpowiednie dane do systemu, może zostać wygenerowanych kilka raportów zgodnie z zabezpieczeniami.

## jeden

# Przykład sklepu Java
Typowe ćwiczenie w Javie, które pokazuje, jak zbudować prosty projekt obiektowy i przećwiczyć umiejętności, takie jak: jak wybrać odpowiedni typ danych do projektu, jak napisać czysty i spójny kod itp.

Ten projekt zostanie napisany przy użyciu podejścia Java 8, a nie Java 7 i starszych. Gdy Java 9 zostanie wydana, być może w razie potrzeby zostaną wprowadzone niektóre z nowych funkcji Java.

Używam również podejścia TDD do ukończenia tego projektu, ponieważ znalazłem ten naprawdę wygodny sposób tworzenia projektów w Javie. Dodatkowo staram się używać Travis CI do budowania i testowania projektów razem z Codacy, aby mój kod był czysty i spójny.
## Plan akcji:
  - [x] Wymaż fałszywe testy dla klas ** Product, Basket, Order, Inventory, Shop ** i odpowiednio je przepisz
      - Klasa [x] ** ProductTest **
      - Klasa [x] ** BasketTest **
      - klasa [x] ** OrderTest **
      - Klasa [x] ** InventoryTest **
      - Klasa [x] ** ShopTest **
      
  - [x] Wypełnij wspomniane wyżej zajęcia, aby zobaczyć, jak działa aplikacja
      - [x] ** Klasa produktu **
      - Klasa [x] ** Basket **
      - klasa [x] ** Order **
      - Klasa [x] ** Inventory **
      - Klasa [x] ** Shop **
      
  - [x] W prostej wersji takiego ćwiczenia, aby zapisać dane proponuje się zapisywanie danych do plików, jednak zapiszę to do PostgreSQL DB
      - [x] Może zapisać koszyk w DB
      - [x] Może zapisać zamówienie w DB
      - [x] Może przywrócić koszyk z DB
      - [x] Może przywrócić porządek z DB
      
  - [x] Jako część opcjonalną chciałbym wprowadzić system użytkownika: administrację i klientów. Pierwszy byłby w stanie zobaczyć wszystkie zrealizowane zamówienia i stan zapasów oraz ich całkowity koszt, podczas gdy klienci mogą wypełniać koszyki, składać zamówienia i wyświetlać tylko swój koszyk i zamówienia
      - [x] Administrator może
          - [x] Zobacz wszystkie dostępne produkty
          - [x] Zobacz całkowity koszt wszystkich produktów
          - [x] Dodaj produkty do magazynu
          - [x] Usuń produkty z magazynu
          - [x] Zobacz zamówienia zrealizowane przez dowolnego użytkownika
          - [x] Zobacz całkowity koszt wszystkich zrealizowanych zamówień
          - [x] Dodaj użytkownika do systemu
          - [x] Usuń użytkownika z systemu
          - [x] Filtruj produkty według nazwy, ceny i wagi
          - [x] Filtruj zamówienia według daty
          - [x] Filtruj zamówienia według ceny łącznej
      - [x] Użytkownik klienta może
          - [x] Zobacz wszystkie dostępne produkty
          - [x] Dodaj do koszyka
          - [x] Usuń z koszyka
          - [x] Zapisz koszyk
          - [x] Przywróć koszyk
          - [x] Zapisz zamówienie
          - [x] Przywróć porządek
          - [x] Kompletne zamówienie
          - [x] Zobacz wszystkie zamówienia (klient widzi tylko swoje zamówienia)
          - [x] Filtruj produkty według nazwy, ceny i wagi
          - [x] Filtruj zamówienia według daty
          - [x] Filtruj zamówienia według ceny łącznej
      
  - [x] Jako część opcjonalną chciałbym wprowadzić GUI, który ułatwi wypełnianie koszyka, przeglądanie zamówień itp.
      - [x] Ekran logowania
      - [x] Może zalogować się do systemu i uzyskać odpowiednie uprawnienia
      - GUI klienta [x]
          - [x] Zobacz wszystkie dostępne produkty
          - [x] Dodaj do koszyka
          - [x] Usuń z koszyka
          - [x] Kompletne zamówienie
          - [x] Zobacz wszystkie zrealizowane zamówienia (klient widzi tylko swoje zamówienia)
          - [x] Zobacz całkowity koszt wszystkich zrealizowanych zamówień
          - [x] Sortuj zamówienia według ceny całkowitej
          - [x] Filtruj zamówienia według ceny łącznej
          - [x] Wyszukaj określony produkt według nazwy
          - [x] Sortuj produkty według nazwy, ceny i wagi
          - [x] Filtruj produkty według nazwy, ceny i wagi
      - GUI administratora [x]
          - [x] Zobacz wszystkie dostępne produkty
          - [x] Zobacz całkowity koszt wszystkich produktów
          - [x] Dodaj nowy produkt do magazynu
          - [x] Dodaj produkty do magazynu
          - [x] Usuń produkty z magazynu
          - [x] Zobacz zamówienia zrealizowane przez dowolnego użytkownika
          - [x] Zobacz całkowity koszt wszystkich zrealizowanych zamówień
          - [x] Sortuj zamówienia według daty, ceny całkowitej
          - [x] Filtruj zamówienia według daty / ceny całkowitej
          - [x] Dodaj użytkownika do systemu
          - [x] Usuń użytkownika z systemu
          - [x] Wyszukaj określony produkt według nazwy
          - [x] Sortuj produkty według nazwy, ceny
          - [x] Filtruj produkty według ceny, wagi
      - [x] Przenieś wszystkie komponenty GUI do jednego etapu
          - [x] Utwórz główną scenę za pomocą TabPane (panel zakładek, który zawiera sceny)
              - [x] Scena główna, która tworzy panele zakładek w zależności od poziomu uprawnień zalogowanego użytkownika
              - [x] Zapisz koszyk
              - [x] Przywróć koszyk
          - [x] Połącz GUI z bazą danych
              - [x] GUI logowania
              - GUI klienta [x]
                  - [x] Wyróżnione części
              - GUI administratora [x]
                  - [x] Wyróżnione części
                  
      - [x] Zakończ testy
          - [x] Przejrzyj testy dotychczasowego projektu
          - Testy [x] GUI MainStage
              - [x] Testy GUI klienta
              - Testy [x] GUI administratora
              
  - [] Jako część opcjonalną chciałbym t

## dwa


## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project is simple Lorem ipsum dolor generator.
	
## Technologies
Project is created with:
* Lorem version: 12.3
* Ipsum version: 2.33
* Ament library version: 999
	
## Setup
To run this project, install it locally using npm:

```
$ cd ../lorem
$ npm install
$ npm start
