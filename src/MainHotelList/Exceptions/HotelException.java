package MainHotelList.Exceptions;

public class HotelException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3154682415876985355L;
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public HotelException(String msg){
		super(msg);
	}
	
	public HotelException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}