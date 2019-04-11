package MainHotelList;
import java.util.ArrayList;
import java.util.List;

import MainHotelList.Exceptions.RoomExceptionRoomAvailable;
import MainHotelList.Exceptions.RoomExceptionValueNegative;

public class Management {
	private List<Room> Rooms;
	
	private void init(){
		this.setRooms(new ArrayList<Room>());
	}
	
	public Management() {
		this.init();
	}

	public List<Room> getRooms() {
		return Rooms;
	}

	public void setRooms(List<Room> Rooms) {
		this.Rooms = Rooms;
	}
	
	public boolean addNewRoom(Room r){
		return this.Rooms.add(r);
	}
	
	public void ReserveARoom(Reservation r) throws RoomExceptionRoomAvailable{
		for (Room room : Rooms) 
			if(room.getId() == r.getIdRoom())
				room.addNewReservation(r);
		
		System.out.println("Reserva Realizada com Sucesso para o quarto " + r.getIdRoom() + " Inquilino " + r.getIdUser() + "\n" );				
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void unReserveARoom(Reservation r) throws RoomExceptionRoomAvailable{
		for (Room room : Rooms) 
			if(room.getId() == r.getIdRoom())
				room.removeReservation();		
		
		System.out.println("O quarto " + r.getIdRoom() + " está disponível\n" );
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void listAllRooms(){
		System.out.println("Lista de Quartos no Sistema");
		for (Room Room : Rooms) {
			System.out.println("Id: " + Room.getId() + " | Disponibilidade : " + Room.isStatus() + " | Preço : " + Room.getPrice());
		}
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void listRoomSettings(int id) throws RoomExceptionValueNegative{
		for (Room Room : Rooms) {
			if(Room.getId() == id)
				System.out.println("Id: " + Room.getId() + " | Disponibilidade : " + Room.isStatus() + " | Preço : " + Room.getPrice());
		}
		this.listReservationOfTheRoom(id);
		System.out.println("-----------------------------------------------------------------");
	}
	
	private void listReservationOfTheRoom(int id) throws RoomExceptionValueNegative{
		for (Room Room : Rooms) {
			if(Room.getId() == id){
				System.out.println("Reservas realizadas: " + Room.getReservations().size());
				for (Reservation reserve : Room.getReservations()) {
					System.out.println("ID Inquilino: " + reserve.getIdUser() + " | ID Quarto : " + reserve.getIdRoom() + " | Data : " + reserve.getDate());
				}
				System.out.println("Lucro em relação ao preço do quarto R$ " + Room.getFullCash(20));
			}
		}
		
	}

}
