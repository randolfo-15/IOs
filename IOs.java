import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IOs implements Write,Read{
    @Override
    public void make(FileReader file, String text) {
        BufferedReader bf =new BufferedReader(file);
        String line ="";
        try{ while(true) 
                if((line=bf.readLine())==null) break;
                else text+=line;

             bf.close();

        }catch(IOException e){e.printStackTrace();}
    } 
    
    @Override
    public void make(FileWriter file, String text) {
        BufferedWriter bf =new BufferedWriter(file);
        try{ bf.append(text+" \n");
             bf.close();
        
        }catch(IOException e){ e.printStackTrace(); }
    }
    
    @Override
    public void make(ObjectInputStream file,Object obj) {
        try{
            obj=(Object) file.readObject();
            file.close();
        
        } catch(ClassNotFoundException e){ e.printStackTrace(); 
        } catch(IOException e){ e.printStackTrace(); }
    }

    @Override
    public void make(ObjectOutputStream file, Serializable obj) {
        try{
            file.writeObject(obj);
            file.close(); 

        }catch(IOException e){ e.printStackTrace(); }
    }
}
