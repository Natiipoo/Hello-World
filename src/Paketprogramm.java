import java.util.*;

public class Paketprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double l, b, h;
		double v, o, lae;
		
		System.out.println("Paketprogramm: ");
		System.out.println("alle Werte in cm: ");
		System.out.println(" ");
		
		System.out.print("Geben Sie die Laenge ein: ");
		l = sc.nextDouble();
		
		if (l<=0){
			System.out.println("Fehler.");
		}
		else{
			System.out.print("Geben Sie die Breite ein: ");
			b = sc.nextDouble();
			
			if (b<=0) {
				System.out.println("Fehler.");
			}
			else{
				System.out.print("Geben Sie die Hoehe ein: ");
				h = sc.nextDouble();
				System.out.println(" ");
				
				if (h<=0) {
					System.out.println("Fehler.");
				}
				else{
					v = getVolumen(l, b, h);
					o = 2*(l*b+ l*h+ b*h);
					lae = 2*l+ 2*b+ 4*h+ 10;
					
					System.out.print("Das Volumen betraegt: " +v);
					System.out.println(" cm^3");
					System.out.print("Sie brauchen " +o);
					System.out.println(" cm^2 Papier");
					System.out.print("Die Schnur muss "+lae);
					System.out.println(" cm lang sein");
				}
			}
		}	
	}
	static double getVolumen(double h, double b, double l){
		return l*b*h;
	}
}
