package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri6 {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");

        for(String n : nama){
            if(n.startsWith("A")){
                System.out.println(n);
            }
        }
    }
}