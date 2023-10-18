package Pasta_Atividade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Model.Calculo_5;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtpeso;
	private JTextField txtvalor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_5 frame = new Exercicio_5();
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
	public Exercicio_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblpeso = new JLabel("Peso do Prato");
		lblpeso.setFont(new Font("Arial", Font.BOLD, 13));
		lblpeso.setBounds(72, 43, 105, 13);
		contentPane.add(lblpeso);
		
		txtpeso = new JTextField();
		txtpeso.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpeso.setBounds(187, 35, 183, 29);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		JLabel lblvalor_quilo = new JLabel("Valor do Quilo");
		lblvalor_quilo.setFont(new Font("Arial", Font.BOLD, 13));
		lblvalor_quilo.setBounds(72, 100, 99, 13);
		contentPane.add(lblvalor_quilo);
		
		txtvalor = new JTextField();
		txtvalor.setFont(new Font("Arial", Font.PLAIN, 13));
		txtvalor.setBounds(187, 92, 183, 29);
		contentPane.add(txtvalor);
		txtvalor.setColumns(10);
		
		JButton btncalcular = new JButton("CALCULAR");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String peso = txtpeso.getText();
				Double  pesoD = Double.valueOf(peso);	
				String valor = txtvalor.getText(); 
				Double valorD = Double.valueOf(valor);
				
				Calculo_5 calculo = new Calculo_5();
				Double valor_total = calculo.valor_total(pesoD, valorD);
				JOptionPane.showMessageDialog(null, " Valor total a pagar: R$" + valor_total);
			
			}
		});
		btncalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btncalcular.setBounds(167, 149, 105, 29);
		contentPane.add(btncalcular);
		
		JButton btnlimpar = new JButton("LIMPAR");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtpeso.setText("");
				txtvalor.setText("");
			}
		});
		btnlimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnlimpar.setBounds(167, 188, 105, 29);
		contentPane.add(btnlimpar);
		
		JButton btnfehar = new JButton("FECHAR");
		btnfehar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnfehar.setFont(new Font("Arial", Font.BOLD, 12));
		btnfehar.setBounds(321, 224, 105, 29);
		contentPane.add(btnfehar);
	}
}
