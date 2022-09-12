import java.util.Scanner;


public class Odevv3 {
    public static void main(String[] args) {
        Scanner alan=new Scanner(System.in);
        int a,b,c;
        double u,ucgenalan;
        System.out.print("1.kenarı giriniz:");
        a=alan.nextInt();

        System.out.print("2.kenarı giriniz:");
        b=alan.nextInt();

        System.out.print("3.kenarı giriniz:");
        c=alan.nextInt();

        u=(a+b+c)/2;
        ucgenalan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı:"+ucgenalan);


    }
}
