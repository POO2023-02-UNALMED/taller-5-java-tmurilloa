package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;

	public Ave() {}
	public Ave(String nombre, int edad, String habitat, String genero,
			String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public static int cantidadAves() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "volar";
	}
	public void crearHalcon(String nombre, int edad, String genero) {
		setHabitat("montanas");
		colorPlumas = "cafe glorioso";
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		halcones ++;
	}
	public void crearAguilas(String nombre, int edad, String genero) {
		setHabitat("montanas");
		colorPlumas = "blanco y amarillo";
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		aguilas ++;		
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setListado(List<Ave> nuevolistado) {
		listado = nuevolistado;
	}
	public List<Ave> getListado(){
		return listado;
	}
}
