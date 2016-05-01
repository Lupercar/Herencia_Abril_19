package consola;

import java.util.Date;

import entidades.Producto;
import entidades.ProductoCaducable;

public class App {

	public static void main(String[] args) {
		ProductoCaducable pc = new ProductoCaducable(1, "Producto1 Caducable", 1.00, new Date() );
		System.out.println("pc\n"+pc); //utiliza el toString de la clase que hereda Producto, muestra todo menos la fecha.
		
		//casting o moldeo
		Producto p = pc; 
		System.out.println("p\n"+p);
		
//		El comando instanceof permite saber si un objeto es un IS-A de una clase
		if(pc instanceof ProductoCaducable)
			System.out.println("Es un producto de caducable.");
	}
}
