import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Arkadaş Sayılar");
        System.out.println("-------------------------------------------");
        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();

        int num1_remainder = 0;
        int num2_remainder = 0;

        for(int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                num1_remainder += i;
            }
        }

        for(int j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                num2_remainder += j;
            }
        }

        if (num1_remainder == num2 && num2_remainder == num1) {
            System.out.println("Arkadaş Sayılardır");
        } else {
            System.out.println("Arkadaş Sayı Değildir");
        }

        scanner.close();
    }
}
