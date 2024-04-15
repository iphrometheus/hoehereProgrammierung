# Vorlesung 3


## instance of
mit instanceof kann eine Objektabfrage realisiert werden
```java
//object o gesucht
if(o instance of Object){
       // ...
}
```

## Überschreiben von Methoden
mit **@Override** kann eine identische Methode bei Vererbung von Klassen methoden überschreiben
  
## for range schleife
bsp.:
```java
// Medium == Klasse 
for (Medium medium : medien){ // wird über ein array des Typs Mediums drüber iterieren und dann auf medium kasten
    medium.println(); // funktion von Medium
}
```

## abstract
"Vorlagen" Methode nur als vorlage für eine Subklasse abstract Methoden werden nie erzeugt

## enum
äquivalent zu c 
werden immer in Caps definiert
```java
public enum WeekDay{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
WeekDay mon = WeekDay.MONDAY; // anlegen mit einem Enum

public static void main(String[] args) {
    System.out.println(mon);
}
```

## Switch expression
```java
//mit pfeil
case one -> "eins";
case zwei -> "zwei";

```
````java
//mit pfeil und yield
case one -> "eins";
case zwei -> "zwei";
default -> {yield "drei"};
````

```java
//mit : und yield
case one : yield "eins";
case zwei: yield"zwei";
default : yield "drei";
```

## Schnittstellen
Die Schnittstelle legt die Syntax aber nicht die Semantik der Klasse fest
Schnittstellen brauchen eine Schnittstellenspezifikation welche **nur** deren Wirkungsweise beschreibt
Es können beliebig viele Schnittstellen implementiert werden.
Es wird kein weiterer Speicher verbraucht anders wie bei abstrakten klassen
Beim Implementieren der Schnittstelle müssen **alle** Methoden implementiert werden
kann nicht instanziiert werden aber als variablen und Attribut-typ verwendet werden

## Einfach und Mehrfachvererbung
einfache Vererbung: klasse erbt von höchstens einer anderen Klasse
mehrfache Vererbung: Klasse erbt möglicherweise von mehreren Klassen

->In Java kann man nur eine Klasse erben


## Functional Interface und Lambda-Ausdruck
Funktionale Schnittstellen sind Schnittstellen die genau **eine** abstrakte Methode besitzt
Lambda Ausdrücke nutzen diese Schnittstelle
Annotation @FunctionalInterface
```java
@FunctionalInterface
public interface BinaerIntOperation{
    int operation(int a, int b);
}

public static void main(String[] args) {
    BinaerIntOperation plus = (a,b) -> {
        int c = a + b;
        return c;
    }; // langschreibweise
    BinaerIntOperation minus = (a, b) -> a-b; // Kurzschreibweise
    int x = 9; int y = 8;
    int s = plus.operation(x, y);
    int t = minus.operation(x, y);
}
```
