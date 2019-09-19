package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameCalculadora extends JFrame {
	
	private double valor1, valor2;
	private Operacao operacao = Operacao.NENHUMA;
	private boolean limpar;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		txtNumber = new JTextField();
		txtNumber.setEditable(false);
		txtNumber.setColumns(10);
		
		JButton botao_7 = new JButton("7");
		botao_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "7");
			}
		});
		botao_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_8 = new JButton("8");
		botao_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "8");
			}
		});
		botao_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_9 = new JButton("9");
		botao_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "9");
			}
		});
		botao_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_mais = new JButton("+");
		botao_mais.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor2 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.SOMA;
				operar();
			}
		});
		botao_mais.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_4 = new JButton("4");
		botao_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "4");
			}
		});
		botao_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_5 = new JButton("5");
		botao_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "5");
			}
		});
		botao_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_6 = new JButton("6");
		botao_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "6");
			}
		});
		botao_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_menos = new JButton("-");
		botao_menos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor2 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.SUBTRACAO;
				operar();
			}
		});
		botao_menos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_1 = new JButton("1");
		botao_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "1");
			}
		});
		botao_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_2 = new JButton("2");
		botao_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "2");
			}
		});
		botao_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_3 = new JButton("3");
		botao_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "3");
			}
		});
		botao_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_0 = new JButton("0");
		botao_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
				txtNumber.setText(txtNumber.getText() + "0");
			}
		});
		botao_0.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_limpar = new JButton("C");
		botao_limpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNumber.setText(" ");
			}
		});
		botao_limpar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton botao_igual = new JButton("=");
		botao_igual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor2 = Double.parseDouble(txtNumber.getText());
				operar();
				operacao = Operacao.NENHUMA;
			}
		});
		botao_igual.setFont(new Font("Tahoma", Font.PLAIN, 10));
		botao_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton botao_mult = new JButton("*");
		botao_mult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor2 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.MULTIPLICACAO;
				operar();
			}
		});
		botao_mult.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor2 = Double.parseDouble(txtNumber.getText());
				operacao = Operacao.DIVISAO;
				operar();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(121)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtNumber)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(botao_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_0, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(botao_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_igual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(botao_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_limpar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(botao_menos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_mult, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botao_mais))))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(botao_7)
						.addComponent(botao_8)
						.addComponent(botao_9)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(botao_4)
						.addComponent(botao_5)
						.addComponent(botao_6)
						.addComponent(botao_mult))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(botao_1)
						.addComponent(botao_2)
						.addComponent(botao_3)
						.addComponent(botao_menos, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(botao_0)
						.addComponent(botao_igual, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(botao_limpar)
						.addComponent(botao_mais))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

	public void operar() {
		switch (operacao) {
			case NENHUMA:
				valor1 = valor2;
				break;
			case SOMA:
				valor1 = valor1+valor2;
				break;
			case SUBTRACAO:
				valor1 = valor1-valor2;
				break;
			case DIVISAO:
				valor1 = valor1/valor2;
				break;
			case MULTIPLICACAO:
				valor1 = valor1*valor2;
		}
		txtNumber.setText(String.valueOf(valor1));
		limpar = true;
	}
	
	public void limpar() {
		if (limpar) {
			txtNumber.setText("");
		}
		limpar = false;
	}

	
}
