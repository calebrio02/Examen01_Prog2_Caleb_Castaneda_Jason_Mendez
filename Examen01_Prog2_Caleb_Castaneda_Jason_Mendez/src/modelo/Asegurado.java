package modelo;

import modelo.Persona;

public class Asegurado extends Persona{
	
	//ATRIBUTOS DEL/A ASEGURADO
	
	String numPoliza;
	String direccion;
	String Categoria;//HACE REFERENCIA A SI ES ASEGURADO SOLO O PERTENCE A UN SEGURO DE COBERTURA FAMILIAR. 
	
	
	
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

	
}
