
public class Ex1App {

	public static void main(String[] args) {
		
		Electrodomestico array[] = new Electrodomestico [10];
		
		Electrodomestico electrodomestico1 = new Electrodomestico ();
		Electrodomestico electrodomestico2 = new Electrodomestico (150.0,100.0);
		Electrodomestico electrodomestico3 = new Electrodomestico (300.0,"Gris",'A',250.64);
		
		Lavadora lavadora1 = new Lavadora (); 
		Lavadora lavadora2 = new Lavadora (200.0,250.0); 
		Lavadora lavadora3 = new Lavadora (150.0,"Blanco",'C',120.51,15);
		
		Television television1 = new Television (); 
		Television television2 = new Television (150.0,25.0); 
		Television television3 = new Television (125.0,"Negro",'A',45.0,50,true);
		Television television4 = new Television ();
		
		array[0] = electrodomestico1;
		array[1] = lavadora1;
		array[2] = television1;
		array[3] = electrodomestico2;
		array[4] = lavadora2;	
		array[5] = television2;		
		array[6] = electrodomestico3;
		array[7] = lavadora3;
		array[8] = television3;
		array[9] = television4;
		
		Double precio_electrodomestico = 0.0;
		Double precio_lavadora = 0.0;
		Double precio_televisor = 0.0;
		Double precio = 0.0;
		
		for(int i=0;i<array.length;i++) {
			
			array[i].precioFinal();
			
			if(array[i] instanceof Lavadora) {
				
				precio_lavadora = precio_lavadora + array[i].precio_base;
				precio_electrodomestico = precio_electrodomestico + array[i].precio_base;
			}else if(array[i] instanceof Television) {
				
				precio_televisor = precio_televisor + array[i].precio_base;
				precio_electrodomestico = precio_electrodomestico + array[i].precio_base;
			}
		}
	
		System.out.println("Electro"+precio_electrodomestico);
		System.out.println("Lavad "+precio_lavadora);
		System.out.println("TV "+precio_televisor);
		
	}
	
}
