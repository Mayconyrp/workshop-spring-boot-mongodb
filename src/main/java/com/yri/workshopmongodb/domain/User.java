package com.yri.workshopmongodb.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@org.springframework.data.annotation.Id
	private String Id;
	private String nome;
	private String email;
	
	public User() {
		 
	}

	public User(String id, String nome, String email) {
		super();
		Id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Id, other.Id);
	}

}
