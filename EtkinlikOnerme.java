import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.println("***ETKİNLİK ÖNERME***");
        int sicaklik;
        System.out.print("bir sıcaklık değeri giriniz:");
        sicaklik= imp.nextInt();
        if(sicaklik<5) {
            System.out.print("kayak yapabilirsiniz");
        }
        else if(5<=sicaklik || sicaklik<15){
            System.out.print("sinemaya gidebilirsiniz");
        }
        else if(15<=sicaklik || sicaklik<25){
            System.out.print("pikniğe gidebilirisniz");
        }
        else if(25<=sicaklik){
            System.out.print("yüzmeye gidebilirisniz");
        }
    }
}
