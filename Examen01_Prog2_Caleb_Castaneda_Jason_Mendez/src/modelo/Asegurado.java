package modelo;

import modelo.Persona;

public class Asegurado extends Persona{
	
	//ATRIBUTOS DEL/A ASEGURADO
	
	private String numPoliza;
	private String direccion;
	private String Categoria;//HACE REFERENCIA A SI ES ASEGURADO SOLO O PERTENCE A UN SEGURO DE COBERTURA FAMILIAR. 
	
	
	
	//METODOS GETTERS AND SETTER DE LOS RESPECTIVOS ATRIBUTOS
	
	public String getNumPoliza() {
		return numPoliza;
	}
	public void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
	
	public String mostrar() {
		String mensaje="";
		
		mensaje = "DATOS ASEGURADO \n\n"
				+ "NOMBRE: " + getNombre() + "\n"
				+ "EDAD: " + getEdad() + "\n"
				+ "CEDULA: " + getCedula() + "\n"
				+ "POLIZA: " + getNumPoliza() + "\n"
				+ "DIRECCION: " + getDireccion() + "\n"
				+ "CATEGORIA: " + getCategoria() + "\n";
		
		
		return mensaje;
		
	}
	
	
	public void ingresar(String nombre, String edad, String dni, String numPoliza, String TipoPoliza, String Direccion) {
		
		setNombre(nombre);
		setEdad(edad);
		setCedula(dni);
		setNumPoliza(numPoliza);
		setCategoria(TipoPoliza);
		setDireccion(Direccion);

		
	}

	
}
