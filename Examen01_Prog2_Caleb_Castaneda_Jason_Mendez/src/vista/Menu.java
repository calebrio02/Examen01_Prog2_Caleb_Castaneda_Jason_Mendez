	package vista;
	
	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	
	//import controlador.Arbol;
	//import controlador.Lista;
	
	import javax.swing.JToolBar;
	import javax.swing.SwingConstants;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JOptionPane;
	
	import java.awt.CardLayout;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import java.awt.Button;
	import java.awt.Color;
	
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.Font;
	import javax.swing.JScrollPane;
	import javax.swing.ScrollPaneConstants;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JRadioButtonMenuItem;
	import java.awt.SystemColor;
	
	import java.awt.Canvas;
	import javax.swing.UIManager;
	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
	
	import javax.swing.JTextField;
	import javax.swing.JList;
	import javax.swing.JComboBox;
	import java.awt.Insets;
	import javax.swing.DefaultComboBoxModel;
	import java.awt.Toolkit;
	import java.awt.Window.Type;
	import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.border.CompoundBorder;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Frame;
import java.awt.Point;
import javax.swing.border.MatteBorder;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

import controlador.Lista;
import modelo.SolicitudSeguroSolidario;

import java.awt.event.MouseAdapter;
import javax.swing.BoxLayout;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
	
	public class Menu extends JFrame {
	
		private JPanel contentPane;
		private JPanel BienvenidaAgente;
		
	
		String nombre;
		String dni;
		String lugarResidencia;
		int indiceModificar=1;
		
		Lista lista = new Lista();
		SolicitudSeguroSolidario s = new SolicitudSeguroSolidario();
		JTextArea tArchivadasAc = new JTextArea();
		
		/////BOTON HOME/////
		
		JButton btnHomeShorCut = new JButton("");
		private JButton bSalirSesion;
		
		/////////////PANELES////////////////
		private JPanel bienvenidaAsegurado;
		private JPanel panelCompras;
		private JPanel panelVisitaMedica;
		private JPanel panelPagoServicios;
		private JPanel panelInserta;
		
		
		//////////////INGRESAR//////////////
		private JTextArea tNombre;
		private JTextArea tEdad;
		private JTextArea tCedula;
		private JTextArea tDireccionAsegurado;
		private JTextArea tDetalleCompra;
		private JTextArea tDetalleVisita;
		private JTextArea tDetallePagoServicio;
		private JTextArea tNumeroPoliza;
		private JTextArea tMonto;
		private JTextArea tBuscarAgente;
		private JTextArea tSolicitudesEliminar;
		
		//ComboBox///
		private JComboBox boxTipoCompra;
		private JComboBox boxEspecialidadMedica;
		private JComboBox boxTipoPagoServicio;
		private JComboBox boxTipoServicio;
		private JComboBox boxCategoriaPoliza;
		
		
		
		///////////////ACTUALIZAR/////////////////
		JTextArea tNombreAc = new JTextArea();
		JTextArea tIngresoAc = new JTextArea();
		
		JTextArea tAguaAc = new JTextArea();
		JTextArea tLuzAc = new JTextArea();
		JTextArea tCableinternetAc = new JTextArea();
		JTextArea tTransporteAc = new JTextArea();
		
		JTextArea tSupermercadoAc = new JTextArea();
		JTextArea tCarniceriaAc = new JTextArea();
		JTextArea tVerduleriaAc = new JTextArea();
		
		JTextArea tSuscripcionAc = new JTextArea();
		JTextArea tSalidasAc = new JTextArea();
		private JPanel panelMuestra;
		private JPanel panelEliminar;
		
		
		
		
		
		
		/**
		 * Launch the application.
		 */
		
	
		/**
		 * Create the frame.
		 */
		public Menu() {
			setLocationByPlatform(true);
			setVisible(true);
			setFont(new Font("Palatino Linotype", Font.BOLD, 15));
			setTitle("SEGURO SOLIDARIO");
			setResizable(false);
			setForeground(Color.DARK_GRAY);
			setBackground(Color.DARK_GRAY);
			setIconImage(Toolkit.getDefaultToolkit().getImage("\\\\Mac\\Home\\Downloads\\Basic_set\\Basic_set_Png\\Basic_set_Png\\home_48.png"));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 748, 487);;;
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new CardLayout(0, 0));
			
			
			
			
			//CREACION DEL PRIMER PANEL, INGRESO//LOGIN.
			//CONSISTE BASICAMENTE EN EL BOTON INGRESA PARA INICIAR EL APP
			
			
			JPanel inicioApp = new JPanel();
			contentPane.add(inicioApp, "Ingreso");
			inicioApp.setLayout(null);
			
			JButton bIngresaAgente = new JButton("Ingresa");
			bIngresaAgente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "agente");
					//tInfoEliminar.setText(lista.acumulaDatos());
					
					
				}
			});
			bIngresaAgente.setForeground(Color.WHITE);
			bIngresaAgente.setFont(new Font("Times New Roman", Font.BOLD, 13));
			bIngresaAgente.setFocusPainted(false);
			bIngresaAgente.setBackground(Color.DARK_GRAY);
			bIngresaAgente.setBounds(507, 170, 89, 23);
			inicioApp.add(bIngresaAgente);
			
			JButton bIngresaAsegurado = new JButton("Ingresa");
			bIngresaAsegurado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "asegurado");
					
				}
			});
			bIngresaAsegurado.setFocusPainted(false);
			bIngresaAsegurado.setForeground(Color.WHITE);
			bIngresaAsegurado.setBackground(Color.DARK_GRAY);
			bIngresaAsegurado.setFont(new Font("Times New Roman", Font.BOLD, 13));
			bIngresaAsegurado.setBounds(132, 170, 89, 23);
			inicioApp.add(bIngresaAsegurado);
			
			JLabel lblIndicaAgente = new JLabel("Login Agente");
			lblIndicaAgente.setHorizontalAlignment(SwingConstants.CENTER);
			lblIndicaAgente.setForeground(Color.BLACK);
			lblIndicaAgente.setFont(new Font("Sitka Text", Font.ITALIC, 14));
			lblIndicaAgente.setBounds(495, 101, 129, 18);
			inicioApp.add(lblIndicaAgente);
			
			JLabel lblIndicaAsegurado = new JLabel("Login asegurado");
			lblIndicaAsegurado.setForeground(Color.BLACK);
			lblIndicaAsegurado.setHorizontalAlignment(SwingConstants.CENTER);
			lblIndicaAsegurado.setFont(new Font("Sitka Text", Font.ITALIC, 14));
			lblIndicaAsegurado.setBounds(108, 101, 129, 18);
			inicioApp.add(lblIndicaAsegurado);
			
			JLabel lblAgenteLoginLogo = new JLabel("");
			lblAgenteLoginLogo.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Login.png")));
			lblAgenteLoginLogo.setBounds(532, 26, 64, 64);
			inicioApp.add(lblAgenteLoginLogo);
			
			JLabel lblAseguradoLoginLogo = new JLabel("");
			lblAseguradoLoginLogo.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Login.png")));
			lblAseguradoLoginLogo.setBounds(147, 26, 64, 64);
			inicioApp.add(lblAseguradoLoginLogo);
			
			JLabel lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/AgentBackgroundLogin.png")));
			lblNewLabel_8.setBounds(361, -40, 377, 575);
			inicioApp.add(lblNewLabel_8);
			
			JLabel lblNewLabel_9 = new JLabel("");
			lblNewLabel_9.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/AseguradoBackgroundLogin.jpg")));
			lblNewLabel_9.setBounds(0, -14, 377, 525);
			inicioApp.add(lblNewLabel_9);
			
			bienvenidaAsegurado = new JPanel();
			
			bienvenidaAsegurado.setBackground(Color.WHITE);
			
			contentPane.add(bienvenidaAsegurado, "asegurado");//NOMBRE DEL PANEL PARA SER LLAMADO 
			
			
			
			
			bienvenidaAsegurado.setLayout(null);
			
			panelMuestra = new JPanel();
			panelMuestra.setVisible(false);
			
			panelInserta = new JPanel();
			panelInserta.setVisible(false);
			panelInserta.setLayout(null);
			panelInserta.setBackground(Color.LIGHT_GRAY);
			panelInserta.setBounds(112, 0, 624, 447);
			bienvenidaAsegurado.add(panelInserta);
			
			panelCompras = new JPanel();
			panelCompras.setVisible(false);
			
			panelPagoServicios = new JPanel();
			panelPagoServicios.setVisible(false);
			panelPagoServicios.setBounds(314, 81, 283, 290);
			panelInserta.add(panelPagoServicios);
			panelPagoServicios.setLayout(null);
			
			boxTipoPagoServicio = new JComboBox();
			boxTipoPagoServicio.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoPagoServicio.setModel(new DefaultComboBoxModel(new String[] {" Tipo de servicio a pagar", "Publico", "Municipal"}));
			boxTipoPagoServicio.setToolTipText("Seleccione el tipo de servicio a pagar");
			boxTipoPagoServicio.setBounds(26, 11, 236, 27);
			panelPagoServicios.add(boxTipoPagoServicio);
			
			JScrollPane sPDetallePagoServicio = new JScrollPane();
			sPDetallePagoServicio.setBounds(26, 109, 236, 34);
			panelPagoServicios.add(sPDetallePagoServicio);
			
			tDetallePagoServicio = new JTextArea();
			sPDetallePagoServicio.setViewportView(tDetallePagoServicio);
			
			JLabel lblNewLabel_1 = new JLabel("Especifica servicio");
			lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lblNewLabel_1.setBounds(26, 79, 236, 19);
			panelPagoServicios.add(lblNewLabel_1);
			
			tMonto = new JTextArea();
			tMonto.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
					if(tMonto.getText().equalsIgnoreCase("Monto")) {
						tMonto.setText("");
			    	}
					
				}
			});
			tMonto.setText("Monto");
			tMonto.setToolTipText("ingrese la identificacion del asegurado");
			tMonto.setOpaque(false);
			tMonto.setForeground(new Color(47, 79, 79));
			tMonto.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tMonto.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tMonto.setBounds(26, 195, 161, 21);
			panelPagoServicios.add(tMonto);
			panelCompras.setBounds(315, 81, 283, 290);
			panelInserta.add(panelCompras);
			panelCompras.setLayout(null);
			
			boxTipoCompra = new JComboBox();
			boxTipoCompra.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoCompra.setModel(new DefaultComboBoxModel(new String[] {"Seleccione tipo de compra", "Supermercado", "Farmacia"}));
			boxTipoCompra.setBounds(24, 22, 249, 22);
			panelCompras.add(boxTipoCompra);
			
			JScrollPane sPDetalleCompra = new JScrollPane();
			sPDetalleCompra.setBounds(24, 159, 234, 98);
			panelCompras.add(sPDetalleCompra);
			
			tDetalleCompra = new JTextArea();
			tDetalleCompra.setToolTipText("Especifique detalle de compra");
			sPDetalleCompra.setViewportView(tDetalleCompra);
			
			JLabel lblDetalleCompra = new JLabel("Detalle de compra");
			lblDetalleCompra.setFont(new Font("Sitka Text", Font.BOLD, 14));
			lblDetalleCompra.setHorizontalAlignment(SwingConstants.CENTER);
			lblDetalleCompra.setBounds(41, 134, 203, 14);
			panelCompras.add(lblDetalleCompra);
			
			panelVisitaMedica = new JPanel();
			panelVisitaMedica.setVisible(false);
			panelVisitaMedica.setBounds(314, 81, 283, 290);
			panelInserta.add(panelVisitaMedica);
			panelVisitaMedica.setLayout(null);
			
			boxEspecialidadMedica = new JComboBox();
			boxEspecialidadMedica.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxEspecialidadMedica.setToolTipText("Escoge la especialidad medica deseada");
			boxEspecialidadMedica.setModel(new DefaultComboBoxModel(new String[] {"Elije especialidad medica", "Medicina General", "Fisioterapia", "Psicologia"}));
			boxEspecialidadMedica.setBounds(25, 23, 248, 22);
			panelVisitaMedica.add(boxEspecialidadMedica);
			
			JLabel lblNewLabel_3 = new JLabel("Detalle motivo de visita");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lblNewLabel_3.setBounds(35, 102, 214, 22);
			panelVisitaMedica.add(lblNewLabel_3);
			
			JScrollPane sPDetalleMotivoVisita = new JScrollPane();
			sPDetalleMotivoVisita.setBounds(25, 135, 236, 123);
			panelVisitaMedica.add(sPDetalleMotivoVisita);
			
			tDetalleVisita = new JTextArea();
			tDetalleVisita.setToolTipText("Especifique el motivo de su visita medica");
			sPDetalleMotivoVisita.setViewportView(tDetalleVisita);
			
			tEdad = new JTextArea();
			tEdad.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(tEdad.getText()!=null) {
						tEdad.setText("");
				}
			}
			});
			tEdad.addKeyListener(new KeyAdapter()// Verificar si la tecla pulsada no es un digito/NUMERO
	                {
                public void keyTyped(KeyEvent e)
                {
                    char caracter = e.getKeyChar();


                    if(((caracter < '0') ||
                            (caracter > '9')) &&
                            (caracter != '\b' ))
                    {
                        e.consume();  // ignorar el evento de teclado
                        lista.mensajeTemporizado("Edad debe contener solamente numeros", 1800);

                    }
                }
            });
			
			
			
			
			tEdad.addKeyListener(new KeyListener(){
			   	 
			   	public void keyTyped(KeyEvent e)
			   	 
			   	{if (tEdad.getText().length()==3) //LIMITA AL USER A SOLO AGREGAR EL NUMERO DEL PACIENTE QUE SE QUIERE ACTUALIZAR
			   	 
			   	     e.consume();
			   			if(tEdad.getText().length()==3) {
			   				lista.mensajeTemporizado("Edad no contiene mas de 3 digitos", 1800);
			   			}
			   	
			   	}
			   	 
			   	public void keyPressed(KeyEvent arg0) {
			   	}
			   	 
			   	public void keyReleased(KeyEvent arg0) {
			   	}
			   	});
			tEdad.setToolTipText("Ingrese la edad del asegurado");
			tEdad.setOpaque(false);
			tEdad.setForeground(new Color(47, 79, 79));
			tEdad.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tEdad.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tEdad.setBounds(124, 66, 161, 21);
			panelInserta.add(tEdad);
			
			JLabel lblResidencia = new JLabel("Edad:");
			lblResidencia.setForeground(new Color(47, 79, 79));
			lblResidencia.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblResidencia.setBounds(33, 62, 61, 29);
			panelInserta.add(lblResidencia);
			
			JButton listo = new JButton("Listo!");
			listo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					s = new SolicitudSeguroSolidario();
					
					///////////Datos principales//////
					String nombre = tNombre.getText();
					String edad = tEdad.getText();
					String dni = tCedula.getText();
					String TipoPoliza ="";
					String direccion = tDireccionAsegurado.getText();
					String numPoliza =tNumeroPoliza.getText();
					
					
					////datos condicionales////////
					
					if (boxCategoriaPoliza.getSelectedIndex()==0) {
						lista.mensajeTemporizado("Debes seleccionar un tipo de poliza",1000);
					}else {
						 TipoPoliza = boxCategoriaPoliza.getSelectedItem().toString();
					}
					if (boxTipoServicio.getSelectedIndex()==0) {
						lista.mensajeTemporizado("Debes seleccionar un tipo de servicio", 1000);
					}else 
					   if(boxTipoServicio.getSelectedIndex()==1)  {
						s.setNombreServicio("Compras");
						s.getC().ingresa(boxTipoCompra.getSelectedItem().toString(), tDetalleCompra.getText());
					}else 
						if (boxTipoServicio.getSelectedIndex()==2) {
							s.setNombreServicio("Pago de Servicios Publicos");
							s.getP().ingresa(boxTipoPagoServicio.getSelectedItem().toString(), tDetallePagoServicio.getText());
							s.getP().setMonto(tMonto.getText());
						
					}else 
						if (boxTipoServicio.getSelectedIndex()==3) {
							s.setNombreServicio("Visita medica");
							s.getV().ingresa(boxEspecialidadMedica.getSelectedItem().toString(), tDetalleVisita.getText());
						
					}
				
					s.getA().ingresar(nombre, edad, dni, numPoliza, TipoPoliza, direccion);
					lista.insertar(s);
					lista.mensajeTemporizado("Solicitud agregada", 2000);
					
					tNombre.setText(null);
					tEdad.setText(null);
					tCedula.setText(null);
					tDireccionAsegurado.setText(null);
					tNumeroPoliza.setText(null);
					boxCategoriaPoliza.setSelectedIndex(0);
					boxEspecialidadMedica.setSelectedIndex(0);
					boxTipoCompra.setSelectedIndex(0);
					boxTipoPagoServicio.setSelectedIndex(0);
					boxTipoServicio.setSelectedIndex(0);
				}
			});
			listo.setToolTipText("finalizar de agregar los datos");
			listo.setFont(new Font("Dialog", Font.BOLD, 13));
			listo.setBounds(314, 390, 109, 29);
			panelInserta.add(listo);
			
			JButton btnBorraD = new JButton("Cancelar");
			btnBorraD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panelInserta.setVisible(false);
				}
			});
			btnBorraD.setToolTipText("refresca el menu");
			btnBorraD.setFont(new Font("Dialog", Font.BOLD, 13));
			btnBorraD.setBounds(443, 390, 109, 29);
			panelInserta.add(btnBorraD);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(new Color(47, 79, 79));
			lblNombre.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblNombre.setBounds(33, 36, 81, 16);
			panelInserta.add(lblNombre);
			
			tNombre = new JTextArea();
			tNombre.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(tNombre.getText()!=null) {
						tNombre.setText("");
				}
			}
			});
			tNombre.setToolTipText("Ingrese el nombre del asegurado");
			tNombre.setOpaque(false);
			tNombre.setForeground(new Color(47, 79, 79));
			tNombre.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNombre.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNombre.setBounds(124, 31, 161, 21);
			panelInserta.add(tNombre);
			
			JLabel lblCedula = new JLabel("Cedula:");
			lblCedula.setForeground(new Color(47, 79, 79));
			lblCedula.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblCedula.setBounds(33, 109, 61, 29);
			panelInserta.add(lblCedula);
			
			tCedula = new JTextArea();
			tCedula.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(tCedula.getText()!=null) {
						tCedula.setText("");
				}
			}
			});
			tCedula.setToolTipText("ingrese la identificacion del asegurado");
			tCedula.setOpaque(false);
			tCedula.setForeground(new Color(47, 79, 79));
			tCedula.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tCedula.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tCedula.setBounds(124, 108, 161, 21);
			tCedula.addKeyListener(new KeyAdapter()// Verificar si la tecla pulsada no es un digito/NUMERO
	                {
                public void keyTyped(KeyEvent e)
                {
                    char caracter = e.getKeyChar();


                    if(((caracter < '0') ||
                            (caracter > '9')) &&
                            (caracter != '\b' ))
                    {
                        e.consume();  // ignorar el evento de teclado
                        lista.mensajeTemporizado("Cedula debe contener solamente numeros", 1800);

                    }
                }
            });
			
			
			
			
			tCedula.addKeyListener(new KeyListener(){
			   	 
			   	public void keyTyped(KeyEvent e)
			   	 
			   	{if (tCedula.getText().length()==7) //LIMITA AL USER A SOLO AGREGAR EL NUMERO DEL PACIENTE QUE SE QUIERE ACTUALIZAR
			   	 
			   	     e.consume();
			   			if(tCedula.getText().length()==7) {
			   				lista.mensajeTemporizado("Cedula consta de 7 digitos", 1800);
			   			}
			   	
			   	}
			   	 
			   	public void keyPressed(KeyEvent arg0) {
			   	}
			   	 
			   	public void keyReleased(KeyEvent arg0) {
			   	}
			   	});
			panelInserta.add(tCedula);
			
			boxCategoriaPoliza = new JComboBox();
			boxCategoriaPoliza.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxCategoriaPoliza.setModel(new DefaultComboBoxModel(new String[] {"Elija categoria de poliza", "Individual", "Familiar"}));
			boxCategoriaPoliza.setBounds(33, 206, 253, 29);
			panelInserta.add(boxCategoriaPoliza);
			
			JLabel lblDireccion = new JLabel("Direccion:");
			lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
			lblDireccion.setForeground(new Color(47, 79, 79));
			lblDireccion.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblDireccion.setBounds(112, 261, 86, 29);
			panelInserta.add(lblDireccion);
			
			JScrollPane sPDireccionAsegurado = new JScrollPane();
			sPDireccionAsegurado.setBounds(32, 301, 253, 91);
			panelInserta.add(sPDireccionAsegurado);
			
			tDireccionAsegurado = new JTextArea();
			tDireccionAsegurado.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(tDireccionAsegurado.getText()!=null) {
						tDireccionAsegurado.setText("");
				}
			}
			});
			tDireccionAsegurado.setToolTipText("Especifique la direccion del asegurado para poder asistirle");
			tDireccionAsegurado.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 14));
			tDireccionAsegurado.setLineWrap(true);
			tDireccionAsegurado.setWrapStyleWord(true);
			sPDireccionAsegurado.setViewportView(tDireccionAsegurado);
			
			boxTipoServicio = new JComboBox();
			boxTipoServicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if (boxTipoServicio.getSelectedItem().toString().equalsIgnoreCase("Compras")) {
						panelCompras.setVisible(true);
						panelPagoServicios.setVisible(false);
						panelVisitaMedica.setVisible(false);
						
					} else if(boxTipoServicio.getSelectedItem().toString().equalsIgnoreCase("Pago de servicios publicos")){
						panelCompras.setVisible(false);
						panelPagoServicios.setVisible(true);
						panelVisitaMedica.setVisible(false);

					}else if (boxTipoServicio.getSelectedItem().toString().equalsIgnoreCase("Visita medica")) {
						panelCompras.setVisible(false);
						panelPagoServicios.setVisible(false);
						panelVisitaMedica.setVisible(true);
					}else {
						panelCompras.setVisible(false);
						panelPagoServicios.setVisible(false);
						panelVisitaMedica.setVisible(false);
					}
					
				}
			});
			boxTipoServicio.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoServicio.setModel(new DefaultComboBoxModel(new String[] {"Selecciona tipo de servicio", "Compras", "Pago de servicios publicos", "Visita medica"}));
			boxTipoServicio.setBounds(337, 28, 246, 29);
			panelInserta.add(boxTipoServicio);
			
			JLabel lblNumeroPoliza = new JLabel("Poliza #: ");
			lblNumeroPoliza.setForeground(new Color(47, 79, 79));
			lblNumeroPoliza.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblNumeroPoliza.setBounds(33, 149, 81, 29);
			panelInserta.add(lblNumeroPoliza);
			
			tNumeroPoliza = new JTextArea();
			tNumeroPoliza.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(tNumeroPoliza.getText()!=null) {
						tNumeroPoliza.setText("");
				}
			}
			});
			tNumeroPoliza.setToolTipText("Numero de poliza del asegurado, consta de 3 digitos");
			tNumeroPoliza.setOpaque(false);
			tNumeroPoliza.setForeground(new Color(47, 79, 79));
			tNumeroPoliza.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNumeroPoliza.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNumeroPoliza.setBounds(124, 151, 161, 21);
			
			
			tNumeroPoliza.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
					tNumeroPoliza.selectAll();
				}
			});
			tNumeroPoliza.addKeyListener(new KeyAdapter()// Verificar si la tecla pulsada no es un digito/NUMERO
	                {
                public void keyTyped(KeyEvent e)
                {
                    char caracter = e.getKeyChar();


                    if(((caracter < '0') ||
                            (caracter > '9')) &&
                            (caracter != '\b' ))
                    {
                        e.consume();  // ignorar el evento de teclado
                        lista.mensajeTemporizado("Poliza debe contener solamente numeros", 1800);

                    }
                }
            });
			
			
			
			
			tNumeroPoliza.addKeyListener(new KeyListener(){
			   	 
			   	public void keyTyped(KeyEvent e)
			   	 
			   	{if (tNumeroPoliza.getText().length()==3) //LIMITA AL USER A SOLO AGREGAR EL NUMERO DEL PACIENTE QUE SE QUIERE ACTUALIZAR
			   	 
			   	     e.consume();
			   			if(tNumeroPoliza.getText().length()==3) {
			   				lista.mensajeTemporizado("Poliza consta de 3 digitos", 1800);
			   			}
			   	
			   	}
			   	 
			   	public void keyPressed(KeyEvent arg0) {
			   	}
			   	 
			   	public void keyReleased(KeyEvent arg0) {
			   	}
			   	});
			
			
			
			
			panelInserta.add(tNumeroPoliza);
			panelMuestra.setBackground(SystemColor.controlDkShadow);
			panelMuestra.setBounds(112, 0, 624, 454);
			bienvenidaAsegurado.add(panelMuestra);
			panelMuestra.setLayout(null);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(62, 79, 447, 241);
			panelMuestra.add(scrollPane_2);
			
			JTextArea tMuestraDatosAsegurado = new JTextArea();
			tMuestraDatosAsegurado.setMargin(new Insets(2, 10, 2, 2));
			tMuestraDatosAsegurado.setEditable(false);
			tMuestraDatosAsegurado.setToolTipText("Mostrando solicitudes en registro");
			tMuestraDatosAsegurado.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 14));
			scrollPane_2.setViewportView(tMuestraDatosAsegurado);
			
			JLabel lblMuestraDatosAsegurado = new JLabel("Solicitudes");
			lblMuestraDatosAsegurado.setForeground(Color.WHITE);
			lblMuestraDatosAsegurado.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblMuestraDatosAsegurado.setHorizontalAlignment(SwingConstants.CENTER);
			lblMuestraDatosAsegurado.setBounds(155, 21, 243, 30);
			panelMuestra.add(lblMuestraDatosAsegurado);
			
			JPanel panelMenuOpciones = new JPanel();
			panelMenuOpciones.setBackground(Color.DARK_GRAY);
			panelMenuOpciones.setBounds(0, 0, 113, 454);
			bienvenidaAsegurado.add(panelMenuOpciones);
			panelMenuOpciones.setLayout(null);
			
			JButton bBackToLogin = new JButton("");
			bBackToLogin.setHorizontalAlignment(SwingConstants.RIGHT);
			bBackToLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bBackToLogin.setBorder(null);
			bBackToLogin.setToolTipText("Salir del perfil \"Asegurado\", vuelve e inicia otra sesion");
			bBackToLogin.setContentAreaFilled(false);
			bBackToLogin.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Home48.png")));
			bBackToLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bienvenidaAsegurado.setVisible(false);
				}
			});
			bBackToLogin.setBounds(0, 309, 79, 51);
			panelMenuOpciones.add(bBackToLogin);
			//btnMostrar.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/monitor_16.png")));
			
			JButton btnInsertar = new JButton("");
			btnInsertar.setHorizontalAlignment(SwingConstants.RIGHT);
			btnInsertar.setContentAreaFilled(false);
			btnInsertar.setBorder(null);
			btnInsertar.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/insert48.png")));
			btnInsertar.setBounds(10, 30, 79, 51);
			panelMenuOpciones.add(btnInsertar);
			btnInsertar.setToolTipText("Agregar registro");
			btnInsertar.setForeground(Color.WHITE);
			btnInsertar.setOpaque(false);
			btnInsertar.setBackground(new Color (0, 0, 0, 50));
			
			
			
			btnInsertar.setSelected(true);
			btnInsertar.setPreferredSize(new Dimension(68, 23));
			btnInsertar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
			//PARA QUE SE CREE UN NUEVO REPORTE EN ORDEN?
			
			btnInsertar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//CardLayout c = (CardLayout)(contentPane.getLayout());
					//c.show(contentPane, "t1");
					panelInserta.setVisible(true);
					panelMuestra.setVisible(false);
					
				}
			});
			btnInsertar.setFont(new Font("SimSun", Font.BOLD, 15));
			
					JButton btnMostrar = new JButton("");
					btnMostrar.setHorizontalAlignment(SwingConstants.RIGHT);
					btnMostrar.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/ShowView48.png")));
					btnMostrar.setContentAreaFilled(false);
					btnMostrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnMostrar.setBorder(null);
					btnMostrar.setBounds(0, 109, 79, 51);
					panelMenuOpciones.add(btnMostrar);
					btnMostrar.setToolTipText("ver el resumen de todos los gastos registrados...");
					btnMostrar.setForeground(Color.WHITE);
					btnMostrar.setOpaque(false);
					btnMostrar.setBackground(new Color (0, 0, 0, 50));
					btnMostrar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							if (lista.elementosLista()==false) {
								
								lista.mensajeTemporizado("No existen solicitudes", 1000);
								panelMuestra.setVisible(false);
							}else {
								
						
							panelInserta.setVisible(false);
							panelMuestra.setVisible(true);
							tMuestraDatosAsegurado.setText(lista.mostrar());
							
							}
							
						}
					});
					
					btnMostrar.setFont(new Font("SimSun", Font.BOLD, 15));
					
					JButton bSalirProgramaAsegurado = new JButton("");
					bSalirProgramaAsegurado.setHorizontalAlignment(SwingConstants.RIGHT);
					bSalirProgramaAsegurado.setBorder(null);
					bSalirProgramaAsegurado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					bSalirProgramaAsegurado.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {//FINALIZACION DEL PROGRAMA CONTROLADA
							
							if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
							        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
								System.exit(0);//SI NO HAY DATOS DEL TODO EL PROGRAMA SOLO SE CIERRA SIN PREGUNTAR SI DESEA GUARDAR DATOS
							} else {
							}
						}
					});
					
					
					bSalirProgramaAsegurado.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/VolverPrincipal48px.png")));
					bSalirProgramaAsegurado.setToolTipText("Salir del programa");
					bSalirProgramaAsegurado.setContentAreaFilled(false);
					bSalirProgramaAsegurado.setBounds(0, 372, 79, 45);
					panelMenuOpciones.add(bSalirProgramaAsegurado);
			
			
			JPanel menuActualiza = new JPanel();
			menuActualiza.setBackground(new Color(95, 158, 160));
			contentPane.add(menuActualiza, "t5");
			menuActualiza.setLayout(null);
			
			JButton btnHomeShorCut_3 = new JButton("");
			btnHomeShorCut_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuActualiza.setVisible(false);
					bienvenidaAsegurado.setVisible(true);
					
				}
			});
		//	btnHomeShorCut_3.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut_3.setToolTipText("Regresar a menu prinicipal");
			btnHomeShorCut_3.setOpaque(false);
			btnHomeShorCut_3.setContentAreaFilled(false);
			btnHomeShorCut_3.setBounds(314, 379, 61, 53);
			menuActualiza.add(btnHomeShorCut_3);
			
			JLabel lblNewLabel = new JLabel("Registro de gastos:");
			lblNewLabel.setForeground(new Color(255, 245, 238));
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
			lblNewLabel.setBounds(28, 18, 165, 18);
			menuActualiza.add(lblNewLabel);
			
			JButton btnSiguienteAc = new JButton("Siguiente");
			btnSiguienteAc.setFont(new Font("Sitka Text", Font.BOLD, 12));
			btnSiguienteAc.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					
					if(lista.elementosLista()==false) {
						
					}else {
					
					indiceModificar++;
					
					s = lista.buscar(indiceModificar);
					
					/*
					if(s.getP().getNombre()!=null) {
						tNombreAc.setText(s.getP().getNombre());
						tIngresoAc.setText(Integer.toString(s.getP().getIngreso()));
						
						
						tAguaAc.setText(Integer.toString(s.getSb().getAgua()));
						tLuzAc.setText(Integer.toString(s.getSb().getLuz()));
						tCableinternetAc.setText(Integer.toString(s.getSb().getCableInternet()));
						tTransporteAc.setText(Integer.toString(s.getSb().getTransporte()));
						
						tSupermercadoAc.setText(Integer.toString(s.getComida().getSupermercado()));
						tCarniceriaAc.setText(Integer.toString(s.getComida().getCarniceria()));
						tVerduleriaAc.setText(Integer.toString(s.getComida().getVerduleria()));
						
						tSuscripcionAc.setText(Integer.toString(s.getOcio().getStreaming()));
						tSalidasAc.setText(Integer.toString(s.getOcio().getSalidas()));
						
					}else {
						indiceModificar--;
					}
					*/
					
					}
					
				}
			});
			btnSiguienteAc.setBounds(519, 18, 89, 23);
			menuActualiza.add(btnSiguienteAc);
			
			JScrollPane sPAc = new JScrollPane();
			sPAc.setBounds(179, 11, 210, 41);
			menuActualiza.add(sPAc);
			tArchivadasAc.setForeground(Color.DARK_GRAY);
			tArchivadasAc.setFont(new Font("Monospaced", Font.BOLD, 14));
			sPAc.setViewportView(tArchivadasAc);
			
			
			tArchivadasAc.setEditable(false);
			
			JButton btnAnteriorAc = new JButton("Anterior");
			btnAnteriorAc.setFont(new Font("Sitka Text", Font.BOLD, 12));
			btnAnteriorAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					if(lista.elementosLista()==false) {
						
					}else {
						
					
					
						indiceModificar--;
					
					s = lista.buscar(indiceModificar);
					
					/*
					if(s.getP().getNombre()!=null) {
						tNombreAc.setText(s.getP().getNombre());
						tIngresoAc.setText(Integer.toString(s.getP().getIngreso()));
						
						
						tAguaAc.setText(Integer.toString(s.getSb().getAgua()));
						tLuzAc.setText(Integer.toString(s.getSb().getLuz()));
						tCableinternetAc.setText(Integer.toString(s.getSb().getCableInternet()));
						tTransporteAc.setText(Integer.toString(s.getSb().getTransporte()));
						
						tSupermercadoAc.setText(Integer.toString(s.getComida().getSupermercado()));
						tCarniceriaAc.setText(Integer.toString(s.getComida().getCarniceria()));
						tVerduleriaAc.setText(Integer.toString(s.getComida().getVerduleria()));
						
						tSuscripcionAc.setText(Integer.toString(s.getOcio().getStreaming()));
						tSalidasAc.setText(Integer.toString(s.getOcio().getSalidas()));
						
					}else {
						indiceModificar++;
					}
					*/
					}
					
				}
			});
			btnAnteriorAc.setBounds(420, 18, 89, 23);
			menuActualiza.add(btnAnteriorAc);
			
			JLabel lblGastosDeSupermercado_1 = new JLabel("Gastos de Comida:");
			lblGastosDeSupermercado_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblGastosDeSupermercado_1.setForeground(SystemColor.menu);
			lblGastosDeSupermercado_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
			lblGastosDeSupermercado_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 240, 245)));
			lblGastosDeSupermercado_1.setBounds(401, 60, 223, 36);
			menuActualiza.add(lblGastosDeSupermercado_1);
			
			JLabel lblGastosDeOcio_1 = new JLabel("Gastos de Ocio:");
			lblGastosDeOcio_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblGastosDeOcio_1.setForeground(SystemColor.menu);
			lblGastosDeOcio_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
			lblGastosDeOcio_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 240, 245)));
			lblGastosDeOcio_1.setBounds(461, 237, 136, 36);
			menuActualiza.add(lblGastosDeOcio_1);
			
			JLabel lblGastosDeServicios_1 = new JLabel("Gastos de Servicios Basicos:");
			lblGastosDeServicios_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblGastosDeServicios_1.setForeground(SystemColor.menu);
			lblGastosDeServicios_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
			lblGastosDeServicios_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 240, 245)));
			lblGastosDeServicios_1.setBounds(60, 153, 237, 36);
			menuActualiza.add(lblGastosDeServicios_1);
			
			
			
			
			tSalidasAc.setToolTipText("En relacion a gastos de ocio, ingresa el gasto de salidas");
			tSalidasAc.setText("Ingrese gasto Salidas");
			tSalidasAc.setOpaque(false);
			tSalidasAc.setForeground(Color.LIGHT_GRAY);
			tSalidasAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tSalidasAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tSalidasAc.setBounds(403, 325, 221, 21);
			menuActualiza.add(tSalidasAc);
			
			tSuscripcionAc.setToolTipText("En relacion a gastos de ocio, si usas servicios tales como: netflix, spotify...\r\ningresa el monto");
			tSuscripcionAc.setText("Ingrese gasto Suscripciones");
			tSuscripcionAc.setOpaque(false);
			tSuscripcionAc.setForeground(Color.LIGHT_GRAY);
			tSuscripcionAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tSuscripcionAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tSuscripcionAc.setBounds(401, 293, 274, 21);
			menuActualiza.add(tSuscripcionAc);
			
			tVerduleriaAc.setToolTipText("ingrese gasto verduleria");
			tVerduleriaAc.setText("Ingrese gasto Verduleria");
			tVerduleriaAc.setOpaque(false);
			tVerduleriaAc.setForeground(Color.LIGHT_GRAY);
			tVerduleriaAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tVerduleriaAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tVerduleriaAc.setBounds(403, 191, 221, 21);
			menuActualiza.add(tVerduleriaAc);
			
			tSupermercadoAc.setToolTipText("ingrese gasto supermercado");
			tSupermercadoAc.setText("Ingrese gasto Supermercado");
			tSupermercadoAc.setOpaque(false);
			tSupermercadoAc.setForeground(Color.LIGHT_GRAY);
			tSupermercadoAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tSupermercadoAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tSupermercadoAc.setBounds(403, 109, 221, 21);
			menuActualiza.add(tSupermercadoAc);
			
			tCarniceriaAc.setToolTipText("ingrese gasto carniceria");
			tCarniceriaAc.setText("Ingrese gasto Carniceria");
			tCarniceriaAc.setOpaque(false);
			tCarniceriaAc.setForeground(Color.LIGHT_GRAY);
			tCarniceriaAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tCarniceriaAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tCarniceriaAc.setBounds(403, 148, 221, 21);
			menuActualiza.add(tCarniceriaAc);
			
			
			
			
			tAguaAc.setToolTipText("ingrese gasto agua");
			tAguaAc.setText("Ingrese gasto Agua");
			tAguaAc.setOpaque(false);
			tAguaAc.setForeground(Color.LIGHT_GRAY);
			tAguaAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tAguaAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tAguaAc.setBounds(60, 200, 221, 21);
			menuActualiza.add(tAguaAc);
			
			tTransporteAc.setToolTipText("ingrese gasto transporte");
			tTransporteAc.setText("Ingrese gasto Transporte");
			tTransporteAc.setOpaque(false);
			tTransporteAc.setForeground(Color.LIGHT_GRAY);
			tTransporteAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tTransporteAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tTransporteAc.setBounds(60, 338, 221, 21);
			menuActualiza.add(tTransporteAc);
			
			tLuzAc.setToolTipText("ingrese gasto luz");
			tLuzAc.setText("Ingrese gasto Luz");
			tLuzAc.setOpaque(false);
			tLuzAc.setForeground(Color.LIGHT_GRAY);
			tLuzAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tLuzAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tLuzAc.setBounds(60, 242, 221, 21);
			menuActualiza.add(tLuzAc);
			
			tCableinternetAc.setToolTipText("ingrese gasto cable-internet");
			tCableinternetAc.setText("Ingrese gasto Cable-Internet");
			tCableinternetAc.setOpaque(false);
			tCableinternetAc.setForeground(Color.LIGHT_GRAY);
			tCableinternetAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tCableinternetAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tCableinternetAc.setBounds(60, 287, 221, 21);
			menuActualiza.add(tCableinternetAc);
			
			tIngresoAc.setToolTipText("especifique el ingreso/salario");
			tIngresoAc.setOpaque(false);
			tIngresoAc.setForeground(Color.LIGHT_GRAY);
			tIngresoAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tIngresoAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tIngresoAc.setBounds(106, 114, 161, 21);
			menuActualiza.add(tIngresoAc);
			
			JLabel lblResidencia_1 = new JLabel("Ingreso:");
			lblResidencia_1.setForeground(new Color(255, 245, 238));
			lblResidencia_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblResidencia_1.setBounds(28, 110, 122, 29);
			menuActualiza.add(lblResidencia_1);
			
			tNombreAc.setToolTipText("Ingrese el nombre ");
			tNombreAc.setOpaque(false);
			tNombreAc.setForeground(Color.LIGHT_GRAY);
			tNombreAc.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNombreAc.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.info));
			tNombreAc.setBounds(106, 74, 161, 21);
			menuActualiza.add(tNombreAc);
			
			JButton listoAc = new JButton("Listo!");
			
			
			listoAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(tNombreAc.getText().isEmpty()) {
						lista.mensajeTemporizado("Agregue su nombre", 1000);
						
					
					
						 
					}else {
							
						
						
						
						
					s = new SolicitudSeguroSolidario();
						
							
							
							int agua=0;
							int luz=0;
							int cInternet=0;
							int transporte=0;
							int supermercado=0;
							int carniceria=0;
							int verduleria=0;
							int suscripcion=0;
							int salidas=0;
						
							if(tAguaAc.getText().equalsIgnoreCase("ingrese gasto Agua")||tAguaAc.getText().equalsIgnoreCase("")) {
								
							//	s.sb.setAgua(0);
								
							}else {
								agua = Integer.parseInt(tAguaAc.getText());
							}
							if(tLuzAc.getText().equalsIgnoreCase("ingrese gasto luz")||tLuzAc.getText().equalsIgnoreCase("")){
							//	s.sb.setLuz(0);
							
							}else {
								
								 luz = Integer.parseInt(tLuzAc.getText());
							}
							
								if(tCableinternetAc.getText().equalsIgnoreCase("ingrese gasto cable-internet")||tCableinternetAc.getText().equalsIgnoreCase("")){
								
							//	s.sb.setCableInternet(0);
								
							}else {
								cInternet = Integer.parseInt(tCableinternetAc.getText());
							}
								if(tTransporteAc.getText().equalsIgnoreCase("ingrese gasto transporte")||tTransporteAc.getText().equalsIgnoreCase("")) {
								
							//	s.sb.setTransporte(0);
								
							}else {
								transporte = Integer.parseInt(tTransporteAc.getText());
							}
								
								
								if(tSupermercadoAc.getText().equalsIgnoreCase("ingrese gasto supermercado")||tSupermercadoAc.getText().equalsIgnoreCase("")) {
							//	s.comida.setSupermercado(0);
							}else {
								supermercado = Integer.parseInt(tSupermercadoAc.getText());
							}
								
								if (tCarniceriaAc.getText().equalsIgnoreCase("ingrese gasto carniceria")||tCarniceriaAc.getText().equalsIgnoreCase("")) {
							//	s.comida.setCarniceria(0);
								
							}else {
								carniceria = Integer.parseInt(tCarniceriaAc.getText());
							}
								if(tVerduleriaAc.getText().equalsIgnoreCase("ingrese gasto verduleria")||tVerduleriaAc.getText().equalsIgnoreCase("")) {
							//	s.comida.setVerduleria(0);
								
							}else {
								verduleria = Integer.parseInt(tVerduleriaAc.getText());
							}
								if(tSuscripcionAc.getText().equalsIgnoreCase("ingrese gasto suscripciones")||tSuscripcionAc.getText().equalsIgnoreCase("")) {
							//	s.ocio.setStreaming(0);
								
							}else {
								suscripcion = Integer.parseInt(tSuscripcionAc.getText());
							}
								if(tSalidasAc.getText().equalsIgnoreCase("ingrese gasto salidas")||tSalidasAc.getText().equalsIgnoreCase("")) {
								
							//	s.ocio.setSalidas(0);
							
							}else {
								salidas = Integer.parseInt(tSalidasAc.getText());
							}
							
								
						//	s.ingresaP(tNombreAc.getText(),Integer.parseInt(tIngresoAc.getText()));
						//	s.ingresaSB(agua, luz, cInternet, transporte);
						//	s.ingresaC(supermercado, carniceria, verduleria);
						//	s.ingresaO(suscripcion, salidas);
							
							
						
							
						//	s.setIndiceGuia(indiceModificar);
							
							
							lista.actualizar(indiceModificar,s);
							
							lista.mensajeTemporizado("Datos agregados!", 1200);
							
							
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							
							tNombre.setText("");
							//tIngreso.setText("");
							
							
								
							tArchivadasAc.setText(lista.acumulaDatos());
								
						}
				}
						
			});
			
			JButton btnBorraDAc = new JButton("Borrar Datos");//PROBABLEMENTE ESTE BOTON SE DESECHARÃƒÂ�
			btnBorraDAc.setToolTipText("refresca el menu");
			btnBorraDAc.setIcon(null);
			btnBorraDAc.setFont(new Font("Dialog", Font.BOLD, 13));
			btnBorraDAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					tNombreAc.setText("");
					tIngresoAc.setText("");
					
					
					
					
					
				}
			});

			listoAc.setToolTipText("finalizar de agregar los datos");
			listoAc.setFont(new Font("Dialog", Font.BOLD, 13));
			listoAc.setBounds(476, 379, 122, 29);
			menuActualiza.add(listoAc);
			
			JLabel lblNombre_1 = new JLabel("Nombre:");
			lblNombre_1.setForeground(new Color(255, 245, 238));
			lblNombre_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblNombre_1.setBounds(28, 76, 81, 16);
			menuActualiza.add(lblNombre_1);
			
			JLabel lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setForeground(Color.LIGHT_GRAY);
			//lblNewLabel_7.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientActualizar.jpeg")));
			lblNewLabel_7.setBounds(0, 0, 721, 450);
			menuActualiza.add(lblNewLabel_7);
			
			BienvenidaAgente = new JPanel();
			contentPane.add(BienvenidaAgente, "agente");
			BienvenidaAgente.setLayout(null);
			
			panelEliminar = new JPanel();
			panelEliminar.setVisible(false);
			
			JPanel panelActualiza = new JPanel();
			panelActualiza.setVisible(false);
			panelActualiza.setBackground(Color.LIGHT_GRAY);
			panelActualiza.setBounds(124, 0, 608, 448);
			BienvenidaAgente.add(panelActualiza);
			panelActualiza.setLayout(null);
			
			JPanel panelVisitaMedicaActualizar = new JPanel();
			panelVisitaMedicaActualizar.setVisible(false);
			
			JPanel panelComprasActualiza = new JPanel();
			panelComprasActualiza.setVisible(false);
			panelComprasActualiza.setBounds(301, 144, 258, 239);
			panelActualiza.add(panelComprasActualiza);
			panelComprasActualiza.setLayout(null);
			
			JComboBox boxTipoCompra_1 = new JComboBox();
			boxTipoCompra_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione tipo de compra", "Supermercado", "Farmacia"}));
			boxTipoCompra_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoCompra_1.setBounds(10, 11, 238, 22);
			panelComprasActualiza.add(boxTipoCompra_1);
			
			JScrollPane sPDetalleCompra_1 = new JScrollPane();
			sPDetalleCompra_1.setBounds(14, 118, 234, 98);
			panelComprasActualiza.add(sPDetalleCompra_1);
			
			JTextArea textAreaCompraAc = new JTextArea();
			textAreaCompraAc.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPDetalleCompra_1.setViewportView(textAreaCompraAc);
			
			JLabel lblDetalleCompra_1 = new JLabel("Detalle de compra");
			lblDetalleCompra_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblDetalleCompra_1.setFont(new Font("Sitka Text", Font.BOLD, 14));
			lblDetalleCompra_1.setBounds(51, 93, 161, 14);
			panelComprasActualiza.add(lblDetalleCompra_1);
			panelVisitaMedicaActualizar.setBounds(301, 144, 258, 239);
			panelActualiza.add(panelVisitaMedicaActualizar);
			panelVisitaMedicaActualizar.setLayout(null);
			
			JComboBox boxEspecialidadMedica_1 = new JComboBox();
			boxEspecialidadMedica_1.setModel(new DefaultComboBoxModel(new String[] {"Elije especialidad medica", "Medicina General", "Fisioterapia", "Psicologia"}));
			boxEspecialidadMedica_1.setToolTipText("Escoge la especialidad medica deseada");
			boxEspecialidadMedica_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxEspecialidadMedica_1.setBounds(10, 11, 238, 22);
			panelVisitaMedicaActualizar.add(boxEspecialidadMedica_1);
			
			JLabel lblNewLabel_3_1 = new JLabel("Detalle motivo de visita");
			lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lblNewLabel_3_1.setBounds(21, 80, 214, 22);
			panelVisitaMedicaActualizar.add(lblNewLabel_3_1);
			
			JScrollPane sPDetalleMotivoVisita_1 = new JScrollPane();
			sPDetalleMotivoVisita_1.setBounds(12, 105, 236, 123);
			panelVisitaMedicaActualizar.add(sPDetalleMotivoVisita_1);
			
			JTextArea textAreaMotivoVisitaAc = new JTextArea();
			textAreaMotivoVisitaAc.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPDetalleMotivoVisita_1.setViewportView(textAreaMotivoVisitaAc);
			
			JPanel panelPagoServiciosActualizar = new JPanel();
			panelPagoServiciosActualizar.setVisible(false);
			panelPagoServiciosActualizar.setBounds(301, 144, 258, 239);
			panelActualiza.add(panelPagoServiciosActualizar);
			panelPagoServiciosActualizar.setLayout(null);
			
			JComboBox boxTipoPagoServicio_1 = new JComboBox();
			boxTipoPagoServicio_1.setModel(new DefaultComboBoxModel(new String[] {" Tipo de servicio a pagar", "Publico", "Municipal"}));
			boxTipoPagoServicio_1.setToolTipText("Seleccione el tipo de servicio a pagar");
			boxTipoPagoServicio_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoPagoServicio_1.setBounds(10, 11, 236, 27);
			panelPagoServiciosActualizar.add(boxTipoPagoServicio_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Especifica servicio");
			lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lblNewLabel_1_1.setBounds(10, 86, 129, 19);
			panelPagoServiciosActualizar.add(lblNewLabel_1_1);
			
			JScrollPane sPDetallePagoServicioAc = new JScrollPane();
			sPDetallePagoServicioAc.setBounds(10, 116, 236, 34);
			panelPagoServiciosActualizar.add(sPDetallePagoServicioAc);
			
			JTextArea textAreaServicioAc = new JTextArea();
			textAreaServicioAc.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPDetallePagoServicioAc.setViewportView(textAreaServicioAc);
			
			JTextArea tMonto_1 = new JTextArea();
			tMonto_1.setToolTipText("ingrese la identificacion del asegurado");
			tMonto_1.setText("Monto");
			tMonto_1.setOpaque(false);
			tMonto_1.setForeground(new Color(47, 79, 79));
			tMonto_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tMonto_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tMonto_1.setBounds(10, 171, 161, 21);
			panelPagoServiciosActualizar.add(tMonto_1);
			
			JLabel lblNombre_2 = new JLabel("Nombre:");
			lblNombre_2.setForeground(new Color(47, 79, 79));
			lblNombre_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblNombre_2.setBounds(20, 104, 81, 16);
			panelActualiza.add(lblNombre_2);
			
			JTextArea tNombre_1 = new JTextArea();
			tNombre_1.setToolTipText("Ingrese el nombre del asegurado");
			tNombre_1.setOpaque(false);
			tNombre_1.setForeground(new Color(47, 79, 79));
			tNombre_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNombre_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNombre_1.setBounds(111, 102, 161, 21);
			panelActualiza.add(tNombre_1);
			
			JLabel lblResidencia_2 = new JLabel("Edad:");
			lblResidencia_2.setForeground(new Color(47, 79, 79));
			lblResidencia_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblResidencia_2.setBounds(20, 144, 61, 29);
			panelActualiza.add(lblResidencia_2);
			
			JTextArea tEdad_1 = new JTextArea();
			tEdad_1.setToolTipText("Ingrese la edad del asegurado");
			tEdad_1.setOpaque(false);
			tEdad_1.setForeground(new Color(47, 79, 79));
			tEdad_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tEdad_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tEdad_1.setBounds(111, 148, 161, 21);
			panelActualiza.add(tEdad_1);
			
			JLabel lblCedula_1 = new JLabel("Cedula:");
			lblCedula_1.setForeground(new Color(47, 79, 79));
			lblCedula_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblCedula_1.setBounds(20, 186, 61, 29);
			panelActualiza.add(lblCedula_1);
			
			JLabel lblNumeroPoliza_1 = new JLabel("Poliza #: ");
			lblNumeroPoliza_1.setForeground(new Color(47, 79, 79));
			lblNumeroPoliza_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblNumeroPoliza_1.setBounds(20, 226, 81, 29);
			panelActualiza.add(lblNumeroPoliza_1);
			
			JTextArea tCedula_1 = new JTextArea();
			tCedula_1.setToolTipText("ingrese la identificacion del asegurado");
			tCedula_1.setOpaque(false);
			tCedula_1.setForeground(new Color(47, 79, 79));
			tCedula_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tCedula_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tCedula_1.setBounds(111, 190, 161, 21);
			panelActualiza.add(tCedula_1);
			
			JTextArea tNumeroPoliza_1 = new JTextArea();
			tNumeroPoliza_1.setToolTipText("Numero de poliza del asegurado, consta de 3 digitos");
			tNumeroPoliza_1.setOpaque(false);
			tNumeroPoliza_1.setForeground(new Color(47, 79, 79));
			tNumeroPoliza_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNumeroPoliza_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNumeroPoliza_1.setBounds(111, 228, 161, 21);
			panelActualiza.add(tNumeroPoliza_1);
			
			JComboBox boxCategoriaPoliza_1 = new JComboBox();
			boxCategoriaPoliza_1.setModel(new DefaultComboBoxModel(new String[] {"Elija categoria de poliza", "Individual", "Familiar"}));
			boxCategoriaPoliza_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxCategoriaPoliza_1.setBounds(20, 266, 253, 29);
			panelActualiza.add(boxCategoriaPoliza_1);
			
			JLabel lblDireccion_1 = new JLabel("Direccion:");
			lblDireccion_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblDireccion_1.setForeground(new Color(47, 79, 79));
			lblDireccion_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblDireccion_1.setBounds(105, 306, 86, 29);
			panelActualiza.add(lblDireccion_1);
			
			JScrollPane sPDireccionAsegurado_1 = new JScrollPane();
			sPDireccionAsegurado_1.setBounds(20, 346, 253, 91);
			panelActualiza.add(sPDireccionAsegurado_1);
			
			JComboBox boxTipoServicio_1 = new JComboBox();
			boxTipoServicio_1.setModel(new DefaultComboBoxModel(new String[] {"Selecciona tipo de servicio", "Compras", "Pago de servicios publicos", "Visita medica"}));
			boxTipoServicio_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoServicio_1.setBounds(312, 99, 235, 29);
			panelActualiza.add(boxTipoServicio_1);
			
			JButton listo_1 = new JButton("Listo!");
			listo_1.setToolTipText("finalizar de agregar los datos");
			listo_1.setFont(new Font("Dialog", Font.BOLD, 13));
			listo_1.setBounds(301, 408, 109, 29);
			panelActualiza.add(listo_1);
			
			JButton btnBorraD_1 = new JButton("Cancelar");
			btnBorraD_1.setToolTipText("refresca el menu");
			btnBorraD_1.setFont(new Font("Dialog", Font.BOLD, 13));
			btnBorraD_1.setBounds(438, 408, 109, 29);
			panelActualiza.add(btnBorraD_1);
			
			JScrollPane sPMuestraAc = new JScrollPane();
			sPMuestraAc.setBounds(20, 22, 253, 51);
			panelActualiza.add(sPMuestraAc);
			
			JTextArea textAreaMuestraAc = new JTextArea();
			textAreaMuestraAc.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPMuestraAc.setViewportView(textAreaMuestraAc);
			
			JButton btnAnterior = new JButton("");
			btnAnterior.setToolTipText("finalizar de agregar los datos");
			btnAnterior.setFont(new Font("Dialog", Font.BOLD, 13));
			btnAnterior.setBounds(301, 22, 109, 29);
			panelActualiza.add(btnAnterior);
			
			JButton Siguiente = new JButton("");
			Siguiente.setToolTipText("finalizar de agregar los datos");
			Siguiente.setFont(new Font("Dialog", Font.BOLD, 13));
			Siguiente.setBounds(450, 22, 109, 29);
			panelActualiza.add(Siguiente);
			panelEliminar.setBackground(SystemColor.activeCaption);
			panelEliminar.setBounds(124, 0, 612, 454);
			BienvenidaAgente.add(panelEliminar);
			panelEliminar.setLayout(null);
			
			JTextArea tPolizaEliminar = new JTextArea();
			tPolizaEliminar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tPolizaEliminar.setText(null);
				}
			});
			
			tPolizaEliminar.addKeyListener(new KeyAdapter()// Verificar si la tecla pulsada no es un digito/NUMERO
	                {
                public void keyTyped(KeyEvent e)
                {
                    char caracter = e.getKeyChar();


                    if(((caracter < '0') ||
                            (caracter > '9')) &&
                            (caracter != '\b' ))
                    {
                        e.consume();  // ignorar el evento de teclado
                        lista.mensajeTemporizado("Poliza debe contener solamente numeros", 1800);

                    }
                }
            });
			
			
			
			
			tPolizaEliminar.addKeyListener(new KeyListener(){
			   	 
			   	public void keyTyped(KeyEvent e)
			   	 
			   	{if (tPolizaEliminar.getText().length()==3) //LIMITA AL USER A SOLO AGREGAR EL NUMERO DEL PACIENTE QUE SE QUIERE ACTUALIZAR
			   	 
			   	     e.consume();
			   			if(tPolizaEliminar.getText().length()==3) {
			   				lista.mensajeTemporizado("Poliza consta de 3 digitos", 1800);
			   			}
			   	
			   	}
			   	 
			   	public void keyPressed(KeyEvent arg0) {
			   	}
			   	 
			   	public void keyReleased(KeyEvent arg0) {
			   	}
			   	});
			tPolizaEliminar.setToolTipText("Especifique numero de poliza a buscar");
			tPolizaEliminar.setText("Poliza a Eliminar");
			tPolizaEliminar.setOpaque(false);
			tPolizaEliminar.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tPolizaEliminar.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 69, 0)));
			tPolizaEliminar.setBounds(199, 47, 136, 22);
			panelEliminar.add(tPolizaEliminar);
			
			JButton btnEliminaSolicitud = new JButton("");
			btnEliminaSolicitud.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lista.suprimir(tPolizaEliminar.getText());
					tSolicitudesEliminar.setText(lista.acumulaDatos());
					tPolizaEliminar.setText(null);
				}
			});
			btnEliminaSolicitud.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/DeleteOneUser48px.png")));
			btnEliminaSolicitud.setToolTipText("Presiona para eliminar solicitud");
			btnEliminaSolicitud.setContentAreaFilled(false);
			btnEliminaSolicitud.setBorder(null);
			btnEliminaSolicitud.setBounds(345, 27, 61, 60);
			panelEliminar.add(btnEliminaSolicitud);
			
			JScrollPane sPEliminarSolicitud = new JScrollPane();
			sPEliminarSolicitud.setBounds(30, 108, 524, 278);
			panelEliminar.add(sPEliminarSolicitud);
			
			tSolicitudesEliminar = new JTextArea();
			tSolicitudesEliminar.setEditable(false);
			sPEliminarSolicitud.setViewportView(tSolicitudesEliminar);
			
			JButton btnEliminaTodo = new JButton("");
			btnEliminaTodo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lista.eliminarLista();
					
				}
			});
			btnEliminaTodo.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/DeleteAll48px.png")));
			btnEliminaTodo.setToolTipText("Presiona para eliminar registro de solicitudes");
			btnEliminaTodo.setContentAreaFilled(false);
			btnEliminaTodo.setBorder(null);
			btnEliminaTodo.setBounds(416, 27, 61, 60);
			panelEliminar.add(btnEliminaTodo);
			
			JPanel panelBuscarAgente = new JPanel();
			panelBuscarAgente.setVisible(false);
			panelBuscarAgente.setBackground(new Color(128, 128, 0));
			panelBuscarAgente.setBounds(124, 0, 612, 454);
			BienvenidaAgente.add(panelBuscarAgente);
			panelBuscarAgente.setLayout(null);
			
			JTextArea tPolizaBuscar = new JTextArea();
			tPolizaBuscar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
					tPolizaBuscar.setText(null);;
				}
			});
			tPolizaBuscar.addKeyListener(new KeyAdapter()// Verificar si la tecla pulsada no es un digito/NUMERO
	                {
                public void keyTyped(KeyEvent e)
                {
                    char caracter = e.getKeyChar();


                    if(((caracter < '0') ||
                            (caracter > '9')) &&
                            (caracter != '\b' ))
                    {
                        e.consume();  // ignorar el evento de teclado
		   				lista.mensajeTemporizado("Ingrese solo numeros", 1800);

                    }
                }
            });
			
			tPolizaBuscar.addKeyListener(new KeyListener(){
			   	 
			   	public void keyTyped(KeyEvent e)
			   	 
			   	{if (tPolizaBuscar.getText().length()==3) //LIMITA AL USER A SOLO AGREGAR EL NUMERO DEL PACIENTE QUE SE QUIERE ACTUALIZAR
			   	 
			   	     e.consume();
			   			if(tPolizaBuscar.getText().length()==3) {
			   				lista.mensajeTemporizado("Poliza debe contener 3 digitos", 1800);
			   			}
			   	
			   	}
			   	 
			   	public void keyPressed(KeyEvent arg0) {
			   	}
			   	 
			   	public void keyReleased(KeyEvent arg0) {
			   	}
			   	});
			
			
			
			tPolizaBuscar.setToolTipText("Especifique numero de poliza a buscar");
			tPolizaBuscar.setText("Poliza a buscar");
			tPolizaBuscar.setOpaque(false);
			tPolizaBuscar.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tPolizaBuscar.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.activeCaption));
			tPolizaBuscar.setBounds(218, 28, 122, 22);
			panelBuscarAgente.add(tPolizaBuscar);
			
			JButton btnBuscarAgente = new JButton("");
			btnBuscarAgente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tBuscarAgente.setText(lista.consultar(tPolizaBuscar.getText()));
				}
			});
			btnBuscarAgente.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/searchAsegurado.png")));
			btnBuscarAgente.setToolTipText("Presiona para buscar solicitud");
			btnBuscarAgente.setContentAreaFilled(false);
			btnBuscarAgente.setBorder(null);
			btnBuscarAgente.setBounds(360, 11, 51, 57);
			panelBuscarAgente.add(btnBuscarAgente);
			
			JScrollPane sPBuscarAgente = new JScrollPane();
			sPBuscarAgente.setBounds(35, 89, 524, 278);
			panelBuscarAgente.add(sPBuscarAgente);
			
			tBuscarAgente = new JTextArea();
			tBuscarAgente.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
			tBuscarAgente.setEditable(false);
			sPBuscarAgente.setViewportView(tBuscarAgente);
			
			JPanel panelBotonesMenuAgente = new JPanel();
			panelBotonesMenuAgente.setBackground(Color.DARK_GRAY);
			panelBotonesMenuAgente.setBounds(0, 0, 125, 454);
			BienvenidaAgente.add(panelBotonesMenuAgente);
			panelBotonesMenuAgente.setLayout(null);
			
			JButton btnBuscar = new JButton("");
			btnBuscar.setContentAreaFilled(false);
			btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnBuscar.setBorder(null);
			btnBuscar.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Search48.png")));
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (lista.elementosLista()==false) {
						panelBuscarAgente.setVisible(false);
						panelEliminar.setVisible(false);
						panelActualiza.setVisible(false);
						lista.mensajeTemporizado("No existen Solicitudes", 1000);
					} else {
						panelBuscarAgente.setVisible(true);
						panelEliminar.setVisible(false);
						panelActualiza.setVisible(false);

					}

				}
			});
			btnBuscar.setOpaque(false);
			btnBuscar.setBounds(33, 11, 52, 51);
			panelBotonesMenuAgente.add(btnBuscar);
			btnBuscar.setToolTipText("Buscar solicitudes registradas");
			btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
			btnBuscar.setForeground(Color.WHITE);
			btnBuscar.setFont(new Font("SimSun", Font.BOLD, 15));
			btnBuscar.setBackground(new Color(0, 0, 0, 50));
			
			JButton btnActualiza_1 = new JButton("");
			btnActualiza_1.setContentAreaFilled(false);
			btnActualiza_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnActualiza_1.setBorder(null);
			btnActualiza_1.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Update.png")));
			btnActualiza_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (lista.elementosLista()==false) {
						panelBuscarAgente.setVisible(false);
						panelEliminar.setVisible(false);
						panelActualiza.setVisible(false);
						lista.mensajeTemporizado("No existen Solicitudes", 1000);
					} else {
						
						panelActualiza.setVisible(true);
						panelEliminar.setVisible(false);
						panelBuscarAgente.setVisible(false);

					}
					
				}
			});
			btnActualiza_1.setBounds(33, 77, 52, 51);
			panelBotonesMenuAgente.add(btnActualiza_1);
			btnActualiza_1.setToolTipText("actualiza alguna de las solicitudes de los asegurados...");
			btnActualiza_1.setOpaque(false);
			btnActualiza_1.setHorizontalAlignment(SwingConstants.LEFT);
			btnActualiza_1.setForeground(Color.WHITE);
			btnActualiza_1.setFont(new Font("SimSun", Font.BOLD, 15));
			btnActualiza_1.setBackground(new Color(0, 0, 0, 50));
			
			JButton btnEliminar = new JButton("");
			btnEliminar.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Delete48.png")));
			btnEliminar.setBorder(null);
			btnEliminar.setContentAreaFilled(false);
			btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (lista.elementosLista()==false) {
						lista.mensajeTemporizado("No existen solicitudes", 1000);
						panelBuscarAgente.setVisible(false);
						panelActualiza.setVisible(false);
						panelEliminar.setVisible(false);
					} else {
						panelBuscarAgente.setVisible(false);
						panelEliminar.setVisible(true);
						panelActualiza.setVisible(false);
						tSolicitudesEliminar.setText(lista.acumulaDatos());
					}
				}
			});
			btnEliminar.setBounds(33, 159, 52, 51);
			panelBotonesMenuAgente.add(btnEliminar);
			btnEliminar.setToolTipText("elimina uno o bien todos las solicitudes registradas");
			btnEliminar.setOpaque(false);
			btnEliminar.setHorizontalAlignment(SwingConstants.LEFT);
			btnEliminar.setForeground(Color.WHITE);
			btnEliminar.setFont(new Font("SimSun", Font.BOLD, 15));
			btnEliminar.setBackground(new Color(0, 0, 0, 50));
			
			JButton bSalirSesionAgente = new JButton("");
			bSalirSesionAgente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bSalirSesionAgente.setBorder(null);
			bSalirSesionAgente.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {//FINALIZACION DEL PROGRAMA CONTROLADA
					
					if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
						System.exit(0);//SI NO HAY DATOS DEL TODO EL PROGRAMA SOLO SE CIERRA SIN PREGUNTAR SI DESEA GUARDAR DATOS
					} else {
					}
				}
			});
			bSalirSesionAgente.setToolTipText("Salir del programa");
			
			bSalirSesionAgente.setContentAreaFilled(false);
			bSalirSesionAgente.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/VolverPrincipal48px.png")));
			bSalirSesionAgente.setBounds(33, 387, 52, 44);
			panelBotonesMenuAgente.add(bSalirSesionAgente);
			
			JButton bBackToLoginAgente = new JButton("");
			bBackToLoginAgente.setToolTipText("Salir del perfil \"Agente\", vuelve e inicia otra sesion");
			bBackToLoginAgente.setBorder(null);
			bBackToLoginAgente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BienvenidaAgente.setVisible(false);
				}
			});
			bBackToLoginAgente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bBackToLoginAgente.setContentAreaFilled(false);
			bBackToLoginAgente.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Home48.png")));
			bBackToLoginAgente.setBounds(33, 301, 52, 44);
			panelBotonesMenuAgente.add(bBackToLoginAgente);
			
			//
		}
	}
