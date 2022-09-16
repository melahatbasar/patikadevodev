import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {

        int dogumyili;
        Scanner scan=new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz:");
        dogumyili= scan.nextInt();


        if(dogumyili%12==0){
            System.out.println("çin zodayğı burcunuz:maymun");
        }
        else if(dogumyili%12==1){
            System.out.println("çin zodyağı burcunuz:horoz");
        }
        else if(dogumyili%12==2){
            System.out.println("çin zodyağı burcunuz:köpek");
        }
        else if(dogumyili%12==3){
            System.out.println("çin zodyağı burcunuz:domuz");
        }
        else if(dogumyili%12==4){
            System.out.println("çin zodyağı burcunuz:fare");
        }
        else if(dogumyili%12==5){
            System.out.println("çin zodyağı burcunuz:öküz");
        }
        else if(dogumyili%12==6){
            System.out.println("çin zodyağı burcunuz:kaplan");
        }
        else if(dogumyili%12==7){
            System.out.println("çin zodyağı burcunuz:tavşan");
        }
        else if(dogumyili%12==8){
            System.out.println("çin zodyağı burcunuz:ejderha");
        }
        else if(dogumyili%12==9){
            System.out.println("çin zodyağı burcunuz:yılan");
        }
        else if(dogumyili%12==10){
            System.out.println("çin zodyağı burcunuz:at");
        }
        else if(dogumyili%12==11){
            System.out.println("çin zodyağı burcunuz:koyun");
        }
    }
}
