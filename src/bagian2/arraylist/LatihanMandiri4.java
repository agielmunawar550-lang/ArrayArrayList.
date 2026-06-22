package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri4 {
    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        belanja.remove(1);

        System.out.println(belanja);
        System.out.println("Jumlah : " + belanja.size());
    }
}