package entornos;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSumador extends JPanel {
	
Sumadore actual = new Sumadore();
	
	
	private JTextField jtfNumero1;
	private JTextField jtfNumero2;
	private JTextField jtfResultado;
	
	public PanelSumador() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Sumador");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 1:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNumero1 = new JTextField();
		GridBagConstraints gbc_jtfNumero1 = new GridBagConstraints();
		gbc_jtfNumero1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNumero1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNumero1.gridx = 1;
		gbc_jtfNumero1.gridy = 1;
		add(jtfNumero1, gbc_jtfNumero1);
		jtfNumero1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Numero 2:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfNumero2 = new JTextField();
		GridBagConstraints gbc_jtfNumero2 = new GridBagConstraints();
		gbc_jtfNumero2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNumero2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNumero2.gridx = 1;
		gbc_jtfNumero2.gridy = 2;
		add(jtfNumero2, gbc_jtfNumero2);
		jtfNumero2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfResultado = new JTextField();
		GridBagConstraints gbc_jtfResultado = new GridBagConstraints();
		gbc_jtfResultado.insets = new Insets(0, 0, 5, 0);
		gbc_jtfResultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfResultado.gridx = 1;
		gbc_jtfResultado.gridy = 3;
		add(jtfResultado, gbc_jtfResultado);
		jtfResultado.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sumar();
			}

			
		});
		panel.add(btnSumar);
		
		JButton btnSalir = new JButton("Salir");
		panel.add(btnSalir);
	}
	
	private void sumar() {
		int numero1=(Integer.parseInt(jtfNumero1.getText())) + (Integer.parseInt(jtfNumero2.getText()))  ;
		this.jtfResultado.setText(""+numero1);
		
	}
	
}
