package Pasta_Atividade;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.ConverterTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Exercicio_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texttemperatura;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_1 frame = new Exercicio_1();
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
	public Exercicio_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 213, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbllegendatemperatura = new JLabel("Temperatura (F)");
		lbllegendatemperatura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbllegendatemperatura.setBounds(67, 90, 130, 14);
		contentPane.add(lbllegendatemperatura);
		
		texttemperatura = new JTextField();
		texttemperatura.setForeground(Color.BLACK);
		texttemperatura.setBounds(164, 86, 203, 23);
		contentPane.add(texttemperatura);
		texttemperatura.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(173, 191, 89, 23);
		contentPane.add(btnFechar);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String TempDigitada = texttemperatura.getText();
				float TempConvertidaF = Float.valueOf(TempDigitada);
				ConverterTemperatura conv = new ConverterTemperatura();
				float tempoC = conv.converterFtoC(TempConvertidaF);
				JOptionPane.showMessageDialog(null, "Temperatura Convertida: "+tempoC);
				
				
				
				
				//Pegar a temperatura digitada no componente de texto
				// Converter a temperatura (STRING) para float
				//Chamar o metodo de classe Conversão
				//Mostrar Temperatura em Celcius
			}
		});
		btnCalcular.setBounds(173, 157, 89, 23);
		contentPane.add(btnCalcular);
	}

}
