package day07_NestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElseEmeklilik {
    public static void main(String[] args) {
        //eger iç içe method varsa o zmn nested if kullanılır örneğin
        /*
          emeklilik kontrolu yapan bir program yaziniz
          cinsiyet olarak E (erkek) veya K(Kadin) degiskenlerini kabul etsin
          farkli bir harf veya sembol girilirse hata mesaji versin
          emeklilik icin kadinlarda yas siniri 60
          erkeklerde 65 olsun
          negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("cinsiyetinizi giriniz:");
        String cinsiyet = scan.next().toUpperCase();
        char ilkHarf = cinsiyet.charAt(0);
        System.out.print("yasınızı giriniz:");
        double yas = scan.nextDouble();

        if (ilkHarf == 'E') {
            if ((yas >= 65) && (yas <= 80)) {
                System.out.println("emekli olabilirsiniz");
            } else {
                System.out.println("emekli olamazsınız");
            }
        } else if (ilkHarf == 'K') {
            if ((yas >= 60) && (yas <= 80)) {
                System.out.println("emekli olabilirsiniz");
            } else {
                System.out.println("emekli olamazsınız");
            }

        } else {
            System.out.println("yanlıs girdiniz");
        }
    }
}