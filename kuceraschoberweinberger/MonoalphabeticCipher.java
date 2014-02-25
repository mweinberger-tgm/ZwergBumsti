package kuceraschoberweinberger;

/**
 * 
 * @author Schober
 *
 */
public class MonoalphabeticCipher implements Cipher {

	private String secretAlphabet;
	private final String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
	
	public MonoalphabeticCipher() {

	}

	public String getSecretAlphabet() {
		return null;
	}


	/**
	 * @see nachname1nachname2nachname3nachname4.Cipher#encrypt(nachname1nachname2nachname3nachname4.lang.String)
	 */
	public String encrypt(String text) {
		return null;
	}


	/**
	 * @see nachname1nachname2nachname3nachname4.Cipher#decrypt(nachname1nachname2nachname3nachname4.lang.String)
	 */
	public String decrypt(String text) {
		return null;
	}

	public void setSecretAlphabet(String s) {
		this.secretAlphabet = s;
	}
	
	/**
	 * @return the alphabet
	 */
	public String getAlphabet() {
		return alphabet;
	}
	
}
