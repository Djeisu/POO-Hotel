package MainHotelList.Exceptions;

public class RoomExceptionValueNegative extends HotelException{
	public RoomExceptionValueNegative(int v) {
		super(v + " Eh um valor negativo");
	}
}
