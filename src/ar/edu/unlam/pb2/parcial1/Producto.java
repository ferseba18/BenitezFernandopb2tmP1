package ar.edu.unlam.pb2.parcial1;

public class Producto {
	protected Integer Codigo;
	protected String Descripcion;
	protected Boolean Alaventa;
	protected Boolean Sealquila;
	private Double PrecioAlquiler= -10.0;
	private Double PrecioVenta= -10.0;
	private Integer Clasificacion;
	public Producto(Integer Codigo,String Descripcion)
	 {
	     this.Codigo = Codigo;
	     this.Descripcion = Descripcion;
	     
	 }

	public Integer getCodigo() {
		return Codigo;
	}

	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	

	public boolean isAlaventa() {
		return Alaventa;
	}

	public void setAlaventa(boolean alaventa) {
		Alaventa = alaventa;
	}

	public boolean isSealquila() {
		return Sealquila;
	}

	public void setSealquila(boolean sealquila) {
		Sealquila = sealquila;
	}
	public Double precioDeAlquiler(Double Precio) {
		if(Sealquila= true) {
			PrecioAlquiler=Precio;
			}
		return this.PrecioAlquiler;
		
	}
	public Double precioDeVenta(Double Precio) {
		
		if(Alaventa= true) {
		PrecioVenta=Precio;
		}
		
		return this.PrecioVenta;
		
	}
	public Double getprecioDeVenta() {
		return PrecioVenta;
	}
	public Double getprecioDeAlquiler() {
		return PrecioAlquiler;
	}
	public Integer getClasificacion() {
		return Clasificacion;
	}

	public void setClasificacion(Integer clasificacion) {
		Clasificacion = clasificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Codigo == null) ? 0 : Codigo.hashCode());
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (Codigo == null) {
			if (other.Codigo != null)
				return false;
		} else if (!Codigo.equals(other.Codigo))
			return false;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		return true;
	}
	
	
}
