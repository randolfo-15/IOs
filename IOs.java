/*!**********************************************************  
 *  Ios 
 * =====
 * @author: Randolfo A Goncalves
 * @date  : 07/05/24
 * @file  : IOs.java
*************************************************************/

//! Imports:
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IOs {
    public static String get_text(String path) throws IOException {
        BufferedReader bf =new BufferedReader(new FileReader(path));
        String line ="",text="";
        while((line=bf.readLine())!=null) text+=line+" \n";
        bf.close();
        return text;
    } 
    
    public static void set_text(String path, String text)throws IOException {
        BufferedWriter bf =new BufferedWriter(new FileWriter(path,true));
        bf.append(text+" \n");
        bf.close();
    }
    
    public static void set_text(String path, String text, Boolean append)throws IOException {
        BufferedWriter bf =new BufferedWriter(new FileWriter(path,append));
        bf.append(text+" \n");
        bf.close();
    }   

    public static Object get_object(String path)throws ClassNotFoundException,IOException {
        ObjectInputStream file = new ObjectInputStream(new FileInputStream(path));
        Object obj = file.readObject();
        file.close();
        return obj;
    }

    public static void set_object(String path, Serializable obj)throws IOException {
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(path));
        file.writeObject(obj);
        file.close();
    }
}
