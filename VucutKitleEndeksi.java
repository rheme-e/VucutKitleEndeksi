package Giris;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
    int kilo;
    double sonuc,boy;
    Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz:");
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz:");
    kilo = inp.nextInt();
    boy= inp.nextDouble();
    sonuc= (kilo/(boy*boy));
        System.out.println("Vücut Kitle Endeksi=" + sonuc);
    }
}
