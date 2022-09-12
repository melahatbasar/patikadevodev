import java.util.Scanner;

public class SwitchCaseIleHesapMakinesi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,b,toplam,fark,carpma,bolme;
        int deger;
        System.out.print("Birinci sayıyı giriniz:");
        a= inp.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b= inp.nextInt();
        System.out.println("Yapmak istediğiniz işlem:" +
                "\n1-Toplama" +
                "\n2-Çıkarma" +
                "\n3-Çarpma" +
                "\n4-Bölme");
        deger= inp.nextInt();
        switch (deger){
            case 1:toplam=a+b;
                System.out.println("toplam değeri:"+toplam);break;
            case 2:fark=a-b;
                System.out.println("fark değeri:"+fark);break;
            case 3:carpma=a*b;
                System.out.println("çarpım değeri:"+carpma);break;
            case 4:
                if(b!=0){
                    bolme=a/b;
                    System.out.println("bölüm değeri:"+bolme);
                }
                else{
                    System.out.println("bir sayı sıfıra bölünemez");
                }

            break;
            default:
                System.out.println("yanlış seçim yaptınız!!");
        }


    }
}
