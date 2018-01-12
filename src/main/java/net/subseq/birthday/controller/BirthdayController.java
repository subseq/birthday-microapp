package net.subseq.birthday.controller;

import net.subseq.birthday.data.DataGenerator;
import net.subseq.birthday.data.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BirthdayController {
	
    @RequestMapping(value = "/")
    public String index(Model model) {

        /*
            Zufällig generierte List von Mitarbeitern / employees.
            Jeder Mitarbeiter enthält folgende Daten:
                - String: firstname,
                - String: lastname and
                - LocalDate: birthday
        */
        List<Employee> employees = DataGenerator.getRandomEmployees(30);


        /*  TODO Liste 'employees' filtern,
            sodass die Liste nur Mitarbeiter enthält,
            die in den nächsten 14 Tagen ihren Geburtstag feiern.
        */


        /*
            Insert your code HERE
         */
        List<Employee> filteredEmployees = employees.stream()
                .filter(new java.util.function.Predicate<Employee>() {
                    @Override
                    public boolean test(Employee e) {
                        return e.hasBirthDayInXDays(e.getBirthday(), 14);
                    }
                }).collect(Collectors.toList());
        Collections.sort(filteredEmployees, new Comparator<Employee>() {
        	public int compare (Employee e1, Employee e2) {
        		return e1.getDaysTillBirthday() - e2.getDaysTillBirthday();
        	}
        });
        
        
        // Liste zum 'Model' hinzufügen, um im Template darauf zuzugreifen
        model.addAttribute("employees", employees);
        
        model.addAttribute("filteredEmployees", filteredEmployees);


        // Template: templates/index.ftl
        return "index";
    }

}
