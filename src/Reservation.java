
public class Reservation {
	private int idUser;
	private int idRom;
	private String date;
	
	public Reservation() {}
	
	public Reservation(int idU, int idR, String d) {
		this.setIdUser(idU);
		this.setIdRom(idR);
		this.setDate(d);
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdRom() {
		return idRom;
	}

	public void setIdRom(int idRom) {
		this.idRom = idRom;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
