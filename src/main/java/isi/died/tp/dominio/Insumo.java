package isi.died.tp.dominio;

public abstract class Insumo {
	int id;
	String desc;
	double peso;
	double costo;	//Costo por unidad de medida//
	boolean esRefrigerado;

	
	
	
public int getId() {
		return id;
	}
public void setId(int id) {
		this.id = id;
	}
public double getPeso() {
		return peso;
	}
public void setPeso(double peso) {
		this.peso = peso;
	}
public double getCosto() {
		return costo;
	}
public void setCosto(double costo) {
		this.costo = costo;
	}
public boolean isEsRefrigerado() {
		return esRefrigerado;
	}
public void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}




public double calcularCosto() {return 0;};	
}
