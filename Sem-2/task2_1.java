import java.io.FileReader;

public class task2_1 {
    public static void main(String[] args) {
        StringBuilder zapros = new StringBuilder();
        zapros.append("Select * from students WHERE");
        try(FileReader fr = new FileReader("Sem-2/data_file.json")){
            int c;
            while((c=fr.read())!=-1){
                if((Integer)c != null)
                {
                    zapros.append((char)c);
                }
            } 
            System.out.print(zapros);
            fr.close();
    }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }  
    }
}
