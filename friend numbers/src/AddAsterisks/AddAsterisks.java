package AddAsterisks;

import java.util.Scanner;

public class AddAsterisks {
    public static void main(String[] args) {
        // Kullanıcıdan kelime almak için Scanner oluştur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String input = scanner.next();

        // Asterisks eklemek için StringBuilder kullan
        StringBuilder result = new StringBuilder();

        // Kelimenin harflerinin arasına "*" ekle
        for (int i = 0; i < input.length(); i++) {
            result.append(input.charAt(i));
            if (i < input.length() - 1) {
                result.append('*');
            }
        }

        // Sonucu ekrana yazdır
        System.out.println(result.toString());

        // Scanner'ı kapat
        scanner.close();
    }
}
