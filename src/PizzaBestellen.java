package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PizzaBestellen extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	// automatisch als Klassenfelder generiert
	private JTextField textFieldName;
	private JTextField textFieldStr;
	private JTextField textFieldOrt;
	
	// von Hand als Klassenfelder deklariert, um sie in resetButtonsFields() 
	// verändern zu können
	private JCheckBox chckbxPaprika;
	private JCheckBox chckbxSalami;
	private JCheckBox chckbxPilze;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaBestellen frame = new PizzaBestellen();
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
	public PizzaBestellen() {
		setTitle("Pizza bestellen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblZutaten = new JLabel("Zutaten");
		GridBagConstraints gbc_lblZutaten = new GridBagConstraints();
		gbc_lblZutaten.anchor = GridBagConstraints.WEST;
		gbc_lblZutaten.insets = new Insets(0, 0, 5, 5);
		gbc_lblZutaten.gridx = 1;
		gbc_lblZutaten.gridy = 1;
		contentPane.add(lblZutaten, gbc_lblZutaten);
		
		
		chckbxPaprika = new JCheckBox("Paprika");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 2;
		contentPane.add(chckbxPaprika, gbc_chckbxNewCheckBox);
		
		
		chckbxPilze = new JCheckBox("Pilze");
		GridBagConstraints gbc_chckbxPilze = new GridBagConstraints();
		gbc_chckbxPilze.anchor = GridBagConstraints.WEST;
		gbc_chckbxPilze.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPilze.gridx = 1;
		gbc_chckbxPilze.gridy = 4;
		contentPane.add(chckbxPilze, gbc_chckbxPilze);
		
		
		chckbxSalami = new JCheckBox("Salami");
		GridBagConstraints gbc_chckbxSalami = new GridBagConstraints();
		gbc_chckbxSalami.anchor = GridBagConstraints.WEST;
		gbc_chckbxSalami.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSalami.gridx = 1;
		gbc_chckbxSalami.gridy = 3;
		contentPane.add(chckbxSalami, gbc_chckbxSalami);
		
		JLabel lblZahlungsweise = new JLabel("Zahlungsweise");
		GridBagConstraints gbc_lblZahlungsweise = new GridBagConstraints();
		gbc_lblZahlungsweise.insets = new Insets(0, 0, 5, 5);
		gbc_lblZahlungsweise.gridx = 5;
		gbc_lblZahlungsweise.gridy = 1;
		contentPane.add(lblZahlungsweise, gbc_lblZahlungsweise);
		
		JRadioButton rdbtnBarzahlung = new JRadioButton("Barzahlung");
		buttonGroup.add(rdbtnBarzahlung);
		GridBagConstraints gbc_rdbtnBarzahlung = new GridBagConstraints();
		gbc_rdbtnBarzahlung.anchor = GridBagConstraints.WEST;
		gbc_rdbtnBarzahlung.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnBarzahlung.gridx = 5;
		gbc_rdbtnBarzahlung.gridy = 2;
		contentPane.add(rdbtnBarzahlung, gbc_rdbtnBarzahlung);
		
		JRadioButton rdbtnBitcoin = new JRadioButton("Bitcoin");
		buttonGroup.add(rdbtnBitcoin);
		GridBagConstraints gbc_rdbtnBitcoin = new GridBagConstraints();
		gbc_rdbtnBitcoin.anchor = GridBagConstraints.WEST;
		gbc_rdbtnBitcoin.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnBitcoin.gridx = 5;
		gbc_rdbtnBitcoin.gridy = 3;
		contentPane.add(rdbtnBitcoin, gbc_rdbtnBitcoin);
		
		
		JLabel lblLieferadresse = new JLabel("Lieferadresse");
		GridBagConstraints gbc_lblLieferadresse = new GridBagConstraints();
		gbc_lblLieferadresse.anchor = GridBagConstraints.WEST;
		gbc_lblLieferadresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblLieferadresse.gridx = 1;
		gbc_lblLieferadresse.gridy = 6;
		contentPane.add(lblLieferadresse, gbc_lblLieferadresse);
		
		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 7;
		contentPane.add(lblName, gbc_lblName);
		
		textFieldName = new JTextField();
		GridBagConstraints gbc_textFieldName = new GridBagConstraints();
		gbc_textFieldName.gridwidth = 2;
		gbc_textFieldName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldName.gridx = 2;
		gbc_textFieldName.gridy = 7;
		contentPane.add(textFieldName, gbc_textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblStrae = new JLabel("Straße");
		GridBagConstraints gbc_lblStrae = new GridBagConstraints();
		gbc_lblStrae.anchor = GridBagConstraints.WEST;
		gbc_lblStrae.insets = new Insets(0, 0, 5, 5);
		gbc_lblStrae.gridx = 1;
		gbc_lblStrae.gridy = 8;
		contentPane.add(lblStrae, gbc_lblStrae);
		
		textFieldStr = new JTextField();
		GridBagConstraints gbc_textFieldStr = new GridBagConstraints();
		gbc_textFieldStr.gridwidth = 2;
		gbc_textFieldStr.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStr.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStr.gridx = 2;
		gbc_textFieldStr.gridy = 8;
		contentPane.add(textFieldStr, gbc_textFieldStr);
		textFieldStr.setColumns(10);
		
		JLabel lblOrt = new JLabel("Ort");
		GridBagConstraints gbc_lblOrt = new GridBagConstraints();
		gbc_lblOrt.anchor = GridBagConstraints.WEST;
		gbc_lblOrt.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrt.gridx = 1;
		gbc_lblOrt.gridy = 9;
		contentPane.add(lblOrt, gbc_lblOrt);
		gbc_textFieldName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldName.gridx = 9;
		gbc_textFieldName.gridy = 2;
		
		textFieldOrt = new JTextField();
		GridBagConstraints gbc_textFieldOrt = new GridBagConstraints();
		gbc_textFieldOrt.gridwidth = 2;
		gbc_textFieldOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldOrt.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldOrt.gridx = 2;
		gbc_textFieldOrt.gridy = 9;
		contentPane.add(textFieldOrt, gbc_textFieldOrt);
		textFieldOrt.setColumns(10);
		
		JButton btnHunger = new JButton("Hunger!");
		btnHunger.addActionListener(e -> {

			// Nur Rückmeldung, ohne Auslesen von Feldern
			// JOptionPane.showMessageDialog(null, "Pizza kommt in 5 Minuten!");
			
			// Detaillierte Rückmeldung
			
				String anredeString = "Hallo, "+textFieldName.getText();
				
				String belagString = "Pizza mit ";
				belagString += chckbxPilze.isSelected() ? "Pilzen " : "";
				belagString += chckbxSalami.isSelected() ? "Salami " : "";
				belagString += chckbxPaprika.isSelected() ? "Paprika " : "";
				
				String adresse = textFieldStr.getText()+", "+textFieldOrt.getText();
				
				String zahlweise = "Bitte halten Sie entsprechend "
						+ ( rdbtnBitcoin.isSelected() ? "Bitcoin" : "Bargeld" ) + " bereit. ";
				
				String nachricht = anredeString + "!\n" + belagString + "\n" + 
				"wird in 5 Minuten geliefert nach: "+adresse + ". \n"+zahlweise+"\nGuten Appetit!";
				JOptionPane.showMessageDialog(null, nachricht);
				
				// Felder und Buttons zurücksetzen
				resetButtonsFields();
				
			}
			);
		GridBagConstraints gbc_btnHunger = new GridBagConstraints();
		gbc_btnHunger.insets = new Insets(0, 0, 5, 5);
		gbc_btnHunger.gridx = 5;
		gbc_btnHunger.gridy = 10;
		contentPane.add(btnHunger, gbc_btnHunger);
	}

	private void resetButtonsFields() {
		buttonGroup.clearSelection();
		chckbxPilze.setSelected(false);
		chckbxSalami.setSelected(false);
		chckbxPaprika.setSelected(false);
		textFieldName.setText("");
		textFieldStr.setText("");
		textFieldOrt.setText("");
		
	}
	
}
