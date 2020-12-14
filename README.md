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
Podstawowym celem „ZAKUPÓW w Internecie” jest usprawnienie administracji Klientów i sprzedawców. Utrzymuje subtelności rat klienta, przyjęcia pozycji, ekspansji nowych klientów, pozycji, a ponadto odświeżanie, anulowanie dla tego samego. Dodatkowo przechowuje szczegóły faktur utworzonych przez klientów i wykonanych przez nich rat wszystkimi metodami płatności, takimi jak Visa.

Klienci mogą kupować wiele przedmiotów zgodnie z ich wymaganiami i sprawdzać nagrodę, szczegóły przedmiotu i wiele więcej, podczas gdy sprzedawca ma pełne informacje o przedmiocie i może odświeżyć lub zachować dane przedmiotu.

Najważniejsze cechy przedsięwzięcia „ZAKUPY w Internecie” to wysoka precyzja, możliwość dostosowania planu i prosta dostępność. Co więcej, wykorzystuje tabele bazy danych reprezentujące elementy i połączenia między elementami.

Wymagania projektowe

Technologia: Java, Javascript, HTML, PHP

Backend: WAMP, Xampp

Baza danych: MySQL

Wymagania dotyczące oprogramowania: Fasola sieciowa IDB 8.2, oprogramowanie Eclipse

Wymagania sprzętowe: Windows 7/8/10


Najnowsze projekty w JAVA
Chcesz rozwinąć praktyczne umiejętności obsługi JAVA? Sprawdź nasze najnowsze projekty i zacznij naukę za darmo

Zacznij za darmo

Wdrożenie projektu

Ramy po ostrożnym badaniu zostały uznane za powiązane moduły i zadania.

Dołączone moduły to:

Administrator

Moderatorzy

Użytkownicy

Menedżer lub administrator jest super klientem tej aplikacji. Tylko administrator ma dostęp do tej strony administratora. Właścicielem sklepu może być administrator. Kierownik ma wszystkie dane dotyczące wszystkich klientów i towarów

Segment administracyjny będzie efektywnie gotowy do uzyskania danych klientów, w tym adresu e-mail i numeru kontaktowego, listy żądanych pozycji oraz danych o stanie raty. Jego segment księgowy zapewni jasny obraz transakcji oraz raportów kupna i sprzedaży, wykorzystując generator raportów i tworząc raport dochodzeniowy w układzie graficznym, na przykład jako ustrukturyzowaną prezentację lub wykorzystując wykres kołowy

Tylko administrator ma tę zaletę, że może włączyć moderatora. Za moderatora można uznać osobę, która zajmuje się prośbami lub właściciel kilku przedmiotów.

Administrator będzie miał listę wszystkich aktualnych pozycji. Może również szukać konkretnego przedmiotu po nazwie.

Administrator może zobaczyć wszystkie szczegóły każdego klienta na liście oprócz ich haseł. Administrator ma korzyści z natychmiastowego włączenia klienta, podając niezbędne szczegóły.

Menedżer ma możliwość usunięcia lub utrudnienia klientowi. Domyślny stan zarejestrowanego nowego klienta jest ustawiony jako zablokowany. Administrator musi potwierdzić nowego klienta, odblokowując go.

Moderatorzy mogą zmniejszyć zaległe zadanie administratora.

Obecnie moderator ma wszystkie zalety administratora oprócz nadzorowania innych moderatorów.

Może zawierać przedmioty i klientów. Może również sprawdzić aranżacje i zmienić swój profil.

Inny klient powinien zarejestrować się w frameworku, podając podstawowe szczegóły, aby zobaczyć elementy we frameworku.

Administrator musi potwierdzić innego klienta, odblokowując go.

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

There are two main actors of the application who will interact directly with the application. Admin and a user. Admin can add, edit, delete the book in the shop and the user can view, search, buy and download the required book.

Admin:

Admin can view all the available free books in the application.

Admin can ADD/DELETE/UPDATE free books of the store.

Admin can view all the paid books in the application.

Admin can ADD/DELETE/UPDATE Paid books of the store.

Admin can view all the bookings or sales of the store.

User:

User can view all the books in the application.

Users can search books by name.

Users can filter books by categories.

User can download free books after login in the application

Login and registration for the user.

Users can buy any book with online payment.

Users can check the booking history after login in to the application.

Technology Used in the project Online Book book.

Front-End : JSP, Html, CSS, JS.

Server-side: Servlet.

Back-end: MYSQL.

Server: Tomcat 8.5.



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
