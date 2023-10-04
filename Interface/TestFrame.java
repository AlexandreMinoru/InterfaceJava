package Interface;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TestFrame extends JFrame{
	
	JLabel rotulo;
	JButton botao;
	JTextField entrada;
	public TestFrame() {
		setTitle("Primeira Java Swing");
		setSize(375,100);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255,255,255));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		rotulo = criarRotulo("Teste", 20, 20, 80, 30);	
		botao = criarBotao("Botão",'B', 30, 50, 150, 30);
		entrada = criarInput();
		setVisible(true);
	}
	
	public JTextField criarInput() {
		JTextField input = new JTextField();
		input.setText("Teste");
		input.setHorizontalAlignment(JTextField.CENTER);
		input.setBounds(100, 20, 80, 30);
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
	
	public void centralizar() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		Dimension janela = getSize();
		if(janela.height > screen.height)	
			setSize(janela.width, screen.height);
		if(janela.width > screen.width)
			setSize(screen.width, janela.height);
		
		setLocation((screen.width - janela.width)/2, (screen.height - janela.height)/2);
	}
	
	
	public static void main(String[] args) {
		new TestFrame();
	}
}
