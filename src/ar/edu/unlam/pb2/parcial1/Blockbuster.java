package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;


public class Blockbuster {
	    ArrayList<Producto> productos;
	    ArrayList<Cliente> clientes;
	    ArrayList<Alquiler> alquileres;
	    ArrayList<Venta> ventas;
	    Integer Alquilerhecho = 0;
	    Integer TopeAlquileres = 2;
	    Integer NoAlquilado = -123;
	    Integer Ventahecha = 0;
	    
	    public Blockbuster(){
	    	productos= new ArrayList<>();
	    	clientes= new ArrayList<>();
	    	ArrayList<Alquiler> alquileres;
	 	    ArrayList<Venta> ventas;
	    }
	    public Producto getProducto(Integer codigo)
	    {
	        // Buscar si hay producto
	        for (Producto producto : productos)
	          {
	            if (producto.getCodigo().equals(codigo))
	                return producto;
	          }

	        return null;
	    }
	    public Integer cantidadAlquileres(Integer ClienteCod)
	    {
	        Integer calq = 0;

	        for (Cliente cliente : clientes)
	          {
	            if (clientes.getCodigoDeCliente().equals(ClienteCod))
	                calq++;
	          }

	        return calq;
	    }
	    public Integer Avergiuarclasificacion(Integer ClienteCod)
	    {
	        Integer clasificacion = 0;

	        for (Cliente cliente : clientes)
	          {
	            if (clientes.getEdad().equals(ClienteCod))
	            	clasificacion++;
	          }

	        return clasificacion;
	    }
	    public Boolean AlquilarProducto(Integer codigo, Integer ClienteCod)
	    {
	     
	        Producto producto = getProducto(codigo);

	        if (producto != null)
	          {
	            if ((producto.isSealquila() == true)
	                    && (cantidadAlquileres(ClienteCod) > TopeAlquileres) && 
	                    (Avergiuarclasificacion(ClienteCod) <= producto.getClasificacion())
	                    
	            		)
	                    		
	                    		//Cliente. > TopeAlquileres))
	              {
	            	Alquilerhecho++;
	            	alquileres.add(new Alquiler(Alquilerhecho, codigo, ClienteCod));
	                return true;
	              }
	          }

	        return false;
	    }
	    public Boolean VenderProducto(Integer codigo, Integer ClienteCod)
	    {
	     
	        Producto producto = getProducto(codigo);

	        if (producto != null)
	          {
	            if ((producto.isAlaventa() == true) )
	                    		
	                    		//Cliente. > TopeAlquileres))
	              {
	            	Ventahecha++;
	            	ventas.add(new Venta(Ventahecha, codigo, ClienteCod));
	                return true;
	              }
	          }

	        return false;
	    }
	    
	    
} 
