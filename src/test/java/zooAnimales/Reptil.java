package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	private static List<Reptil> listado = new ArrayList<>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {}
	public Reptil(String nombre, int edad, String habitat, String genero,
			String colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	public static int cantidadReptiles() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
	public void crearIguana(String nombre, int edad, String genero) {
		new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas ++;
	}
	public void crearSerpiente(String nombre, int edad, String genero) {
		new Reptil(nombre,edad,"humedal",genero,"blanco",1);
		serpientes ++;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public void setListado(List<Reptil> nuevolistado) {
		listado = nuevolistado;
	}
	public List<Reptil> getListado(){
		return listado;
	}
}
