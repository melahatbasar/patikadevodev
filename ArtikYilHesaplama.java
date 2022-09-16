import java.util.Scanner;
public class ArtikYilHesaplama
{
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int yil;
        System.out.println("***ARTIK YIL HESAPLAMA***");
        System.out.print("Bir yıl giriniz:");
        yil=scan.nextInt();
       if(yil%100!=0){
           if(yil%4==0){
               System.out.println("artık yıl girdiniz");
           }
           else{
               System.out.println("artık yıl girmediniz");
           }
       }
       else if(yil%100==0&&400<=yil){
           if(yil%400==0){
               System.out.println("artık yıl girdiniz");
           }
           else{
               System.out.println("artık yıl girmediniz");
           }
       }
    }


}
