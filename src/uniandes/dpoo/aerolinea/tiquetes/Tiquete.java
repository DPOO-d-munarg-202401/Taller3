package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.clientes.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import java.util.HashSet;
import java.util.Set;



public interface Tiquete {
    String getCodigo();
    int getTarifa();
    boolean isUsado();
    Vuelo getVuelo();
    Cliente getCliente();
    
    public class TiqueteImpl implements Tiquete {
        private String codigo;
        private int tarifa;
        private boolean usado;
        private Vuelo vuelo;
        private Cliente clienteComprador;
    
    public TiqueteImpl(String codigo, int tarifa, boolean usado, Vuelo vuelo, Cliente clienteComprador) {
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.usado = usado;
        this.vuelo = vuelo;
        this.clienteComprador = clienteComprador;
    }
    
	public String getCodigo() { 
		return codigo; 
		}
	    
	    public int getTarifa() { 
	    	return tarifa; 
	    	}
	    
	    public boolean isUsado() { 
	    	return usado; 
	    }
	    
	    public void marcarComoUsado() {
	    	this.usado = true; 
	    	}
	    
	    public Vuelo getVuelo() { 
	    	return vuelo; 
	    	}
	    
	    public Cliente getCliente() {
	    	return clienteComprador; 
	    	}
    }
}

			
