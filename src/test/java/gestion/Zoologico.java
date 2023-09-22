package gestion;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	 private String nombre;
	 private String ubicacion;
	 private List<Zona> zonas = new ArrayList<>();
	 
	 public Zoologico() {}
	 public Zoologico(String nombre, String ubicacion) {
		 this.nombre = nombre;
		 this.ubicacion = ubicacion;
	 }
	 
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 public String getNombre() {
		 return nombre;
	 }
	 public void setUbicacion(String ubicacion) {
		 this.ubicacion = ubicacion;
	 }
	 public String getUbicacion() {
		 return ubicacion;
	 }
	 public void setZonas(List<Zona> zonas) {
		 this.zonas = zonas;
	 }
	 public List<Zona> getZona() {
		 return zonas;
	 }
	 public void agregarZonas(Zona zona) {
		 zonas.add(zona);
	 }
	
	 public int cantidadTotalAnimales() {
		 int totalAnimales = 0;
		 for (int i = 0; i< zonas.size(); i++){
			 int x = zonas.get(i).getAnimales().size();
			 totalAnimales += x;			 
		 }
		 return totalAnimales;
	 }
}