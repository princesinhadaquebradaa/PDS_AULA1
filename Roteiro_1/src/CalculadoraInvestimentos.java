import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdeposito;
	private JTextField txtnum;
	private JTextField txtjuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setTitle("CalculadoraInvestimentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepósitoMesal = new JLabel("Depósito Mesal R$:");
		lblDepósitoMesal.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDepósitoMesal.setBounds(63, 10, 134, 13);
		contentPane.add(lblDepósitoMesal);
		
		txtdeposito = new JTextField();
		txtdeposito.setBounds(10, 30, 216, 19);
		contentPane.add(txtdeposito);
		txtdeposito.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		lblNumMeses.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNumMeses.setBounds(73, 59, 97, 13);
		contentPane.add(lblNumMeses);
		
		txtnum = new JTextField();
		txtnum.setBounds(10, 82, 216, 19);
		contentPane.add(txtnum);
		txtnum.setColumns(10);
		
		JLabel lblJurosmês = new JLabel("Juros ao mês %: ");
		lblJurosmês.setFont(new Font("Arial", Font.PLAIN, 13));
		lblJurosmês.setBounds(68, 111, 102, 13);
		contentPane.add(lblJurosmês);
		
		txtjuros = new JTextField();
		txtjuros.setBounds(10, 131, 219, 19);
		contentPane.add(txtjuros);
		txtjuros.setColumns(10);
		
		JLabel lbltotal = new JLabel("Total investimento + juros R$:");
		lbltotal.setFont(new Font("Arial", Font.PLAIN, 13));
		lbltotal.setBounds(35, 160, 180, 13);
		contentPane.add(lbltotal);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncalcular.setFont(new Font("Arial", Font.PLAIN, 13));
		btncalcular.setBounds(74, 183, 85, 21);
		contentPane.add(btncalcular);
	}
}
