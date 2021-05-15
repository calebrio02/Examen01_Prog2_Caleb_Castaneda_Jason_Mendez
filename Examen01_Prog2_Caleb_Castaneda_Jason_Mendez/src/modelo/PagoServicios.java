package modelo;

public class PagoServicios extends Servicio{

	String ServicioPagar;
	String monto;
	
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
		setMonto(m);
		
	}
	

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		String mensaje ="";
		
		 mensaje+="PAGO DE SERVICIOS\n\n"
		 		+ "SERVICIO A PAGAR: ¢"+ getServicioPagar()+"\n"
		 		+ "MONTO: ¢"+getMonto() +"\n\n";
		
		return mensaje;
	}

	

}
