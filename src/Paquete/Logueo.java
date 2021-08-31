package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logueo extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField JpassClave;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logueo frame = new Logueo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Logueo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 214);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 31, 381, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(30, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(30, 119, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(109, 69, 135, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JpassClave = new JPasswordField();
		JpassClave.setBounds(110, 116, 135, 20);
		contentPane.add(JpassClave);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char[] clave = JpassClave.getPassword();
				String claveFinal = new String(clave);
				
				if(txtUsuario.getText().equals("Pablo") && claveFinal.equals("123456")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido a Banco Platinium","INGRESASTE",
							JOptionPane.INFORMATION_MESSAGE);
					
					Principal p = new Principal();
					p.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					
					txtUsuario.setText("");
					JpassClave.setText("");
					txtUsuario.requestFocus();
					
					
				}
			}
		});
		btnIngresar.setBounds(299, 115, 89, 23);
		contentPane.add(btnIngresar);
	}
}
