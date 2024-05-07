import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Letter implements Serializable{
    public String name;
    Letter(String name){this.name=name;}
}

class Main{
    public static void main(String[] args) {
       try{
           //  Out
           // =====
           //IOs.set_text("nomes.txt", "Randolfo"); 
           //IOs.set_text("nomes.txt", "Pedro"); 
           //IOs.set_text("nomes.txt", "Carla"); 
           //IOs.set_object("letter.dat", new Letter("B"));

           //  In
           // ====
           System.out.println(
                   "Nomes:\n"+IOs.get_text("nomes.txt")+"\n"+
                   "Letra:\nA!="+((Letter)IOs.get_object("letter.dat")).name);
       }
       catch(ClassNotFoundException e){}
       catch(IOException e){}
    }
}
