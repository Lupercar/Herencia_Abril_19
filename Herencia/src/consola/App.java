package consola;

import java.util.Date;

import entidades.Producto;
import entidades.ProductoCaducable;
import entidades.ProductoNoCaducable;

public class App {

	public static void main(String[] args) {
		ProductoCaducable pc = new ProductoCaducable(1, "Producto1 Caducable", 1.00, new Date() );
		ProductoNoCaducable pnc = new ProductoNoCaducable(2, "Producto2 No Caducable", 1.00);
		
		System.out.println("pc\n"+pc); //utiliza el toString de la clase que hereda Producto, muestra todo menos la fecha.
		System.out.println("pnc\n"+pnc);
		
		//casting o moldeo
		Producto p = pc; //casting de hijo a padre
		pc =(ProductoCaducable) p; //casting de padre a hijo 
		System.out.println("\np casting\n"+p);
		System.out.println("pc casting\n"+pc);
		
//		El comando instanceof permite saber si un objeto es un IS-A de una clase
		if(pc instanceof ProductoCaducable)
			System.out.println("\nEs un producto de caducable.");
		
//		No tiene mucho sentido añadir un Producto, lo evito haciendo la clase abstracta
//		Producto p1 = new Producto(3, "Producto3", 3.00); 
	}
}
