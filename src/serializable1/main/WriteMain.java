package serializable1.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import serializable1.model.Person;
import serializable1.persistence.PersonNativeFileWriter;

public class WriteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Person person = new Person("Maria", LocalDate.of(1998, Month.MARCH, 5));
        File file = new File("maria2.person");
        PersonNativeFileWriter pnfw = new PersonNativeFileWriter(file);
        pnfw.writer(person);
        System.out.println("Person saved");

    }
    
}
