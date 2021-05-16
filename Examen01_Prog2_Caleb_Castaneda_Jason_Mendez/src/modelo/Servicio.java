package modelo;

public abstract class Servicio {

	private String nombreServicio;
	
	
	//public abstract void escogeServicio();
	
	public String getNombreServicio() {
		return nombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	public abstract void ingresa(String a, String b);
	public abstract String muestra();
	
	
	
}
