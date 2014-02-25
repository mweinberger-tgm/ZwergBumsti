package kuceraschoberweinberger;

/**
 * 
 * @author Schober
 *
 */
public class ShiftCipher extends MonoalphabeticCipher {

	public ShiftCipher(int value) {
		setShiftAmount(value);
	}

	public void setShiftAmount(int shiftvalue) {
		String toShift = this.getAlphabet().substring(0, shiftvalue - 1);
		String rest = this.getAlphabet().substring(shiftvalue, this.getAlphabet().length());
		
		this.setSecretAlphabet(rest + toShift);
	}

}
