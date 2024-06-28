public class PerfectNumber {
    public static void main(String[] args) {

        int number = 6; // Mükemmel sayı örneği
        int total = 0;

        // Pozitif bölenlerini bul
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        // Mükemmel sayı kontrolü
        if (total == number) {
            System.out.println(number + " Mükemmel sayıdır");
        } else {
            System.out.println(number + " Mükemmel sayı değildir");
        }
    }
}
