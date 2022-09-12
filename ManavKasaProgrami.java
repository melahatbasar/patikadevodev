import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       int akg,ekg,dkg,mkg,pkg;
       double tutar;
        System.out.print("kaç kilogram armut aldınız:");
        akg= inp.nextInt();
        System.out.print("kaç kilogram elma aldınız:");
        ekg= inp.nextInt();
        System.out.print("kaç kilogram domates aldınız:");
        dkg= inp.nextInt();
        System.out.print("kaç kilogram muz aldınız:");
        mkg= inp.nextInt();
        System.out.print("kaç kilogram patlıcan aldınız:");
        pkg= inp.nextInt();

        tutar=(2.14*akg+3.67*ekg+1.11*dkg+0.95*mkg+5*pkg);
        System.out.println("Ödenecek toplam tutar:"+tutar+"TL");


    }
}
