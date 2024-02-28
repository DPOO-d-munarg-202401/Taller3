package uniandes.dpoo.aerolinea.modelo;
import java.util.Collection;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
public class Vuelo {

	private String fecha;
	private Ruta ruta;
	private Avion avion ;
	public Collection<Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
        this.fecha = fecha;
        this.ruta = ruta; 
        this.avion = avion; 
    }
	public String getFecha() {
		return this.fecha;
	}
	public Ruta getRuta() {
		return this.ruta;
	}
	public Avion getAvion() {
		return this.avion;
	}
	public Collection<Tiquete> getTiquetes(){
		return this.tiquetes;
		
	}
	
	

}
