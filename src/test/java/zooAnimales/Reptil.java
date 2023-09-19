package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	private static List<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
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
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas ++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre,edad,"humedal",genero,"blanco",1);
		serpientes ++;
		return serpiente;
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
	public static List<Reptil> getListado(){
		return listado;
	}
}
