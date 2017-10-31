import java.util.*;

public class Studienberatung{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String antwort = new String();
		
		System.out.println("Hast du Abitur?");
		
		antwort = scanner.nextLine();
		if(antwort=="n"){
			System.out.println("Hast du Fachabitur?");{
				antwort = scanner.nextLine();
				if(antwort =="j"){
					System.out.println("Hast du eine Berufsausbildung?");
					antwort = scanner.nextLine();
				}
			}
		else if	(antwort=="j"){
			System.out.println("Bist du wissbegierig?");
		}
		
	}
}