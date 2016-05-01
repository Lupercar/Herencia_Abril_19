package entidades;

public class ProductoNoCaducable extends Producto{
	
//	Constructor sin par�metros que llama al constructor con par�metros ProductoCaducable
	public ProductoNoCaducable() {
		this(0, "", 0.0); //centralizo todo en el constructor con par�metros
	}

//	Constructor que llama al constructor de la clase Padre
	public ProductoNoCaducable(int codigo, String nombre, double precio) {
		super(codigo, nombre, precio); 
	}
	
}
