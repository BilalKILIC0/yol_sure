//Klavyeden Yol Uzunluğu Ve Hızı Girilen Aracın Yolu Kaç Saatte Gideceğini Hesaplayan Program.

/*
Adım 1: Başla.
Adım 2: Kullanıcıdan Yol Uzunluğu Ve Aracın Hızını Al.
Adım 3: double saat =(uzunluk/hız) işlemini yap.
Adım 4: Bulduğun değeri Ekrana Yazdır.
Adım 5: Dur.
*/
package yol_sure;
import java.util.Scanner; //java'nın Util Kütüphanesinden Scanner Class'ı Programımıza Ekledik.



public class Yol_sure {

    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); //Consoldan Değer Almak İçin Tanımladık.
       System.out.println("Gidiceğiniz Yolun KM Cinsinden Uzunluğunu Giriniz :");
       double uzunluk=input.nextDouble();
       System.out.println("Ortalama Kaç KM/S Hızla Gidiceğinizi Giriniz :");
       double hız=input.nextDouble();
       
       double saat =(uzunluk/hız); //X=V.T Formülünden Yararlandık.
       
       System.out.println("Yolculuğunuzun Toplam Süresi :" +saat); //En Son Yaptığımız İşlemi Ekrana Yazdırdık.
       
        
    }
    
}
