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
	
	public class Menu extends JFrame {
	
		private JPanel contentPane;
		private JPanel menuMuestra;
		private JPanel BienvenidaAgente;
		
	
		String nombre;
		String dni;
		String lugarResidencia;
		int indiceModificar=1;
		
		Lista lista = new Lista();
		SolicitudSeguroSolidario s = new SolicitudSeguroSolidario();
		
		
		
		//////////////AREASDETEXTO//////////
		JTextArea tDatosBuscar = new JTextArea();
		JTextArea datos = new JTextArea();
		JTextArea tInfoEliminar = new JTextArea();
		JTextArea tArchivadasAc = new JTextArea();
		
		/////BOTON HOME/////
		
		JButton btnHomeShorCut = new JButton("");
		private JButton bSalirSesion;
		private JButton btnHomeShorCut_2;
		private JButton btnHomeShorCut_1;
		
		/////////////PANELES////////////////
		private JPanel bienvenidaAsegurado;
		private JPanel panelCompras;
		private JPanel menuElimina;
		private JPanel menuBusca;
		private JPanel panelVisitaMedica;
		private JPanel panelPagoServicios;
		
		
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
			
			JPanel panelMenuOpciones = new JPanel();
			panelMenuOpciones.setBackground(Color.DARK_GRAY);
			panelMenuOpciones.setBounds(0, 0, 113, 454);
			bienvenidaAsegurado.add(panelMenuOpciones);
			panelMenuOpciones.setLayout(null);
			//btnMostrar.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/monitor_16.png")));
			
			JButton btnInsertar = new JButton("Inserta");
			btnInsertar.setBounds(0, 0, 113, 51);
			panelMenuOpciones.add(btnInsertar);
			btnInsertar.setToolTipText("Agrega los gastos para este mes...");
			btnInsertar.setHorizontalAlignment(SwingConstants.LEFT);
			btnInsertar.setForeground(Color.WHITE);
			btnInsertar.setOpaque(false);
			btnInsertar.setBackground(new Color (0, 0, 0, 50));
			//btnInsertar.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/add.png")));
			btnInsertar.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					
				}
			});
			
			btnInsertar.setSelected(true);
			btnInsertar.setPreferredSize(new Dimension(68, 23));
			btnInsertar.setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));
			
			//PARA QUE SE CREE UN NUEVO REPORTE EN ORDEN?
			
			btnInsertar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t1");
					
				}
			});
			btnInsertar.setFont(new Font("SimSun", Font.BOLD, 15));
			
					JButton btnMostrar = new JButton("Mostrar");
					btnMostrar.setBounds(0, 62, 113, 51);
					panelMenuOpciones.add(btnMostrar);
					btnMostrar.setToolTipText("ver el resumen de todos los gastos registrados...");
					btnMostrar.setHorizontalAlignment(SwingConstants.LEFT);
					btnMostrar.setForeground(Color.WHITE);
					btnMostrar.setOpaque(false);
					btnMostrar.setBackground(new Color (0, 0, 0, 50));
					btnMostrar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							CardLayout c = (CardLayout)(contentPane.getLayout());
							c.show(contentPane, "t2");
							datos.setText(lista.mostrar());
							
							
							
						}
					});
					
					btnMostrar.setFont(new Font("SimSun", Font.BOLD, 15));
					
					
					JButton btnbusca = new JButton("Buscar");
					btnbusca.setBounds(0, 124, 113, 51);
					panelMenuOpciones.add(btnbusca);
					btnbusca.setToolTipText("buscar en el registro alg\u00FAn gasto en especifico...");
					btnbusca.setHorizontalAlignment(SwingConstants.LEFT);
					//btnbusca.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/buscar.png")));
					btnbusca.setForeground(Color.WHITE);
					btnbusca.setOpaque(false);
					btnbusca.setBackground(new Color (0, 0, 0, 50));
					btnbusca.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							CardLayout c = (CardLayout)(contentPane.getLayout());
							c.show(contentPane, "t3");
							tDatosBuscar.setText(lista.acumulaDatos());
							
						}
					});
					
					
					btnbusca.setFont(new Font("SimSun", Font.BOLD, 15));
					
					JButton bSalirProgramaAsegurado = new JButton("");
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
					bSalirProgramaAsegurado.setBounds(29, 305, 44, 45);
					panelMenuOpciones.add(bSalirProgramaAsegurado);
					
					JButton bBackToLogin = new JButton("");
					bBackToLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					bBackToLogin.setBorder(null);
					bBackToLogin.setToolTipText("Salir del perfil \"Asegurado\", vuelve e inicia otra sesion");
					bBackToLogin.setContentAreaFilled(false);
					bBackToLogin.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/backToLogin48px.png")));
					bBackToLogin.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							bienvenidaAsegurado.setVisible(false);
						}
					});
					bBackToLogin.setBounds(29, 232, 44, 51);
					panelMenuOpciones.add(bBackToLogin);
					
					JPanel menuInserta = new JPanel();
					menuInserta.setLayout(null);
					menuInserta.setBackground(Color.LIGHT_GRAY);
					menuInserta.setBounds(112, 0, 624, 447);
					bienvenidaAsegurado.add(menuInserta);
					
					panelCompras = new JPanel();
					panelCompras.setVisible(false);
					
					panelPagoServicios = new JPanel();
					panelPagoServicios.setVisible(false);
					panelPagoServicios.setBounds(314, 81, 283, 290);
					menuInserta.add(panelPagoServicios);
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
					tMonto.setText("Monto");
					tMonto.setToolTipText("ingrese la identificacion del asegurado");
					tMonto.setOpaque(false);
					tMonto.setForeground(new Color(47, 79, 79));
					tMonto.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
					tMonto.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
					tMonto.setBounds(26, 195, 161, 21);
					panelPagoServicios.add(tMonto);
					panelCompras.setBounds(315, 81, 283, 290);
					menuInserta.add(panelCompras);
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
					menuInserta.add(panelVisitaMedica);
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
					tEdad.setToolTipText("Ingrese la edad del asegurado");
					tEdad.setOpaque(false);
					tEdad.setForeground(new Color(47, 79, 79));
					tEdad.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
					tEdad.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
					tEdad.setBounds(124, 66, 161, 21);
					menuInserta.add(tEdad);
					
					JLabel lblResidencia = new JLabel("Edad:");
					lblResidencia.setForeground(new Color(47, 79, 79));
					lblResidencia.setFont(new Font("Sitka Text", Font.BOLD, 15));
					lblResidencia.setBounds(33, 62, 61, 29);
					menuInserta.add(lblResidencia);
					
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
						}
					});
					listo.setToolTipText("finalizar de agregar los datos");
					listo.setFont(new Font("Dialog", Font.BOLD, 13));
					listo.setBounds(314, 390, 109, 29);
					menuInserta.add(listo);
					
					JButton btnBorraD = new JButton("Cancelar");
					btnBorraD.setToolTipText("refresca el menu");
					btnBorraD.setFont(new Font("Dialog", Font.BOLD, 13));
					btnBorraD.setBounds(443, 390, 109, 29);
					menuInserta.add(btnBorraD);
					
					JLabel lblNombre = new JLabel("Nombre:");
					lblNombre.setForeground(new Color(47, 79, 79));
					lblNombre.setFont(new Font("Sitka Text", Font.BOLD, 15));
					lblNombre.setBounds(33, 36, 81, 16);
					menuInserta.add(lblNombre);
					
					tNombre = new JTextArea();
					tNombre.setToolTipText("Ingrese el nombre del asegurado");
					tNombre.setOpaque(false);
					tNombre.setForeground(new Color(47, 79, 79));
					tNombre.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
					tNombre.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
					tNombre.setBounds(124, 17, 161, 21);
					menuInserta.add(tNombre);
					
					JLabel lblCedula = new JLabel("Cedula:");
					lblCedula.setForeground(new Color(47, 79, 79));
					lblCedula.setFont(new Font("Sitka Text", Font.BOLD, 15));
					lblCedula.setBounds(33, 109, 61, 29);
					menuInserta.add(lblCedula);
					
					tCedula = new JTextArea();
					tCedula.setToolTipText("ingrese la identificacion del asegurado");
					tCedula.setOpaque(false);
					tCedula.setForeground(new Color(47, 79, 79));
					tCedula.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
					tCedula.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
					tCedula.setBounds(124, 108, 161, 21);
					menuInserta.add(tCedula);
					
					boxCategoriaPoliza = new JComboBox();
					boxCategoriaPoliza.setFont(new Font("Sitka Text", Font.BOLD, 12));
					boxCategoriaPoliza.setModel(new DefaultComboBoxModel(new String[] {"Elija categoria de poliza", "Individual", "Familiar"}));
					boxCategoriaPoliza.setBounds(33, 206, 253, 29);
					menuInserta.add(boxCategoriaPoliza);
					
					JLabel lblDireccion = new JLabel("Direccion:");
					lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
					lblDireccion.setForeground(new Color(47, 79, 79));
					lblDireccion.setFont(new Font("Sitka Text", Font.BOLD, 15));
					lblDireccion.setBounds(112, 261, 86, 29);
					menuInserta.add(lblDireccion);
					
					JScrollPane sPDireccionAsegurado = new JScrollPane();
					sPDireccionAsegurado.setBounds(32, 301, 253, 91);
					menuInserta.add(sPDireccionAsegurado);
					
					tDireccionAsegurado = new JTextArea();
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
							}
							
						}
					});
					boxTipoServicio.setFont(new Font("Sitka Text", Font.BOLD, 12));
					boxTipoServicio.setModel(new DefaultComboBoxModel(new String[] {"Selecciona tipo de servicio", "Compras", "Pago de servicios publicos", "Visita medica"}));
					boxTipoServicio.setBounds(337, 28, 246, 29);
					menuInserta.add(boxTipoServicio);
					
					JLabel lblNumeroPoliza = new JLabel("Poliza #: ");
					lblNumeroPoliza.setForeground(new Color(47, 79, 79));
					lblNumeroPoliza.setFont(new Font("Sitka Text", Font.BOLD, 15));
					lblNumeroPoliza.setBounds(33, 149, 81, 29);
					menuInserta.add(lblNumeroPoliza);
					
					tNumeroPoliza = new JTextArea();
					tNumeroPoliza.setToolTipText("ingrese la identificacion del asegurado");
					tNumeroPoliza.setOpaque(false);
					tNumeroPoliza.setForeground(new Color(47, 79, 79));
					tNumeroPoliza.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
					tNumeroPoliza.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
					tNumeroPoliza.setBounds(124, 151, 161, 21);
					menuInserta.add(tNumeroPoliza);
			
			menuMuestra = new JPanel();
			menuMuestra.setBackground(SystemColor.activeCaption);
			contentPane.add(menuMuestra, "t2");
			menuMuestra.setLayout(null);
			
			
			btnHomeShorCut = new JButton("");
			btnHomeShorCut.setToolTipText("Regresar a menu prinicipal");
			btnHomeShorCut.setOpaque(false);
			btnHomeShorCut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuMuestra.setVisible(false);
					bienvenidaAsegurado.setVisible(true);
				
					
					
				}
			});
			
			btnHomeShorCut.setContentAreaFilled(false);
			//btnHomeShorCut.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut.setBounds(311, 378, 65, 41);
			menuMuestra.add(btnHomeShorCut);
			
			JLabel lDatos = new JLabel("Datos");
			lDatos.setForeground(new Color(47, 79, 79));
			lDatos.setHorizontalAlignment(SwingConstants.CENTER);
			lDatos.setFont(new Font("SimSun", Font.BOLD, 20));
			lDatos.setBounds(274, 21, 129, 35);
			menuMuestra.add(lDatos);
			
			datos.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 13));
			
			JScrollPane scroll;
			
			datos.setEditable(false);
			
			datos.setForeground(new Color(0, 0, 0));
			datos.setBackground(new Color(211, 211, 211));
			scroll= new JScrollPane(datos);
			scroll.setBounds(93, 67, 498, 262);
			menuMuestra.add(scroll);
			
			JLabel lblNewLabel_5 = new JLabel("");
			//lblNewLabel_5.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientMostrar.jpeg")));
			lblNewLabel_5.setBounds(0, 0, 721, 450);
			menuMuestra.add(lblNewLabel_5);
			
			
			
			
			
			menuBusca = new JPanel();
			menuBusca.setBackground(new Color(188, 143, 143));
			menuBusca.setToolTipText("");
			contentPane.add(menuBusca, "t3");
			menuBusca.setLayout(null);
			
			JLabel lBuscando = new JLabel("Buscando.");
			lBuscando.setForeground(new Color(0, 51, 102));
			lBuscando.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lBuscando.setBounds(287, 6, 140, 30);
			menuBusca.add(lBuscando);
			
			JTextArea tDigito = new JTextArea(); //TOMA EL DIGITO PARA BUSCAR EL PACIENTE
			tDigito.setFont(new Font("Sitka Text", Font.BOLD, 14));
			tDigito.setForeground(new Color(255, 245, 238));
			tDigito.setOpaque(false);
			tDigito.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 51, 102)));
			tDigito.setBackground(new Color(153, 153, 153));
			tDigito.setToolTipText("Ingresa el digito entre corchetes \"[ ]\"");
			tDigito.setBounds(287, 47, 71, 28);
			menuBusca.add(tDigito);
			
			JLabel lblDigitaPacienteA = new JLabel("Digita paciente a buscar:");
			lblDigitaPacienteA.setForeground(new Color(0, 51, 102));
			lblDigitaPacienteA.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblDigitaPacienteA.setBounds(85, 49, 191, 30);
			menuBusca.add(lblDigitaPacienteA);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(159, 110, 408, 193);
			menuBusca.add(scrollPane);
			tDatosBuscar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tDatosBuscar.setBackground(new Color(153, 153, 153));
			
			scrollPane.setViewportView(tDatosBuscar);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setContentAreaFilled(false);
			btnBuscar.setIgnoreRepaint(true);
			btnBuscar.setFont(new Font("Sitka Text", Font.BOLD, 12));
			btnBuscar.setForeground(Color.WHITE);
			//btnBuscar.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/buscarBusqueda.png")));
			
			btnBuscar.setOpaque(false);
			btnBuscar.setContentAreaFilled(false);
			btnBuscar.setBackground(new Color (0, 0, 0, 100));
			
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(Integer.parseInt(tDigito.getText())<0) {
						lista.mensajeTemporizado("Ingresa numero de reporte", 1000);
						
						
					}else {
						
						
						lista.consultar(Integer.parseInt(tDigito.getText()));
						tDigito.setText("");
					}
				
					
				}
			});
			
			btnBuscar.setToolTipText("Presiona para mostrar informacion.");
			btnBuscar.setBounds(368, 33, 121, 52);
			menuBusca.add(btnBuscar);
			
			btnHomeShorCut_2 = new JButton("");
			btnHomeShorCut_2.setToolTipText("Menu principal");
			btnHomeShorCut_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuBusca.setVisible(false);
					bienvenidaAsegurado.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut_2.setContentAreaFilled(false);
		//	btnHomeShorCut_2.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut_2.setBounds(301, 365, 82, 52);
			menuBusca.add(btnHomeShorCut_2);
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setForeground(new Color(51, 51, 0));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			//lblNewLabel_2.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientBuscar.jpg")));
			lblNewLabel_2.setBounds(-58, -43, 841, 538);
			menuBusca.add(lblNewLabel_2);
			
			menuElimina = new JPanel();
			menuElimina.setBackground(new Color(119, 136, 153));
			contentPane.add(menuElimina, "t4");
			menuElimina.setLayout(null);
			
			JButton btnEliminaLista = new JButton("");
			btnEliminaLista.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lista.elementosLista()==false) {
						lista.mensajeTemporizado("Lista vacia", 1200);
					}else {
						lista.eliminarLista();
						lista.mensajeTemporizado("Registro eliminado", 1500);
						tInfoEliminar.setText(lista.acumulaDatos());
					}
				}
			});
			//btnEliminaLista.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/borrar2.png")));
			btnEliminaLista.setToolTipText("Presiona para eliminar  todo el registro.");
			btnEliminaLista.setFont(new Font("Sitka Text", Font.BOLD, 15));
			btnEliminaLista.setContentAreaFilled(false);
			btnEliminaLista.setBounds(531, 77, 48, 38);
			menuElimina.add(btnEliminaLista);
			
			JLabel lEliminando = new JLabel("Eliminando.");
			lEliminando.setForeground(SystemColor.scrollbar);
			lEliminando.setBackground(new Color(245, 255, 250));
			lEliminando.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lEliminando.setBounds(312, 11, 140, 30);
			menuElimina.add(lEliminando);
			
			JTextArea tDigitoEliminar = new JTextArea();
			tDigitoEliminar.setForeground(SystemColor.scrollbar);
			tDigitoEliminar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
			tDigitoEliminar.setOpaque(false);
			tDigitoEliminar.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.activeCaption));
			tDigitoEliminar.setBackground(SystemColor.activeCaption);
			tDigitoEliminar.setToolTipText("Ingresa el digito entre corchetes \"[ ]\" del n\u00FAmero de paciente a eliminar...");
			tDigitoEliminar.setBounds(390, 84, 48, 28);
			menuElimina.add(tDigitoEliminar);
			
			JLabel lPacienteEliminar = new JLabel("Digita paciente a eliminar:");
			lPacienteEliminar.setForeground(SystemColor.scrollbar);
			lPacienteEliminar.setToolTipText("");
			lPacienteEliminar.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
			lPacienteEliminar.setBounds(194, 77, 199, 30);
			menuElimina.add(lPacienteEliminar);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(81, 133, 579, 224);
			menuElimina.add(scrollPane_1);
			tInfoEliminar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tInfoEliminar.setBackground(SystemColor.activeCaption);
			
			
			scrollPane_1.setViewportView(tInfoEliminar);
			
			JButton btnEliminar = new JButton("");
			//btnEliminar.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/borrarBorrado.png")));
			btnEliminar.setContentAreaFilled(false);
			//btnEliminar.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/trash_32.png")));
			btnEliminar.setFont(new Font("Sitka Text", Font.BOLD, 15));
			btnEliminar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
						lista.suprimir(Integer.parseInt(tDigitoEliminar.getText()));
						tInfoEliminar.setText("");
						tInfoEliminar.setText(lista.acumulaDatos());
						
						
				}
				
			});
			
			btnEliminar.setToolTipText("Presiona para eliminar");
			btnEliminar.setBounds(459, 77, 48, 38);
			menuElimina.add(btnEliminar);
			
			
			 btnHomeShorCut_1 = new JButton("");
			 btnHomeShorCut_1.setToolTipText("Regresa a menu principal");
			btnHomeShorCut_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuElimina.setVisible(false);
					bienvenidaAsegurado.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut_1.setContentAreaFilled(false);
			//btnHomeShorCut_1.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut_1.setBounds(328, 381, 65, 49);
			menuElimina.add(btnHomeShorCut_1);
			
			JLabel lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setHorizontalTextPosition(SwingConstants.RIGHT);
			//lblNewLabel_6.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientEliminar.jpeg")));
			lblNewLabel_6.setBounds(0, 0, 721, 450);
			menuElimina.add(lblNewLabel_6);
			
			
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
			
			JPanel panelBotonesMenuAgente = new JPanel();
			panelBotonesMenuAgente.setBackground(Color.DARK_GRAY);
			panelBotonesMenuAgente.setBounds(0, 0, 125, 454);
			BienvenidaAgente.add(panelBotonesMenuAgente);
			panelBotonesMenuAgente.setLayout(null);
			
			JButton btnMostrar_1 = new JButton("Mostrar");
			btnMostrar_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t2");
					datos.setText(lista.mostrar());
					
					
					
				}
			});
			btnMostrar_1.setOpaque(false);
			btnMostrar_1.setBounds(0, 11, 123, 51);
			panelBotonesMenuAgente.add(btnMostrar_1);
			btnMostrar_1.setToolTipText("ver el resumen de todas las solicitudes registradas...");
			btnMostrar_1.setHorizontalAlignment(SwingConstants.LEFT);
			btnMostrar_1.setForeground(Color.WHITE);
			btnMostrar_1.setFont(new Font("SimSun", Font.BOLD, 15));
			btnMostrar_1.setBackground(new Color(0, 0, 0, 50));
			
			JButton btnActualiza_1 = new JButton("Actualizar");
			btnActualiza_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t1");
					menuInserta.setVisible(true);
					//datos.setText(lista.mostrar());
				}
			});
			btnActualiza_1.setBounds(0, 60, 123, 51);
			panelBotonesMenuAgente.add(btnActualiza_1);
			btnActualiza_1.setToolTipText("actualiza alguna de las solicitudes de los asegurados...");
			btnActualiza_1.setOpaque(false);
			btnActualiza_1.setHorizontalAlignment(SwingConstants.LEFT);
			btnActualiza_1.setForeground(Color.WHITE);
			btnActualiza_1.setFont(new Font("SimSun", Font.BOLD, 15));
			btnActualiza_1.setBackground(new Color(0, 0, 0, 50));
			
			JButton btnElimina_1 = new JButton("Eliminar");
			btnElimina_1.setBounds(0, 108, 123, 51);
			panelBotonesMenuAgente.add(btnElimina_1);
			btnElimina_1.setToolTipText("elimina uno o bien todos las solicitudes registradas");
			btnElimina_1.setOpaque(false);
			btnElimina_1.setHorizontalAlignment(SwingConstants.LEFT);
			btnElimina_1.setForeground(Color.WHITE);
			btnElimina_1.setFont(new Font("SimSun", Font.BOLD, 15));
			btnElimina_1.setBackground(new Color(0, 0, 0, 50));
			
			JButton bSalirSesionAgente = new JButton("");
			bSalirSesionAgente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bSalirSesionAgente.setBorder(null);
			bSalirSesionAgente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BienvenidaAgente.setVisible(false);
					
				}
			});
			
			bSalirSesionAgente.setToolTipText("Salir del programa");
			
			bSalirSesionAgente.setContentAreaFilled(false);
			bSalirSesionAgente.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/VolverPrincipal48px.png")));
			bSalirSesionAgente.setBounds(33, 337, 52, 44);
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
			bBackToLoginAgente.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/backToLogin48px.png")));
			bBackToLoginAgente.setBounds(33, 248, 52, 44);
			panelBotonesMenuAgente.add(bBackToLoginAgente);
			
			//
		}
	}
