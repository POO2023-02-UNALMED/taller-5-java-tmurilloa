package gestion;
import java.util.ArrayList;
import java.util.List;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<>();
	
	public Zona() {}
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 public String getNombre() {
		 return nombre;
	 }
	 public void setZoo(Zoologico zoo) {
		 this.zoo = zoo;
	 }
	 public Zoologico getZoo() {
		 return zoo;
		 }
	 public void setAnimales(List<Animal> animales) {
		 this.animales = animales;
	 }
	 public List<Animal> getAnimales() {
		 return animales;
		 }
}
