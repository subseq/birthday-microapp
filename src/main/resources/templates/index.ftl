<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kommende Geburtstage</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<#--
    Diese Seite zeigt aktuell eine Liste aller Angestellten.
    Die Seite soll wie folgt modifiziert werden:
        - Sie soll eine Auflistung aller Angestellten zeigen, die in den nächsten
          14 Tagen ihren Geburtstag feiern (bitte nur im Backend filtern -> BirthdayController)
        - Die Daten sollen in Tabellenform dargestellt werden.
        - Die Daten sollen sortiert sein: nächste Geburtstage zuerst.
        - Die Übersicht soll ansprechend und ordentlich gestaltet werden.

    [Optional]
        - Alle Angestellten die in den nächsten drei Tagen Geburtstag feiern
          in der Tabelle highlighten.
        - Den nächsten Geburtstag in einem Satz über der Tabelle promoten. Bsp.:
          "[Vorname], [Nachname] feiert seinen Geburtstag in [X] Tagen.
-->

<h1>Alle Mitarbeiter</h1>

<ul>
    <#list employees as employee>
        <li>${employee.lastname}, ${employee.firstname} (${employee.birthday})</li>
    </#list>
</ul>

</body>
</html>