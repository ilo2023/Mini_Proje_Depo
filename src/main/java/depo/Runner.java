package depo;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Urun tanimlamayi bitirmek icin 0 i tuslayin");
        Methodlar urun = new Methodlar();
        urun.urunTanimlama();
        urun.urunListele();
        urun.urunGirisi();
        urun.urunuRafaKoy();
        urun.urunCikis();
        urun.urunListele();
    }
}
