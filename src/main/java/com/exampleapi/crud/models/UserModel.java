package com.exampleapi.crud.models;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserModel {

	@Id
	private String id;

	@Column
	private String name;

	@Column
	private String login;

	@Column
	private String password;

	public UserModel() {
		id = UUID.randomUUID().toString();
	}
}
