package usere22.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
//	how to get getter and setter
//	alt+s
//	generate getter and stter slect all click on generate
//	how to get too string
//	alt+s
//	generate too string method click on generate
	
	
	
	
}
