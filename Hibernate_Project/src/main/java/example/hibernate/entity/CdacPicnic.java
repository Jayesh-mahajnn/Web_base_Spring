package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Marks this class has an entity class
@Table (name = "Cdac_Picnic_Master")//maps to DB table
public class CdacPicnic { //Entity class , Table:Cdac_picnic_master
	
	@Id//Marks this field as an ID field
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "picnic_id") //Maps to column of DB table
	private Integer picnicId;
	
	@Column(name ="picnic_location" , length = 40)
	private String location;
	
	@Column(name ="picnic_date" , length = 30)
	private String date;
	
	@Column(name ="picnic_head_count")
	private int headCount;

	public CdacPicnic() {
		
		
	}

	public CdacPicnic(Integer picnicId, String location, String date, int headCount) {
		super();
		this.picnicId = picnicId;
		this.location = location;
		this.date = date;
		this.headCount = headCount;
	}

	public Integer getPicnicId() {
		return picnicId;
	}

	public void setPicnicId(Integer picnicId) {
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
		return "CdacPicnic [picnicId=" + picnicId + ", location=" + location + ", date=" + date + ", headCount="
				+ headCount + "]";
	}
	

}
