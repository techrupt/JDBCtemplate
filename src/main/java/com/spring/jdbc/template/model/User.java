package com.spring.jdbc.template.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/*@Getter @Setter 
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data*/
public class User {

	
	private  Integer id;
	    
	private String name;
	
	private String email;
	
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	    
	 
	
	
	
}
