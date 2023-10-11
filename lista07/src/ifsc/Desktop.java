package ifsc;

import java.util.ArrayList;

public class Desktop extends Produto{

	private boolean Gamer;
	private ArrayList<String> pecas;
	
	
	
	
	
	
	public boolean isGamer() {
		return Gamer;
	}
	public void setGamer(boolean gamer) {
		Gamer = gamer;
	}
	public ArrayList<String> getPecas() {
		return pecas;
	}
	public void setPecas(ArrayList<String> pecas) {
		this.pecas = pecas;
	}
	
	
}
