import java.util.Scanner;
public class OdevDort {
    public static void main(String[] args) {


        Scanner imp = new Scanner(System.in);
        int r;
        double pi = 3.14, aci,alan;
        System.out.print("bir yarıçap değeri giriniz:");
        r= imp.nextInt();
        System.out.print("bir açı değeri giriniz:");
        aci= imp.nextDouble();
        alan=(pi*(r*r)*aci)/360;
        System.out.println("alan değeri:"+alan);




    }
}
