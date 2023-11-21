import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;

public class ClaculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label_1;
	private JLabel lblNumDeMeses;
	private JLabel lbldeposito;
	private JLabel lblnum;
	private JTextField txtnum;
	private JLabel lbljuros;
	private JTextField txtjuros;
	private JLabel lbltotal;
	private JButton btncalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosGrid frame = new ClaculadoraInvestimentosGrid();
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
	public ClaculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		lbldeposito = new JLabel("Depósito mesal R$:");
		lbldeposito.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lbldeposito);
		
		JTextField txtdeposito = new JTextField();
		contentPane.add(txtdeposito);
		txtdeposito.setColumns(10);
		
		lblnum = new JLabel("Num. de meses:");
		lblnum.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lblnum);
		
		txtnum = new JTextField();
		contentPane.add(txtnum);
		txtnum.setColumns(10);
		
		lbljuros = new JLabel("Juros ao mês %:");
		lbljuros.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lbljuros);
		
		txtjuros = new JTextField();
		contentPane.add(txtjuros);
		txtjuros.setColumns(10);
		
		lbltotal = new JLabel("Total de investimentos + juros R$: ");
		lbltotal.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lbltotal);
		
		label_1 = new JLabel("");
		contentPane.add(label_1);
		
		lblNumDeMeses = new JLabel("");
		lblNumDeMeses.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lblNumDeMeses);
		
		btncalcular = new JButton("Calcular");
		btncalcular.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(btncalcular);
	}

}
