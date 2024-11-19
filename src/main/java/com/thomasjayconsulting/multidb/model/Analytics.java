package com.thomasjayconsulting.multidb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Analytics {
    @Id
    private String id; // Auto assigned by MongoDB

    private String userId;
    private Long userLoginCount;
	public Analytics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Analytics(String id, String userId, Long userLoginCount) {
		super();
		this.id = id;
		this.userId = userId;
		this.userLoginCount = userLoginCount;
	}
	@Override
	public String toString() {
		return "Analytics [id=" + id + ", userId=" + userId + ", userLoginCount=" + userLoginCount + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getUserLoginCount() {
		return userLoginCount;
	}
	public void setUserLoginCount(Long userLoginCount) {
		this.userLoginCount = userLoginCount;
	}
    
    

}
