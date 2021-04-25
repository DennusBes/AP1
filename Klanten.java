public class Klanten {

	private int klantID;
	private String klantNaam;

	//Getters
	public String getKlantNaam() {
		return klantNaam;
	}
	public int getKlantID() {
		return klantID;
	}

	//Setters
	public void setKlantID(int Value) {
		klantID = Value;
	}
	public void setKlantNaam(String Value) {
		klantNaam = Value;
	}


	public Klanten(String knm, int kid) {
		this.klantNaam = knm;
		this.klantID = kid;
	}
}
