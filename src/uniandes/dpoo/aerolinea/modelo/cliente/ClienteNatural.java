package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{

		public static final String NATURAL = null;
		private String nombre;
		String natural = "Natural";
		
		public ClienteNatural(String nombre) {
			this.nombre=nombre;
			
		}
		
		public String getNombre() {
			return nombre;
		}
		public String getIdentificador() {
			return null;
		}
	}

