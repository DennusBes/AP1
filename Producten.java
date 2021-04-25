public class Producten {

	private int productID;
	private String prodNaam;

	//Getters
	public int getProductID() {
		return productID;
	}
	public String getProdNaam() {
		return prodNaam;
	}

	//Setters
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public void setProdNaam(String prodNaam) {
		this.prodNaam = prodNaam;
	}

	public Producten(String pnm, int pid) {
		this.prodNaam = pnm;
		this.productID = pid;
	}


}