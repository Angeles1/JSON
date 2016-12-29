package serializable1.main;

import java.io.File;
import java.io.IOException;
import serializable1.model.Person;
import serializable1.persistence.PersonNativeFileReader;

public class ReadMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person;
        person = new PersonNativeFileReader (new File("maria.person")).read();
        System.out.println(person.getName()+ " nacio el "+ person.getBirthdate());
    }
    
}
