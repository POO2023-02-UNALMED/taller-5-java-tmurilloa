package gestion;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	 private String nombre;
	 private String ubicacion;
	 private List<Zona> zonas = new ArrayList<>();
	 
	 public Zoologico() {}
	 public Zoologico(String nombre, String ubicacion, List<Zona> zonas) {
		 this.nombre = nombre;
		 this.ubicacion = ubicacion;
		 this.zonas = zonas;
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
	 public List<Zona> getZonas() {
		 return zonas;
	 }
	 public void agregarZonas(Zona zona) {
		 zonas.add(zona);
	 }
	 // falta el metodo cantidadTotalAnimales()
	 
}
