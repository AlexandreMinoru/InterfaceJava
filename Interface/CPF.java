package Interface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CPF extends JFrame{
	
	JLabel nome, endereco,logradouro,  cpf, rg;
	JButton cancelar, login;
	JTextField inputNome,inputEndereco, inputLogradouro, inputCpf, inputRg; 
	public CPF() {
		setTitle("Primeira Java Swing");
		setSize(400,220);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255,255,255));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		int esquerda = 10;
		int top = 20;
		cpf = criarRotulo("CPF", esquerda, top, 40, 20);
		inputNome = criarInput("", esquerda += 50, top, 100, 20);
		top = 20;
		esquerda = 10;
		rg = criarRotulo("RG", esquerda += 200, top , 40, 20);
		inputRg = criarInput("", esquerda += 20, top, 100, 20);

		esquerda = 10;
		nome = criarRotulo("Nome", esquerda, top += 40, 40, 20);
		inputNome = criarInput("", esquerda += 50, top, 300, 20);
		esquerda= 10;
		
		logradouro = criarRotulo("Logradouro", esquerda, top += 40, 80, 30);
		inputLogradouro = criarInput("", esquerda += 80, top, 100, 20);
		
		endereco = criarRotulo("Endereço", esquerda += 100, top, 80, 30);
		inputEndereco = criarInput("", esquerda += 60, top, 100, 20);
		cancelar = criarBotao("Cancelar", 'C', esquerda -=200, top += 40, 100, 30);
		login = criarBotao("Login", 'L', esquerda += 160, top , 100, 30);
		

		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CPF();
	}
	
	public JTextField criarInput(String txt, int x, int y, int width, int height) {
		JTextField input = new JTextField();
		input.setText(txt);
		input.setHorizontalAlignment(JTextField.CENTER);
		input.setBounds(x,y,width,height);
		getContentPane().add(input);
		return input;
	}
	
	public JButton criarBotao(String text, char key, int x, int y, int width, int height ) {
		JButton button = new JButton();
		button.setText(text);
		button.setBounds(x, y, width, height);
		button.setBackground(new Color(0,0,170));
		button.setForeground(Color.GREEN);
		button.setFont(new Font("Helvetica", Font.BOLD,12));
		button.setToolTipText("Botão 1");
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.setVerticalAlignment(SwingConstants.CENTER);
		button.setEnabled(true);
		button.setMnemonic(key);
		getContentPane().add(button);
		return button;
	}
	
	public JLabel criarRotulo(String texto, int left, int right, int widht, int height) {
		JLabel ji = new JLabel(texto);
		ji.setLocation(left, right);
		ji.setSize(widht, height);
		ji.setOpaque(false);
		ji.setForeground(new Color(123,18,14));
		ji.setFont(new Font("Courier new", Font.BOLD,12));
		ji.setToolTipText("Exemplo");
		ji.setHorizontalAlignment(SwingConstants.LEFT);
		ji.setVerticalAlignment(SwingConstants.TOP);
		add(ji);
		
		return ji;
	}
}
