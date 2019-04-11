package MainHotelList;

public class Reservation {
	private int idUser;
	private int idRoom;
	private String date;
	
	public Reservation() {}
	
	public Reservation(int idU) {
		this.setIdRoom(idU);
	}
	
	public Reservation(int idR, int idU, String d) {
		this.setIdRoom(idR);
		this.setIdUser(idU);
		this.setDate(d);
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
