package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a Banco Platinium");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 24, 396, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tus Datos");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(-19, 60, 443, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(118, 99, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 129, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 160, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 191, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 222, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Rut:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 101, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 132, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 163, 63, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 194, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha Ingreso:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 225, 98, 14);
		contentPane.add(lblNewLabel_6);
	}

}
