# Übung 1

## Mitschriften
### ? Operator
Wenn ja dann die erste Option sonst die zweite.
Bsp.:
```java
Object o = isEmpty() ? null : first;
```

### Listen Implementation

Um eine Liste mit einem Objekt hinten zu erweitern braucht man einen "Pointer" auf den Kopf der Liste.
Anschließend wird das **neue** Listen Element erzeugt. Dadurch das Tail auf den Speicher von head zeigt
kann man einfach tail mit tail.next durch Iterieren und dann wenn man den nächsten null Wert gefunden hat tail.next neu zuweißen.

```java
import Uebungen.Uebung1.queue.impl.QueueByList;

tail =head;
QueueByList.ListElement neu = new ListElement(objekt, null);
while(tail.next != null) tail = tail.next;
tail.next = neu;
```

## Aufgabenstellung

