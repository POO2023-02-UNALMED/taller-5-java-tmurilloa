package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
	private static List<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	public Anfibio(String nombre, int edad, String habitat, String genero,
			String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public static int cantidadAnfibios(){
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras ++;
		return salamandra;
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas ++;
		return rana;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public void setListado(List<Anfibio> nuevolistado) {
		listado = nuevolistado;
	}
	public List<Anfibio> getListado(){
		return listado;
	}
}
