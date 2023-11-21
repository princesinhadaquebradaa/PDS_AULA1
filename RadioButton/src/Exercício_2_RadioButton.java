import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercício_2_RadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtprimeiro;
	private JTextField txtsegundo;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício_2_RadioButton frame = new Exercício_2_RadioButton();
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
	public Exercício_2_RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[381px]", "[243px]"));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[179px][40px][148px]", "[39px][39px][21px][21px][21px][21px][31px]"));
		
		JPanel painel_primeiroNum = new JPanel();
		panel.add(painel_primeiroNum, "cell 0 0 3 1,grow");
		painel_primeiroNum.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primeiro Número Inteiro:");
		lblNewLabel.setBounds(0, 10, 138, 13);
		painel_primeiroNum.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtprimeiro = new JTextField();
		txtprimeiro.setFont(new Font("Arial", Font.BOLD, 11));
		txtprimeiro.setBounds(148, 7, 203, 19);
		painel_primeiroNum.add(txtprimeiro);
		txtprimeiro.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 0 1 3 1,grow");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo Número Inteiro:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1.setBounds(0, 10, 162, 13);
		panel_1.add(lblNewLabel_1);
		
		txtsegundo = new JTextField();
		txtsegundo.setFont(new Font("Arial", Font.BOLD, 11));
		txtsegundo.setBounds(150, 7, 201, 19);
		panel_1.add(txtsegundo);
		txtsegundo.setColumns(10);
		
		JRadioButton rdbtnadicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnadicao);
		rdbtnadicao.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(rdbtnadicao, "cell 0 2,alignx left,aligny top");
		
		JRadioButton rdbtnsubtracao = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnsubtracao);
		rdbtnsubtracao.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(rdbtnsubtracao, "cell 0 3,alignx left,aligny top");
		
		JRadioButton rdbtnmultiplicacao = new JRadioButton("x Multiplicação");
		buttonGroup.add(rdbtnmultiplicacao);
		rdbtnmultiplicacao.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(rdbtnmultiplicacao, "cell 0 4,alignx left,aligny top");
		
		JRadioButton rdbtndivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtndivisao);
		rdbtndivisao.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(rdbtndivisao, "cell 0 5,alignx left,aligny top");
		
		JLabel lblresultado = new JLabel("");
		lblresultado.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(lblresultado, "cell 2 6,grow");

		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1 = Double.valueOf(txtprimeiro.getText());
				Double num2 = Double.valueOf(txtsegundo.getText());
		        Double resultado;

		        if (rdbtnadicao.isSelected()) {
		            resultado = num1 + num2;
		            lblresultado.setText("Resultado: " + resultado);
		        } else if (rdbtnsubtracao.isSelected()) {
		            resultado = num1 - num2;
		            lblresultado.setText("Resultado: " + resultado);
		        } else if (rdbtnmultiplicacao.isSelected()) {
		            resultado = num1 * num2;
		            lblresultado.setText("Resultado: " + resultado);
		        } else if (rdbtndivisao.isSelected()) {
		            resultado = num1 / num2;
		            lblresultado.setText("Resultado: " + resultado);
		        } else {
		            lblresultado.setText("Por favor, selecione uma operação.");
		        }

			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		panel.add(btnNewButton, "cell 0 6,alignx right,growy");
		
		
	
    }
};
