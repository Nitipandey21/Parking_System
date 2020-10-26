package parking;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public long getBreadth() {
		return breadth;
	}

	public void setBreadth(long breadth) {
		this.breadth = breadth;
	}

	public ParkingType getType() {
		return type;
	}

	public void setType(ParkingType type) {
		this.type = type;
	}

	public Boolean getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	private String name;

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", length=" + length + ", breadth=" + breadth + ", type=" + type
				+ ", isdeleted=" + isdeleted + "]";
	}

	public Car(Long id, String name, long length, long breadth, ParkingType type, Boolean isdeleted) {
		super();
		this.id = id;
		this.name = name;
		this.length = length;
		this.breadth = breadth;
		this.type = type;
		this.isdeleted = isdeleted;
	}

	private long length;

	private long breadth;

	@Enumerated(EnumType.STRING)
	private ParkingType type;

	private Boolean isdeleted = Boolean.FALSE;
}
