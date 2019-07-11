package com.objProd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_OBJ_ITEM")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemMng implements Serializable {
	
	private static final long SerialVersionUID=1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="OBJ_KEY",precision = 1)
	private int objKey;
	
	@Column(name="ITEM_KEY",length = 50)
	private String itemKey;
	
	@Column(name="ITEM_KEY_NM",length = 100)
	private String itemkeyNm;
	
	@Column(name="ITEM_KEY_DESC",length = 1000)
	private String itemKeyDesc;

	@Column(name="ITEM_INS_YMD",length = 8)
	private String itemInsYmd;
	
	@Column(name="INS_ID",length = 10)
	private String insId;
	
	@Column(name="INS_IP",length = 20)
	private String insIp;
	
	@Column(name="INS_DATE",length = 14)
	private String insDate;
	
	@Column(name="MOD_ID",length = 10)
	private String modId;
	
	@Column(name="MOD_DATE",length = 14)
	private String modDate;

	public int getObjKey() {
		return objKey;
	}

	public void setObjKey(int objKey) {
		this.objKey = objKey;
	}

	public String getItemKey() {
		return itemKey;
	}

	public void setItemKey(String itemKey) {
		this.itemKey = itemKey;
	}

	public String getItemkeyNm() {
		return itemkeyNm;
	}

	public void setItemkeyNm(String itemkeyNm) {
		this.itemkeyNm = itemkeyNm;
	}

	public String getItemKeyDesc() {
		return itemKeyDesc;
	}

	public void setItemKeyDesc(String itemKeyDesc) {
		this.itemKeyDesc = itemKeyDesc;
	}

	public String getItemInsYmd() {
		return itemInsYmd;
	}

	public void setItemInsYmd(String itemInsYmd) {
		this.itemInsYmd = itemInsYmd;
	}

	public String getInsId() {
		return insId;
	}

	public void setInsId(String insId) {
		this.insId = insId;
	}

	public String getInsIp() {
		return insIp;
	}

	public void setInsIp(String insIp) {
		this.insIp = insIp;
	}

	public String getInsDate() {
		return insDate;
	}

	public void setInsDate(String insDate) {
		this.insDate = insDate;
	}

	public String getModId() {
		return modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}


}