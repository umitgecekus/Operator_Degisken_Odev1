package com.umit;

import java.util.Scanner;

public class Runner_Ornek_001 {
    public static void main(String[] args) {

        byte a= (byte)128; //byte sinirini astigimizde cast islemi yapmamiz gerekiyor 127 den sonra alinan deger -128 den baslayip hesaplaniyor
        System.out.println(a);

        char b= 65;
        char c= 'A';
        System.out.println(b + " " +c); // bu iki char degiskeni ayni sonucu doner. + islemi birlestirme
                                        // operatoru kullanimini yapti. Araya String deger girmeseydi toplama yapacakti.

        System.out.println(b+c);        // 65 + 65 = 130 sonucunu verir.

        /**
         * Klavyeden girilen çift haneli 2 sayiyinin ortalamasini bulup 9 ile carpip ,
         * sonucun klavyeden girilen rakamla modunu alip , sonuc <= 10 sonucunu kontrol
         * edip cikacak sonucu boolean donen program.
         */

        System.out.println("Lutfen 2 adet cift haneli sayi giriniz...: ");
        int s1= new Scanner(System.in).nextInt();
        int s2= new Scanner(System.in).nextInt();

        double ort= (double) (s1+s2)/2;  // s1 ve s2 int oldugu icin cast islemi yapmazsak sonuc int doner ve dogru sonuca ulasamayiz
        System.out.println(ort);
        ort*=9;  //degeri 9la carpip sonucu degere atama islemi yaptik.
        System.out.println(ort);

        System.out.println("Hangi rakamla mod almak istiyorsunuz");
        int s3=new Scanner(System.in).nextInt();

        ort%=s3;  //degerin klavyeden aldigimiz rakamla modunu alip degere atama islemi yaptik.
        System.out.println(ort);

        boolean kontrol=false;
        if (ort<=10) kontrol=true;
        System.out.println(kontrol);


    }   //main method sonu
}   //clsas sonu
