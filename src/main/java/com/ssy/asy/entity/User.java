package com.ssy.asy.entity;


public class User {
	private Integer id;
	private String lastname;
	private String workcode;
	private String mobile;
	private String email;
	private String password;
	private String jobtitles;
	private String joblevel;
	private Integer department;
	private Integer subcompany;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id, String lastname, String workcode, String mobile, String email, String password,
			String jobtitles, String joblevel, Integer department, Integer subcompany) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.workcode = workcode;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.jobtitles = jobtitles;
		this.joblevel = joblevel;
		this.department = department;
		this.subcompany = subcompany;
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the workcode
	 */
	public String getWorkcode() {
		return workcode;
	}
	/**
	 * @param workcode the workcode to set
	 */
	public void setWorkcode(String workcode) {
		this.workcode = workcode;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the jobtitles
	 */
	public String getJobtitles() {
		return jobtitles;
	}
	/**
	 * @param jobtitles the jobtitles to set
	 */
	public void setJobtitles(String jobtitles) {
		this.jobtitles = jobtitles;
	}
	/**
	 * @return the joblevel
	 */
	public String getJoblevel() {
		return joblevel;
	}
	/**
	 * @param joblevel the joblevel to set
	 */
	public void setJoblevel(String joblevel) {
		this.joblevel = joblevel;
	}
	/**
	 * @return the department
	 */
	public Integer getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Integer department) {
		this.department = department;
	}
	/**
	 * @return the subcompany
	 */
	public Integer getSubcompany() {
		return subcompany;
	}
	/**
	 * @param subcompany the subcompany to set
	 */
	public void setSubcompany(Integer subcompany) {
		this.subcompany = subcompany;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", lastname=" + lastname + ", workcode=" + workcode + ", mobile=" + mobile
				+ ", email=" + email + ", password=" + password + ", jobtitles=" + jobtitles + ", joblevel=" + joblevel
				+ ", department=" + department + ", subcompany=" + subcompany + "]";
	}
	
	
	
}
