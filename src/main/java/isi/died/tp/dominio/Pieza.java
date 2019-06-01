package isi.died.tp.dominio;

public class Pieza extends Insumo{
	int stock;
	Enum<UnidadesPieza> UnidadDeMedida;

	@Override
	public double calcularCosto() {
		return this.costo*this.stock;
	}
}
