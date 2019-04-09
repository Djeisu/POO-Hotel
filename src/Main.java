import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Management management = new Management();
		management.addNewRom(new Rom(1,true,50.5));
		management.addNewRom(new Rom(2,true,100.5));
		management.addNewRom(new Rom(3,true,99.90));
		management.addNewRom(new Rom(4,true,89.90));
		management.listAllRoms();
		
		//idQuarto idUser Date
		management.ReserveARom(1, 1, "Monday");
		management.unReserveARom(1);
		management.ReserveARom(1, 2, "Tuestday");
		management.unReserveARom(1);
		management.ReserveARom(1, 3, "Wednesday");
		management.unReserveARom(1);
		management.ReserveARom(1, 4, "Thrusday");
		management.unReserveARom(1);
		management.ReserveARom(1, 5, "Friday");
		management.unReserveARom(1);
		
		management.listRomSettings(1);
//		management.listAllRoms();
	}
}
