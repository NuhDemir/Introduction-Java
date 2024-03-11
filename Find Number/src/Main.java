import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturma
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu al
        System.out.print("Dizinin boyutunu giriniz: ");
        int size = scanner.nextInt();

        // Diziyi oluştur
        int[] numbers = new int[size];

        // Kullanıcıdan dizi elemanlarını al
        for (int i = 0; i < size; i++) {
            System.out.print("Sayı " + (i + 1) + " giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        // Aranacak sayıyı al
        System.out.print("Aranacak sayıyı giriniz: ");
        int search_number = scanner.nextInt();

        // Aranan sayının dizide olup olmadığını kontrol et
        boolean isThere = false;
        for (int number : numbers) {
            if (number == search_number) {
                isThere = true;
                break;
            }
        }

        // Sonucu ekrana yazdır
        if (isThere) {
            System.out.println("Sayı Mevcuttur");
        } else {
            System.out.println("Sayı Mevcut Değildir");
        }

        // Scanner nesnesini kapat
        scanner.close();
    }
}
