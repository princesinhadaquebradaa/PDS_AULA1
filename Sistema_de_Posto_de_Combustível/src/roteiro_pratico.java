import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Modelo.Calculo;
import Modelo.Combustivel;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;


public class roteiro_pratico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel OleoDisel;
	private JTextField txtOleoDisel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtPreco500ml;
	private JTextField txtPreco1L;
	private JTextField txtQuantidade500ml;
	private JTextField txtQuantidade1L;
	private JTextField txt_quantidade_litro;
	private JTextField txtdia;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JPanel painel_botões = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roteiro_pratico frame = new roteiro_pratico();
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
	public roteiro_pratico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 592);
		OleoDisel = new JPanel();
		OleoDisel.setFont(new Font("Arial", Font.BOLD, 11));
		OleoDisel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(OleoDisel);
		OleoDisel.setLayout(new MigLayout("", "[259px][20px][11px][10px][238px]", "[209px][135px][121px][36px][]"));
		
		JPanel preco_combustivel = new JPanel();
		preco_combustivel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Pre\u00E7o do Combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OleoDisel.add(preco_combustivel, "cell 0 0,grow");
		preco_combustivel.setLayout(null);
		
		JPanel painel_disel = new JPanel();
		painel_disel.setBounds(10, 22, 231, 36);
		preco_combustivel.add(painel_disel);
		painel_disel.setLayout(null);
		
		JLabel oleo_disel = new JLabel("Oleo Disel:");
		oleo_disel.setBounds(10, 10, 69, 13);
		painel_disel.add(oleo_disel);
		oleo_disel.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtOleoDisel = new JTextField();
		txtOleoDisel.setBounds(117, 4, 104, 26);
		painel_disel.add(txtOleoDisel);
		txtOleoDisel.setColumns(10);
		
		JPanel painel_comum = new JPanel();
		painel_comum.setBounds(10, 67, 231, 36);
		preco_combustivel.add(painel_comum);
		painel_comum.setLayout(null);
		
		JLabel gas_comum = new JLabel("Gas Comum:");
		gas_comum.setBounds(10, 10, 70, 13);
		painel_comum.add(gas_comum);
		gas_comum.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtGasComum = new JTextField();
		txtGasComum.setBounds(117, 4, 104, 26);
		painel_comum.add(txtGasComum);
		txtGasComum.setColumns(10);
		
		JPanel painel_aditivada = new JPanel();
		painel_aditivada.setBounds(10, 113, 231, 36);
		preco_combustivel.add(painel_aditivada);
		painel_aditivada.setLayout(null);
		
		JLabel gas_aditivada = new JLabel("Gas Aditivada: ");
		gas_aditivada.setBounds(10, 10, 83, 13);
		painel_aditivada.add(gas_aditivada);
		gas_aditivada.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtGasAditivada = new JTextField();
		txtGasAditivada.setBounds(117, 4, 104, 26);
		painel_aditivada.add(txtGasAditivada);
		txtGasAditivada.setColumns(10);
		
		JPanel painel_etanol = new JPanel();
		painel_etanol.setBounds(10, 159, 231, 36);
		preco_combustivel.add(painel_etanol);
		painel_etanol.setLayout(null);
		
		JLabel etanol = new JLabel("Etanol:");
		etanol.setBounds(10, 10, 38, 13);
		painel_etanol.add(etanol);
		etanol.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtEtanol = new JTextField();
		txtEtanol.setBounds(117, 4, 104, 26);
		painel_etanol.add(txtEtanol);
		txtEtanol.setColumns(10);
		
		JPanel preço_oleo_motor = new JPanel();
		preço_oleo_motor.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o do Oleo do Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		OleoDisel.add(preço_oleo_motor, "cell 2 0 3 1,grow");
		preço_oleo_motor.setLayout(null);
		
		JPanel painel_500ml = new JPanel();
		painel_500ml.setBounds(10, 61, 231, 36);
		preço_oleo_motor.add(painel_500ml);
		painel_500ml.setLayout(null);
		
		JLabel frasco_500ml = new JLabel("Frasco 500ml");
		frasco_500ml.setBounds(10, 10, 81, 13);
		painel_500ml.add(frasco_500ml);
		frasco_500ml.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtPreco500ml = new JTextField();
		txtPreco500ml.setBounds(117, 4, 104, 26);
		painel_500ml.add(txtPreco500ml);
		txtPreco500ml.setColumns(10);
		
		JPanel painel_1L = new JPanel();
		painel_1L.setBounds(10, 123, 231, 36);
		preço_oleo_motor.add(painel_1L);
		painel_1L.setLayout(null);
		
		JLabel frasco_1L = new JLabel("Frasco 1L");
		frasco_1L.setBounds(10, 10, 76, 13);
		painel_1L.add(frasco_1L);
		frasco_1L.setFont(new Font("Arial", Font.BOLD, 11));
		
		txtPreco1L = new JTextField();
		txtPreco1L.setBounds(117, 4, 104, 26);
		painel_1L.add(txtPreco1L);
		txtPreco1L.setColumns(10);
		
		JPanel painel_oleo_motor = new JPanel();
		painel_oleo_motor.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		OleoDisel.add(painel_oleo_motor, "cell 0 1 5 1,grow");
		painel_oleo_motor.setLayout(null);
		
		JPanel painel_500ml_1 = new JPanel();
		painel_500ml_1.setBounds(10, 26, 231, 36);
		painel_oleo_motor.add(painel_500ml_1);
		painel_500ml_1.setLayout(null);
		
		JLabel frasco_500ml_1 = new JLabel("Frasco 500ml");
		frasco_500ml_1.setFont(new Font("Arial", Font.BOLD, 11));
		frasco_500ml_1.setBounds(10, 10, 81, 13);
		painel_500ml_1.add(frasco_500ml_1);
		
		txtQuantidade500ml = new JTextField();
		txtQuantidade500ml.setColumns(10);
		txtQuantidade500ml.setBounds(117, 4, 104, 26);
		painel_500ml_1.add(txtQuantidade500ml);
		
		JPanel painel_1L_1 = new JPanel();
		painel_1L_1.setLayout(null);
		painel_1L_1.setBounds(10, 82, 231, 36);
		painel_oleo_motor.add(painel_1L_1);
		
		JLabel frasco_1L_1 = new JLabel("Frasco 1L");
		frasco_1L_1.setFont(new Font("Arial", Font.BOLD, 11));
		frasco_1L_1.setBounds(10, 10, 76, 13);
		painel_1L_1.add(frasco_1L_1);
		
		txtQuantidade1L = new JTextField();
		txtQuantidade1L.setBounds(117, 4, 104, 26);
		painel_1L_1.add(txtQuantidade1L);
		txtQuantidade1L.setColumns(10);
		
		JPanel painel_valor_pagar = new JPanel();
		painel_valor_pagar.setBounds(251, 28, 132, 90);
		painel_oleo_motor.add(painel_valor_pagar);
		painel_valor_pagar.setLayout(null);
		
		JLabel lbl_valor_pagar_500ml = new JLabel(".......................................");
		lbl_valor_pagar_500ml.setBounds(10, 10, 76, 13);
		painel_valor_pagar.add(lbl_valor_pagar_500ml);
		
		JLabel lbl_valor_pagar_1L = new JLabel("......................................");
		lbl_valor_pagar_1L.setBounds(10, 67, 76, 13);
		painel_valor_pagar.add(lbl_valor_pagar_1L);
		
		JPanel painel_total_oleo = new JPanel();
		painel_total_oleo.setBounds(393, 37, 132, 81);
		painel_oleo_motor.add(painel_total_oleo);
		painel_total_oleo.setLayout(null);
		
		JLabel lbl_total_oleo = new JLabel("Total Oléo");
		lbl_total_oleo.setBounds(40, 10, 82, 13);
		painel_total_oleo.add(lbl_total_oleo);
		lbl_total_oleo.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lbl_vazio_oleo = new JLabel("......................................");
		lbl_vazio_oleo.setBounds(40, 45, 57, 13);
		painel_total_oleo.add(lbl_vazio_oleo);
		
		JLabel lblquantidade = new JLabel("Quantidade");
		lblquantidade.setFont(new Font("Arial", Font.BOLD, 11));
		lblquantidade.setBounds(151, 10, 78, 13);
		painel_oleo_motor.add(lblquantidade);
		
		JLabel lblvalor_pagar = new JLabel("Valor a Pagar");
		lblvalor_pagar.setBounds(254, 10, 74, 13);
		painel_oleo_motor.add(lblvalor_pagar);
		lblvalor_pagar.setFont(new Font("Arial", Font.BOLD, 11));
		
		JPanel Abastecimento = new JPanel();
		Abastecimento.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OleoDisel.add(Abastecimento, "cell 0 2 3 1,grow");
		Abastecimento.setLayout(null);
		
		JLabel lblcombustivel = new JLabel("Combustivel: ");
		lblcombustivel.setFont(new Font("Arial", Font.BOLD, 11));
		lblcombustivel.setBounds(10, 20, 86, 13);
		Abastecimento.add(lblcombustivel);
		
		JComboBox<Combustivel> comboBoxOleo_Disel = new JComboBox<Combustivel>();
		comboBoxOleo_Disel.setBounds(150, 16, 130, 21);
		Abastecimento.add(comboBoxOleo_Disel);
	
		comboBoxOleo_Disel.addItem(Combustivel.DISEL);
		comboBoxOleo_Disel.addItem(Combustivel.GASCOMUM);
		comboBoxOleo_Disel.addItem(Combustivel.GASADITIVADA);
		comboBoxOleo_Disel.addItem(Combustivel.ETANOL);
		
		
		JLabel lblquantidade_litros = new JLabel("Quantidade de Litros:");
		lblquantidade_litros.setFont(new Font("Arial", Font.BOLD, 11));
		lblquantidade_litros.setBounds(10, 53, 130, 13);
		Abastecimento.add(lblquantidade_litros);
		
		JLabel lbl_total_combustivel = new JLabel("Total Combustível:");
		lbl_total_combustivel.setFont(new Font("Arial", Font.BOLD, 11));
		lbl_total_combustivel.setBounds(10, 84, 104, 13);
		Abastecimento.add(lbl_total_combustivel);
		
		txt_quantidade_litro = new JTextField();
		txt_quantidade_litro.setBounds(160, 47, 104, 26);
		Abastecimento.add(txt_quantidade_litro);
		txt_quantidade_litro.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OleoDisel.add(panel, "cell 4 2,grow");
		panel.setLayout(null);
		
		JRadioButton rdbtn_vista = new JRadioButton("Á vista");
		buttonGroup.add(rdbtn_vista);
		rdbtn_vista.setBounds(6, 26, 103, 21);
		panel.add(rdbtn_vista);
		
		JRadioButton rdbtn_prazo = new JRadioButton("Á prazo");
		buttonGroup.add(rdbtn_prazo);
		rdbtn_prazo.setBounds(6, 56, 103, 21);
		panel.add(rdbtn_prazo);
		
		JLabel lbl_dias = new JLabel("Dias:");
		lbl_dias.setFont(new Font("Arial", Font.BOLD, 11));
		lbl_dias.setBounds(123, 30, 45, 13);
		panel.add(lbl_dias);
		
		txtdia = new JTextField();
		txtdia.setBounds(161, 24, 67, 26);
		panel.add(txtdia);
		txtdia.setColumns(10);
		
		JLabel lbl_total = new JLabel("Total a Pagar:");
		lbl_total.setFont(new Font("Arial", Font.BOLD, 11));
		lbl_total.setBounds(22, 83, 87, 13);
		panel.add(lbl_total);
		
		JLabel lbl_vazio_total = new JLabel("......................................");
		lbl_vazio_total.setBounds(161, 83, 67, 13);
		panel.add(lbl_vazio_total);
		OleoDisel.add(painel_botões, "cell 0 3 5 1,grow");
		painel_botões.setLayout(null);
		
		JLabel lbl_resultado_combustivel = new JLabel("......................................");
		lbl_resultado_combustivel.setBounds(170, 84, 76, 13);
		Abastecimento.add(lbl_resultado_combustivel);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String precoDisel = txtOleoDisel.getText();
				Double  precoDisel1 = Double.valueOf(precoDisel);
				
				String precoComum = txtGasComum.getText();
				Double  precoComum1 = Double.valueOf(precoComum);
				
				String precoAditivada = txtGasAditivada.getText();
				Double  precoAditivada1 = Double.valueOf(precoAditivada);
				
				String precoEtanol = txtEtanol.getText();
				Double  precoEtanol1 = Double.valueOf(precoEtanol);
				
				String qtdLitros = txt_quantidade_litro.getText();
				Double qtdLitros1 = Double.valueOf(qtdLitros);
				
				Calculo calc = new Calculo();
	            Combustivel tipo = (Combustivel) comboBoxOleo_Disel.getSelectedItem();
				Double total_pagar_disel = calc.calculo_combustivel(precoDisel1, precoComum1, precoAditivada1, precoEtanol1, qtdLitros1, tipo);
				lbl_resultado_combustivel.setText("R$ " + total_pagar_disel + "");
				
				String preco500ml = txtPreco500ml.getText();
		        Double preco500ml1 = Double.valueOf(preco500ml);

		        String preco1L = txtPreco1L.getText();
		        Double preco1L1 = Double.valueOf(preco1L);

		        String quantidade500ml = txtQuantidade500ml.getText();
		        Double quantidade500ml1 = Double.valueOf(quantidade500ml);

		        String quantidade1L = txtQuantidade1L.getText();
		        Double quantidade1L1 = Double.valueOf(quantidade1L);

		        double total_oleo_motor_500ml = calc.calculo_oleo_motor_500ml(preco500ml1,quantidade500ml1);
		        double total_oleo_motor_1l = calc.calculo_oleo_motor_1l(preco1L1,quantidade1L1);
		        double total_oleo_motor = calc.calculo_total_oleo_motor(total_oleo_motor_500ml, total_oleo_motor_1l);
		        
		        lbl_valor_pagar_500ml.setText("R$ " + total_oleo_motor_500ml + "");
		        lbl_valor_pagar_1L.setText("R$ " + total_oleo_motor_1l + "");
		        lbl_vazio_oleo.setText("R$ " + total_oleo_motor + "");
		        
		        double valor_desconto = calc.calculo_desconto(total_pagar_disel, total_oleo_motor);
		        double valor_prazo = calc.calculo_prazo(total_pagar_disel, total_oleo_motor);
		        double valor_atrasado = calc.calculo_atraso(total_pagar_disel, total_oleo_motor, valor_prazo );
		        
		        String dia = txtdia.getText();
		        int diaI = Integer.valueOf(dia);
		        
		        if(rdbtn_vista.isSelected()) {
		        	 lbl_vazio_total.setText("R$" + valor_desconto );
		        	 //JOptionPane.showMessageDialog(null,"R$" + valor_desconto );
		        }else if(rdbtn_prazo.isSelected()) {
		        	if(diaI > 30){
	        	lbl_vazio_total.setText("R$" + valor_atrasado );
		        } else if(diaI <= 30){
		        lbl_vazio_total.setText("R$" + valor_prazo );
		        }
		       }
			}
			
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(51, 10, 85, 21);
		painel_botões.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Novo Calculo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOleoDisel.setText("");
				txtGasComum.setText("");
				txtGasAditivada.setText("");
				txtEtanol.setText("");
				txt_quantidade_litro.setText("");
				txtPreco500ml.setText("");
				txtPreco1L.setText("");
				txtQuantidade500ml.setText("");
				txtQuantidade1L.setText("");
				txtdia.setText("");
				lbl_valor_pagar_500ml.setText("");
				lbl_valor_pagar_1L.setText("");
				lbl_vazio_oleo.setText("");
				lbl_resultado_combustivel.setText("");
				lbl_vazio_total.setText("");
				
			}
			
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_1.setBounds(146, 10, 108, 21);
		painel_botões.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fechar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_2.setBounds(264, 10, 85, 21);
		painel_botões.add(btnNewButton_2);
	}
}
