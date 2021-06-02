package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;


public class Pelicula extends Producto{
	 private String Genero;
	 private Integer AnoEstreno;
     private String Director;
     private String ActoresPrincipales;
     public Boolean Alaventa=true;
     public Boolean Sealquila=true;
     ArrayList<Actores> actores;

public Pelicula(Integer codigo, String descripcion, String Genero ,
		Integer AnoEstreno, String Director) {
	super( codigo, descripcion);
    this.AnoEstreno = AnoEstreno;
    this.Director = Director;
    this.Genero = Genero;
}

public String getGenero() {
	return Genero;
}

public void setGenero(String genero) {
	Genero = genero;
}

public Integer getAnoEstreno() {
	return AnoEstreno;
}

public void setAnoEstreno(Integer anoEstreno) {
	AnoEstreno = anoEstreno;
}

public String getDirector() {
	return Director;
}

public void setDirector(String director) {
	Director = director;
}

public String getActoresPrincipales() {
	return ActoresPrincipales;
}

public void setActoresPrincipales(String actoresPrincipales) {
	ActoresPrincipales = actoresPrincipales;
}
//@Override
public boolean isAlaventa() {
	return Alaventa;
}
//@Override
	public boolean IsSealquila() {
		return Sealquila;
	}

	public void agregarActor(Actores Actor) {
		
		actores.add(Actor);
		
	}

	public Boolean actua(Actores siactua) {
		boolean actua=false;
		for (int i = 0; i < actores.size(); i++) {
			 if (actores.get(i).getNombre().equals(siactua))
				 actua=true;
	                return actua;
		}
		return actua;
	}



}
