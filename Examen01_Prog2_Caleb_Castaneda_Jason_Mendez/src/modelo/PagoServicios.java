package modelo;

public class PagoServicios extends Servicio{

	private String ServicioPagar;
	private String detalle;
	private String monto;
	
	
	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	
	 public String getServicioPagar() {
		return ServicioPagar;
	}

	public void setServicioPagar(String servicioPagar) {
		ServicioPagar = servicioPagar;
	}


	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	 
	 
	 
	
	@Override
	public void ingresa(String p, String m) {
		// TODO Auto-generated method stub
		
		setServicioPagar(p);
		setDetalle(m);
		
	}
	

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		String mensaje ="";
		
		 mensaje+="PAGO DE SERVICIOS\n\n"
		 		+ "SERVICIO A PAGAR: "+ getServicioPagar()+"\n"
		 		+ "DETALLE: "+getDetalle()+"\n"
		 		+ "MONTO: ¢"+getMonto() +"\n\n";
		
		return mensaje;
	}

	

}
