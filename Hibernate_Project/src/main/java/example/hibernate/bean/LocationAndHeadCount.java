package example.hibernate.bean;

public class LocationAndHeadCount {
	
	private String loc;
	private int count;

	

	public LocationAndHeadCount() {
		super();
	}

	public LocationAndHeadCount(String loc, int count) {
		super();
		this.loc = loc;
		this.count = count;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "LocationAndHeadCount [loc=" + loc + ", count=" + count + "]";
	}
	
	

}
