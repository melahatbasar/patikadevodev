import java.util.Scanner;
public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int yol,tip,yas;
        double normaltutar,yasindirimi,indirimlitutar,biletindirimi;
        System.out.print("gideceğiniz yolu(km) giriniz:");
        yol= scan.nextInt();
        System.out.print("yaşınızı giriniz:");
        yas= scan.nextInt();
        System.out.print("yolculuk tipini giriniz(tek yön-çift yön):");
        tip= scan.nextInt();


        if(yol>0){
            normaltutar=yol*0.10;
            {
                if(yas<12){
                    yasindirimi=normaltutar*0.5;
                    indirimlitutar=normaltutar-yasindirimi;{
                        if(tip==1){
                            System.out.println("bilet fiyatınız:"+indirimlitutar+"TL");
                        } else if(tip==2){
                           biletindirimi=indirimlitutar*0.20;
                           indirimlitutar-=biletindirimi;
                            System.out.println("bilet fiyatınız:"+2*indirimlitutar+"TL");

                        }
                        else{
                            System.out.println("hatalı giriş");
                        }
                    }
                    
                } else if (12<=yas||yas<24) {
                    yasindirimi=normaltutar*0.10;
                  indirimlitutar=normaltutar-yasindirimi;{
                        if(tip==1){
                            System.out.println("bilet fiyatınız:"+indirimlitutar+"TL");
                        } else if(tip==2){
                            biletindirimi=indirimlitutar*0.20;
                            indirimlitutar-=biletindirimi;
                            System.out.println("bilet fiyatınız:"+2*indirimlitutar+"TL");

                        }
                        else {
                            System.out.println("hatalı giriş");
                        }

                    }
                } else if (yas>65) {
                    yasindirimi=normaltutar*0.20;
                    indirimlitutar=normaltutar-yasindirimi;{
                        if(tip==1){
                            System.out.println("bilet fiyatınız:"+indirimlitutar+"TL");
                        } else if(tip==2){
                            biletindirimi=indirimlitutar*0.20;
                            indirimlitutar-=biletindirimi;
                            System.out.println("bilet fiyatınız:"+2*indirimlitutar+"TL");

                        }
                        else {
                            System.out.println("hatalı giriş");
                        }
                    }
                    
                }
            }
        }
        else{
            System.out.println("hatalı bilgi girdiniz");
        }


    }
}
