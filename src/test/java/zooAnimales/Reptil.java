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
	}
	
}
