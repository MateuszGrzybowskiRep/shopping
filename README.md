## Opis
Ten projekt to internetowa aplikacja do zakupów online, opracowana w języku JAVA. Głównym celem „ZAKUPÓW ONLINE” jest usprawic uslugi Klientów i Sprzedawców. Zachowuje szczegóły płatności klientów, przyjęcia produktów, dodawania nowych klientów, produktów, a także aktualizuje, usuwa je. Przechowuje również szczegóły faktur wygenerowanych przez klienta i dokonanych przez niego płatności wraz ze wszystkimi szczegółami płatności, takimi jak karta kredytowa.

PRZEGLĄD ZAKUPÓW ONLINE:

Aplikacja umożliwienie klientowi robienia zakupów przez Internet i umożliwienie klientom kupowania w sklepie dowolnych towarów i artykułów. Informacje dotyczące produktów są przechowywane na stronie serwera (sklepu). Serwer przetwarza klientów, a towary są wysyłane na podany przez nich adres.

Aplikacja została zaprojektowana w dwóch modułach, najpierw jest przeznaczona dla klientów, którzy chcą kupić artykuły. Drugi jest przeznaczony dla właścicieli sklepów, którzy utrzymują i aktualizują informacje dotyczące artykułów i klientów.

Użytkownikiem końcowym tego produktu jest dom towarowy, w którym aplikacja jest hostowana w Internecie, a administrator utrzymuje bazę danych. Aplikacja, która jest wdrażana w bazie danych klientów, szczegóły pozycji są przenoszone z bazy danych do podglądu klienta na podstawie wyboru poprzez menu, a baza danych wszystkich produktów jest aktualizowana na koniec każdej transakcji.

Wprowadzanie danych do aplikacji odbywa się poprzez różne ekrany przeznaczone dla różnych poziomów użytkowników. Gdy upoważniony personel wprowadzi odpowiednie dane do systemu, może zostać wygenerowanych kilka raportów zgodnie z zabezpieczeniami.

## jeden

# Przykład sklepu Java

  - [x] 
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
              

## Wymagania projektowe

Technologia: Java, Javascript, HTML

Backend: Hibernate,JSP, Html, CSS, JS.

Baza danych: MySQL

Wymagania dotyczące oprogramowania: Fasola sieciowa IDB 8.2, oprogramowanie Eclipse

Wymagania sprzętowe: Windows 7/8/10

erdzić innego klienta, odblokowując go.

Zaloguj sie

Po rejestracji klient musi zalogować się do platformy przy użyciu nazwy i hasła klienta.

Pokaż produkty

Klient może zobaczyć listę pozycji na podstawie ich nazw po skutecznym zalogowaniu. Konkretne przedstawienie konkretnego przedmiotu z nazwą przedmiotu, szczegółami przedmiotu, zdjęciem przedmiotu, koszt może być widoczny dla klientów.

Wyszukaj produkt

Klienci mogą skanować w poszukiwaniu określonego elementu w zestawieniu według nazwy.

Dodaj do koszyka:

Klient może dodać idealny przedmiot do swojej ciężarówki, klikając opcję dodaj do ciężarówki wybór na elemencie.

Może zobaczyć swoją ciężarówkę, naciskając przycisk ciężarówki. Wszystkie elementy zawarte w ciężarówce można zobaczyć w ciężarówce. Klient może wydalić przedmiot z ciężarówki, klikając pusty.

Kolejny kod java dla tych logik można łatwo znaleźć w Internecie, który należy zamodelować i zaimplementować na powyższym modelu.



Czy wiedziałeś
Skyfi Labs pomaga uczniom uczyć się praktycznych umiejętności, budując projekty w świecie rzeczywistym.

Możesz zapisać się ze znajomymi i otrzymać zestawy na wyciągnięcie ręki

Możesz uczyć się od ekspertów, budować projekty, prezentować umiejętności światu i zdobywać najlepsze miejsca pracy.
Zacznij dziś!


Zestaw wymagany do opracowania projektu zakupów online przy użyciu JAVA:
JAWA
Technologie, których nauczysz się pracując nad projektem Zakupy online w JAVA:
JAWA
MySQL
HTML
Tworzenie stron internetowych
PROJEKT ZAKUPÓW ONLINE W JAVA

## trzy

Istnieją dwaj główni aktorzy aplikacji, którzy będą bezpośrednio współdziałać z aplikacją. Administrator i użytkownik. Administrator może dodawać, edytować, usuwać produkty w sklepie, a użytkownik może przeglądać, wyszukiwać, kupować i pobierać wymaganą książkę.

Admin:

Administrator może przeglądać wszystkie dostępne bezpłatne książki w aplikacji.

Administrator może DODAĆ / USUNĄĆ / AKTUALIZOWAĆ darmowe książki w sklepie.

Administrator może przeglądać wszystkie płatne książki w aplikacji.

Administrator może DODAĆ / USUNĄĆ / AKTUALIZOWAĆ Płatne książki w sklepie.

Administrator może przeglądać wszystkie rezerwacje lub sprzedaże sklepu.

Użytkownik:

Użytkownik może przeglądać wszystkie książki w aplikacji.

Użytkownicy mogą wyszukiwać książki według nazwy.

Użytkownicy mogą filtrować książki według kategorii.

Użytkownik może pobrać bezpłatne książki po zalogowaniu się w aplikacji 

Logowanie i rejestracja użytkownika.

Użytkownicy mogą kupić dowolną książkę za pomocą płatności online.

Użytkownicy mogą sprawdzić historię rezerwacji po zalogowaniu się do aplikacji.

Technologia wykorzystana w projekcie książki Online Book.

Front-End: JSP, Html, CSS, JS.

Po stronie serwera: serwlet.

Zaplecze: MYSQL.

Serwer: Tomcat 8.5.

## cztery


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
