package ar.edu.unlam.pb2.parcial1;

public class Cliente {
	private Integer CodigoDeCliente;
	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer Calquileres;
	public Cliente(Integer codigoDeCliente, String nombre,String apellido, Integer edad) {
		 this.CodigoDeCliente= codigoDeCliente;
		 this.nombre= nombre;
	     this.apellido = apellido;
	     this.edad = edad;
	}
	
	
	public Integer getCprestamos() {
		return Calquileres;
	}


	public void setCalquileres(Integer calquileres) {
		Calquileres = Calquileres;
	}


	public Integer getCodigoDeCliente() {
		return CodigoDeCliente;
	}
	public void setCodigoDeCliente(Integer codigoDeCliente) {
		CodigoDeCliente = codigoDeCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
}
