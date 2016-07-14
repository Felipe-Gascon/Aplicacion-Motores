import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class VDatosMotor extends JFrame {

	private JPanel contentPane;
	private JTextField ciguenyal;
	private JTextField diamCilindro;
	private JLabel lblDiametroCilindro;
	private JLabel lblLongitudDeBiela;
	private JTextField textField;
	private JLabel lblIntroduceLosDatos;
	private JTextField lumbrePpal;
	private JLabel lblAreaLumbrePrincipal;
	private JTextField escapeAux;
	private JLabel lblAreaEscapeAuxiliar;
	private JLabel lblAnguloLumbreraEscape;
	private JTextField lumbreraEscape;
	private JLabel lblAnguloDeGrados;
	private JTextField textField_1;


	/**
	 * Create the frame.
	 */
	public VDatosMotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ciguenyal = new JTextField();
		ciguenyal.setBounds(10, 72, 86, 20);
		contentPane.add(ciguenyal);
		ciguenyal.setColumns(10);

		JLabel lblCarreraCigeal = new JLabel("Carrera Cig\u00FCe\u00F1al");
		lblCarreraCigeal.setBounds(10, 47, 105, 14);
		contentPane.add(lblCarreraCigeal);

		diamCilindro = new JTextField();
		diamCilindro.setBounds(10, 128, 86, 20);
		contentPane.add(diamCilindro);
		diamCilindro.setColumns(10);

		lblDiametroCilindro = new JLabel("Diametro Cilindro");
		lblDiametroCilindro.setBounds(10, 103, 86, 14);
		contentPane.add(lblDiametroCilindro);

		lblLongitudDeBiela = new JLabel("Longitud de Biela");
		lblLongitudDeBiela.setBounds(10, 159, 86, 14);
		contentPane.add(lblLongitudDeBiela);

		textField = new JTextField();
		textField.setBounds(10, 184, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		lblIntroduceLosDatos = new JLabel("Introduce Los Datos del Motor");
		lblIntroduceLosDatos.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblIntroduceLosDatos.setForeground(new Color(0, 0, 0));
		lblIntroduceLosDatos.setBounds(84, 11, 326, 14);
		contentPane.add(lblIntroduceLosDatos);

		lumbrePpal = new JTextField();
		lumbrePpal.setBounds(318, 72, 86, 20);
		contentPane.add(lumbrePpal);
		lumbrePpal.setColumns(10);

		lblAreaLumbrePrincipal = new JLabel("Area Lumbrera Principal");
		lblAreaLumbrePrincipal.setBounds(318, 47, 129, 14);
		contentPane.add(lblAreaLumbrePrincipal);

		escapeAux = new JTextField();
		escapeAux.setBounds(318, 128, 86, 20);
		contentPane.add(escapeAux);
		escapeAux.setColumns(10);

		lblAreaEscapeAuxiliar = new JLabel("Area Escape Auxiliar");
		lblAreaEscapeAuxiliar.setBounds(318, 103, 105, 14);
		contentPane.add(lblAreaEscapeAuxiliar);

		lblAnguloLumbreraEscape = new JLabel("Angulo Lumbrera Escape");
		lblAnguloLumbreraEscape.setBounds(318, 159, 141, 14);
		contentPane.add(lblAnguloLumbreraEscape);

		lumbreraEscape = new JTextField();
		lumbreraEscape.setBounds(318, 184, 86, 20);
		contentPane.add(lumbreraEscape);
		lumbreraEscape.setColumns(10);

		lblAnguloDeGrados = new JLabel("Angulo de Grados de Carga");
		lblAnguloDeGrados.setBounds(318, 215, 151, 14);
		contentPane.add(lblAnguloDeGrados);

		textField_1 = new JTextField();
		textField_1.setBounds(318, 238, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("<< Atras");
		button.setBounds(28, 300, 89, 23);
		contentPane.add(button);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCalcular.setBounds(318, 300, 89, 23);
		contentPane.add(btnCalcular);
	}
}
