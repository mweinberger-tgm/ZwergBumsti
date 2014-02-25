package kuceraschoberweinberger;

import java.awt.event.*;

/**
 * Verschluesselt den eingegebenen Text (unter Beruecksichtigung der Parameter) und gibt ihn im Ausgabefenster wieder aus.
 * 
 * Jede der Methoden funktioniert von der Anwendung her gleich, die Funktion ist natuerlich je nach Auswahl unterschiedlich.
 * 
 * @author Michael Weinberger
 * @version 2014-02-19
 *
 */
public class EncryptListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		//Implementierung fuer fehlerhafte Parameter fehlt noch komplett in den Methoden!!
		if(GuiCipher.ausgewaehltesverfahren == "KeywordCipher") {
			KeywordCipher k = new KeywordCipher(GuiCipher.parameter.getText()); //Erstellt ein neues Objekt und uebergibt den Parameter.
			
			GuiCipher.ausgabe.setText(k.encrypt(GuiCipher.eingabe.getText())); //Verschluesselt den Text und gibt ihn im Ausgabefeld aus.
		}
		
		if(GuiCipher.ausgewaehltesverfahren == "ShiftCipher") {
			ShiftCipher s = new ShiftCipher(Integer.parseInt(GuiCipher.parameter.getText()));
			
			GuiCipher.ausgabe.setText(s.encrypt(GuiCipher.eingabe.getText()));
		}

		if(GuiCipher.ausgewaehltesverfahren == "SubstitutionCipher") {
			SubstitutionCipher sub = new SubstitutionCipher(GuiCipher.eingabe.getText());
			
			GuiCipher.ausgabe.setText(sub.encrypt(GuiCipher.eingabe.getText()));
		}

		if(GuiCipher.ausgewaehltesverfahren == "MonoalphabeticCipher") {
			MonoalphabeticCipher m = new MonoalphabeticCipher();
			
			GuiCipher.ausgabe.setText(m.encrypt(GuiCipher.eingabe.getText()));
		}
	}
	
}