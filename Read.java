import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public interface Read{
    public void make(FileReader file,String text)throws IOException;
    public void make(ObjectInputStream file,Object obj)throws IOException,ClassNotFoundException;
}

