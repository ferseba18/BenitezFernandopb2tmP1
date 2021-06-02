package ar.edu.unlam.pb2.parcial1;


public class Comestible extends Producto{
    public Boolean Alaventa=true;
    public Boolean Sealquila=false;
	public Comestible(Integer Codigo, String Descripcion) {
		super(Codigo, Descripcion);
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
