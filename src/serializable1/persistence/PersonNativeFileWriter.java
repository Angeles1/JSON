package serializable1.persistence;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import serializable1.model.Person;

public class PersonNativeFileWriter {
    private final File file;

    public PersonNativeFileWriter(File file) {
        this.file = file;
    }
    public void writer (Person person) throws IOException {
        try (FileOutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject (person);
        }
        
    }
}
