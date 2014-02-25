package kuceraschoberweinberger;

import java.awt.event.*;
import javax.swing.*;

/**
 * Gibt ein Hilfsfenster aus, dass den User bei der Eingabe der richtigen Parameter unterstuetzen soll.
 * 
 * @author Michael Weinberger
 * @version 2014-02-19
 *
 */
public class HelpListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Willkommen im Hilfe-Menü!\nKeywordCipher: Bitte geben Sie ein Geheimwort an!\nShiftCipher: Geben Sie den Wert an, um den der Buchstabe verschoben werden soll!\nSubstitutionCipher: Bitte geben Sie ein Alphabet mit 30 Zeichen an! (Bsp: abcdefghijklmnopqrstuvwxyzäöüß)", "Hilfe", JOptionPane.PLAIN_MESSAGE);
	}
	
}