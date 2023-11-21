
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class Exercício_1_RadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtbase;
	private JTextField txtaltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício_1_RadioButton frame = new Exercício_1_RadioButton();
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
	public Exercício_1_RadioButton() {
		setTitle("Retangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel painel_principal = new JPanel();
		painel_principal.setForeground(new Color(64, 0, 128));
		painel_principal.setBounds(75, 73, 350, 180);
		panel.add(painel_principal);
		painel_principal.setLayout(null);
		
		JPanel painel_base = new JPanel();
		painel_base.setBounds(0, 0, 128, 23);
		painel_principal.add(painel_base);
		
		JLabel lblbase = new JLabel("Base");
		lblbase.setFont(new Font("Arial", Font.BOLD, 10));
		painel_base.add(lblbase);
		
		JPanel painel_altura = new JPanel();
		painel_altura.setBounds(221, 0, 128, 23);
		painel_principal.add(painel_altura);
		
		JLabel lblNewLabel = new JLabel("Altura");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 10));
		painel_altura.add(lblNewLabel);
		
		JButton btnfechar = new JButton("Fechar");
		btnfechar.setFont(new Font("Arial", Font.BOLD, 10));
		btnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnfechar.setBounds(264, 159, 85, 21);
		painel_principal.add(btnfechar);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 10));
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtbase.setText("");
				txtaltura.setText("");
				
			}
	
		});
		btnlimpar.setBounds(139, 159, 85, 21);
		painel_principal.add(btnlimpar);
		
		JPanel painel_base_texto = new JPanel();
		painel_base_texto.setBounds(0, 27, 128, 29);
		painel_principal.add(painel_base_texto);
		
		txtbase = new JTextField();
		txtbase.setFont(new Font("Arial", Font.BOLD, 10));
		painel_base_texto.add(txtbase);
		txtbase.setColumns(10);
		
		JPanel painel_altura_texto = new JPanel();
		painel_altura_texto.setBounds(221, 27, 128, 29);
		painel_principal.add(painel_altura_texto);
		
		txtaltura = new JTextField();
		txtaltura.setFont(new Font("Arial", Font.BOLD, 10));
		painel_altura_texto.add(txtaltura);
		txtaltura.setColumns(10);
		
		JPanel painel_area = new JPanel();
		painel_area.setBounds(0, 61, 128, 31);
		painel_principal.add(painel_area);
		
		JRadioButton rdbtnbarea = new JRadioButton("Area");
		rdbtnbarea.setFont(new Font("Arial", Font.BOLD, 10));
		buttonGroup.add(rdbtnbarea);
		painel_area.add(rdbtnbarea);
		
		JPanel painel_perimetro = new JPanel();
		painel_perimetro.setBounds(221, 61, 129, 31);
		painel_principal.add(painel_perimetro);
		
		JRadioButton rdbtnperimetro = new JRadioButton("Perimetro");
		rdbtnperimetro.setFont(new Font("Arial", Font.BOLD, 10));
		buttonGroup.add(rdbtnperimetro);
		painel_perimetro.add(rdbtnperimetro);
		
		
		JLabel lblaa = new JLabel("");
		lblaa.setBounds(0, 102, 340, 47);
		painel_principal.add(lblaa);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.setFont(new Font("Arial", Font.BOLD, 10));
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String base = txtbase.getText();
				float baseF = Float.valueOf(base);
				String altura = txtaltura.getText();
				float alturaF = Float.valueOf(altura);
				
				Retangulo calc = new Retangulo();
				
				float perimetro = calc.calcularP(baseF,alturaF);
				float area = calc.calcularArea(baseF, alturaF);
				String perimetro1 = String.format("%.2f",perimetro);
				String area1 = String.format("%.2f",area);
			
				
			 
			   if(rdbtnbarea.isSelected()) {
				   lblaa.setText("Área: " + area1);
				   
			}else
				
				
				if(rdbtnperimetro.isSelected()) {
					lblaa.setText("Perímetro: " + perimetro1);
				}
				
		}
		});
		btncalcular.setBounds(0, 159, 85, 21);
		painel_principal.add(btncalcular);
		
	}
}

