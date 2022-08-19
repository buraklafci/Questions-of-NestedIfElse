package day07_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse5Bölünen4BasamakliTekCift {
    public static void main(String[] args) {
        /*
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e     bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        */
        Scanner scan = new Scanner(System.in);
        System.out.print("4 basamakli sayi giriniz:");
        double tamSayi = scan.nextDouble();

        if (tamSayi < 1000 || tamSayi > 9999) {
            System.out.println("lütfen gecerli bir sayi giriniz");
        } else if (tamSayi % 5 == 0) {
            if (tamSayi % 10 == 0) {
                System.out.println("5 e bölünen 4 basamakli cift sayidir");
            } else System.out.println("5 e bölünen 4 basamakli tek sayidir");
        } else {
            System.out.println("tekrar deneyin");
        }
    }
}