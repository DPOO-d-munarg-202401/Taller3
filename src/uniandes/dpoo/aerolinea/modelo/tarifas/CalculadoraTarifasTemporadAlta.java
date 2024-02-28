package uniandes.dpoo.aerolinea.modelo.tarifas;
	import uniandes.dpoo.aerolinea.modelo.Ruta;
	import uniandes.dpoo.aerolinea.modelo.Vuelo;
	import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
	
public class CalculadoraTarifasTemporadAlta implements CalculadoraTarifas {
	protected int COSTO_POR_KM=1000;
		
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;
	}


	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}


	public double calcularPorcentaje(Cliente cliente) {
		return 0;
	}


	public int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
	}


	public int calcularValorImpuestos(int costoBase) {
		return 0;
	}
	
}

