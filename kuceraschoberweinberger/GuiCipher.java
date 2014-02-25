package kuceraschoberweinberger;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Das Kernelement des Programms, fuegt alle Funktionen zusammen.
 * 
 * Mithilfe der Combobox kann der Benutzer die Verschluesselungsarten veraendern.
 * Ueber das Parameterfeld kann man die fuer die Verfahren wichtigen Werte mitgeben.
 * Das Ein-/Ausgabefeld dient als Schnittstelle zwischen Unverschluesselten und Verschluesselten, hier werden die Zeichenketten ausgegeben.
 * Die Funktion der 'Encrypt/Decrypt'-Buttons ist obligatorisch, mit einem Klick auf 'Help' bekommt der Anwender Hilfe beim Angeben der Parameter. 
 * 
 * @author Michael Weinberger
 * @version 2014-02-19
 *
 */
public class GuiCipher extends WindowAdapter {
	
	public static String ausgewaehltesverfahren = "";
	public static JTextField parameter;
	public static JTextArea eingabe;
	public static JTextArea ausgabe;
	
	public void initGUI() {
		JFrame mainframe = new JFrame();
		JPanel hauptpanel = new JPanel();
		JPanel toppanel = new JPanel();
		JPanel textpanel = new JPanel();
		JPanel bottompanel = new JPanel();
		
		hauptpanel.setLayout(new BorderLayout());
		toppanel.setLayout(new GridLayout(0,2));
		textpanel.setLayout(new GridLayout(0,2));
		bottompanel.setLayout(new FlowLayout());
		
		JComboBox verfahrenauswahl = new JComboBox();
		verfahrenauswahl.addItemListener(new AuswahlListener());
		verfahrenauswahl.addItem("KeywordCipher");
		verfahrenauswahl.addItem("ShiftCipher");
		verfahrenauswahl.addItem("SubstitutionCipher");
		verfahrenauswahl.addItem("MonoalphabeticCipher");
		
		toppanel.add(verfahrenauswahl);
		
		parameter = new JTextField("Parameter eingeben");
		
		toppanel.add(parameter);
		hauptpanel.add(toppanel, BorderLayout.NORTH);
		
		eingabe = new JTextArea("Eingabe");
		ausgabe = new JTextArea("Ausgabe");
		
		eingabe.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ausgabe.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		ausgabe.setEditable(false);
		
		textpanel.add(eingabe);
		textpanel.add(ausgabe);
		
		hauptpanel.add(textpanel, BorderLayout.CENTER);
		
		JButton encrypt = new JButton("Encrypt");
		encrypt.addActionListener(new EncryptListener());
		JButton help = new JButton("Help");
		help.addActionListener(new HelpListener());
		JButton decrypt = new JButton("Decrypt");
		decrypt.addActionListener(new DecryptListener());
		
		bottompanel.add(encrypt);
		bottompanel.add(help);
		bottompanel.add(decrypt);
		
		hauptpanel.add(bottompanel, BorderLayout.SOUTH);
		
		mainframe.add(hauptpanel);
		mainframe.addWindowListener(this);
		mainframe.setSize(500, 500);
		mainframe.setMinimumSize(new Dimension(300, 300));
		mainframe.setTitle("A12 Cipher");
		mainframe.setVisible(true);
	}
	
	/**
	 * Schliesst das Programm, wenn das Fenster geschlossen wird.
	 * 
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
