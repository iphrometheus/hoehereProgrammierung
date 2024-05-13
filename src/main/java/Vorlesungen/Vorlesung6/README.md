# Vorlesung 6

Generische Typen
Vereinfachen das Anlegen von Funktionen wenn man beispiels weiße eine Funktion anlegen will die \
sowohl für den einen als auch für den anderen Datentyp die gleiche Funktion  erfüllen soll
```java
class SLL <E> { // E ist der generische Datentyp
    E element;
    SLL<E> next;

    SLL(E element, SLL<E> next) {
        this.element = element;
        this.next = next;
    }
}
``` 
in go (nicht die Gleiche Funktionalität):

```go
func compare [K comparable] (in K, toCompare K) bool{
    return in == toCompare
}
```