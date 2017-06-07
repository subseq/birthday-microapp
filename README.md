# Subseq.net // Micro-App Geburtstage

## Allgemeines

#### Problemstellung

Es soll eine Web-Applikation entwickelt werden, die basierend auf gegebenen Daten über Mitarbeiter, eine Übersicht bereitstellt, um kommende Geburtstage der Mitarbeiter anzuzeigen.

#### Setup

- Projekt aus Github auschecken oder downloaden
- Java 8 installieren 
- Projekt in IDE als **Maven Project** (wichtig!) importieren
- Maven-Import aller sources abwarten
- ``BirthdayApplication`` ausführen. Applikation läuft per default auf Port ``8080``
- Im Browser die Seite unter ``localhost:8080`` aufrufen.

## Aufbau der Applikation

#### Folgendes ist bereits vorhanden:

Bereitgestellt wird eine Grund-Applikation in die die fehlenden Bestandteile implementiert werden sollen. Die folgenden Bereiche sind bereits implementiert.

##### Backend:
- Fertig konfigurierte Spring Boot Application
- Ein Controller (``BirthdayController``) der Daten verarbeiten soll und an die View schickt
- Ein ``DataGenerator`` der zufällig Mitarbeiterdaten erstellt
- Die Klasse ``Employee``

##### Frontend:
- Template ``index.ftl`` in dem die Ausgabe stattfindet
- Stylesheet ``style.css`` in dem eigene Styles konfiguriert werden können.

#### Folgende Dateien können bearbeitet werden
- Klasse ``BirthdayController``
- Klasse ``Employee`` (optional)
- ``style.css``
- ``index.ftl``

## Anforderungen

#### Backend

Im ``BirthdayController`` steht eine Liste von Mitarbeitern bereit. Diese soll so gefiltert werden, dass sie nur noch Mitarbeiter enthält, die in den nächsten *14 Tagen* ihren Geburtstag feiern.

Es sollen nur die Klassen ``BirthdayController`` und ``Employee`` (optional) bearbeitet werden. 

#### Frontend

Die Seite zeigt aktuell eine Liste aller Angestellten.
Die Seite soll wie folgt modifiziert werden:
- Sie soll eine Auflistung aller Angestellten zeigen, die in den nächsten 
      14 Tagen ihren Geburtstag feiern (bitte nur im Backend filtern > ``BirthdayController``)
- Die Daten sollen in Tabellenform dargestellt werden.
- Die Daten sollen sortiert sein: nächste Geburtstage zuerst.
- Die Übersicht soll ansprechend und ordentlich gestaltet werden.

[Optional]
- Alle Angestellten die in den nächsten drei Tagen Geburtstag feiern in der Tabelle highlighten.
- Den nächsten Geburtstag in einem Satz über der Tabelle promoten. Bsp.:
    *"[Vorname] [Nachname] feiert seinen Geburtstag in [X] Tagen."*
    
#### Tips
- Bei Änderungen an einer Java-Klassenstruktur muss die App neu gestartet werden.
- Bei Änderungen innerhalb einer Java-Methode (bspw. im Controller) reicht ein Projekt-Rebuild aus.
- Bei Änderungen an Template und CSS reicht ein ebenfalls Rebuild des Projekts aus.