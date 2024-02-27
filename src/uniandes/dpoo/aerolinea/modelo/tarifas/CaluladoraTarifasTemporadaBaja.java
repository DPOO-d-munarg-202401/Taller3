package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CaluladoraTarifasTemporadaBaja implements CalculadoraTarifas {
	int COSTO_PORKM_NATURAL= 600;
	int COSTO_POR_KM_CORPORATIVO=900;
	double DESCUENTO_PEQ=0.02;
	double DESCUENTO_MEDIANAS=0.1;
	double DESCUENTO_GRANDES=0.2;
	

	

	public int calcularTarifa(Vuelo vuelo, Cliente clisente) {
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
