package kuceraschoberweinberger;

import java.awt.event.*;

import javax.swing.*;

/**
 * Entschluesselt den eingegebenen Text (unter Beruecksichtigung der Parameter) und gibt ihn im Ausgabefenster wieder aus.
 * 
 * Jede der Methoden funktioniert von der Anwendung her gleich, die Funktion ist natuerlich je nach Auswahl unterschiedlich.
 * 
 * @author Michael Weinberger
 * @version 2014-02-19
 *
 */
public class DecryptListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		if(GuiCipher.ausgewaehltesverfahren == "KeywordCipher") {
			KeywordCipher k = new KeywordCipher(GuiCipher.parameter.getText()); //Erstellt ein neues Objekt und uebergibt den Parameter.
			
			GuiCipher.ausgabe.setText(k.decrypt(GuiCipher.eingabe.getText()));//Entschluesselt die Zeichenkette und gibt den Text im Ausgabefeld aus.
		}
		
		if(GuiCipher.ausgewaehltesverfahren == "ShiftCipher") {
			ShiftCipher s = new ShiftCipher(Integer.parseInt(GuiCipher.parameter.getText()));
			
			GuiCipher.ausgabe.setText(s.decrypt(GuiCipher.eingabe.getText()));
		}

		if(GuiCipher.ausgewaehltesverfahren == "SubstitutionCipher") {
			SubstitutionCipher sub = new SubstitutionCipher(GuiCipher.eingabe.getText());
			
			GuiCipher.ausgabe.setText(sub.decrypt(GuiCipher.eingabe.getText()));
		}

		if(GuiCipher.ausgewaehltesverfahren == "MonoalphabeticCipher") {
			MonoalphabeticCipher m = new MonoalphabeticCipher();
			
			GuiCipher.ausgabe.setText(m.decrypt(GuiCipher.eingabe.getText()));
		}
	}
	
}