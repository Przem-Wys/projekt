package com.wysokinski.Projekt.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "users")
public class Users extends BaseEntity {
@Column(name = "first_Name")
    private String first_Name;
@Column(name = "second_name")
private String second_Name;
@Column(name = "email")
private String email;
@Column (name = "password")
private String password;
@Column(name = "admin")
private boolean admin;
@Column(name = "author")
private boolean author;


}
