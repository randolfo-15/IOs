import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) {
       IOs io = new IOs();
       
       try{
           
           io.make(new FileWriter("nomes.txt",true), "Randolfo");
           io.make(new FileWriter("nomes.txt",true), "Pablo");
           io.make(new FileWriter("nomes.txt",true), "Joao");
           
           String nomes="";
           io.make(new FileReader("nomes.txt"),nomes);
           System.out.println(nomes);

       }catch(IOException e){}

    }
}
