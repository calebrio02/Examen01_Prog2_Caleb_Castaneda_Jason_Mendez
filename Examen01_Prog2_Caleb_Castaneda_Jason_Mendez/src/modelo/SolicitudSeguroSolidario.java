package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SolicitudSeguroSolidario {
	
//ATRIBUTOS EXCLUSIVOS DE LA PRESENTE CLASE 
		private String fechaHoraSolicitud;


		private String nombreServicio;
		private int indiceSolicitud;

		
//AGREGACION DEL ASUGURADO A SEGURO/SOLICITUD
		Asegurado a = new Asegurado();
	
	
//AGREGACION DE LOS TRES TIPOS DE SERVICIOS BRINDADOS POR EL SEGURO SOLIDARIO

		Compras  c = new Compras();
		PagoServicios p = new PagoServicios();
		VisitaMedica v = new VisitaMedica();
	 
	
	
	 public String getFechaHoraSolicitud() {
		 return fechaHoraSolicitud;
	 }
	 
	 public void setFechaHoraSolicitud(String fechaHoraSolicitud) {
		 this.fechaHoraSolicitud = fechaHoraSolicitud;
	 }
	 
	 public int getIndiceSolicitud() {
		 return indiceSolicitud;
	 }
	 
	 public void setIndiceSolicitud(int indiceSolicitud) {
		 this.indiceSolicitud = indiceSolicitud;
	 }
	 
	 public Asegurado getA() {
		 return a;
	 }
	 
	 public void setA(Asegurado a) {
		 this.a = a;
	 }
	 
	 public Compras getC() {
		 return c;
	 }
	 
	 public void setC(Compras c) {
		 this.c = c;
	 }
	 
	 public PagoServicios getP() {
		 return p;
	 }
	 
	 public void setP(PagoServicios p) {
		 this.p = p;
	 }
	 
	 public VisitaMedica getV() {
		 return v;
	 }
	 
	 public void setV(VisitaMedica v) {
		 this.v = v;
	 }
	 
	 public String getNombreServicio() {
		 return nombreServicio;
	 }
	 
	 public void setNombreServicio(String nombreServicio) {
		 this.nombreServicio = nombreServicio;
	 }
	 
	 
	 
	 
	 // OTROS METODOS
//--------------------------------------------------------------------------------------------------- 
	 
	 public String mostrar() {
		 
		 
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
		   LocalDateTime now = LocalDateTime.now();
		   setFechaHoraSolicitud(dtf.format(now));
		   
		String mensaje = "";
		
		
		
		mensaje= "FECHA/HORA DE SOLICITUD: " 
				+ getFechaHoraSolicitud()+"\n"
				+ a.mostrar()
				+"TIPO DE SOLICITUD: "
				+ SaberTipoSolicitud(getNombreServicio());
				
		
		return mensaje;
	 }
	 
	 
	 
	 
	 public String SaberTipoSolicitud(String tipo) {//METODO QUE HACE USO DEL POLIMORFISMO
		 
		 
		 
		 String mensaje = "";
		 
		 if(tipo.equalsIgnoreCase("compras")) {
			 mensaje= c.muestra();
			 
		 }else if(tipo.equalsIgnoreCase("Pago de servicios publicos")) {
			 mensaje= p.muestra();
			 
		 }else if(tipo.equalsIgnoreCase("visita medica")) {
			 mensaje= v.muestra();
			 
		 }
		 
		 	
			return mensaje;
		 }
	 
	 
	 
	 
}
