package depo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Methodlar extends Urun{
    static HashMap<Integer,Urun> urunlerhm=new HashMap<>();
    static Scanner input = new Scanner(System.in);
    static ArrayList<Urun> urunler =new ArrayList<>();
    public void urunTanimlama() {
        System.out.println("Kullanici eklemek istemiyorsaniz 0 i eklemeye devam etmek icin urun adini giriniz");
        do {
            Urun urun = new Urun();
            System.out.println("urunismi");
            urun.setUrunIsmi(input.next());
            System.out.println("uretici");
            urun.setUreticisi(input.next());
            System.out.println("miktar");
            urun.setMiktar(input.nextInt());
            Random rand = new Random();
            int id = rand.nextInt(1000);
            urun.setId(id);
            System.out.println("birim");
            urun.setBirim(input.next());
            System.out.println("raf");
            urun.setRaf(input.nextInt());
            urunler.add(urun);
            urunlerhm.put(id,urun);
            System.out.println("Urun ekleme islemini bırakmak icin 0 i devam etmek icin herhangi bir tusu tiklayiniz");
            if (input.next().equals("0")) {
                break;
            }
            System.out.println(urunler);
        }
        while (true) ;
        System.out.println(urunlerhm);
    }
    public void urunListele(){
        System.out.println("URUNLER");
        System.out.println("__________________________");
        System.out.printf("%-5s %-11s %-10s %-6s %-7s %-2s %n","Id","Urun İsmi", "Ureticisi", "Miktar","Birim","Raf");
        System.out.println("_____________________________________");
        for (Urun w : urunlerhm.values()) {
            System.out.printf("%-5s %-11s %-10s %-6s %-7s %-2s %n",
                    w.getId(), w.getUrunIsmi(), w.getUreticisi(), w.getMiktar(), w.getBirim(), w.getRaf());
        }
        System.out.println("_____________________________________");
    }
    public void urunGirisi(){
        System.out.println("Lutfen degistirmek istediginiz urunun id sini giriniz");
        int id = input.nextInt();
        Urun urun =urunlerhm.get(id-1);
        System.out.println("Lutfen eklemek istediginiz degeri girin");
        int eklenecekDeger = input.nextInt();
        urun.setMiktar(urun.getMiktar()+eklenecekDeger);
        urunlerhm.put(id-1,urun);
        System.out.println(urunlerhm);
    }
    public void urunuRafaKoy(){
        System.out.println("Lutfen rafini degistirmek istediginiz urunun id sini giriniz");
        int id = input.nextInt();
        Urun urun =urunlerhm.get(id-1);
        System.out.println("Lutfen hangi rafa eklemek istediginizi giriniz");
        int degistirilecekRaf= input.nextInt();
        urun.setRaf(degistirilecekRaf);
        urunlerhm.put(id-1,urun);
        System.out.println(urunlerhm);
    }
    public void urunCikis(){
        System.out.println("Lutfen cikisini yapmak istediginiz urunun id sini giriniz");
        int id = input.nextInt();
        Urun urun =urunlerhm.get(id-1);
        System.out.println("Lutfen cikarmak istediginiz degeri girin");
        int cikilacakDeger = input.nextInt();
        urun.setMiktar(urun.getMiktar()-cikilacakDeger);
        urunlerhm.put(id-1,urun);
        System.out.println(urunlerhm);
    }
}


