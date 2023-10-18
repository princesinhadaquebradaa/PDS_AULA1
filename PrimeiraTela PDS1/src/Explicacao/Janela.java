package Explicacao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblBemVindo = new JLabel("Bem Vindo!!");
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setTitle("Janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 199, 223));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblBemVindo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Curioso, tem nada aqui!!");
			}
		});
		lblBemVindo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				JOptionPane.showMessageDialog(null, "Curioso, tem nada aqui");
			}
		});
		lblBemVindo.setForeground(new Color(0, 0, 0));
		lblBemVindo.setFont(new Font("David CLM", Font.BOLD, 23));
		lblBemVindo.setBounds(155, 36, 169, 14);
		contentPane.add(lblBemVindo);
		
		JButton btnAperte = new JButton("Fechar");
		btnAperte.setBackground(Color.CYAN);
		btnAperte.setForeground(new Color(0, 0, 0));
		btnAperte.setFont(new Font("Arial", Font.BOLD, 14));
		btnAperte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnAperte.setBounds(286, 156, 99, 29);
		contentPane.add(btnAperte);
		
		txtNome = new JTextField();
		txtNome.setBounds(92, 94, 275, 29);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.BOLD, 11));
		lblNome.setBounds(45, 101, 41, 14);
		contentPane.add(lblNome);
		
		JButton btnNewButton = new JButton("Validar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				JOptionPane.showMessageDialog(null, "O nome digitado é: "+nome);
				
				//pegar o texto digitado no JtextField (txtNome) e mostrar o nome
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(148, 156, 128, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
			}
		});
		btnNewButton_1.setBounds(39, 157, 99, 29);
		contentPane.add(btnNewButton_1);
	}
}
