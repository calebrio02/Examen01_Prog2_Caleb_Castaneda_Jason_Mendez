package controlador;


import java.util.LinkedList;

import javax.swing.JOptionPane;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import modelo.SolicitudSeguroSolidario;




public class Lista {

	
	LinkedList<SolicitudSeguroSolidario> solicitudes = new LinkedList<SolicitudSeguroSolidario>();
		
		public String mostrar(int i) {
			
			String info= "";
			
			for (int j = 0; j < solicitudes.size(); j++) {
				
				info += solicitudes.get(j).mostrar() + "\n\n";
			}
			
			
			
			return info;
		}
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		

			
			int size=0;
			//int numPaciente=0; //

			
			
			public void insertar(SolicitudSeguroSolidario s) {//SE IRAN AGREGANDO LAS SOLICITUDES CONFORME EN EL REGISTRO DEL SEGURO
				solicitudes.add(s);
				size++;
			}
			
			
			
			public void consultar(int d) {//
				
					
					try {
						if(solicitudes.isEmpty()) {///Si esta vacia se despliega el memnsaje
							mensajeTemporizado("Lista Vacia", 800);
						}else {
					
							JOptionPane.showMessageDialog(null, solicitudes.get(d-1).mostrar()); 
						}
						}catch (Exception e) {
							mensajeTemporizado("Registro no existe", 800);

						}
					
			}
			
			public SolicitudSeguroSolidario buscar(int d) {//metodo para buscar un cliente en especifico
				//la variable "d" se utiliza para recibir el dato del JTxtField
				
				
				SolicitudSeguroSolidario s = new SolicitudSeguroSolidario();
					
					try {
						if(solicitudes.isEmpty()) {///Si esta vacia se despliega el memnsaje
							mensajeTemporizado("Lista Vacia", 800);
							s = null;
						}else{
							s = solicitudes.get(d-1);

							
						}
						}catch (Exception e) {
							mensajeTemporizado("Registro no existe", 800);
							
						}
					
					
					
					return s;
					
			}
			
			public void actualizar(int indice, SolicitudSeguroSolidario s) {//metodo para buscar un cliente en especifico
				//la variable "d" se utiliza para recibir el dato del JTxtField
				
				solicitudes.set((indice-1), s);
				
			}
			
			public void eliminarLista() {
				solicitudes.removeAll(solicitudes);
			}
			
				
			
			
						
			
			
			public void suprimir(int d) {//funciona igual que el mostrar, con la diferencia que el dato se elimina y se le hace saber al user de lo acontecido 
				//la variable d sirve para tomar el dato del jtxtfield en la interfaz, CORRESPONDIENTE AL INDICE QUE CONTIENE AL OBJETO
				
				
				try {
					if(solicitudes.isEmpty()){///Si esta vacia se despliega el memnsaje
						mensajeTemporizado("Lista Vacia", 800);
					}else {
						
						solicitudes.remove((d-1));
						mensajeTemporizado("Registrp [" + d + "]" + "eliminado", 800);
						size--;
					}
					
					}catch (Exception e) {
						mensajeTemporizado("Registro no existe", 800);
					}
				
				
			
			}
			
			
			
			public String mostrar() {//metodo para mostrar todos los datos que haya hasta ese momento
				
				String mensaje="";
				if(solicitudes.isEmpty()) {
					mensajeTemporizado("Lista Vacia", 800);//si esta vacia se hace uso del metodo correspondiente y se devuelve este mensaje
				}else {
					//Datos para ver los datos de forma dinamica
					
					//String texto="";
					for (int i = 0; i < solicitudes.size(); i++) {
						mensaje+=solicitudes.get(i).mostrar()+ "\n\n";
						
					}
					//texto+= mensaje;
					
					//De lo contrario se devuelve el mensaje con lo que contenga
				}
				return mensaje;
			}
			
			public boolean elementosLista() {// PARA VER SI HAY ELEMENTOS EN LISTA 
				
				boolean hayElementos= false;
				
				if (solicitudes.isEmpty()==true) {
					 hayElementos = false; // si vacia, no hay elementos en lista
					
					
				}else {// de lo contrario, contiene elementos
					hayElementos = true;
				}
				
				
				return hayElementos;
			}
			
			
			public boolean existeElemento(int d) {//metodo para buscar un cliente en especifico
				
				
				//la variable "d" se utiliza para recibir el dato del JTxtField
				boolean existe= false;
				
					
					try {
						if(solicitudes.isEmpty()) {///Si esta vacia se despliega el mensaje
							mensajeTemporizado("Lista Vacia", 800);
						}else {
							existe = true;
							
						}
						}catch (Exception e) {
							mensajeTemporizado("Registro no existe", 800);
							existe = false;
						}
					return existe;
					
			}
			
			
			public String acumulaDatos() {//ACUMULA LA INFO DE LA LISTA, DESPLEGANDO AL FINAL SOLAMENTE EL NOMBRE E IDENTIFICACION DEL REGISTRO.
											//ESTO HACE MÃ�S PRATICO, EL ELIMINAR, BUSCAR Y ACTUALIZAR, PARA EL USER 
				
				
				String mensaje="";
				if(solicitudes.isEmpty()) {
				}else { 
					
					//Datos para ver los datos de forma dinamica
					for (int i = 0; i < size; i++) {
						
					mensaje+= "Persona [" + (i+1) + "]" + ": " + solicitudes.get(i).getA().getNombre() + "\n";
						
					}	
				}
				
				return mensaje;//retorna solo el nombre y el dni
			}
			
			
				
			public void mensajeTemporizado(String s, int t) {//METODO PARA HACER MENSAJES TEMPORIZADOS, ES MUY UTIL PARA LA GUI Y ADEMAS FACIL DE USAR
				JOptionPane opt = new JOptionPane(s, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
				  final JDialog dlg = opt.createDialog("Aviso");
				  new Thread(new Runnable()
				        {
				          public void run()
				          {
				            try
				            {
				              Thread.sleep(t);//Duracion de un segundo para que el mensaje desaparezca
				              dlg.dispose();

				            }
				            catch ( Throwable th )
				            {
				          
				            }
				          }
				        }).start();
				  dlg.setVisible(true);
			}
		}

		
		

