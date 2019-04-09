import java.util.ArrayList;
import java.util.List;

public class Rom {
	private int id;
	private boolean status;
	private double price;
	private List<Reservation> reservations;
	private double fullCashReceipt;
	
	private void init(){
		this.reservations = new ArrayList<Reservation>();
	}
	
	Rom(){
		this.init();
	}
	
	Rom(int i){
		this.init();
		this.setId(i);
		this.setPrice(0);
		this.setStatus(false);
	}
	
	Rom(int i, boolean st){
		this.init();
		this.setId(i);
		this.setPrice(0);
		this.setStatus(st);
	}
	
	Rom(int i, boolean st, double pr){
		this.init();
		this.setId(i);
		this.setPrice(pr);
		this.setStatus(st);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public boolean setReservations(Reservation r) {
		return this.reservations.add(r);
	}

	public double getFullCashReceipt() {
		return fullCashReceipt;
	}

	public void setFullCashReceipt(double fullCashReceipt) {
		this.fullCashReceipt = fullCashReceipt;
	}
	
	public double getFullCash() {
		return this.getPrice()*this.getReservations().size();
	}
}
