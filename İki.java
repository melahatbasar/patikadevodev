
import java.util.Scanner;

public class İki {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz:");
        int urun= input.nextInt();

        boolean kosul= urun<=1000;

        double kdv= kosul ? 0.18 : 0.08;
        double kdvTutar=kdv*urun;
        double kdvUrun=kdvTutar+urun;

        System.out.println("Ürünün KDV'li Fiyatı : " +kdvUrun);


    }



}
