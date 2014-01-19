natspec-gui.example
===================

Lean Modeling von GUI Dialogen mittels NatSpec. Die hier benutzte Methode wird in
[Lean Modeling: mit natürlicher Sprache zum Model](http://www.bibsonomy.org/bibtex/220fe16bb76f4ef5d8c911c0c7a246a05/funthomas424242)
beschrieben.

NatSpec ist eine Modellierungssprache welche sich durch ihre Flexibilität selbst zur Modellierung 
von Domain Spezifischen Sprachen (DSLs) eignet. Der Umfang der jeweiligen Sprache ist dabei abhängig
den implementierten Mappings natürlich sprachlicher Sätze auf Java Methoden. 

Da es sich um einen generativen Ansatz handelt würde ich für den produktiven Einsatz 
empfehlen, das grobe Grundgerüst der zu modellierenden DSL schon vor der Entwicklung möglichst 
umfangreich zu durchdenken. Das schliesst natürlich die agile und insbesondere die iterative 
Entwicklung nicht aus. Wenn man jedoch schon 80 Szenarien geschrieben hat und es einem dann 
einfällt ein Sprachkonstrukt einzuführen welches Auswirkungen auf bestehende Spezifikationen hat,
fällt Aufwand an um diese Spezifikationen anzupassen.
Das wäre in diesem Fall allerdings auch bei anderen Modellierungssprachen so - es ist also ein 
generelles Problem der Generator getriebenen Entwicklung und nicht durch NatSpec verursacht. 

Projektstatus
-------------

Aktuell zeigt mein Beispielprojekt wie über eine sprachliche Spezifikation in NatSpec eine
prototypische Implementierung bereitgestellt wird. Später soll der eigentliche Grundgedanke
der Technologie verwirklicht werden und gezeigt werden wie eine wirkliche Generierung von 
Java Quellen erfolgen kann. 
Im [Beispielprojekt](https://github.com/DevBoost/JavaMagazin_Lean_Modeling_Example) der Urheber 
auf Github ist dies bereits umgesetzt.

