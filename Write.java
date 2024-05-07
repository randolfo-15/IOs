import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public interface Write{
    public void make(FileWriter file,String text)throws IOException;
    public void make(ObjectOutputStream file,Serializable obj)throws IOException,ClassNotFoundException;
}

