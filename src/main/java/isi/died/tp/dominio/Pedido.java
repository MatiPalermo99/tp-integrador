package isi.died.tp.dominio;
import java.util.ArrayList;


public class Pedido {
	ArrayList<Insumo> lista;
	

	public ArrayList<Insumo> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Insumo> lista) {
		this.lista = lista;
	}
	public void agregarInsumo(Insumo a) {
		this.lista.add(a);
	}
	















}
