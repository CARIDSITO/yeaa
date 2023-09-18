package color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class osi {

	private JFrame frame;
	private JLabel lblSi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					osi window = new osi();
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
	public osi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblSi = new JLabel("");
		lblSi.setOpaque(true);
		lblSi.setBackground(new Color(240, 240, 240));
		lblSi.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.BLACK));
		lblSi.setForeground(new Color(255, 255, 255));
		lblSi.setBounds(181, 43, 186, 186);
		frame.getContentPane().add(lblSi);
		
		JButton btnazul = new JButton("azul");
		btnazul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSi.setBackground(Color.blue);
			
			}
		});
		JButton btnAzul = new JButton("azul");
		btnazul.setBounds(0, 11, 89, 23);
		frame.getContentPane().add(btnazul);
		
		JButton btnrojo = new JButton("rojo");
		btnrojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSi.setBackground(Color.red);
			}
		});
		btnrojo.setBounds(0, 45, 89, 23);
		frame.getContentPane().add(btnrojo);
		
		JButton btnNegro = new JButton("negro");
		btnNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSi.setBackground(Color.black);
			}
		});
		btnNegro.setBounds(0, 79, 89, 23);
		frame.getContentPane().add(btnNegro);
		
		JButton btnverde = new JButton("verde");
		btnverde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSi.setBackground(Color.green);
			}
		});
		btnverde.setBounds(0, 108, 89, 23);
		frame.getContentPane().add(btnverde);
		
		JButton btnnaranja = new JButton("naranja");
		btnnaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSi.setBackground(Color.orange);
			}
		});
		btnnaranja.setBounds(0, 153, 89, 23);
		frame.getContentPane().add(btnnaranja);
		
		JButton btnamarillo = new JButton("amarillo");
		btnamarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSi.setBackground(Color.yellow);
			}
		});
		btnamarillo.setBounds(0, 189, 89, 23);
		frame.getContentPane().add(btnamarillo);
		
		JButton btnRosa = new JButton("Rosa");
		btnRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSi.setBackground(Color.pink);
				
			}
		});
		btnRosa.setBounds(0, 227, 89, 23);
		frame.getContentPane().add(btnRosa);
	}
}
