package com.ocx.domain;

/**
 * ���֤��Ϣ
 *
 * 2016��8��3��
 */
public class IdCardInfo {

	/**
	 * ���֤��
	 */
	private String idCode;
	
	/**
	 * ����
	 */
	private String username;
	
	/**
	 * �Ա�
	 */
	private String sex;
	
	/**
	 * ��Ƭbase64�ַ���
	 */
	private String photoData;

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhotoData() {
		return photoData;
	}

	public void setPhotoData(String photoData) {
		this.photoData = photoData;
	}

}
