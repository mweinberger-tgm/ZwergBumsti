package kuceraschoberweinberger;

import java.awt.event.*;
import javax.swing.*;

/**
 * Liest das augewaehlte Verfahren aus der JComboBox aus und speichert es in eine Variable, sodass andere Methoden sie auslesen koennen.
 * 
 * @author Michael Weinberger
 * @version 2014-02-19
 *
 */
public class AuswahlListener implements ItemListener {
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		JComboBox eingabe = (JComboBox) e.getSource();
		
		String verfahren = eingabe.getSelectedItem().toString();
		int index = eingabe.getSelectedIndex();
		
		GuiCipher.ausgewaehltesverfahren = verfahren;
	}
	
}