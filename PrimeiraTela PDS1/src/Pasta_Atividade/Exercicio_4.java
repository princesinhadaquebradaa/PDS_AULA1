package Pasta_Atividade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtpreco;
	private JLabel lblvalor;
	private JTextField txtvalor;
	private JButton btncalcular;
	private JButton btnlimpar;
	private JButton btnfechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_4 frame = new Exercicio_4();
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
	public Exercicio_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpreco = new JLabel("Preço do Litro da Gasolina");
		lblpreco.setFont(new Font("Arial", Font.BOLD, 12));
		lblpreco.setBounds(35, 57, 169, 13);
		contentPane.add(lblpreco);
		
		txtpreco = new JTextField();
		txtpreco.setBounds(214, 50, 190, 27);
		contentPane.add(txtpreco);
		txtpreco.setColumns(10);
		
		lblvalor = new JLabel("Valor do Pagamento");
		lblvalor.setFont(new Font("Arial", Font.BOLD, 12));
		lblvalor.setBounds(56, 113, 129, 13);
		contentPane.add(lblvalor);
		
		txtvalor = new JTextField();
		txtvalor.setBounds(214, 106, 190, 27);
		contentPane.add(txtvalor);
		txtvalor.setColumns(10);
		
		btncalcular = new JButton("CALCULAR");
		btncalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btncalcular.setBounds(158, 163, 114, 27);
		contentPane.add(btncalcular);
		
		btnlimpar = new JButton("LIMPAR");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpreco.setText("");
				txtvalor.setText("");
			}
		});
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnlimpar.setBounds(158, 205, 114, 27);
		contentPane.add(btnlimpar);
		
		btnfechar = new JButton("FECHAR");
		btnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnfechar.setFont(new Font("Arial", Font.BOLD, 12));
		btnfechar.setBounds(341, 226, 85, 27);
		contentPane.add(btnfechar);
	}

}
