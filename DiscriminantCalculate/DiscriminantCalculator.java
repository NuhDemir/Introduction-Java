import java.util.Scanner;

public class DiscriminantCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Kullanıcıdan a,b ve c değerlerini al.
		System.out.println("Merhaba Kullanıcı, diskriminat hesaplama programına\n hoşgeldin!");
		
		System.out.print("a değerini girin: ");
		double a =sc.nextDouble();
		
		System.out.print("b değerini girin: ");
		double b = sc.nextDouble();
		
		System.out.print("c değerini giriniz: ");
		double c = sc.nextDouble();
		
		//Diskiriminatı hesapla
		double discriminant = calculateDiscriminant(a,b,c);
		
		//Sonucu göster
		System.out.println("Diskriminant değeri: " + discriminant);
		
		//Diskriminantın köklerin gerçek olup olmadığını belirleme
		if(discriminant>0){System.out.println("Denklemin iki farkli gerçek kökü vardir.");}
		else if (discriminant ==0) {System.out.println("Denklemin çakışık iki gerçek kökü vardir.");}
		else {System.out.println("Denklemin iki karmaşık kökü vardir.");}
		
		
		
sc.close();
	}
	public static double calculateDiscriminant(double a,double b, double c)
	{
		return b*b 4 * a * c;
	}
}
