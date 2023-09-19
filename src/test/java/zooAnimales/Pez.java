package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado = new ArrayList<>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {}
	public Pez(String nombre, int edad, String habitat, String genero,
			String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
	public void crearSalmon(String nombre, int edad, String genero) {
		new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones ++;
	}
	public void crearBacalao(String nombre, int edad, String genero) {
		new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos ++;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public void setListado(List<Pez> nuevolistado) {
		listado = nuevolistado;
	}
	public List<Pez> getListado(){
		return listado;
	}
}
