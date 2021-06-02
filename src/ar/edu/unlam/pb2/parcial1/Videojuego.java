package ar.edu.unlam.pb2.parcial1;



public class Videojuego extends Producto{
	private String Consola;
    public Boolean Alaventa=false;
    public Boolean Sealquila=true;
	public Videojuego( Integer Codigo, String Descripcion ,String Consola)
	 {
		 super(Codigo, Descripcion);
	     this.Consola = Consola;
	     
	 }


	public String getConsola() {
		return Consola;
	}

	public void setConsola(String consola) {
		Consola = consola;
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
