import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSobre frame = new FormSobre();
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
	public FormSobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcalculo = new JLabel("CalcInvest - Calculadora de Investimentos");
		lblcalculo.setBounds(15, 17, 283, 24);
		contentPane.add(lblcalculo);
		
		JLabel lblversao = new JLabel("Versão 1.0");
		lblversao.setBounds(15, 45, 283, 25);
		contentPane.add(lblversao);
		
		JLabel lblNewLabel_2 = new JLabel("Autor: Vitória de Jesus Onofre");
		lblNewLabel_2.setBounds(15, 74, 283, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contato: vitoria.j13@aluno.ifsc.edu.br");
		lblNewLabel_3.setBounds(15, 102, 283, 25);
		contentPane.add(lblNewLabel_3);
		
		JButton btnok = new JButton("OK");
		btnok.setBounds(119, 137, 93, 24);
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(btnok);
	}
}
