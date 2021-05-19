package modelo;

public class VisitaMedica extends Servicio {
	
	private String EspecialidadMedica;
	private String detalle;

	
	
	
	public String getEspecialidadMedica() {
		return EspecialidadMedica;
	}

	public void setEspecialidadMedica(String especialidadMedica) {
		EspecialidadMedica = especialidadMedica;
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
		 		+ "MOTIVO DE VISITA: "+ getEspecialidadMedica()+"\n"
		 		+ "DETALLE: "+getDetalle() +"\n\n";
		
		return mensaje;
	}

	@Override
	public void ingresa(String m, String d) {
		// TODO Auto-generated method stub
		
		setEspecialidadMedica(m);
		setDetalle(d);
		
	}

	
	
}
