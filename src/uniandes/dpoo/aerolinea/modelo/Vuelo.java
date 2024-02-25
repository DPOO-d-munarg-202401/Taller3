package uniandes.dpoo.aerolinea.modelo;

public class Vuelo {

	private String fecha;
	private Ruta ruta;
	private Avion avion ;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
        this.fecha = fecha;
        this.ruta = ruta; 
        this.avion = avion; 
    }
	public String getFecha() {
		return fecha;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public Avion getAvion() {
		return avion;
	}

}
