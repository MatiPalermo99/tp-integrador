package isi.died.tp.dominio;

public class Granel extends Insumo{
	double stock;
	Enum<UnidadesGranel> UnidadDeMedida;

public double calcularCosto() {
	return this.costo*this.stock;
}




}