package consola;

import java.util.Date;

import entidades.ProductoCaducable;

public class App {

	public static void main(String[] args) {
		ProductoCaducable pc = new ProductoCaducable(1, "Producto1 Caducable", 1.00, new Date() );
		System.out.println(pc); //utiliza el toString de la clase que hereda Producto, muestra todo menos la fecha.
	}
}
