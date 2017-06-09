package net.subseq.birthday.controller;

import net.subseq.birthday.data.DataGenerator;
import net.subseq.birthday.data.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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


        // Liste zum 'Model' hinzufügen, um im Template darauf zuzugreifen
        model.addAttribute("employees", employees);

        // Template: templates/index.ftl
        return "index";
    }

}
