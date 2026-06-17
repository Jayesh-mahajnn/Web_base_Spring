package example.hibernate.entity;

public class Picnic {//Picnic_master  Picnic.hbm.xml
	
	private int picnicId;
	private String location;
	private String date;
	private int headCount;

	public Picnic() {
		
		
	}

	public Picnic(int picnicId, String location, String date, int headCount) {
		super();
		this.picnicId = picnicId;
		this.location = location;
		this.date = date;
		this.headCount = headCount;
	}

	public int getPicnicId() {
		return picnicId;
	}

	public void setPicnicId(int picnicId) {
		this.picnicId = picnicId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHeadCount() {
		return headCount;
	}

	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}

	@Override
	public String toString() {
		return "Picnic [picnicId=" + picnicId + ", location=" + location + ", date=" + date + ", headCount=" + headCount
				+ "]";
	}
	
	

}
