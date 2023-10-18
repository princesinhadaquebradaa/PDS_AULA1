package Pasta_Atividade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercicio_2 extends JFrame {
	
	// Escreva um programa leia o nome e, em seguida, o
	//sobrenome de uma pessoa em dois componentes
	//JtextField. . Após, o sistema deverá mostrar o nome
	//completo da pessoa em um componente JLabel.

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdigitado;
	private JTextField txtsobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_2 frame = new Exercicio_2();
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
	public Exercicio_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdigitado = new JTextField();
		txtdigitado.setBounds(85, 70, 324, 28);
		contentPane.add(txtdigitado);
		txtdigitado.setColumns(10);
		
		JLabel lblnome = new JLabel("Nome");
		lblnome.setBounds(45, 77, 46, 14);
		contentPane.add(lblnome);
		
		JLabel lblsobrenome = new JLabel("Sobrenome");
		lblsobrenome.setBounds(45, 120, 67, 14);
		contentPane.add(lblsobrenome);
		
		txtsobrenome = new JTextField();
		txtsobrenome.setBounds(111, 113, 298, 28);
		contentPane.add(txtsobrenome);
		txtsobrenome.setColumns(10);
		
		JButton bntlimpar = new JButton("LIMPAR");
		bntlimpar.setBackground(Color.ORANGE);
		bntlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtdigitado.setText("");
			txtsobrenome.setText("");
			
			
			}
		});
		bntlimpar.setBounds(195, 152, 89, 23);
		contentPane.add(bntlimpar);
		
		JButton btnvalidar = new JButton("VALIDAR");
		btnvalidar.setBackground(Color.ORANGE);
		btnvalidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtdigitado.getText();
				//JOptionPane.showMessageDialog(null, "O nome digitado é: "+nome);
				String sobrenome = txtsobrenome.getText();
				//JOptionPane.showMessageDialog(null, "O sobrenome digitado é: "+sobrenome);
				JOptionPane.showMessageDialog(null, "O nome digitado é: "+nome +" " +sobrenome);
		
				
				
			}
		});
		btnvalidar.setBounds(195, 186, 89, 23);
		contentPane.add(btnvalidar);
		
		JButton btnfechar = new JButton("FECHAR");
		btnfechar.setBackground(Color.ORANGE);
		btnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnfechar.setBounds(335, 227, 89, 23);
		contentPane.add(btnfechar);
	}

}
