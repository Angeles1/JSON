package serializable1.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable{
    private final String name;
    private final LocalDate birthdate;

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
}
