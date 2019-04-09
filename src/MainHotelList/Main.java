package MainHotelList;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Management management = new Management();
		management.addNewRoom(new Room(1,true,50.5));
		management.addNewRoom(new Room(2,true,100.5));
		management.addNewRoom(new Room(3,true,99.90));
		management.addNewRoom(new Room(4,true,89.90));
		management.listAllRooms();
		
		//idQuarto idUser Date
		management.ReserveARoom(new Reservation(1, 1, "Monday"));
		management.unReserveARoom(new Reservation(1));
		management.ReserveARoom(new Reservation(1, 2, "Tuestday"));
		management.unReserveARoom(new Reservation(1));
		management.ReserveARoom(new Reservation(1, 3, "Wednesday"));
		management.unReserveARoom(new Reservation(1));
		management.ReserveARoom(new Reservation(1, 4, "Thrusday"));
		management.unReserveARoom(new Reservation(1));
		management.ReserveARoom(new Reservation(1, 5, "Friday"));
		management.unReserveARoom(new Reservation(1));
		
		management.listRoomSettings(1);
//		management.listAllRooms();
	}
}
