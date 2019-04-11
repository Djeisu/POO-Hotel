package MainHotelList;
import java.util.ArrayList;
import java.util.List;

import MainHotelList.Exceptions.RoomExceptionRoomAvailable;
import MainHotelList.Exceptions.RoomExceptionValueInvalid;
import MainHotelList.Exceptions.RoomExceptionValueNegative;

public class Room {
	private int id;
	private boolean status;
	private double price;
	private double value;
	private List<Reservation> reservations;
	private double fullCashReceipt;
	
	private void init(){
		this.reservations = new ArrayList<Reservation>();
	}
	
	Room(){
		this.init();
	}
	
	Room(int i){
		this.init();
		this.setId(i);
		this.setPrice(0);
		this.setStatus(false);
	}
	
	Room(int i, boolean st){
		this.init();
		this.setId(i);
		this.setPrice(0);
		this.setStatus(st);
	}
	
	Room(int i, boolean st, double pr, double v){
		this.init();
		this.setId(i);
		this.setPrice(pr);
		this.setStatus(st);
		this.setValue(v);
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
	
	public double getFullCash(int v) throws RoomExceptionValueNegative{
		if(v > 0)
			return Math.max(0,(this.getPrice()*this.getReservations().size())-v);
		else
			throw new RoomExceptionValueNegative(v);
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public void removeReservation() throws RoomExceptionRoomAvailable{
		if(!this.isStatus())
			this.setStatus(true);
		else
			throw new RoomExceptionRoomAvailable();
	}
	
	public void addNewReservation(Reservation r) throws RoomExceptionRoomAvailable{
		if(this.isStatus()){
			this.setStatus(false);
			this.setReservations(r);
		}else
			throw new RoomExceptionRoomAvailable();
	}
}
