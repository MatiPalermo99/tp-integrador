package isi.died.tp.dominio;

public class Liquido extends Insumo {
	double stock; //El stock de cada insumo se almacena en unidades de medidas
	double densidad;//propias del insumo, por lo que los liquidos se almacenaran en Litros/M3
	Enum<UnidadesLiquido> UnidadDeMedida;

	public double calcularCosto() {
		double f = this.costo*(this.stock*this.densidad);//Como el costo se calcula en base al peso
		return f;										//del insumo, multiplicamos el costo x el peso
	}







}
