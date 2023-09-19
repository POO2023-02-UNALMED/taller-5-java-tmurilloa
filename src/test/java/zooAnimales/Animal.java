package zooAnimales;
import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales ++;
	}
	@Override
	public String toString() {
		String resultado = "Mi nombre es " + nombre+ ", tengo una edad de " + edad+ 
				", habito en " + habitat + " y mi genero es " + genero;
		if (zona != null) {
			resultado += " la zona en la que me ubico es " + zona.getNombre() +
			", en el " + zona.getZoo().getNombre();
		}
		return resultado;
	}
	public String movimiento(){
		return "desplazarse";
	} 
	
	public static String totalPorTipo() {
		String resultado = "Mamiferos: " + Mamifero.getListado().size() + "\n"+
				"Aves: " + Ave.getListado().size() + "\n"+
				"Reptiles:" + Reptil.getListado().size()+"\n"+
				"Peces: " + Pez.getListado().size() +"\n"+
				"Anfibios: " + Anfibio.getListado().size();
		return resultado;
	}
	public int getTotalAnimales() {
		return totalAnimales;
	}
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setNombre(Zona zona) {
		this.zona = zona;
	}
}

