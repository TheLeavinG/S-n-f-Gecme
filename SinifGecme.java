import java.util.Scanner;


public class SinifGecme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double mat,fizik,kimya,biyoloji,geo;
        double ortalama;

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextDouble();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextDouble();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextDouble();

        System.out.print("Biyoloji Notunuzu Giriniz : ");
        biyoloji = input.nextDouble();

        System.out.print("Geometri Notunuzu Giriniz : ");
        geo = input.nextDouble();


        ortalama = (mat+fizik+kimya+biyoloji+geo)/5 ;

        if ( ortalama < 55 ) {

            System.out.println("SINIFTA KALDINIZ!");
            System.out.print("Ortalamaniz : " + ortalama);

        }


        else if (ortalama >= 55) {

            System.out.println("TEBRIKLER SINIFI GECTINIZ!");
            System.out.print("Ortalamaniz : " + ortalama);

        }



    }

}
