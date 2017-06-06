package userGUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import enums.UF;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CadastroClientes extends JInternalFrame {
	private JTextField cadastroNomeCliente;
	private JTextField cadastroNacionalidadeCliente;
	private JTextField cadastroProfissaoCliente;
	private JTextField cadastroRGClienteOrgaoEmissor;
	private JTextField cadastroRGCliente;
	private JTextField cadastroCpfCliente;
	private JTextField enderecoRuaCliente;
	private JTextField enderecoNumeroCasaCliente;
	private JTextField enderecoComplementoCliente;
	private JTextField enderecoBairroCliente;
	private JTextField enderecoCidadeCliente;
	private JTextField enderecoCepCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClientes frame = new CadastroClientes();
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
	public CadastroClientes() {
		setBounds(100, 100, 1100, 600);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1084, 570);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelNomeCliente = new JLabel("NOME");
		labelNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNomeCliente.setHorizontalAlignment(SwingConstants.CENTER);
		labelNomeCliente.setBounds(32, 79, 55, 14);
		panel.add(labelNomeCliente);
		
		JLabel labelNacionalidadeCliente = new JLabel("NACIONALIDADE");
		labelNacionalidadeCliente.setHorizontalAlignment(SwingConstants.CENTER);
		labelNacionalidadeCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNacionalidadeCliente.setBounds(30, 114, 144, 14);
		panel.add(labelNacionalidadeCliente);
		
		JLabel labelEstadoCivilCliente = new JLabel("ESTADO CIVIL");
		labelEstadoCivilCliente.setHorizontalAlignment(SwingConstants.CENTER);
		labelEstadoCivilCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelEstadoCivilCliente.setBounds(331, 113, 118, 14);
		panel.add(labelEstadoCivilCliente);
		
		JLabel labelProfissaoCliente = new JLabel("PROFISSÃO");
		labelProfissaoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		labelProfissaoCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelProfissaoCliente.setBounds(32, 153, 94, 14);
		panel.add(labelProfissaoCliente);
		
		JLabel labelRgCliente = new JLabel("RG");
		labelRgCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelRgCliente.setBounds(32, 188, 31, 14);
		panel.add(labelRgCliente);
		
		JLabel labelCpfCliente = new JLabel("CPF");
		labelCpfCliente.setToolTipText("informe somente os números do CPF (sem pontos, hífens ou barras) ");
		labelCpfCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelCpfCliente.setBounds(32, 222, 37, 14);
		panel.add(labelCpfCliente);
		
		cadastroNomeCliente = new JTextField();
		cadastroNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroNomeCliente.setBounds(90, 76, 615, 24);
		panel.add(cadastroNomeCliente);
		cadastroNomeCliente.setColumns(10);
		
		cadastroNacionalidadeCliente = new JTextField();
		cadastroNacionalidadeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroNacionalidadeCliente.setBounds(177, 111, 144, 24);
		panel.add(cadastroNacionalidadeCliente);
		cadastroNacionalidadeCliente.setColumns(10);
		
		JComboBox cadastroComboBoxEstadoCivilCliente = new JComboBox();
		cadastroComboBoxEstadoCivilCliente.setModel(new DefaultComboBoxModel(new String[] {"<selecione> ...", "Solteiro(a)", "Casado(a)", "União Estável", "Separado(a)", "Divorciado(a)"}));
		cadastroComboBoxEstadoCivilCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroComboBoxEstadoCivilCliente.setBounds(453, 108, 152, 24);
		panel.add(cadastroComboBoxEstadoCivilCliente);
		
		cadastroProfissaoCliente = new JTextField();
		cadastroProfissaoCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroProfissaoCliente.setBounds(132, 150, 189, 24);
		panel.add(cadastroProfissaoCliente);
		cadastroProfissaoCliente.setColumns(10);
		
		JLabel labelOrgaoEmissor = new JLabel("ORGÃO EMISSOR");
		labelOrgaoEmissor.setHorizontalAlignment(SwingConstants.CENTER);
		labelOrgaoEmissor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelOrgaoEmissor.setBounds(274, 188, 144, 14);
		panel.add(labelOrgaoEmissor);
		
		JLabel labelUfCliente = new JLabel("UF");
		labelUfCliente.setHorizontalAlignment(SwingConstants.CENTER);
		labelUfCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelUfCliente.setBounds(561, 188, 21, 14);
		panel.add(labelUfCliente);
		
		cadastroRGClienteOrgaoEmissor = new JTextField();
		cadastroRGClienteOrgaoEmissor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroRGClienteOrgaoEmissor.setBounds(420, 185, 123, 20);
		panel.add(cadastroRGClienteOrgaoEmissor);
		cadastroRGClienteOrgaoEmissor.setColumns(10);
		
		JComboBox cadastroComboBoxUfCliente = new JComboBox();
		cadastroComboBoxUfCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cadastroComboBoxUfCliente.setModel(new DefaultComboBoxModel(UF.values()));
		cadastroComboBoxUfCliente.setBounds(587, 185, 46, 20);
		panel.add(cadastroComboBoxUfCliente);
		
		cadastroRGCliente = new JTextField();
		cadastroRGCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cadastroRGCliente.setBounds(60, 185, 202, 20);
		panel.add(cadastroRGCliente);
		cadastroRGCliente.setColumns(10);
		
		cadastroCpfCliente = new JTextField();
		cadastroCpfCliente.setToolTipText("! <Informe> : insira somente os números ");
		cadastroCpfCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroCpfCliente.setBounds(67, 220, 192, 20);
		panel.add(cadastroCpfCliente);
		cadastroCpfCliente.setColumns(10);
		
		JLabel lblcadastrandoNovoCliente = new JLabel("================================================ CADASTRANDO NOVO CLIENTE ===========================================================");
		lblcadastrandoNovoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblcadastrandoNovoCliente.setBounds(32, 39, 1027, 14);
		panel.add(lblcadastrandoNovoCliente);
		
		JLabel lblNewLabel = new JLabel("============================================== CADASTRANDO ENDEREÇO DO CLIENTE ========================================================");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 268, 1027, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("nº");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(372, 294, 21, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblComplemento = new JLabel("complemento");
		lblComplemento.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblComplemento.setBounds(485, 293, 106, 14);
		panel.add(lblComplemento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rua", "Avenida", "Travessa", "Viela", "Beco"}));
		comboBox.setBounds(32, 291, 77, 24);
		panel.add(comboBox);
		
		enderecoRuaCliente = new JTextField();
		enderecoRuaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecoRuaCliente.setBounds(112, 293, 250, 20);
		panel.add(enderecoRuaCliente);
		enderecoRuaCliente.setColumns(10);
		
		enderecoNumeroCasaCliente = new JTextField();
		enderecoNumeroCasaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecoNumeroCasaCliente.setBounds(395, 293, 86, 20);
		panel.add(enderecoNumeroCasaCliente);
		enderecoNumeroCasaCliente.setColumns(10);
		
		enderecoComplementoCliente = new JTextField();
		enderecoComplementoCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecoComplementoCliente.setBounds(594, 293, 315, 20);
		panel.add(enderecoComplementoCliente);
		enderecoComplementoCliente.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setHorizontalAlignment(SwingConstants.CENTER);
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBairro.setBounds(32, 337, 46, 14);
		panel.add(lblBairro);
		
		enderecoBairroCliente = new JTextField();
		enderecoBairroCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecoBairroCliente.setBounds(82, 335, 174, 20);
		panel.add(enderecoBairroCliente);
		enderecoBairroCliente.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCidade.setBounds(285, 337, 55, 14);
		panel.add(lblCidade);
		
		enderecoCidadeCliente = new JTextField();
		enderecoCidadeCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecoCidadeCliente.setBounds(344, 335, 144, 20);
		panel.add(enderecoCidadeCliente);
		enderecoCidadeCliente.setColumns(10);
		
		JLabel label = new JLabel("UF");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(503, 337, 21, 14);
		panel.add(label);
		
		JComboBox enderecoUfCliente = new JComboBox();
		enderecoUfCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		enderecoUfCliente.setModel(new DefaultComboBoxModel(UF.values()));
		enderecoUfCliente.setBounds(528, 335, 46, 20);
		panel.add(enderecoUfCliente);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setHorizontalAlignment(SwingConstants.CENTER);
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCep.setBounds(32, 381, 31, 14);
		panel.add(lblCep);
		
		enderecoCepCliente = new JTextField();
		enderecoCepCliente.setToolTipText("! <Informe> : insira somente os números ");
		enderecoCepCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecoCepCliente.setBounds(67, 381, 189, 20);
		panel.add(enderecoCepCliente);
		enderecoCepCliente.setColumns(10);
		
		JButton btnSalvarDadosE = new JButton("Cadastrar Cliente");
		btnSalvarDadosE.setForeground(new Color(230, 230, 250));
		btnSalvarDadosE.setBackground(new Color(34, 139, 34));
		btnSalvarDadosE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalvarDadosE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvarDadosE.setBounds(274, 462, 175, 48);
		panel.add(btnSalvarDadosE);
		
		JButton btnLimparDados = new JButton("Limpar Dados");
		btnLimparDados.setBackground(new Color(0, 0, 0));
		btnLimparDados.setForeground(new Color(230, 230, 250));
		btnLimparDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLimparDados.setBounds(504, 462, 175, 48);
		panel.add(btnLimparDados);

	}
}
