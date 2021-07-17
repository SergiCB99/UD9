import java.util.Scanner;

public class Ex4App {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Valor de a");
		a=teclado.nextInt();
		
		System.out.println("Valor de b");
		b=teclado.nextInt();
		
		System.out.println("Valor de c");
		c=teclado.nextInt();
		
		Raices raiz = new Raices(a,b,c);
		
		raiz.calcular();
		
		
	}
	
}
