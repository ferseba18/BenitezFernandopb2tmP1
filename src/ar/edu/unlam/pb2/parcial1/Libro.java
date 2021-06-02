package ar.edu.unlam.pb2.parcial1;


public class Libro extends Producto{
	private String Autor;
	private String Editorial;
    public Boolean Alaventa=true;
    public Boolean Sealquila=false;
	
	public Libro(Integer Codigo, String Descripcion, String Autor,String Editorial)
	 {
		 super(Codigo, Descripcion);
	     this.Autor = Autor;
	     this.Editorial = Editorial;
	     
	 }

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	
	
	
	//@Override
	public boolean isAlaventa() {
		return Alaventa;
	}
	//@Override
		public boolean IsSealquila() {
			return Sealquila;
		}
	
}
