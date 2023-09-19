package zooAnimales;
import java.util.ArrayList;
import java.util.List;


public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	public Mamifero(String nombre, int edad, String habitat, String genero,
			boolean pelaje, int patas ) {
			super(nombre,edad,habitat,genero);
			this.pelaje = pelaje;
			this.patas = patas;
			listado.add(this);
	}
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public void crearCaballo(String nombre, int edad, String genero) {
		new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos ++;
	}
	public void crearLeon(String nombre, int edad, String genero) {
		new Mamifero(nombre,edad,"selva",genero,true,4);
		leones ++;
		}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getPatas() {
		return patas;
		}
	
	public void setListado(List<Mamifero> nuevolistado) {
		listado = nuevolistado;
	}
	public List<Mamifero> getListado(){
		return listado;
	}
}
