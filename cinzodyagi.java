import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Doğum Yılınızı Giriniz");
        year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("Çin Zodyağı Burcunuz Maymundur");
                break;

            case 1:
                System.out.println("Çin Zodyağı Burcunuz Horozdur");

            case 2:
                System.out.println("Çin Zodyağı Burcunuz Köpekdir");
                break;

            case 3:
                System.out.println("Çin Zodyağı Burcunuz Domuzdur");
                break;

            case 4:
                System.out.println("Çin Zodyağı Burcunuz Faredir");
                break;

            case 5:
                System.out.println("Çin Zodyağı Burcunuz Öküzdür");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz Kaplandır");
                break;

            case 7:
                System.out.println("Çin Zodyağı Burcunuz Tavşandır");
                break;

            case 8:
                System.out.println("Çin Zodyağı Burcunuz Ejderhadır");
                break;

            case 9:
                System.out.println("Çin Zodyağı Burcunuz Yılandır");
                break;


            case 10:
                System.out.println("Çin Zodyağı Burcunuz Attır");
                break;


            case 11:
                System.out.println("Çin Zodyağı Burcunuz Koyundur");
                break;


        }


        if (year <0 ){
            System.out.println("Geçerli Bir Değer Giriniz");
        }
    }
}
