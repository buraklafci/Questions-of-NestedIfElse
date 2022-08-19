package day07_NestedIfElse;

import java.util.Scanner;

public class C04_NestedIfElseArtikYil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("yil giriniz:");
        int yilİsmi = scan.nextInt();

        if (yilİsmi % 100 != 0) {
            if (yilİsmi % 4 == 0) {
                System.out.println("artik yildir");
            } else {
                System.out.println("artik yil degildir");

            }
        } else if (yilİsmi % 100 == 0) {
            if (yilİsmi % 400 == 0)
                System.out.println("artik yildir");

            else {
                System.out.println("artik yil degildir");
            }
        }else {
            System.out.println("artik yil degildir");
        }



      }

    }
