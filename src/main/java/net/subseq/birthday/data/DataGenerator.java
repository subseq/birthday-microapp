package net.subseq.birthday.data;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class DataGenerator {

    public static List<Employee> getRandomEmployees(int number) {
        Fairy fairy = Fairy.create(Locale.US);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Person person = fairy.person();
            employees.add(
                    new Employee(
                            person.getFirstName(),
                            person.getLastName(),
                            person.getDateOfBirth().toLocalDate()
                    ));
        }
        return employees;
    }

}
