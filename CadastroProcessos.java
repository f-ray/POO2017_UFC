package userGUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import enums.*;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class CadastroProcessos extends JInternalFrame {
	private JTextField cadastroProcessoNumeroProcesso;
	private JTextField cadastroProcessoCPFCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProcessos frame = new CadastroProcessos();
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
	public CadastroProcessos() {
		setBounds(100, 100, 1100, 600);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1084, 570);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelNumeroProcesso = new JLabel("Número Processo");
		labelNumeroProcesso.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumeroProcesso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNumeroProcesso.setBounds(57, 167, 154, 39);
		panel.add(labelNumeroProcesso);
		
		cadastroProcessoNumeroProcesso = new JTextField();
		cadastroProcessoNumeroProcesso.setHorizontalAlignment(SwingConstants.CENTER);
		cadastroProcessoNumeroProcesso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cadastroProcessoNumeroProcesso.setBounds(208, 176, 274, 24);
		panel.add(cadastroProcessoNumeroProcesso);
		cadastroProcessoNumeroProcesso.setColumns(10);
		
		JLabel labelEsferaProcessual = new JLabel("Esfera Processual");
		labelEsferaProcessual.setHorizontalAlignment(SwingConstants.CENTER);
		labelEsferaProcessual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelEsferaProcessual.setBounds(65, 213, 136, 27);
		panel.add(labelEsferaProcessual);
		
		JRadioButton cadastroProcessoEsferaEstadual = new JRadioButton("Estadual");
		cadastroProcessoEsferaEstadual.setHorizontalAlignment(SwingConstants.CENTER);
		cadastroProcessoEsferaEstadual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroProcessoEsferaEstadual.setBounds(242, 217, 109, 23);
		panel.add(cadastroProcessoEsferaEstadual);
		
		JRadioButton cadastroProcessoEsferaFederal = new JRadioButton("Federal");
		cadastroProcessoEsferaFederal.setHorizontalAlignment(SwingConstants.CENTER);
		cadastroProcessoEsferaFederal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cadastroProcessoEsferaFederal.setBounds(400, 215, 109, 23);
		panel.add(cadastroProcessoEsferaFederal);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setHorizontalAlignment(SwingConstants.CENTER);
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUf.setBounds(65, 265, 21, 14);
		panel.add(lblUf);
		
		JComboBox cadastroProcessoComboBoxUF = new JComboBox();
		cadastroProcessoComboBoxUF.setModel(new DefaultComboBoxModel(UF.values()));
		cadastroProcessoComboBoxUF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cadastroProcessoComboBoxUF.setBounds(89, 260, 46, 27);
		panel.add(cadastroProcessoComboBoxUF);
		
		JLabel lblComarca = new JLabel("Comarca");
		lblComarca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblComarca.setBounds(144, 259, 79, 27);
		panel.add(lblComarca);
		
		JComboBox cadastroProcessoComboBoxComarca = new JComboBox();
		cadastroProcessoComboBoxComarca.setModel(new DefaultComboBoxModel(ForosCeara.values()));
		cadastroProcessoComboBoxComarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cadastroProcessoComboBoxComarca.setBounds(214, 260, 154, 27);
		panel.add(cadastroProcessoComboBoxComarca);
		
		JLabel labelSeara = new JLabel("Seara");
		labelSeara.setHorizontalAlignment(SwingConstants.CENTER);
		labelSeara.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelSeara.setBounds(65, 303, 45, 23);
		panel.add(labelSeara);
		
		JComboBox cadastroProcessoComboBoxSeara = new JComboBox();
		cadastroProcessoComboBoxSeara.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cadastroProcessoComboBoxSeara.setModel(new DefaultComboBoxModel(Searas.values()));
		cadastroProcessoComboBoxSeara.setBounds(113, 301, 238, 27);
		panel.add(cadastroProcessoComboBoxSeara);
		
		JButton btnCadastrarProcesso = new JButton("Cadastrar Processo");
		btnCadastrarProcesso.setForeground(new Color(230, 230, 250));
		btnCadastrarProcesso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarProcesso.setBackground(new Color(34, 139, 34));
		btnCadastrarProcesso.setBounds(274, 462, 175, 48);
		panel.add(btnCadastrarProcesso);
		
		JButton btnLimparDados = new JButton("Limpar Dados");
		btnLimparDados.setForeground(new Color(230, 230, 250));
		btnLimparDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLimparDados.setBackground(Color.BLACK);
		btnLimparDados.setBounds(504, 462, 175, 48);
		panel.add(btnLimparDados);
		
		JLabel lblCpfCliente = new JLabel("CPF Cliente");
		lblCpfCliente.setToolTipText("! <Informe>\r\nSomente é possível cadastrar processos referentes à Clientes já cadastrados");
		lblCpfCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCpfCliente.setBounds(57, 114, 89, 14);
		panel.add(lblCpfCliente);
		
		cadastroProcessoCPFCliente = new JTextField();
		cadastroProcessoCPFCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cadastroProcessoCPFCliente.setBounds(152, 112, 238, 20);
		panel.add(cadastroProcessoCPFCliente);
		cadastroProcessoCPFCliente.setColumns(10);

	}
}
