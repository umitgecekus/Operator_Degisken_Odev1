package com.umit;

public class Operatorler_Tanim {

    /**
     *
     * -----OPERATORLER-----
     * Operatorler
     *
     * 1-ARITMETIK OPERATORLER
     *  +(toplama), -(cikartma), *(carpma),/(bolme) ve % (mod alma) dan olusur.
     *
     * 2-GOREV (ASSIGMENT) OPERATORLERI
     *  += (toplama yapıp yeni deger olusur) int a=5 , a+=3 , a nin 8 olmasini saglar.
     *  -= (cikartma yapıp yeni deger olusur)
     *  /= (bolme yapip yeni deger olusur)
     *  *= (carpma yapip yeni deger olusur)
     *  %= (mod alip yeni degere esitlenir) double a=35 , a%=2 , 35in 2 ye modunu alip a ye esitler , a=1 olur.
     *  ++ (degerin 1 artmasını saglar, degiskenden once gelirse islemden once,sonra gelirse islemden sonra degiskenin degeri artar)
     *  -- (degerin 1 azalmasini saglar, degiskenden once gelirse islemden once,sonra gelirse islemden sonra degiskenin degeri azalir)
     *
     * 3-ATAMA OPERATORU
     *  = (esitligin sag tarafinda ki degeri sol tarafa atama yapar)
     *
     * 4-KARSILASTIRMA OPERATORLERI
     *  >(buyuktur) , <(kucuktur) , >=(buyuk esit) , <= (kucuk esit), ==(esit mi) , != (esit degil mi) kontrollerini yapar.
     *
     * 5-MANTIKSAL OPERATORLER
     * Boolean deger donerler.
     *
     * &&(ve) 1&&1 dogru deger doner , &&(ve) operatorunde 0 olmasi false donmeye sebep olur.
     * ||(veya) operatorunde 1 tane true deger olmasi kosulun true donmesine sebep olur
     * !(degil) icerde donen degeri tersine cevirir, false degerin basine geldiginde true olmus olur.
     *
     * 6-BIRLESTIRME OPERATORU
     *  + operatoru int degiskenlerde toplama ozelligine sahipken String degiskenlerde birlestirmeyi saglar.
     *  String a= "asd" ,   a + "fg " yaparsak a= "asdfg" olmus olur.
     *
     */
    public static void main(String[] args) {

        int s1=12,s2=6;
        System.out.println(s1+s2); //toplama
        System.out.println(s1-s2); //cikarma
        System.out.println(s1*s2); //carpma
        System.out.println(s1/s2); //bolme
        System.out.println("mod alma "+s1%s2); //mod alma
        s1+=s2; //s1 degerine s2 ekleyip ,s1 yeni deger kazandirmis oluruz.
        // + yazdigimiz yere - , / , * , % islemlerini de yazabiliriz.
        System.out.println(s1);
        s1++; //deger 1 artar (--yaparsak 1 azalir)
        System.out.println(s1);

        if (s1>s2) System.out.println("s1 buyuktur... ");
        // > , < , >= , <= , == , != gibi operatorler de kosullarda kullanilabilir.
        int s3=12,s4=45;
        if (s1>s2 || s3<s4) System.out.println("yazdir"); //veya kosulunu kullandik

    }

}
