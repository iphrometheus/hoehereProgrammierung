  # Vorlesung 2
  
## Klassen erstellen
"neuer Behälter" wird erstellt 
eindeutige Objektidentifikator (vergeben wie ein Pointer) 

  ```java
new Book0a = new Book("A", 56, authors);
new Book0b = new Book("A", 56, authors);

if(Book0a == Book0b){ //Inhalts vergleich über Objects.equals(Book0a, Book0b) oder wenn man sicher ist das Book0a kein null value hat Book0a.equals(Book0b)
    System.out.println("Book0a == Bookb");
} else {
    System.out.println("Book0a != Bookb");
} //durch die Unterschiedlichen Objektidentifikatoren würde Book0a != Bookb ausgegeben werden
```
Objektvergleich bzw. Inhaltsvergleich über Objects.equals() Funktion

## Klassen Methoden
Erstellung:
```java
public int methode(...) {...}
```
Aufruf:
```java
b.methode(...);
```
