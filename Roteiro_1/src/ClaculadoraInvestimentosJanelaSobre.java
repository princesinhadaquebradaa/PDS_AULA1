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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

public class ClaculadoraInvestimentosJanelaSobre extends JFrame {

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
	private JMenuBar Ajuda;
	private JMenu mnNajuda;
	private JMenuItem mnsobre;
	private JLabel lblrecado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosJanelaSobre frame = new ClaculadoraInvestimentosJanelaSobre();
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
	public ClaculadoraInvestimentosJanelaSobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 231);
		
		Ajuda = new JMenuBar();
		Ajuda.setToolTipText("Ajuda");
		setJMenuBar(Ajuda);
		
		mnNajuda = new JMenu("Ajuda");
		Ajuda.add(mnNajuda);
		
		mnsobre = new JMenuItem("Sobre");
		mnsobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FormSobre janela = new FormSobre();
				 janela.setVisible(true);
				
			}
		});
		mnNajuda.add(mnsobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		deposito = new JPanel();
		deposito.setBounds(5, 5, 198, 27);
		contentPane.add(deposito);
		
		lbldeposito = new JLabel("Depósito mesal R$:");
		deposito.add(lbldeposito);
		lbldeposito.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextField txtdeposito = new JTextField();
		txtdeposito.setBounds(203, 5, 198, 27);
		contentPane.add(txtdeposito);
		txtdeposito.setColumns(10);
		
		num = new JPanel();
		num.setBounds(5, 32, 198, 27);
		contentPane.add(num);
		
		lblnum = new JLabel("Num. de meses:");
		num.add(lblnum);
		lblnum.setFont(new Font("Arial", Font.PLAIN, 13));
		
		txtnum = new JTextField();
		txtnum.setBounds(203, 32, 198, 27);
		contentPane.add(txtnum);
		txtnum.setColumns(10);
		
		juros = new JPanel();
		juros.setBounds(5, 59, 198, 27);
		contentPane.add(juros);
		
		lbljuros = new JLabel("Juros ao mês %:");
		juros.add(lbljuros);
		lbljuros.setFont(new Font("Arial", Font.PLAIN, 13));
		
		txtjuros = new JTextField();
		txtjuros.setBounds(203, 59, 198, 27);
		contentPane.add(txtjuros);
		txtjuros.setColumns(10);
		
		total = new JPanel();
		total.setBounds(5, 86, 198, 27);
		contentPane.add(total);
		
		lbltotal = new JLabel("Total de investimentos + juros R$: ");
		total.add(lbltotal);
		lbltotal.setFont(new Font("Arial", Font.PLAIN, 13));
		
		vazio1 = new JLabel("");
		vazio1.setBounds(5, 113, 198, 27);
		vazio1.setHorizontalAlignment(SwingConstants.CENTER);
		vazio1.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(vazio1);
		
		vazio = new JLabel("");
		vazio.setBounds(213, 5, 198, 27);
		contentPane.add(vazio);
		
		calcular = new JPanel();
		calcular.setBounds(203, 135, 198, 27);
		FlowLayout flowLayout = (FlowLayout) calcular.getLayout();
		contentPane.add(calcular);
		
		btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String deposito = txtdeposito.getText();
		        String num = txtnum.getText();
		        String juros = txtjuros.getText();
		        
		        double deposito1 = Double.valueOf(deposito);
		        int num1 = Integer.valueOf(num);
		        double juros1 = Double.valueOf(juros);
		        
		        Investimento calc = new Investimento(num1, juros1, deposito1);
		        
		        double Total = calc.calcuolaTotal();
		        String sTotal = String.format("%.2f", Total);
		        JOptionPane.showMessageDialog(null, "O Total Investido com juros é: " + sTotal);
		        
		       
				
			
				
				
				
			
				
				
			}
		});
		calcular.add(btncalcular);
		btncalcular.setFont(new Font("Arial", Font.PLAIN, 13));
	}
}
