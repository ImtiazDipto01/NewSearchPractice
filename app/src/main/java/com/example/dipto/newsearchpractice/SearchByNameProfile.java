package com.example.dipto.newsearchpractice;


import com.google.gson.annotations.SerializedName;


public class SearchByNameProfile {

	@SerializedName("speciality")
	private String speciality;

	@SerializedName("is_active")
	private int isActive;

	@SerializedName("address")
	private Object address;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("role_id")
	private int roleId;

	@SerializedName("district")
	private String district;

	@SerializedName("rating")
	private int rating;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("upazila")
	private String upazila;

	public void setSpeciality(String speciality){
		this.speciality = speciality;
	}

	public String getSpeciality(){
		return speciality;
	}

	public void setIsActive(int isActive){
		this.isActive = isActive;
	}

	public int getIsActive(){
		return isActive;
	}

	public void setAddress(Object address){
		this.address = address;
	}

	public Object getAddress(){
		return address;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setRoleId(int roleId){
		this.roleId = roleId;
	}

	public int getRoleId(){
		return roleId;
	}

	public void setDistrict(String district){
		this.district = district;
	}

	public String getDistrict(){
		return district;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setUpazila(String upazila){
		this.upazila = upazila;
	}

	public String getUpazila(){
		return upazila;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"speciality = '" + speciality + '\'' + 
			",is_active = '" + isActive + '\'' + 
			",address = '" + address + '\'' + 
			",user_id = '" + userId + '\'' + 
			",role_id = '" + roleId + '\'' + 
			",district = '" + district + '\'' + 
			",rating = '" + rating + '\'' + 
			",last_name = '" + lastName + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",first_name = '" + firstName + '\'' + 
			",upazila = '" + upazila + '\'' + 
			"}";
		}
}