package entornos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class Sumador extends JFrame {
	
private JTabbedPane jTabbedPane = null;
	
	private static Sumador instance = null;
	
	/**
	 * 
	 * @return
	 */
	public static Sumador getInstance () {
		if (instance == null) {
			instance = new Sumador();
		}
		return instance;
	}

	public Sumador() {
		super("Calculadora");
		this.setBounds(0, 0, 600, 400);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(getPanelPrincipal(), BorderLayout.CENTER);
	}

	/**
	 * 
	 * @return
	 */
	private JTabbedPane getPanelPrincipal() {
		JTabbedPane pane = new JTabbedPane();
		
		pane.add("Sumador", new PanelSumador());
		
		return pane;
	}
	
	/**
	 * @return the jTabbedPane
	 */
	public JTabbedPane getjTabbedPane() {
		return jTabbedPane;
	}

	public static void main(String[] args) {
		Sumador ventana = new Sumador();
		ventana.setVisible(true);

	}

}
