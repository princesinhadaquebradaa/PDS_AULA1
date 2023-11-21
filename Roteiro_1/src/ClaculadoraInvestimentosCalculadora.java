import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClaculadoraInvestimentosCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel vazio1;
	private JLabel vazio;
	private JLabel lbldeposito;
	private JLabel lblnum;
	private JTextField txtnum;
	private JLabel lbljuros;
	private JTextField txtjuros;
	private JLabel lbltotal;
	private JButton btncalcular;
	private JPanel deposito;
	private JPanel juros;
	private JPanel num;
	private JPanel total;
	private JPanel calcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosCalculadora frame = new ClaculadoraInvestimentosCalculadora();
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
	public ClaculadoraInvestimentosCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		deposito = new JPanel();
		contentPane.add(deposito);
		
		lbldeposito = new JLabel("Depósito mesal R$:");
		deposito.add(lbldeposito);
		lbldeposito.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextField txtdeposito = new JTextField();
		contentPane.add(txtdeposito);
		txtdeposito.setColumns(10);
		
		num = new JPanel();
		contentPane.add(num);
		
		lblnum = new JLabel("Num. de meses:");
		num.add(lblnum);
		lblnum.setFont(new Font("Arial", Font.PLAIN, 13));
		
		txtnum = new JTextField();
		contentPane.add(txtnum);
		txtnum.setColumns(10);
		
		juros = new JPanel();
		contentPane.add(juros);
		
		lbljuros = new JLabel("Juros ao mês %:");
		juros.add(lbljuros);
		lbljuros.setFont(new Font("Arial", Font.PLAIN, 13));
		
		txtjuros = new JTextField();
		contentPane.add(txtjuros);
		txtjuros.setColumns(10);
		
		total = new JPanel();
		contentPane.add(total);
		
		lbltotal = new JLabel("Total de investimentos + juros R$: ");
		total.add(lbltotal);
		lbltotal.setFont(new Font("Arial", Font.PLAIN, 13));
		
		vazio1 = new JLabel("");
		vazio1.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(vazio1);
		
		vazio = new JLabel("");
		contentPane.add(vazio);
		
		calcular = new JPanel();
		FlowLayout flowLayout = (FlowLayout) calcular.getLayout();
		contentPane.add(calcular);
		
		btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		calcular.add(btncalcular);
		btncalcular.setFont(new Font("Arial", Font.PLAIN, 13));
	}

}
