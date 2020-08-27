package com.java08;

public class Humans {
	private String car_model;
	private String car_model_year;
	private String gender;
	private Integer age;
	private String race;
	private String city;
	private String last_name;
	private String ip_address;
	private String skills;
	private String password;
	private String money;
	private String id;
	private String department;
	private String first_name;
	private String job_title;
	private String email;
	private String car_make;

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public String getCar_model_year() {
		return car_model_year;
	}

	public void setCar_model_year(String car_model_year) {
		this.car_model_year = car_model_year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCar_make() {
		return car_make;
	}

	public void setCar_make(String car_make) {
		this.car_make = car_make;
	}

	@Override
	public String toString() {
		
		String toString = "  {\n" + 
				"    \"id\": "+this.id+",\n" + 
				"    \"first_name\": \""+this.first_name+"\",\n" + 
				"    \"last_name\": \""+this.last_name+"\",\n" + 
				"    \"email\": \""+this.email+"\",\n" + 
				"    \"gender\": \""+this.gender+"\",\n" + 
				"    \"age\": "+this.age+",\n" + 
				"    \"city\": \""+this.city+"\",\n" + 
				"    \"department\": \""+this.department+"\",\n" + 
				"    \"job_title\": \""+this.job_title+"\",\n" + 
				"    \"skills\": \""+this.skills+"\",\n" + 
				"    \"money\": \""+this.money+"\",\n" + 
				"    \"race\": \""+this.race+"\",\n" + 
				"    \"password\": \""+this.password+"\",\n" + 
				"    \"ip_address\": \""+this.ip_address+"\",\n" + 
				"    \"car_make\": \""+this.car_make+"\",\n" + 
				"    \"car_model\": \""+this.car_model+"\",\n" + 
				"    \"car_model_year\": "+this.car_model_year+"\n" + 
				"  }";
		
		
//		return "[first_name" + first_name + ", last_name=" + last_name + ", gender=" + gender + ", age=" + age
//				+ ", race=" + race + ", city=" + city + ", job_title=" + job_title + ", email=" + email + "]";
		
		return toString;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((car_make == null) ? 0 : car_make.hashCode());
		result = prime * result + ((car_model == null) ? 0 : car_model.hashCode());
		result = prime * result + ((car_model_year == null) ? 0 : car_model_year.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ip_address == null) ? 0 : ip_address.hashCode());
		result = prime * result + ((job_title == null) ? 0 : job_title.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((race == null) ? 0 : race.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Humans other = (Humans) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (car_make == null) {
			if (other.car_make != null)
				return false;
		} else if (!car_make.equals(other.car_make))
			return false;
		if (car_model == null) {
			if (other.car_model != null)
				return false;
		} else if (!car_model.equals(other.car_model))
			return false;
		if (car_model_year == null) {
			if (other.car_model_year != null)
				return false;
		} else if (!car_model_year.equals(other.car_model_year))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ip_address == null) {
			if (other.ip_address != null)
				return false;
		} else if (!ip_address.equals(other.ip_address))
			return false;
		if (job_title == null) {
			if (other.job_title != null)
				return false;
		} else if (!job_title.equals(other.job_title))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (race == null) {
			if (other.race != null)
				return false;
		} else if (!race.equals(other.race))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}

}
