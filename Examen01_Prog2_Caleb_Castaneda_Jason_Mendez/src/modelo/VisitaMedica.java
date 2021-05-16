package modelo;

public class VisitaMedica extends Servicio {
	
	private String motivo;
	private String detalle;

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	
	
	

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		String mensaje ="";
		
		 mensaje+="VISITA MEDICA \n\n"
		 		+ "MOTIVO DE VISITA: "+ getMotivo()+"\n"
		 		+ "DETALLE: "+getDetalle() +"\n\n";
		
		return mensaje;
	}

	@Override
	public void ingresa(String m, String d) {
		// TODO Auto-generated method stub
		
		setMotivo(m);
		setDetalle(d);
		
	}

	
	
}
