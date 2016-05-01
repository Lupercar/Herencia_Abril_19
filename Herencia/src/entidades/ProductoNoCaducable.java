package entidades;

public class ProductoNoCaducable extends Producto {

	// Constructor sin parámetros que llama al constructor con parámetros
	// ProductoCaducable
	public ProductoNoCaducable() {
		this(0, "", 0.0); // centralizo todo en el constructor con parámetros
	}

	// Constructor que llama al constructor de la clase Padre
	public ProductoNoCaducable(int codigo, String nombre, double precio) {
		super(codigo, nombre, precio);
	}

	@Override
	public String toString() {
		return "ProductoNoCaducable [" +
				super.toString()+
				"]";
	}

}
