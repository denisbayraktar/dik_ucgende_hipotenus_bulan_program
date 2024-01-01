import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dikKenar1, dikKenar2;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Üçgenin 1. dik kenarını giriniz: ");
        Scanner input2 = new Scanner(System.in);
        dikKenar1 = input1.nextInt();
        System.out.print("Üçgenin 2. dik kenarını giriniz: ");
        dikKenar2 = input2.nextInt();
        double hipotenusHesaplama = Math.sqrt(Math.pow(dikKenar1,2) + Math.pow(dikKenar2,2));
        System.out.println("Hipotenüs: " + hipotenusHesaplama);
    }
}