package demo;

public class ActionIdBoundary {
	private String domain;
	private int id;
	//Anna
	public ActionIdBoundary() {
		
	}
	public ActionIdBoundary(String domain, int id) {
		super();
		this.domain = domain;
		this.id = id;
	}
	
	public String getDomain() {
		return domain;
	}
	
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
}
