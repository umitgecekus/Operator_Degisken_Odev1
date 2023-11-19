package com.umit;

public class Degiskenler_Tanim {

    /**
     * Değişkenler
     *
     * Syntax [değişken türü + değişken adı] bir değişken tanımlar.
     * Syntax [degiskenin adi = atanilacak deger] degiskene deger atamasi yapmayi saglar.
     * syntax [degisken türü + degişken adi= değer] yeni tanimlanan degiskene deger atamasi yapmayi saglar.
     */

    /**
     * Veri tipleri 3e ayrılıyor, 1- Ilkel (Primitive) Veri Tipleri , 2- Referans Veri Tipleri, 3- Null
     *
     * 1- Ilkel (Primitive) Veri Tipi
     *  a-Sayisal Veri Tipleri
     *   a.1- byte   -128 , 127 arasi 256 tane deger alir. En kucuk yapi bit tir ve 1 byte 8 bit ten olusur.
     *   a.2- short  2^16 tane deger alir.
     *   a.3- int    2^32 tane deger alir. Default degisken turudur.
     *   a.4- long   2^64 tane deger alir. int sinirini astiginde sayinin sonuna L veya l konulmasi gerekiyor.
     *   a.5- char   Karakter veri tipindedir. char klm='B' veya =66(ASCII) ikiside ayni ciktiyi verir.
     *  b-Kesirli Veri Tipleri
     *   b.1- float  2^32 tane deger alir. Sonuna f konulur . 59.956f gibi
     *   b.2- double 2^64 tane deger alir. Sonuna d konulur. Default degisken turudur.
     *

     *  String veri tipi
     *  " " ile yazilan tum ifadeler string olarak tanimlanir. Javanin default tanimlarindan biridir.
     *
     *
     * 2-Referans Veri Tipleri
     *  a-Class
     *  b-Interface
     *  c-Array
     *
     * 3-Null Veri Tipi
     *
     */
    public static void main(String[] args) {
        byte s1=56;
        byte s2=4;
        byte toplam=(byte)(s1+s2); //degeri byte a cast etmemiz gerekir.
        System.out.println(toplam);

        short s3= 32767;
        byte s4= 5+4;
        int s5= 5+4;

        long s6= 5_465_465_465l; //int degerleri asildigi zaman long degiskeni sonuna l L getirilmeli
        float s7= 59.554f;
        double s8=545.64546544545454545;

        int sayi=(int)54654.45454f; //cast yapilmazsa hata aliriz
        System.out.println(sayi);

        int s9=46;
        float sayi_f= s9;
        System.out.println(sayi_f); //daha genis kapsamli donusumlerde cast e gerek yok.

        char karakter= 't';
        char sayisalKarakter= 66; //B degerini yazdirir
        System.out.println(karakter+"  "+sayisalKarakter);

        boolean kontrol=true;
        System.out.println(kontrol);

        String ad= "Umit";
        System.out.println(ad);

    }

}
