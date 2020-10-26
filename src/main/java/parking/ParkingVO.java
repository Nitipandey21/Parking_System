package parking;

import org.springframework.stereotype.Component;



@Component

public class ParkingVO {

	public  long smallSpace;
	public  long mediumSpace;
	public  long largeSpace;
	@Override
	public String toString() {
		return "ParkingVO [smallSpace=" + smallSpace + ", mediumSpace=" + mediumSpace + ", largeSpace=" + largeSpace
				+ "]";
	}
	public ParkingVO(long smallSpace, long mediumSpace, long largeSpace) {
		super();
		this.smallSpace = smallSpace;
		this.mediumSpace = mediumSpace;
		this.largeSpace = largeSpace;
	}
	public long getSmallSpace() {
		return smallSpace;
	}
	public void setSmallSpace(long smallSpace) {
		this.smallSpace = smallSpace;
	}
	public long getMediumSpace() {
		return mediumSpace;
	}
	public void setMediumSpace(long mediumSpace) {
		this.mediumSpace = mediumSpace;
	}
	public long getLargeSpace() {
		return largeSpace;
	}
	public void setLargeSpace(long largeSpace) {
		this.largeSpace = largeSpace;
	}

}
