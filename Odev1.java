import java.util.Scanner;

public class Odev1 {
    public Odev1() {
    }

    public static void main(String[] args) {
        Scanner ders = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        int mat = ders.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        int turkce = ders.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        int fizik = ders.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        int kimya = ders.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        int tarih = ders.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        int muzik = ders.nextInt();
        System.out.println("**************");
        int ortalama = (fizik + mat + turkce + kimya + tarih + muzik) / 6;
        double sonuc = (double)ortalama;
        System.out.println("***Ortalamanız**\n=" + sonuc);
        String str = ortalama > 60 ? "Geçti" : "Kaldı";
        System.out.println(str);
    }
}
