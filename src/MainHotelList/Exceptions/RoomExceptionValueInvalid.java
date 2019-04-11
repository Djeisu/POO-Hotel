package MainHotelList.Exceptions;

public class RoomExceptionValueInvalid extends HotelException{
	public RoomExceptionValueInvalid(double v) {
		super(v + " Nao eh um valor valido, tente outro, por favor!");
	}
}
