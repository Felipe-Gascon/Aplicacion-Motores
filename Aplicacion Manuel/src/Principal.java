import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Principal extends JFrame {

	private JPanel contentPane;

	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVerDatosPrevios = new JButton("Ver Datos Previos");
		btnVerDatosPrevios.setBounds(123, 55, 152, 23);
		contentPane.add(btnVerDatosPrevios);
		
		JButton btnNewButton = new JButton("Calcular Nuevos Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(135, 149, 140, 23);
		contentPane.add(btnNewButton);
	}
}
