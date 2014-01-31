Rapid Prototyping via Lean Modeling 
========================================

Viele Softwareprojekte setzen bereits auf MDD. Doch oft sind die Ansätze recht
schwerfällig. Da müssen DSLs nebst Generatoren entwickelt werden. Anschliessend
wird in den DSLs modelliert und das Generat mit manuellen Erweiterungen 
angereichert. Das Ganze in vielen Iterationen mit Schreib-Build-Test Zyklen. 
Glaubt man den Erfindern von [NatSpec](http://www.nat-spec.com/)
so versucht Lean Modeling damit aufzuräumen. 

Am Ende mancher Projekte schaut man beim Endprodukt auf eine riesige Menge an
Dateien voller Quellkode. Ab und an fragt man sich dann schon ob solch ein 
Aufwand wirklich notwendig ist um ein paar verschiebbare Fenster mit 
Schaltflächen auf den Bildschirm zu zaubern welche lediglich einige wenige Daten
aus der Datenbank visualisieren. Der Aufbau der Fenster ist meist der gleiche, 
die Anordnung der Elemente folgt hoffentlich immer den gleichen Regeln und 
die von den Schaltflächen ausgelösten Funktionen sind bereits von anderen 
Anwendungen gleicher Art bekannt. 

Wie schön wäre es da einfach schreiben zu können:

1. Erstelle einen Dialog "LoginDialog".
1. Füge ein Label "Benutzer" links hinzu.
1. Füge eine Textfeld "username" rechts hinzu.
1. Füge ein Label "Passwort" links hinzu.
1. Füge ein Passwordfield "passord" rechts hinzu.
1. Füge einen Button "Login" links hinzu und verknüpfe diesen mit der Aktion 
   "einloggen".
1. Füge einen Button "Abbrechen" rechts hinzu und verknüpfe diesen mit der 
   Aktion "schliessen".
   
und für die Definition der Aktionen:

1. Führe die Aktion "schliessen" aus als Schliessen des aktiven Dialoges.
1. Realisiere die Aktion "einloggen" in der Klasse "Einloggen".
1. Definiere die Aktion "Speichern" als Folge der Aktionen:
   - "Speichere aktiven Dialog Zustand"
   - "Speichere Reportdaten"
   - "Speichere Stammdaten"
   - "Aktualisiere den Dialog"
   
Nu so schön diese Form auch aussieht, für MDD wird man zunächst eine DSL dafür 
entwickeln müssen. Um die modellierten Dialoge und Aktivitäten für den Generator
vorhalten zu können wird ein fachliches Modell benötigt und schliesslich muss 
auch der Generator selbst geschrieben werden.

Die Idee vom Lean Modeling wie sie in (1) beschrieben ist besteht nun darin,
eine DSL zu nutzen und in dieser mittels natürlicher Sprache die einzelnen
fachlichen Aspekte zu beschreiben. Dabei werden einzelne Satzmuster den 
Methoden von Java Klassen zugeordnet. Diese Methodik ist aus dem 
[BDD](http://de.wikipedia.org/wiki/Behavior_Driven_Development) Umfeld 
von den
[Gherkin](http://de.wikipedia.org/wiki/Behavior_Driven_Development#Beispiel_in_der_Beschreibungssprache_Gherkin)
basierten Akzeptanztestsprachen her bekannt. Doch statt der bei den Gherkin 
Ansätzen hinterlegten starren Vorschriften zur Formulierung der Texte
bietet [NatSpec](http://www.nat-spec.com/) die Möglichkeit natürlich 
sprachliche Texte einzusetzen. 

Quellen
=======

1. [Dr. Seifert, M.; Wende, C.; Heidenreich, F. & Nestler, T. (2013), 'Lean Modeling: mit natürlicher Sprache zum Modell', Java Magazin (12) .](http://jaxenter.de/artikel/Lean-Modeling-mit-natuerlicher-Sprache-zum-Modell-169936)
   
 
 
 
 