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



<h1>Kommende Geburtstage</h1>


<#list filteredEmployees[0..*1] as employee>
        <p><span>${employee.firstname} ${employee.lastname} 
        <#if employee.daysTillBirthday == 0> feiert heute Geburtstag!
        <#elseif employee.daysTillBirthday == 1> feiert in ${employee.daysTillBirthday} Tag Geburtstag!
        <#else> feiert in ${employee.daysTillBirthday} Tagen Geburtstag!</span></p></#if>
</#list>

<table class="employees">
      
    <#list filteredEmployees>
	    <tr>
			  <th>Nachname</th>
			  <th>Vorname</th>
			  <th>Geburtstag</th>
	    </tr>  
	    <#items as employee>
	    	<tr <#if employee.hasBirthdayWithIn3Days> class="in3days"</#if>>
			    <td>${employee.lastname}</td>
			    <td>${employee.firstname}</td>
			    <td>${employee.birthday}</td>
	  		</tr>
	    </#items>
      
     <#else><p>Es gibt keinen Geburtstag in den nächsten 14 Tagen!</p>
    </#list>
  </table>


<#-- 
<ul>
    <#list filteredEmployees as employee>
        <li>${employee.lastname}, ${employee.firstname} (${employee.birthday})</li>
    </#list>
</ul>

<h1>Alle Mitarbeiter</h1>

<ul>
    <#list employees as employee>
        <li>${employee.lastname}, ${employee.firstname} (${employee.birthday})</li>
    </#list>
</ul>
-->
</body>
</html>