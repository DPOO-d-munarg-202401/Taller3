package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;



public class Tiquete {
    private String codigo;
    private int tarifa;
    private boolean usado;
    private Vuelo vuelo;
    private Cliente cliente;

    public Tiquete(String codigo, int tarifa, boolean usado, Vuelo vuelo, Cliente clienteComprador) {
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.usado = usado;
        this.vuelo = vuelo;
        this.cliente = clienteComprador;
    }
    
	public String getCodigo() { 
		return this.codigo; 
		}
	    
	    public int getTarifa() { 
	    	return this.tarifa; 
	    	}
	    
	    public boolean isUsado() { 
	    	return this.usado; 
	    }
	    
	    public void marcarComoUsado() {
	    	this.usado = true; 
	    	}
	    
	    public Vuelo getVuelo() { 
	    	return this.vuelo; 
	    	}
	    
	    public Cliente getCliente() {
	    	return this.cliente; 
	    	}
    }



			
