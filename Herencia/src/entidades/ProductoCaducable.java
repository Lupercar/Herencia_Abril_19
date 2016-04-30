package entidades;

import java.util.Date;

public class ProductoCaducable extends Producto {
	private Date fechaCaducidad;

	public ProductoCaducable() {
		// le pongo como fecha inicial la fecha de hoy
		this(0, "", 0.0, new Date()); // llamada al constructor de la clase
	}

	public ProductoCaducable(int codigo, String nombre, double precio, Date fecha) {
		super(codigo, nombre, precio);//llamada al constructor del padre en este caso a Producto
		setFechaCaducidad(fecha);
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

}
