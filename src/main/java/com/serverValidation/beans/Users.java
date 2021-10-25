package com.serverValidation.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Username can't be null!!")
	@Size(min = 3, message = "Username contains at least 3 charcters")
	private String userName;

	@NotBlank(message = "Email can't be null!!")
	private String email;

	@NotBlank(message = "Password can't be null!!")
	@Size(min = 3, message = "Password contains at least 3 charcters")
	private String password;

	@NotBlank(message = "Password can't be null!!")
	private String confirmPassword;

	@NotBlank(message = "gender can't be null!!")
	private String gender;

	@Transient
	private String isChecked;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}

	public Users(
			@NotBlank(message = "Username can't be null!!") @Size(min = 3, message = "Username contains at least 3 charcters") String userName,
			@NotBlank(message = "Email can't be null!!") String email,
			@NotBlank(message = "Password can't be null!!") @Size(min = 3, message = "Password contains at least 3 charcters") String password,
			@NotBlank(message = "Password can't be null!!") String confirmPassword,
			@NotBlank(message = "gender can't be null!!") String gender, String isChecked) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.gender = gender;
		this.isChecked = isChecked;
	}

	public Users(int id,
			@NotBlank(message = "Username can't be null!!") @Size(min = 3, message = "Username contains at least 3 charcters") String userName,
			@NotBlank(message = "Email can't be null!!") String email,
			@NotBlank(message = "Password can't be null!!") @Size(min = 3, message = "Password contains at least 3 charcters") String password,
			@NotBlank(message = "Password can't be null!!") String confirmPassword,
			@NotBlank(message = "gender can't be null!!") String gender, String isChecked) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.gender = gender;
		this.isChecked = isChecked;
	}
	
	

	public Users(int id,
			@NotBlank(message = "Username can't be null!!") @Size(min = 3, message = "Username contains at least 3 charcters") String userName,
			@NotBlank(message = "Email can't be null!!") String email,
			@NotBlank(message = "Password can't be null!!") @Size(min = 3, message = "Password contains at least 3 charcters") String password,
			@NotBlank(message = "Password can't be null!!") String confirmPassword,
			@NotBlank(message = "gender can't be null!!") String gender) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.gender = gender;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", gender=" + gender + ", isChecked=" + isChecked + "]";
	}
	
	

}
