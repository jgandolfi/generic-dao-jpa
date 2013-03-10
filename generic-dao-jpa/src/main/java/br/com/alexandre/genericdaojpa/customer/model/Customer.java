package br.com.alexandre.genericdaojpa.customer.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = 9055031106759691612L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Sex sex;
	
	@Temporal(TemporalType.DATE)
	private Date birth;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	
}
