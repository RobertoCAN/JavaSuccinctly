package sussinclyPart2.p39;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraSwing extends JFrame implements ActionListener {

	private final JTextField visor; // field text for show the numbers and results
	private double primeiroNumero = 0;
	private String operador = "";
	private boolean limparVisor = false;

	public CalculadoraSwing() {
		// configuration base the window.
		setTitle("Calculadora Swing");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// camp of text(visor)
		visor = new JTextField();
		visor.setFont(new Font("Arila", Font.BOLD, 24));
		visor.setHorizontalAlignment(SwingConstants.RIGHT);
		visor.setEditable(false);
		add(visor, BorderLayout.NORTH);

		// panel of the buttons
		JPanel painelDeBotoes = new JPanel();
		painelDeBotoes.setLayout(new GridLayout(5, 4, 5, 5));

		// list of buttons
		String[] botoes = { "7", "8", "9", "/", "4", "5", "6", "*", "3", "2", "1", "-", "0", ".", "=", "+", "C" };
		// Add buttons in panel

		for (String texto : botoes) {
			JButton botao = new JButton(texto);
			botao.setFont(new Font("Arial", Font.BOLD, 18));
			botao.addActionListener(this);
			painelDeBotoes.add(botao);
		}
		add(painelDeBotoes, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.matches("[0-9\\.]")) {
			if (limparVisor) {
				visor.setText("");
				limparVisor = true;
			}
			visor.setText(visor.getText() + comando);
		} else if (comando.matches("[\\+\\-\\*/]")) 
			{
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

}
