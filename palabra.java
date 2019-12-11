package examenjava;
 
import java.util.Scanner;

/**
 *
 * @author ela24
 */
public class Palabra {
public static void main(String[] args) {
		String pal;
		String palInvertida = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una palabra para comprobar si es palindromo");
		pal = sc.nextLine();
		
		
		for (int x=pal.length()-1;x>=0;x--)
			palInvertida = (String) (palInvertida + pal.charAt(x));
		
		if(pal.equals(palInvertida)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
	}
  

} 