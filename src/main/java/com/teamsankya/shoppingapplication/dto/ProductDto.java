package com.teamsankya.shoppingapplication.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_table")
public class ProductDto implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="TABLE_GEN")
	@Column(name = "pId")
	private String pId;
	@Column(name = "pName")
	private String pName;
	@Column(name = "pPrice")
	private double pPrice;
	@Column(name = "pDescription")
	private String pDescription;
	@Column(name = "pCompany")
	private String pCompany;

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public String getpCompany() {
		return pCompany;
	}

	public void setpCompany(String pCompany) {
		this.pCompany = pCompany;
	}

	@Override
	public String toString() {
		return "ProductDto [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pDescription=" + pDescription
				+ ", pCompany=" + pCompany + "]";
	}

}
