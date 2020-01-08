package com.yue.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbKe implements Serializable{
    private Integer id;

    private String keId;

    private String name;

    private String type;

    private String price;

    private String teacher;

    private String images;

    private String kkDate;

    private Integer status;

	public TbKe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TbKe(Integer id, String keId, String name, String type, String price, String teacher, String images,
			String kkDate, Integer status) {
		super();
		this.id = id;
		this.keId = keId;
		this.name = name;
		this.type = type;
		this.price = price;
		this.teacher = teacher;
		this.images = images;
		this.kkDate = kkDate;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeId() {
		return keId;
	}

	public void setKeId(String keId) {
		this.keId = keId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getKkDate() {
		return kkDate;
	}

	public void setKkDate(String kkDate) {
		this.kkDate = kkDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
    

}