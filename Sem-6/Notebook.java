public class Notebook {
    String Mark;
    Integer RAM;
    Integer Memory;
    String OS;
    String Color;


    void PrintInfo(){
        System.out.println(Mark + " || " + RAM + " || "+ Memory + " || " + OS + " || " + Color );
    }
   

    Notebook(String M, Integer R, Integer Mem, String Oper, String Col){
        Mark = M;
        RAM = R;
        Memory = Mem;
        OS = Oper;
        Color = Col;
    }

}
