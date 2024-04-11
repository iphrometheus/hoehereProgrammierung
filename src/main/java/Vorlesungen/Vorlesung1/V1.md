# Vorlesung 1

### Klassen
"Konstrunktionsanleitung" für Objekt  \
führt Datentypen ein\
Objekt werden bei Bedarf aus der Klasse erzeugt **Beispiel:**
```java
public class Main {
int x = 5;
public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
es gibt Default Konstruktoren => Klasse hat einen vorbestimmten Wert wenn nicht anders initialisiert hat die Klasse immer den Wert!
```java
public class Book{
    public String title;
    public int numberOfPages = 1; //Default wert des Konstruktors 1
    public String[] authors;
    
    public Book(String title, int pages, String[] author){
        this.title = title;
        numberOfPages = pages;
        authors = new String[]{author}; // hier wird auf author verwießen sprich änderungen an Author wird den author in der Klasse verändern !!! Lösung Array Copy
    }
}
```


### Datentypen in Java
Nur komplexe Datentypen in Java 
keine Pointer und kein Speicherzugriff