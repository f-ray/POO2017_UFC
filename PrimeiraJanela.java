package userGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrimeiraJanela extends JFrame {
	
	Container centro = new JDesktopPane();
	Container principal = getContentPane();
	
	
	
	PrimeiraJanela() {
		super("CADJUR - Cadastro Jurídico");
		principal.setBackground(Color.BLACK);
	
		
		ImageIcon icon = 
				new ImageIcon(getClass().getResource("images/BANNER_TOP_CADJUR.jpg"));
		JLabel marca = new JLabel(icon);
		marca.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
		principal.add(BorderLayout.NORTH, marca);
		
		centro.setBounds(0, 0, 1100, 600);
		centro.setLayout(null);
		centro.setBackground(Color.CYAN);
		principal.add(BorderLayout.CENTER, centro);
		
		
		Container botoes = new JPanel();
		botoes.setSize(1100, 200);
		botoes.setLayout(new GridLayout(2, 2));
		
		JButton cadastrarClientes = new JButton("CADASTRAR CLIENTES");
		cadastrarClientes.addActionListener(new BotaoCadastrarClientesListener());
		
		JButton exibirDadosClientes = new JButton("EXIBIR DADOS CLIENTES");
		exibirDadosClientes.addActionListener(new BotaoExibirDadosClientesListener());
		
		JButton cadastrarProcessos = new JButton("CADASTRAR PROCESSOS");
		cadastrarProcessos.addActionListener(new BotaoCadastrarProcessosListener());
		
		JButton exibirDadosProcessos = new JButton("EXIBIR DADOS PROCESSOS");
		exibirDadosProcessos.addActionListener(new BotaoExibirDadosProcessosListener());
		
		botoes.add(cadastrarClientes);
		botoes.add(exibirDadosClientes);
		botoes.add(cadastrarProcessos);
		botoes.add(exibirDadosProcessos);
		principal.add(BorderLayout.SOUTH, botoes);
		
		
		
		construirJanela();
		
	}
	
	
	
	
	private class BotaoCadastrarClientesListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			CadastroClientes telaCadastroClientes = new CadastroClientes();
			centro.add(telaCadastroClientes).setBounds(0, 0, 1100, 600);
			telaCadastroClientes.setVisible(true);
			telaCadastroClientes.setClosable(true);
			telaCadastroClientes.setResizable(false);
				
			telaCadastroClientes.setTitle("                                                                                     "
					+ "                                                           Cadastro de Clientes                 "
					+ "                                                                                           "
					+ "                                                      ");
			telaCadastroClientes.setDefaultCloseOperation(HIDE_ON_CLOSE);

		}
	}
	
	private class BotaoCadastrarProcessosListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			CadastroProcessos telaCadastroProcesso = new CadastroProcessos();
			centro.add(telaCadastroProcesso).setBounds(0, 0, 1100, 600);
			telaCadastroProcesso.setVisible(true);
			telaCadastroProcesso.setClosable(true);
			telaCadastroProcesso.setResizable(false);
				
			telaCadastroProcesso.setTitle("                                                                                     "
					+ "                                                           Cadastro de Processos           "
					+ "                                                                                           "
					+ "                                                      ");
			telaCadastroProcesso.setDefaultCloseOperation(HIDE_ON_CLOSE);
		}
	}
	
	private class BotaoExibirDadosClientesListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		/*	cc.setVisible(false);
			centro.setBounds(0, 101, 1100, 600);
			centro.setBackground(Color.GREEN);*/
		}
	}
	
	private class BotaoExibirDadosProcessosListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			/*cc.setVisible(false);
			centro.setBounds(0, 101, 1100, 600);
			centro.setBackground(Color.MAGENTA);*/
		}
	}
	
	
	
	private void construirJanela() {
		setSize(1100,800);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	



	public static void main(String[] args) {
		
		new PrimeiraJanela();

	}

}
