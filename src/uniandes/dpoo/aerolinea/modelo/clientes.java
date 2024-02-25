package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

import org.json.JSONObject;

public class clientes{
	 
	public static abstract class Cliente{

		public void cliente() {
			
		}
		public String getTipoCliente() {
			return null;
		}
	
		public String getIdentificador() {
			return null;
		}
		
		public void agregarTiquete(Tiquete tiquete) {
			
		}
		
		public int calcularValorTotalTiquete() {
			return 0;
		}
		
		public void usarTiquete(Vuelo vuelo) {
			
		}
	}
	class clienteCorporativo extends Cliente {
		private String nombreEmpresa;
		private int tamanoEmpresa;
		
		String CORPORATIVO = "Corporativo";
		int GRANDE = 1;
		int MEDIANA = 2;
		int PEQUENA = 3;
		
		public clienteCorporativo(String nombreEmpresa, int tamanoEmpresa) {
			this.nombreEmpresa=nombreEmpresa;
			this.tamanoEmpresa=tamanoEmpresa;
		}
		 
		
		public String getNombreEmpresa() {
			return nombreEmpresa;
		}
		public int getTamanoEmpresa() {
			return tamanoEmpresa;
		}
		
		public clienteCorporativo cargarDesdeJSON(JSONObject cliente) {
			return null;
			
		}
		
		public JSONObject salvarEnJSON() {
			return null;
			
		}
		
		public String getIdentificador() {
			return null;
		}
	}
	
	class clienteNatural extends Cliente {
		private String nombre;
		String natural = "Natural";
		
		public clienteNatural(String nombre) {
			this.nombre=nombre;
			
		}
		
		public String getNombre() {
			return nombre;
		}
		public String getIdentificador() {
			return null;
		}
	}

}
