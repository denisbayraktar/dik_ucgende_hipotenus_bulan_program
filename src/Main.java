import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dikKenar1, dikKenar2;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Üçgenin birinci dik kenarını giriniz: ");
        Scanner input2 = new Scanner(System.in);
        dikKenar1 = input1.nextInt();
        System.out.print("Üçgenin ikinci dik kenarını giriniz: ");
        dikKenar2 = input2.nextInt();
        double hipotenusHesaplama = Math.sqrt(Math.pow(dikKenar1,2) + Math.pow(dikKenar2,2));
        System.out.println("Hipotenüs: " + hipotenusHesaplama);

        System.out.println("------------------------------------------------------------");

        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını giriniz: ");
        a = input.nextDouble();
        System.out.println("Üçgenin ikinci kenarını giriniz: ");
        b = input.nextDouble();
        System.out.println("Üçgenin üçüncü kenarını giriniz: ");
        c = input.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}