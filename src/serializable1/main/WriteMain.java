package serializable1.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import serializable1.model.Person;
import serializable1.persistence.PersonJsonFileWriter;
import serializable1.persistence.PersonNativeFileWriter;

public class WriteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Person person = new Person("Maria", LocalDate.of(1998, Month.MARCH, 5));
        new PersonNativeFileWriter(new File("maria1.person")).writer(person);
        new PersonJsonFileWriter(new File("maria1.json")).write(person);
        System.out.println("Person saved");
        

    }
    
}
