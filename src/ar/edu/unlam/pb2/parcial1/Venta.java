package ar.edu.unlam.pb2.parcial1;

public class Venta {
	Integer id;
    Integer cliente;
    Integer  producto;

public Venta(Integer id, Integer codigo, Integer cliente)
{
    this.id = id;
    this.cliente = cliente;
    this.producto = producto;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getCliente() {
	return cliente;
}

public void setCliente(Integer cliente) {
	this.cliente = cliente;
}

public Integer getProducto() {
	return producto;
}

public void setProducto(Integer producto) {
	this.producto = producto;
}


}
