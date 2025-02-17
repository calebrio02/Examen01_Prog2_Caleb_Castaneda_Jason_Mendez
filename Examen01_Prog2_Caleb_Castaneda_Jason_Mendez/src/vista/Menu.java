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
		private JTextArea tSolicitudesEliminar;
		
		//ComboBox///
		private JComboBox boxTipoCompra;
		private JComboBox boxEspecialidadMedica;
		private JComboBox boxTipoPagoServicio;
		private JComboBox boxTipoServicio;
		private JComboBox boxCategoriaPoliza;
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
			
			JButton bExitMainMenu = new JButton("");
			bExitMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bExitMainMenu.setBorderPainted(false);
			bExitMainMenu.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {//FINALIZACION DEL PROGRAMA CONTROLADA
					
					if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
						System.exit(0);//SI NO HAY DATOS DEL TODO EL PROGRAMA SOLO SE CIERRA SIN PREGUNTAR SI DESEA GUARDAR DATOS
					} else {
					}
				}
			});
			
			
			
			bExitMainMenu.setToolTipText("Salir de la aplicacion...");
			bExitMainMenu.setContentAreaFilled(false);
			bExitMainMenu.setBorder(null);
			bExitMainMenu.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/VolverPrincipal48px.png")));
			bExitMainMenu.setBounds(662, 392, 64, 49);
			inicioApp.add(bExitMainMenu);
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
			
			panelVisitaMedica = new JPanel();
			panelVisitaMedica.setVisible(false);
			
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
			tDetallePagoServicio.setFont(new Font("Sitka Text", Font.BOLD, 12));
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
			tDetalleVisita.setFont(new Font("Sitka Text", Font.BOLD, 12));
			tDetalleVisita.setToolTipText("Especifique el motivo de su visita medica");
			sPDetalleMotivoVisita.setViewportView(tDetalleVisita);
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
			tDetalleCompra.setFont(new Font("Sitka Text", Font.BOLD, 12));
			tDetalleCompra.setToolTipText("Especifique detalle de compra");
			sPDetalleCompra.setViewportView(tDetalleCompra);
			
			JLabel lblDetalleCompra = new JLabel("Detalle de compra");
			lblDetalleCompra.setFont(new Font("Sitka Text", Font.BOLD, 14));
			lblDetalleCompra.setHorizontalAlignment(SwingConstants.CENTER);
			lblDetalleCompra.setBounds(41, 134, 203, 14);
			panelCompras.add(lblDetalleCompra);
			
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
			
			JButton listo = new JButton("");
			listo.setBorder(null);
			listo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			listo.setContentAreaFilled(false);
			listo.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/doneB.png")));
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
							s.setNombreServicio("Pago de servicios publicos");
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
			listo.setToolTipText("Aceptar y finalizar de agregar los datos");
			listo.setFont(new Font("Dialog", Font.BOLD, 13));
			listo.setBounds(408, 390, 45, 37);
			panelInserta.add(listo);
			
			JButton btnBorraD = new JButton("");
			btnBorraD.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/deleteB36.png")));
			btnBorraD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnBorraD.setContentAreaFilled(false);
			btnBorraD.setBorder(null);
			btnBorraD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
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
			btnBorraD.setToolTipText("Cancelar y refrescar el menu");
			btnBorraD.setFont(new Font("Dialog", Font.BOLD, 13));
			btnBorraD.setBounds(463, 390, 61, 37);
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
			
			JButton btnBorraDAc = new JButton("Borrar Datos");//PROBABLEMENTE ESTE BOTON SE DESECHARÃƒÂ�
			btnBorraDAc.setToolTipText("refresca el menu");
			btnBorraDAc.setIcon(null);
			btnBorraDAc.setFont(new Font("Dialog", Font.BOLD, 13));
			btnBorraDAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
					
					
				}
			});
			
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
			
			JPanel panelPagoServiciosActualizar = new JPanel();
			panelPagoServiciosActualizar.setVisible(false);
			
			JPanel panelVisitaMedicaActualizar = new JPanel();
			panelVisitaMedicaActualizar.setVisible(false);
			
			JPanel panelComprasActualiza = new JPanel();
			panelComprasActualiza.setVisible(false);
			panelComprasActualiza.setBounds(301, 144, 258, 239);
			panelActualiza.add(panelComprasActualiza);
			panelComprasActualiza.setLayout(null);
			
			JComboBox boxTipoCompraPac = new JComboBox();
			boxTipoCompraPac.setModel(new DefaultComboBoxModel(new String[] {"Seleccione tipo de compra", "Supermercado", "Farmacia"}));
			boxTipoCompraPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoCompraPac.setBounds(10, 11, 238, 22);
			panelComprasActualiza.add(boxTipoCompraPac);
			
			JScrollPane sPDetalleCompra_1 = new JScrollPane();
			sPDetalleCompra_1.setBounds(14, 118, 234, 98);
			panelComprasActualiza.add(sPDetalleCompra_1);
			
			JTextArea tCompraPac = new JTextArea();
			tCompraPac.setAlignmentX(Component.LEFT_ALIGNMENT);
			tCompraPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPDetalleCompra_1.setViewportView(tCompraPac);
			
			JLabel lblDetalleCompra_1 = new JLabel("Detalle de compra");
			lblDetalleCompra_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblDetalleCompra_1.setFont(new Font("Sitka Text", Font.BOLD, 14));
			lblDetalleCompra_1.setBounds(51, 93, 161, 14);
			panelComprasActualiza.add(lblDetalleCompra_1);
			panelVisitaMedicaActualizar.setBounds(301, 144, 258, 239);
			panelActualiza.add(panelVisitaMedicaActualizar);
			panelVisitaMedicaActualizar.setLayout(null);
			
			JComboBox boxEspecialidadMedicaPac = new JComboBox();
			boxEspecialidadMedicaPac.setModel(new DefaultComboBoxModel(new String[] {"Elije especialidad medica", "Medicina General", "Fisioterapia", "Psicologia"}));
			boxEspecialidadMedicaPac.setToolTipText("Escoge la especialidad medica deseada");
			boxEspecialidadMedicaPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxEspecialidadMedicaPac.setBounds(10, 11, 238, 22);
			panelVisitaMedicaActualizar.add(boxEspecialidadMedicaPac);
			
			JLabel lblNewLabel_3_1 = new JLabel("Detalle motivo de visita");
			lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lblNewLabel_3_1.setBounds(21, 80, 214, 22);
			panelVisitaMedicaActualizar.add(lblNewLabel_3_1);
			
			JScrollPane sPDetalleMotivoVisita_1 = new JScrollPane();
			sPDetalleMotivoVisita_1.setBounds(12, 105, 236, 123);
			panelVisitaMedicaActualizar.add(sPDetalleMotivoVisita_1);
			
			JTextArea tMotivoVisitaPac = new JTextArea();
			tMotivoVisitaPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPDetalleMotivoVisita_1.setViewportView(tMotivoVisitaPac);
			panelPagoServiciosActualizar.setBounds(301, 144, 258, 239);
			panelActualiza.add(panelPagoServiciosActualizar);
			panelPagoServiciosActualizar.setLayout(null);
			
			JComboBox boxTipoPagoServicioPac = new JComboBox();
			boxTipoPagoServicioPac.setModel(new DefaultComboBoxModel(new String[] {" Tipo de servicio a pagar", "Publico", "Municipal"}));
			boxTipoPagoServicioPac.setToolTipText("Seleccione el tipo de servicio a pagar");
			boxTipoPagoServicioPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoPagoServicioPac.setBounds(10, 11, 236, 27);
			panelPagoServiciosActualizar.add(boxTipoPagoServicioPac);
			
			JLabel lblNewLabel_1_1 = new JLabel("Especifica servicio");
			lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lblNewLabel_1_1.setBounds(10, 86, 129, 19);
			panelPagoServiciosActualizar.add(lblNewLabel_1_1);
			
			JScrollPane sPDetallePagoServicioAc = new JScrollPane();
			sPDetallePagoServicioAc.setBounds(10, 116, 236, 34);
			panelPagoServiciosActualizar.add(sPDetallePagoServicioAc);
			
			JTextArea tServicioPac = new JTextArea();
			tServicioPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPDetallePagoServicioAc.setViewportView(tServicioPac);
			
			JTextArea tMontoPac = new JTextArea();
			tMontoPac.setToolTipText("ingrese la identificacion del asegurado");
			tMontoPac.setText("Monto");
			tMontoPac.setOpaque(false);
			tMontoPac.setForeground(new Color(47, 79, 79));
			tMontoPac.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tMontoPac.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tMontoPac.setBounds(10, 171, 161, 21);
			panelPagoServiciosActualizar.add(tMontoPac);
			
			JLabel lblNombre_2 = new JLabel("Nombre:");
			lblNombre_2.setForeground(new Color(47, 79, 79));
			lblNombre_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblNombre_2.setBounds(20, 104, 81, 16);
			panelActualiza.add(lblNombre_2);
			
			JTextArea tNombrePac = new JTextArea();
			tNombrePac.setToolTipText("Ingrese el nombre del asegurado");
			tNombrePac.setOpaque(false);
			tNombrePac.setForeground(new Color(47, 79, 79));
			tNombrePac.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNombrePac.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNombrePac.setBounds(111, 102, 161, 21);
			panelActualiza.add(tNombrePac);
			
			JLabel lblResidencia_2 = new JLabel("Edad:");
			lblResidencia_2.setForeground(new Color(47, 79, 79));
			lblResidencia_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblResidencia_2.setBounds(20, 144, 61, 29);
			panelActualiza.add(lblResidencia_2);
			
			JTextArea tEdadPac = new JTextArea();
			tEdadPac.setToolTipText("Ingrese la edad del asegurado");
			tEdadPac.setOpaque(false);
			tEdadPac.setForeground(new Color(47, 79, 79));
			tEdadPac.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tEdadPac.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tEdadPac.setBounds(111, 148, 161, 21);
			panelActualiza.add(tEdadPac);
			
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
			
			JTextArea tCedulaPac = new JTextArea();
			tCedulaPac.setToolTipText("ingrese la identificacion del asegurado");
			tCedulaPac.setOpaque(false);
			tCedulaPac.setForeground(new Color(47, 79, 79));
			tCedulaPac.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tCedulaPac.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tCedulaPac.setBounds(111, 190, 161, 21);
			panelActualiza.add(tCedulaPac);
			
			JTextArea tNumeroPolizaPac = new JTextArea();
			tNumeroPolizaPac.setToolTipText("Numero de poliza del asegurado, consta de 3 digitos");
			tNumeroPolizaPac.setOpaque(false);
			tNumeroPolizaPac.setForeground(new Color(47, 79, 79));
			tNumeroPolizaPac.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNumeroPolizaPac.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNumeroPolizaPac.setBounds(111, 228, 161, 21);
			panelActualiza.add(tNumeroPolizaPac);
			
			JComboBox boxCategoriaPolizaPac = new JComboBox();
			boxCategoriaPolizaPac.setModel(new DefaultComboBoxModel(new String[] {"Elija categoria de poliza", "Individual", "Familiar"}));
			boxCategoriaPolizaPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxCategoriaPolizaPac.setBounds(20, 266, 253, 29);
			panelActualiza.add(boxCategoriaPolizaPac);
			
			JLabel lblDireccion_1 = new JLabel("Direccion:");
			lblDireccion_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblDireccion_1.setForeground(new Color(47, 79, 79));
			lblDireccion_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblDireccion_1.setBounds(111, 299, 86, 29);
			panelActualiza.add(lblDireccion_1);
			
			JScrollPane sPDireccionAsegurado_1 = new JScrollPane();
			sPDireccionAsegurado_1.setBounds(20, 326, 253, 91);
			panelActualiza.add(sPDireccionAsegurado_1);
			
			JTextArea tDireccionAseguradoPac = new JTextArea();
			tDireccionAseguradoPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPDireccionAsegurado_1.setViewportView(tDireccionAseguradoPac);
			
			JComboBox boxTipoServicioPac = new JComboBox();
			boxTipoServicioPac.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (boxTipoServicioPac.getSelectedItem().toString().equalsIgnoreCase("Compras")) {
						panelComprasActualiza.setVisible(true);
						panelPagoServiciosActualizar.setVisible(false);
						panelVisitaMedicaActualizar.setVisible(false);
						
					} else if(boxTipoServicioPac.getSelectedItem().toString().equalsIgnoreCase("Pago de servicios publicos")){
						panelComprasActualiza.setVisible(false);
						panelPagoServiciosActualizar.setVisible(true);
						panelVisitaMedicaActualizar.setVisible(false);

					}else if (boxTipoServicioPac.getSelectedItem().toString().equalsIgnoreCase("Visita medica")) {
						panelComprasActualiza.setVisible(false);
						panelPagoServiciosActualizar.setVisible(false);
						panelVisitaMedicaActualizar.setVisible(true);
					}else {
						panelComprasActualiza.setVisible(false);
						panelPagoServiciosActualizar.setVisible(false);
						panelVisitaMedicaActualizar.setVisible(false);
					}
					
					
				}
			});
			boxTipoServicioPac.setModel(new DefaultComboBoxModel(new String[] {"Selecciona tipo de servicio", "Compras", "Pago de servicios publicos", "Visita medica"}));
			boxTipoServicioPac.setFont(new Font("Sitka Text", Font.BOLD, 12));
			boxTipoServicioPac.setBounds(312, 99, 235, 29);
			panelActualiza.add(boxTipoServicioPac);
			
			JButton bListoPac = new JButton("Actualizar!");
			bListoPac.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
s = new SolicitudSeguroSolidario();
					
					///////////Datos principales//////
					String nombre = tNombrePac.getText();
					String edad = tEdadPac.getText();
					String dni = tCedulaPac.getText();
					String TipoPoliza ="";
					String direccion = tDireccionAseguradoPac.getText();
					String numPoliza =tNumeroPolizaPac.getText();
					
					
					////datos condicionales////////
					
					if (boxCategoriaPolizaPac.getSelectedIndex()==0) {
						lista.mensajeTemporizado("Debes seleccionar un tipo de poliza",1000);
					}else {
						 TipoPoliza = boxCategoriaPolizaPac.getSelectedItem().toString();
					}
					if (boxTipoServicioPac.getSelectedIndex()==0) {
						lista.mensajeTemporizado("Debes seleccionar un tipo de servicio", 1000);
					}else 
					   if(boxTipoServicioPac.getSelectedIndex()==1)  {
						s.setNombreServicio("Compras");
						s.getC().ingresa(boxTipoCompraPac.getSelectedItem().toString(), tCompraPac.getText());
					}else 
						if (boxTipoServicioPac.getSelectedIndex()==2) {
							s.setNombreServicio("Pago de servicios publicos");
							s.getP().ingresa(boxTipoPagoServicioPac.getSelectedItem().toString(), tServicioPac.getText());
							s.getP().setMonto(tMontoPac.getText());
						
					}else 
						if (boxTipoServicioPac.getSelectedIndex()==3) {
							s.setNombreServicio("Visita medica");
							s.getV().ingresa(boxEspecialidadMedicaPac.getSelectedItem().toString(), tMotivoVisitaPac.getText());
						
					}
				
					s.getA().ingresar(nombre, edad, dni, numPoliza, TipoPoliza, direccion);
					lista.actualizar(indiceModificar, s);
					lista.mensajeTemporizado("Datos actualizados", 2000);
					
					
					
					
					
					
					
					
				}
			});
			bListoPac.setToolTipText("finalizar de agregar los datos");
			bListoPac.setFont(new Font("Dialog", Font.BOLD, 13));
			bListoPac.setBounds(380, 394, 109, 29);
			panelActualiza.add(bListoPac);
			
			JScrollPane sPMuestraAc = new JScrollPane();
			sPMuestraAc.setBounds(20, 41, 258, 52);
			panelActualiza.add(sPMuestraAc);
			
			JTextArea tMuestraAc = new JTextArea();
			tMuestraAc.setFont(new Font("Sitka Text", Font.BOLD, 12));
			sPMuestraAc.setViewportView(tMuestraAc);
			
			JButton bAnteriorPac = new JButton("");
			bAnteriorPac.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					indiceModificar --;//MOSTREMOS AL ANTERIOR
					
					
					 s = lista.buscar(indiceModificar);
					
					 if(s.getA().getNombre()!=null) {
						 
						 tMuestraAc.setText(lista.acumulaDatos());
							tNombrePac.setText(s.getA().getNombre());
							tEdadPac.setText(s.getA().getEdad());
							tCedulaPac.setText(s.getA().getCedula());
							tNumeroPolizaPac.setText(s.getA().getNumPoliza());
							boxCategoriaPolizaPac.setSelectedItem(s.getA().getCategoria());
							tDireccionAseguradoPac.setText(s.getA().getDireccion());
							
							boxTipoServicioPac.setSelectedItem(s.getNombreServicio());
							
							if(boxTipoServicioPac.getSelectedIndex()==1) {
								panelPagoServiciosActualizar.setVisible(false);
								panelVisitaMedicaActualizar.setVisible(false);
								panelComprasActualiza.setVisible(true);
								
								boxTipoCompraPac.setSelectedItem(s.getC().getTipoCompra());
								tCompraPac.setText(s.getC().getDetalle());
								
							}else if(boxTipoServicioPac.getSelectedIndex()==2){
								
								panelVisitaMedicaActualizar.setVisible(false);
								panelComprasActualiza.setVisible(false);
								
								panelPagoServiciosActualizar.setVisible(true);
								boxTipoPagoServicioPac.setSelectedItem(s.getP().getServicioPagar());
								tServicioPac.setText(s.getP().getDetalle());
								tMontoPac.setText(s.getP().getMonto());
								
								
							}else if(boxTipoServicioPac.getSelectedIndex()==3) {
								panelVisitaMedicaActualizar.setVisible(false);
								panelComprasActualiza.setVisible(false);
								panelVisitaMedicaActualizar.setVisible(true);
								boxEspecialidadMedicaPac.setSelectedItem(s.getV().getEspecialidadMedica());
								tMotivoVisitaPac.setText(s.getV().getDetalle());
								
							}
						}else {
							indiceModificar++;
						//
						}
					
					
					
					
				}
			});
			bAnteriorPac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bAnteriorPac.setContentAreaFilled(false);
			bAnteriorPac.setBorderPainted(false);
			bAnteriorPac.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/left.png")));
			bAnteriorPac.setToolTipText("mostrar solicitud anterior");
			bAnteriorPac.setFont(new Font("Dialog", Font.BOLD, 13));
			bAnteriorPac.setBounds(365, 28, 55, 57);
			panelActualiza.add(bAnteriorPac);
			
			JButton bSiguientePac = new JButton("");
			bSiguientePac.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					indiceModificar ++;//MOSTREMOS AL SIGUIENTE
					
					
					 s = lista.buscar(indiceModificar);
					
					 if(s.getA().getNombre()!=null) {
						 
						 tMuestraAc.setText(lista.acumulaDatos());
							tNombrePac.setText(s.getA().getNombre());
							tEdadPac.setText(s.getA().getEdad());
							tCedulaPac.setText(s.getA().getCedula());
							tNumeroPolizaPac.setText(s.getA().getNumPoliza());
							boxCategoriaPolizaPac.setSelectedItem(s.getA().getCategoria());
							tDireccionAseguradoPac.setText(s.getA().getDireccion());
							
							boxTipoServicioPac.setSelectedItem(s.getNombreServicio());
							
							
							if(boxTipoServicioPac.getSelectedIndex()==1) {
								panelPagoServiciosActualizar.setVisible(false);
								panelVisitaMedicaActualizar.setVisible(false);
								panelComprasActualiza.setVisible(true);
								
								boxTipoCompraPac.setSelectedItem(s.getC().getTipoCompra());
								tCompraPac.setText(s.getC().getDetalle());
								
							}else if(boxTipoServicioPac.getSelectedIndex()==2){
								
								panelVisitaMedicaActualizar.setVisible(false);
								panelComprasActualiza.setVisible(false);
								
								panelPagoServiciosActualizar.setVisible(true);
								boxTipoPagoServicioPac.setSelectedItem(s.getP().getServicioPagar());
								tServicioPac.setText(s.getP().getDetalle());
								tMontoPac.setText(s.getP().getMonto());
								
								
							}else if(boxTipoServicioPac.getSelectedIndex()==3) {
								panelVisitaMedicaActualizar.setVisible(false);
								panelComprasActualiza.setVisible(false);
								panelVisitaMedicaActualizar.setVisible(true);
								boxEspecialidadMedicaPac.setSelectedItem(s.getV().getEspecialidadMedica());
								tMotivoVisitaPac.setText(s.getV().getDetalle());
							}
						}else {
							indiceModificar--;
						//
						}
					 
						
					
					
					
				}
			});
			bSiguientePac.setContentAreaFilled(false);
			bSiguientePac.setBorderPainted(false);
			bSiguientePac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bSiguientePac.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Right.png")));
			bSiguientePac.setToolTipText("mostrar siguiente solicitud");
			bSiguientePac.setFont(new Font("Dialog", Font.BOLD, 13));
			bSiguientePac.setBounds(447, 28, 55, 57);
			panelActualiza.add(bSiguientePac);
			
			JTextArea tBuscaPolizaPac = new JTextArea();
			tBuscaPolizaPac.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if(tBuscaPolizaPac.getText().equalsIgnoreCase("poliza de solicitud a buscar")) {
						tBuscaPolizaPac.selectAll();
						tBuscaPolizaPac.setText("");
			    	}
					
				}
			});
			tBuscaPolizaPac.setText("poliza de solicitud a buscar");
			tBuscaPolizaPac.setToolTipText("Ingrese la poliza de la solicitud a mostrar ");
			tBuscaPolizaPac.setOpaque(false);
			tBuscaPolizaPac.setForeground(new Color(47, 79, 79));
			tBuscaPolizaPac.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 13));
			tBuscaPolizaPac.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tBuscaPolizaPac.setBounds(111, 11, 174, 21);
			
			panelActualiza.add(tBuscaPolizaPac);
			
			JButton bSearchPac = new JButton("");
			bSearchPac.setBorder(null);
			bSearchPac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bSearchPac.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					s = lista.consultar(tBuscaPolizaPac.getText());
					
					if(s.getA().getNombre()==null) {
						lista.mensajeTemporizado("Solicitud no encontrada", 1200);
						
						
					}else {
						
				
						indiceModificar= (s.getIndiceSolicitud()+1);
			
						tMuestraAc.setText(lista.acumulaDatos());
						tNombrePac.setText(s.getA().getNombre());
						tEdadPac.setText(s.getA().getEdad());
						tCedulaPac.setText(s.getA().getCedula());
						tNumeroPolizaPac.setText(s.getA().getNumPoliza());
						boxCategoriaPolizaPac.setSelectedItem(s.getA().getCategoria());
						tDireccionAseguradoPac.setText(s.getA().getDireccion());
						
						boxTipoServicioPac.setSelectedItem(s.getNombreServicio());
						
						if(boxTipoServicioPac.getSelectedIndex()==1) {
							panelPagoServiciosActualizar.setVisible(false);
							panelVisitaMedicaActualizar.setVisible(false);
							panelComprasActualiza.setVisible(true);
							
							boxTipoCompraPac.setSelectedItem(s.getC().getTipoCompra());
							tCompraPac.setText(s.getC().getDetalle());
							
						}else if(boxTipoServicioPac.getSelectedIndex()==2){
							
							panelVisitaMedicaActualizar.setVisible(false);
							panelComprasActualiza.setVisible(false);
							
							panelPagoServiciosActualizar.setVisible(true);
							boxTipoPagoServicioPac.setSelectedItem(s.getP().getServicioPagar());
							tServicioPac.setText(s.getP().getDetalle());
							tMontoPac.setText(s.getP().getMonto());
							
							
						}else if(boxTipoServicioPac.getSelectedIndex()==3) {
							panelVisitaMedicaActualizar.setVisible(false);
							panelComprasActualiza.setVisible(false);
							panelVisitaMedicaActualizar.setVisible(true);
							boxEspecialidadMedicaPac.setSelectedItem(s.getV().getEspecialidadMedica());
							tMotivoVisitaPac.setText(s.getV().getDetalle());
							
						}
						
						
					}
					
					

					
					
					
				}
			});
			
			
			
			bSearchPac.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/search2.png")));
			bSearchPac.setContentAreaFilled(false);
			bSearchPac.setToolTipText("finalizar de agregar los datos");
			bSearchPac.setFont(new Font("Dialog", Font.BOLD, 13));
			bSearchPac.setBounds(296, 0, 41, 41);
			panelActualiza.add(bSearchPac);
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
					
					
					//ELIMINACION DE SOLICITUDES CONTROLADA
					
					if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar la solicitud?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
							lista.suprimir(tPolizaEliminar.getText());
							tSolicitudesEliminar.setText(lista.acumulaDatos());
							tPolizaEliminar.setText(null);
					
					} else {
						
						
					}
					
					
					
					
					/////////////////////////////////////////////////////
					
					
					
					
					
					///////////////////////////////////////////////////////
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
					
					
							
							
							//ELIMINACION DE SOLICITUDES CONTROLADA
							
							if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar registro de solicitudes?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
							        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
									lista.eliminarLista();
									lista.mensajeTemporizado("Registro de solicitudes eliminado", 1500);
									tSolicitudesEliminar.setText(lista.acumulaDatos());
									tPolizaEliminar.setText(null);
							} else {
								
								
							}
							
							
					
					
					
					
				}
			});
			
				btnEliminaTodo.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/DeleteAll48px.png")));
				btnEliminaTodo.setToolTipText("Presiona para eliminar registro de solicitudes");
				btnEliminaTodo.setContentAreaFilled(false);
				btnEliminaTodo.setBorder(null);
				btnEliminaTodo.setBounds(416, 27, 61, 60);
				panelEliminar.add(btnEliminaTodo);
			
			JPanel panelBotonesMenuAgente = new JPanel();
			panelBotonesMenuAgente.setBackground(Color.DARK_GRAY);
			panelBotonesMenuAgente.setBounds(0, 0, 125, 454);
			BienvenidaAgente.add(panelBotonesMenuAgente);
			panelBotonesMenuAgente.setLayout(null);
			
			JButton bActualiza = new JButton("");
			bActualiza.setContentAreaFilled(false);
			bActualiza.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bActualiza.setBorder(null);
			bActualiza.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Update.png")));
			bActualiza.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (lista.elementosLista()==false) {
						
						panelEliminar.setVisible(false);
						panelActualiza.setVisible(false);
						lista.mensajeTemporizado("No existen Solicitudes", 1000);
					} else {
						 s = lista.buscar(1);
						 
						panelActualiza.setVisible(true);
						panelEliminar.setVisible(false);
						
			
						tMuestraAc.setText(lista.acumulaDatos());
						tNombrePac.setText(s.getA().getNombre());
						tEdadPac.setText(s.getA().getEdad());
						tCedulaPac.setText(s.getA().getCedula());
						tNumeroPolizaPac.setText(s.getA().getNumPoliza());
						boxCategoriaPolizaPac.setSelectedItem(s.getA().getCategoria());
						tDireccionAseguradoPac.setText(s.getA().getDireccion());
						
						boxTipoServicioPac.setSelectedItem(s.getNombreServicio());
						
						if(boxTipoServicioPac.getSelectedIndex()==1) {
							panelComprasActualiza.setVisible(true);
							
							boxTipoCompraPac.setSelectedItem(s.getC().getTipoCompra());
							tCompraPac.setText(s.getC().getDetalle());
							
						}else if(boxTipoServicioPac.getSelectedIndex()==2){
							panelPagoServiciosActualizar.setVisible(true);
							boxTipoPagoServicioPac.setSelectedItem(s.getP().getServicioPagar());
							tServicioPac.setText(s.getP().getDetalle());
							tMontoPac.setText(s.getP().getMonto());
							
							
						}else if(boxTipoServicioPac.getSelectedIndex()==3) {
							panelVisitaMedicaActualizar.setVisible(true);
							boxEspecialidadMedicaPac.setSelectedItem(s.getV().getEspecialidadMedica());
							tMotivoVisitaPac.setText(s.getV().getDetalle());
							
						}
						
					}
					
				}
			});
			bActualiza.setBounds(33, 29, 52, 51);
			panelBotonesMenuAgente.add(bActualiza);
			bActualiza.setToolTipText("actualiza alguna de las solicitudes de los asegurados...");
			bActualiza.setOpaque(false);
			bActualiza.setHorizontalAlignment(SwingConstants.LEFT);
			bActualiza.setForeground(Color.WHITE);
			bActualiza.setFont(new Font("SimSun", Font.BOLD, 15));
			bActualiza.setBackground(new Color(0, 0, 0, 50));
			
			JButton btnEliminar = new JButton("");
			btnEliminar.setIcon(new ImageIcon(Menu.class.getResource("/ImagesMenu/Delete48.png")));
			btnEliminar.setBorder(null);
			btnEliminar.setContentAreaFilled(false);
			btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (lista.elementosLista()==false) {
						lista.mensajeTemporizado("No existen solicitudes", 1000);
						
						panelActualiza.setVisible(false);
						panelEliminar.setVisible(false);
					} else {
						
						panelEliminar.setVisible(true);
						panelActualiza.setVisible(false);
						tSolicitudesEliminar.setText(lista.acumulaDatos());
					}
				}
			});
			btnEliminar.setBounds(33, 111, 52, 51);
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
