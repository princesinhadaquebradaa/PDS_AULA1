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
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClaculadoraInvestimentosGrid2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblOi;
	private JLabel label_6;
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
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosGrid2 frame = new ClaculadoraInvestimentosGrid2();
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
	public ClaculadoraInvestimentosGrid2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 231);
		
		menuBar = new JMenuBar();
		menuBar.setToolTipText("AJUDA");
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Sobre");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FormSobre janela = new FormSobre();
				 janela.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		deposito = new JPanel();
		contentPane.add(deposito);
		
		lbldeposito = new JLabel("Depósito mesal R$:");
		deposito.add(lbldeposito);
		lbldeposito.setFont(new Font("Arial", Font.PLAIN, 13));
		
		panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel);
		
		JTextField txtdeposito = new JTextField();
		txtdeposito.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(txtdeposito);
		txtdeposito.setColumns(20);
		
		num = new JPanel();
		contentPane.add(num);
		
		lblnum = new JLabel("Num. de meses:");
		num.add(lblnum);
		lblnum.setFont(new Font("Arial", Font.PLAIN, 13));
		
		panel_1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1);
		
		txtnum = new JTextField();
		panel_1.add(txtnum);
		txtnum.setColumns(20);
		
		juros = new JPanel();
		contentPane.add(juros);
		
		lbljuros = new JLabel("Juros ao mês %:");
		juros.add(lbljuros);
		lbljuros.setFont(new Font("Arial", Font.PLAIN, 13));
		
		panel_2 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_2);
		
		txtjuros = new JTextField();
		txtjuros.setColumns(20);
		panel_2.add(txtjuros);
		
		total = new JPanel();
		contentPane.add(total);
		
		lbltotal = new JLabel("Total de investimentos + juros R$: ");
		total.add(lbltotal);
		lbltotal.setFont(new Font("Arial", Font.PLAIN, 13));
		
		lblOi = new JLabel("");
		lblOi.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lblOi);
		
		label_6 = new JLabel("");
		contentPane.add(label_6);
		
		
		
		calcular = new JPanel();
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
