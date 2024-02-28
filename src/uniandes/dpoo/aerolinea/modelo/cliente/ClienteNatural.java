package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{

		private String nombre;
		public static String NATURAL = "Natural";
		
		public ClienteNatural(String nombre) {
			this.nombre=nombre;
			
		}
		
		public String getIdentificador() {
			return null;
		}
		public String getTipoCliente() {
			return ClienteNatural.NATURAL;
		}
	}

