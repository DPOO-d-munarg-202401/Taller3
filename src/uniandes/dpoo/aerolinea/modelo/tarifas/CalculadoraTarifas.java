package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;


public abstract interface CalculadoraTarifas {
	public double IMPUESTO = 0.28;
	
	public int calcularTarifa(Vuelo vuelo, Cliente clisente);
	
	int calcularCostoBase(Vuelo vuelo,Cliente cliente);
	
	double calcularPorcentaje(Cliente cliente);
	
	int calcularDistanciaVuelo(Ruta ruta);
	
	int calcularValorImpuestos(int costoBase);
}
