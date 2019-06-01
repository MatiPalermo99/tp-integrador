package isi.died.tp.dominio;

public class Liquido extends Insumo {
	double stock;
	double densidad;
	Enum<UnidadesLiquido> UnidadDeMedida;

	public double calcularCosto() {
		return this.costo*this.stock;
	}







}
