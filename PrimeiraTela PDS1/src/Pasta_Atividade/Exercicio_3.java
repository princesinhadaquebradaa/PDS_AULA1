package Pasta_Atividade;


import java.awt.EventQueue;

import javax.swing.JFrame;


import Model.Retangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercicio_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtbase;
	private final JLabel lblaltura = new JLabel("Altura");
	private JTextField txtaltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_3 frame = new Exercicio_3();
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
	public Exercicio_3() {
		getContentPane().setBackground(new Color(128, 255, 128));
		getContentPane().setLayout(null);
		
		JLabel lblbase = new JLabel("Base");
		lblbase.setFont(new Font("Arial", Font.PLAIN, 17));
		lblbase.setBounds(34, 68, 45, 13);
		getContentPane().add(lblbase);
		
		txtbase = new JTextField();
		txtbase.setBounds(89, 64, 258, 26);
		getContentPane().add(txtbase);
		txtbase.setColumns(10);
		lblaltura.setFont(new Font("Arial", Font.PLAIN, 17));
		lblaltura.setBounds(34, 117, 58, 36);
		getContentPane().add(lblaltura);
		
		txtaltura = new JTextField();
		txtaltura.setBounds(89, 124, 258, 27);
		getContentPane().add(txtaltura);
		txtaltura.setColumns(10);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.setBackground(Color.GREEN);
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String base = txtbase.getText();
				float baseF = Float.valueOf(base);
				String altura = txtaltura.getText();
				float alturaF = Float.valueOf(altura);
				
				Retangulo calc = new Retangulo();
				
				
				float area = calc.calcularArea(baseF,alturaF);
				float peri = calc.calcularP(baseF,alturaF);
				
				JOptionPane.showMessageDialog(null, "O calculo do Perímetro e da Area eh: "+peri +" " +area);
				
				
			    }
		
		});
		btncalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btncalcular.setBounds(144, 175, 132, 26);
		getContentPane().add(btncalcular);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.setBackground(Color.GREEN);
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtbase.setText("");
				txtaltura.setText("");
			}
		});
		btnlimpar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnlimpar.setBounds(144, 211, 132, 26);
		getContentPane().add(btnlimpar);
		
		JButton btnfechar = new JButton("Fechar");
		btnfechar.setBackground(Color.GREEN);
		btnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		btnfechar.setBounds(299, 254, 106, 21);
		getContentPane().add(btnfechar);
	}
}
