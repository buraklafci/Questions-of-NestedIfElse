package day07_NestedIfElse;

import java.util.Scanner;

public class C03_NestedIfElseGecerliSifre {
    public static void main(String[] args) {
        /*
    Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    Kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
    Ilk harf A ise  “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
    Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Sifrenizi giriniz:");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);

        if ((ilkHarf >= 'A') && (ilkHarf <= 'Z')) {
            if (ilkHarf == 'A') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecersiz password");
            }

        } else if ((ilkHarf >= 'a') && (ilkHarf <= 'z')) {
            if (ilkHarf == 'z') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecersiz password");
            }
        } else {
            System.out.println("gecerli password girin");


        }
    }
}
