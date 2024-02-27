package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

import java.util.HashSet;
import java.util.Set;



public class GeneradorTiquetes implements Tiquete{
	public Set<String> codigos = new HashSet<String>();
	
	public GeneradorTiquetes generarTiquete(Vuelo vuelo,Cliente Cliente,int tarifa) {
		return null;
	}
	
	public void regustrarTiquete(GeneradorTiquetes unTiquete) {
		
	}
	public boolean validarTiquete(String codigoTiquete) {
		return true;
	}


	public String getCodigo() {
		return null;
	}

	public int getTarifa() {
		return 0;
	}

	public boolean isUsado() {
		return false;
	}


	public Vuelo getVuelo() {
		return null;
	}

	public Cliente getCliente() {
		return null;
	}
}
