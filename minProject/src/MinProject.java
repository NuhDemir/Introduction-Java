// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MinProject {
    public static void main(String[] args) {
 int number = 1;
 int remainder = number % 2;
 System.out.println(remainder);
 boolean isPrime = true;
        if (number == 1) {
            System.out.println("Sayı Asal Değildir");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz Sayı");
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    isPrime = false;
                }
            }
        }
 if (isPrime){
     System.out.println("Sayı Asaldır");
 }else {
     System.out.println("Sayı Asal Değildir.");
 }
    }
}