package modelo;

public class Compras extends Servicio {
	
	

	private String tipoCompra;
	private String detalle;
	
	public String getTipoCompra() {
		return tipoCompra;
	}

	public void setTipoCompra(String tipoCompra) {
		this.tipoCompra = tipoCompra;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalleCompra(String detalle) {
		this.detalle = detalle;
	}


	
	@Override
	public void ingresa(String c, String d) {
		// TODO Auto-generated method stub
		
		setTipoCompra(c);
		setDetalleCompra(d);
	
		
		
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		String mensaje ="";
		
		 mensaje+="COMPRAS \n\n"
		 		+ "CATEGORIA: "+ getTipoCompra()+"\n"
		 		+ "DETALLE: "+getDetalle() +"\n\n";
		
		return mensaje;
		
	}

	

}
