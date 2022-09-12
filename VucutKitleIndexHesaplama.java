
import java.util.Scanner;
public class VucutKitleIndexHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double boy,kilo,index;
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy=inp.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        kilo= inp.nextDouble();

        index=kilo/(boy*boy);
        System.out.println("vucüt kitle indexiniz:"+index);

    }
}
