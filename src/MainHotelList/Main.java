package MainHotelList;

public class Main {
	Management management = new Management();
	
	public static void main(String[] args) {
		Main m = new Main();
		m.createRoom();
		m.managerRoom();
	}
	
	public void createRoom(){
		management.addNewRoom(new Room(1,true,50.5, 2000));
		management.addNewRoom(new Room(2,true,100.5, 2000));
		management.addNewRoom(new Room(3,true,99.90, 2000));
		management.addNewRoom(new Room(4,true,89.90, 2000));
	}
	
	public void managerRoom(){
		try{
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
			management.ReserveARoom(new Reservation(2, 1, "Monday"));
		}catch (Exception e) {
			System.out.println(e);
		}
		
		try{
			management.listRoomSettings(1);			
			management.listRoomSettings(2);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
