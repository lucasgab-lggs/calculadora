package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JFrameCalculadora extends JFrame {

	private double valor1, valor2;
	private Operacao operacao = Operacao.NENHUMA;
	private boolean limpar;
	private boolean auxiliar;
	private JPanel contentPane;
	private JTextField txtNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCalculadora frame = new JFrameCalculadora();
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
	public JFrameCalculadora() {
		setTitle("Calculadora - Vers\u00E3o 0.5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		txtNumber = new JTextField();
		txtNumber.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtNumber.setBounds(7, 11, 262, 60);
		txtNumber.setEditable(false);
		txtNumber.setColumns(10);

		JButton botao_7 = new JButton("7");
		botao_7.setBounds(7, 82, 58, 32);
		botao_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "7");
			}
		});
		botao_7.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_8 = new JButton("8");
		botao_8.setBounds(75, 82, 58, 32);
		botao_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "8");
			}
		});
		botao_8.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_9 = new JButton("9");
		botao_9.setBounds(143, 82, 58, 32);
		botao_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "9");
			}
		});
		botao_9.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_mais = new JButton("+");
		botao_mais.setBounds(211, 82, 58, 32);
		botao_mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.SOMA;
				operar();
			}
		});
		botao_mais.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_4 = new JButton("4");
		botao_4.setBounds(7, 125, 58, 32);
		botao_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "4");
			}
		});
		botao_4.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_5 = new JButton("5");
		botao_5.setBounds(75, 125, 58, 32);
		botao_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "5");
			}
		});
		botao_5.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_6 = new JButton("6");
		botao_6.setBounds(143, 125, 58, 32);
		botao_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "6");
			}
		});
		botao_6.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_menos = new JButton("-");
		botao_menos.setBounds(211, 125, 58, 32);
		botao_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.SUBTRACAO;
				operar();
			}
		});
		botao_menos.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_1 = new JButton("1");
		botao_1.setBounds(7, 168, 58, 32);
		botao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "1");
			}
		});
		botao_1.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_2 = new JButton("2");
		botao_2.setBounds(75, 168, 58, 32);
		botao_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "2");
			}
		});
		botao_2.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_3 = new JButton("3");
		botao_3.setBounds(143, 168, 58, 32);
		botao_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "3");
			}
		});
		botao_3.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_0 = new JButton("0");
		botao_0.setBounds(7, 211, 58, 32);
		botao_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "0");
			}
		});
		botao_0.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_limpar = new JButton("C");
		botao_limpar.setBounds(75, 211, 58, 32);
		botao_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				operacao = Operacao.NENHUMA;
				valor1 = 0;
				valor2 = 0;
			}
		});
		botao_limpar.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_igual = new JButton("=");
		botao_igual.setBounds(143, 211, 58, 32);
		botao_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auxiliar = false;
				valor2 = Double.parseDouble(txtNumber.getText());
				if (validaDivisao()) {
					operar();
				} else {
					txtNumber.setText("Impossível");
					limpar = true;
				}
				operacao = Operacao.NENHUMA;
				valor1 = 0;
				valor2 = 0;
			}
		});
		botao_igual.setFont(new Font("Dialog", Font.PLAIN, 10));

		JButton botao_mult = new JButton("*");
		botao_mult.setBounds(211, 211, 58, 32);
		botao_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auxiliar = true;
				valor1 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.MULTIPLICACAO;
				operar();
			}
		});
		botao_mult.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton botao_divisao = new JButton("/");
		botao_divisao.setBounds(211, 168, 58, 32);
		botao_divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auxiliar = true;
				valor1 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.DIVISAO;
				operar();
			}
		});
		botao_divisao.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.setLayout(null);
		panel.add(txtNumber);
		panel.add(botao_1);
		panel.add(botao_0);
		panel.add(botao_4);
		panel.add(botao_7);
		panel.add(botao_8);
		panel.add(botao_5);
		panel.add(botao_2);
		panel.add(botao_limpar);
		panel.add(botao_6);
		panel.add(botao_9);
		panel.add(botao_3);
		panel.add(botao_igual);
		panel.add(botao_mult);
		panel.add(botao_menos);
		panel.add(botao_mais);
		panel.add(botao_divisao);
	}

	public void operar() {
		switch (operacao) {
		case NENHUMA:
			valor1 = valor2;
			break;
		case SOMA:
			valor1 = valor1 + valor2;
			break;
		case SUBTRACAO:
			valor1 = valor1 - valor2;
			break;
		case DIVISAO:
			if (validaDivisao() && auxiliar == false) {
				valor1 = valor1 / valor2;
			} else {
				txtNumber.setText("Impossível");
			}
			break;
		case MULTIPLICACAO:
			if (auxiliar == false) {
				valor1 = valor1 * valor2;
			}
			break;
		}
		txtNumber.setText(String.valueOf(valor1));
		limpar = true;
	}

	public void limpar() {
		if (limpar) {
			txtNumber.setText(String.valueOf(""));
		}
		limpar = false;
	}

	public boolean validaDivisao() {
		if (operacao == Operacao.DIVISAO && valor2 == 0) {
			return false;
		}
		return true;
	}

}
