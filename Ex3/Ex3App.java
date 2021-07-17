
public class Ex3App {

	public static void masPaginas (Libro libro1,Libro libro2) {
		
		if(libro1.numero_paginas<libro2.numero_paginas) {
			System.out.println("Libro 2 tiene mas paginas");
		}else {
			System.out.println("Libro 1 tiene mas paginas");
		}
		
	}
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("978-3-16-148410-0","Libro 1","Autor 1",24);
		Libro libro2 = new Libro("878-4-29-958460-3","Libro 2","Autor 2",30);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		masPaginas(libro1,libro2);
		
	}
	
}
