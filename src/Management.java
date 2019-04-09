import java.util.ArrayList;
import java.util.List;

public class Management {
	private List<Rom> roms;
	
	private void init(){
		this.setRoms(new ArrayList<Rom>());
	}
	
	public Management() {
		this.init();
	}

	public List<Rom> getRoms() {
		return roms;
	}

	public void setRoms(List<Rom> roms) {
		this.roms = roms;
	}
	
	public boolean addNewRom(Rom r){
		return this.roms.add(r);
	}
	
	public void ReserveARom(int idRom, int idUser, String date) {
		if(this.addNewResevation(idRom, idUser, date))
			System.out.println("Reserva Realizada com Sucesso para o quarto " + idRom + " Inquilino " + idUser + "\n" );
		else
			System.out.println("Quarto " + idRom + " Indiponível, por favor escolha outro quarto\n");
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void unReserveARom(int idRom){
		if(this.removeResevation(idRom))
			System.out.println("O quarto " + idRom + " está disponível\n" );
		else
			System.out.println("Algo deu errado, por favor tente novamente mais tarde!");
		System.out.println("-----------------------------------------------------------------");
	}
	
	private boolean removeResevation(int idRom){
		for (Rom rom : roms) {
			if(rom.getId() == idRom && !rom.isStatus()){
				rom.setStatus(true);
				return true;				
			}
		}
		return false;
	}
	
	private boolean addNewResevation(int idRom, int idUser, String date){
		for (Rom rom : roms) {
			if(rom.getId() == idRom && rom.isStatus()){
				rom.setStatus(false);
				return rom.setReservations(new Reservation(idRom,idUser,date));				
			}
		}
		return false;
	}
	
	public void listAllRoms(){
		System.out.println("Lista de Quartos no Sistema");
		for (Rom rom : roms) {
			System.out.println("Id: " + rom.getId() + " | Disponibilidade : " + rom.isStatus() + " | Preço : " + rom.getPrice());
		}
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void listRomSettings(int id){
		for (Rom rom : roms) {
			if(rom.getId() == id)
				System.out.println("Id: " + rom.getId() + " | Disponibilidade : " + rom.isStatus() + " | Preço : " + rom.getPrice());
		}
		this.listReservationOfTheRom(id);
		System.out.println("-----------------------------------------------------------------");
	}
	
	private void listReservationOfTheRom(int id){
		for (Rom rom : roms) {
			if(rom.getId() == id){		
				System.out.println("Reservas realizadas: " + rom.getReservations().size());
				for (Reservation reserve : rom.getReservations()) {
					System.out.println("ID Inquilino: " + reserve.getIdUser() + " | ID Quarto : " + reserve.getIdRom() + " | Data : " + reserve.getDate());
				}
				System.out.println("Total R$ " + rom.getFullCash());
			}
		}
		
	}

}
