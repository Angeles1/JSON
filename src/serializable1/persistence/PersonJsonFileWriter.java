package serializable1.persistence;

import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import serializable1.model.Person;

public class PersonJsonFileWriter {
    private final File file;

    public PersonJsonFileWriter(File file) {
        this.file = file;
    }
    
    public void write (Person person) throws IOException{
        FileWriter writer = new FileWriter(file);
        writer.write(new GsonBuilder().create().toJson(person));
        writer.close();
    }
}
