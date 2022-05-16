import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	public JFrame frame;
	public JTextField caja;
	public float primernumero; 
	public float segundonumero; 
	public String operador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
							
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				
		});
		
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 261, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja = new JTextField();
		caja.setBounds(6, 6, 246, 38);
		frame.getContentPane().add(caja);
		caja.setColumns(10);
		
		
		JButton btnSiete = new JButton("7");
		btnSiete.setBounds(6, 118, 50, 50);
		frame.getContentPane().add(btnSiete);
		btnSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "7");
			}
		});
		
		JButton btnOcho = new JButton("8");
		btnOcho.setBounds(68, 118, 50, 50);
		frame.getContentPane().add(btnOcho);
		btnOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "8");
			}
		});
		
		JButton btnNueve = new JButton("9");
		btnNueve.setBounds(130, 118, 50, 50);
		frame.getContentPane().add(btnNueve);
		btnNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "9");
			}
		});
		
		JButton btnMas = new JButton("+");
		btnMas.setBounds(192, 118, 60, 112);
		frame.getContentPane().add(btnMas);
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "+"; 
				caja.setText("");
			}
		});
		
		JButton btnCuatro = new JButton("4");
		btnCuatro.setBounds(6, 180, 50, 50);
		frame.getContentPane().add(btnCuatro);
		btnCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "4");
			}
		});
		
		JButton btnCinco = new JButton("5");
		btnCinco.setBounds(68, 180, 50, 50);
		frame.getContentPane().add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "5");
			}
		});
		
		JButton btnSeis = new JButton("6");
		btnSeis.setBounds(130, 180, 50, 50);
		frame.getContentPane().add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "6");
			}
		});
		
		JButton btnUno = new JButton("1");
		btnUno.setBounds(6, 242, 50, 50);
		frame.getContentPane().add(btnUno);
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "1");
			}
		});
		
		JButton btnDos = new JButton("2");
		btnDos.setBounds(68, 242, 50, 50);
		frame.getContentPane().add(btnDos);
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "2");
			}
		});
		
		JButton btnTres = new JButton("3");
		btnTres.setBounds(130, 242, 50, 50);
		frame.getContentPane().add(btnTres);
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "3");
			}
		});
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(192, 242, 60, 112);
		frame.getContentPane().add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundonumero = Float.parseFloat(caja.getText()); 
				switch(operador) {
					case "+": 
						caja.setText(Float.toString(primernumero + segundonumero)); 
					break;
					case "-": 
						caja.setText(Float.toString(primernumero - segundonumero)); 
					break;
					case "*": 
						caja.setText(Float.toString(primernumero * segundonumero)); 
					break;
					case "/": 
						if (segundonumero != 0) {
							caja.setText(Float.toString(primernumero / segundonumero));
						} else {
							caja.setText("ERROR: No se puede dividir entre 0");
						}
					break;
				}
			}
		});
		
		JButton btnCero = new JButton("0");
		btnCero.setBounds(6, 304, 112, 50);
		frame.getContentPane().add(btnCero);
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "0");
			}
		});
		
		JButton btnPunto = new JButton(".");
		btnPunto.setBounds(130, 304, 50, 50);
		frame.getContentPane().add(btnPunto);
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(caja.getText().contains("."))) {
					caja.setText(caja.getText()+".");
				}
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.setBounds(6, 56, 50, 50);
		frame.getContentPane().add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText("");
			}
		});
		
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(68, 56, 50, 50);
		frame.getContentPane().add(btnDividir);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "/"; 
				caja.setText("");
			}
		});
		
		JButton btnMultijugador = new JButton("*");
		btnMultijugador.setBounds(130, 56, 50, 50);
		frame.getContentPane().add(btnMultijugador);
		btnMultijugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "*"; 
				caja.setText("");
			}
		});
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBounds(192, 56, 60, 50);
		frame.getContentPane().add(btnMenos);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "-"; 
				caja.setText("");
			}
		});
	}
	
}
