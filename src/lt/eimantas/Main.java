package lt.eimantas;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static final String FILE_NAME = "vardai.txt";


    public static void main(String[] args) {
        // write your code here
        Main object = new Main();
    }

    public Main(){
        Klase obj = new Klase(Main.FILE_NAME);

        obj.nuskaitytiFaila();
        obj.atvaizdavimasIsSaraso();
    }


}
