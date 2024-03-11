// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
Mükemmel sayı, pozitif tam sayılar içinde özel bir
 kategoridir. Bir sayı, kendisi hariç pozitif bölenlerinin
 toplamına eşitse, bu sayı mükemmel olarak adlandırılır.*/
        int number = 5 ;
        int total = 0;

        for(int i = 0; i <number; i++){
            if (number % i == 0) {
                total = total+i;
                System.out.println("Mükemmel sayıdr");
            }else {
                System.out.println("Mükemmel Sayı Değildir");
            }
        }

    }
}