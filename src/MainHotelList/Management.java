package MainHotelList;
import java.util.ArrayList;
import java.util.List;

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
	
	public void ReserveARoom(Reservation r) {
		for (Room room : Rooms) {
			if(room.getId() == r.getIdRoom())
				if(room.addNewResevation(r))
					System.out.println("Reserva Realizada com Sucesso para o quarto " + r.getIdRoom() + " Inquilino " + r.getIdUser() + "\n" );
				else
					System.out.println("Quarto " + r.getIdRoom() + " Indiponível, por favor escolha outro quarto\n");
		}	
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void unReserveARoom(Reservation r){
		for (Room room : Rooms) {
			if(room.getId() == r.getIdRoom())
				if(room.removeResevation())
					System.out.println("O quarto " + r.getIdRoom() + " está disponível\n" );
				else
					System.out.println("Algo deu errado, por favor tente novamente mais tarde!");
		}	
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void listAllRooms(){
		System.out.println("Lista de Quartos no Sistema");
		for (Room Room : Rooms) {
			System.out.println("Id: " + Room.getId() + " | Disponibilidade : " + Room.isStatus() + " | Preço : " + Room.getPrice());
		}
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void listRoomSettings(int id){
		for (Room Room : Rooms) {
			if(Room.getId() == id)
				System.out.println("Id: " + Room.getId() + " | Disponibilidade : " + Room.isStatus() + " | Preço : " + Room.getPrice());
		}
		this.listReservationOfTheRoom(id);
		System.out.println("-----------------------------------------------------------------");
	}
	
	private void listReservationOfTheRoom(int id){
		for (Room Room : Rooms) {
			if(Room.getId() == id){		
				System.out.println("Reservas realizadas: " + Room.getReservations().size());
				for (Reservation reserve : Room.getReservations()) {
					System.out.println("ID Inquilino: " + reserve.getIdUser() + " | ID Quarto : " + reserve.getIdRoom() + " | Data : " + reserve.getDate());
				}
				System.out.println("Total R$ " + Room.getFullCash());
			}
		}
		
	}

}
