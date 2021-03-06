package com.las.WebData.entity;
// Generated 2017-9-30 14:53:59 by Hibernate Tools 5.2.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Aiaaproduct generated by hbm2java
 */
@Entity
@Table(name = "AIAAProduct", catalog = "WebData")
public class Aiaaproduct implements java.io.Serializable {

	private Integer id;
	private String aiaaproductType;
	private String aiaaedition;
	private String aiaaproductIntroduction;
	private String aiaaproductName;
	private String aiaaproductrUrl;
	private String aiaaissn;
	private String aiaaeissn;
	private String aiaaproductPicUrl;
	private byte[] aiaaproductPic;
	private String aiaaproductPicName;
	private String aiaaproductDescription;
	private Date createtime;//****************
	private Date updatetime;//****************
	private Set<AiaaproductsEditor> aiaaproductsEditors = new HashSet<AiaaproductsEditor>(0);

	public Aiaaproduct() {
	}

	public Aiaaproduct(String aiaaproductType, String aiaaedition, String aiaaproductIntroduction,
			String aiaaproductName, String aiaaproductrUrl, String aiaaissn, String aiaaeissn, String aiaaproductPicUrl,
			byte[] aiaaproductPic, String aiaaproductPicName, String aiaaproductDescription, Date createtime,
			Date updatetime, Set<AiaaproductsEditor> aiaaproductsEditors) {
		this.aiaaproductType = aiaaproductType;
		this.aiaaedition = aiaaedition;
		this.aiaaproductIntroduction = aiaaproductIntroduction;
		this.aiaaproductName = aiaaproductName;
		this.aiaaproductrUrl = aiaaproductrUrl;
		this.aiaaissn = aiaaissn;
		this.aiaaeissn = aiaaeissn;
		this.aiaaproductPicUrl = aiaaproductPicUrl;
		this.aiaaproductPic = aiaaproductPic;
		this.aiaaproductPicName = aiaaproductPicName;
		this.aiaaproductDescription = aiaaproductDescription;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.aiaaproductsEditors = aiaaproductsEditors;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "AIAAProductType", length = 50)
	public String getAiaaproductType() {
		return this.aiaaproductType;
	}

	public void setAiaaproductType(String aiaaproductType) {
		this.aiaaproductType = aiaaproductType;
	}

	@Column(name = "AIAAEdition", length = 500)
	public String getAiaaedition() {
		return this.aiaaedition;
	}

	public void setAiaaedition(String aiaaedition) {
		this.aiaaedition = aiaaedition;
	}

	@Column(name = "AIAAProductIntroduction", length = 500)
	public String getAiaaproductIntroduction() {
		return this.aiaaproductIntroduction;
	}

	public void setAiaaproductIntroduction(String aiaaproductIntroduction) {
		this.aiaaproductIntroduction = aiaaproductIntroduction;
	}

	@Column(name = "AIAAProductName", length = 500)
	public String getAiaaproductName() {
		return this.aiaaproductName;
	}

	public void setAiaaproductName(String aiaaproductName) {
		this.aiaaproductName = aiaaproductName;
	}

	@Column(name = "AIAAProductrURL", length = 500)
	public String getAiaaproductrUrl() {
		return this.aiaaproductrUrl;
	}

	public void setAiaaproductrUrl(String aiaaproductrUrl) {
		this.aiaaproductrUrl = aiaaproductrUrl;
	}

	@Column(name = "AIAAISSN")
	public String getAiaaissn() {
		return this.aiaaissn;
	}

	public void setAiaaissn(String aiaaissn) {
		this.aiaaissn = aiaaissn;
	}

	@Column(name = "AIAAEISSN")
	public String getAiaaeissn() {
		return this.aiaaeissn;
	}

	public void setAiaaeissn(String aiaaeissn) {
		this.aiaaeissn = aiaaeissn;
	}

	@Column(name = "AIAAProductPicUrl", length = 500)
	public String getAiaaproductPicUrl() {
		return this.aiaaproductPicUrl;
	}

	public void setAiaaproductPicUrl(String aiaaproductPicUrl) {
		this.aiaaproductPicUrl = aiaaproductPicUrl;
	}

	@Column(name = "AIAAProductPic")
	public byte[] getAiaaproductPic() {
		return this.aiaaproductPic;
	}

	public void setAiaaproductPic(byte[] aiaaproductPic) {
		this.aiaaproductPic = aiaaproductPic;
	}

	@Column(name = "AIAAProductPicName")
	public String getAiaaproductPicName() {
		return this.aiaaproductPicName;
	}

	public void setAiaaproductPicName(String aiaaproductPicName) {
		this.aiaaproductPicName = aiaaproductPicName;
	}

	@Column(name = "AIAAProductDescription")
	public String getAiaaproductDescription() {
		return this.aiaaproductDescription;
	}

	public void setAiaaproductDescription(String aiaaproductDescription) {
		this.aiaaproductDescription = aiaaproductDescription;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Createtime", length = 19)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Updatetime", length = 19)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aiaaproduct")
	public Set<AiaaproductsEditor> getAiaaproductsEditors() {
		return this.aiaaproductsEditors;
	}

	public void setAiaaproductsEditors(Set<AiaaproductsEditor> aiaaproductsEditors) {
		this.aiaaproductsEditors = aiaaproductsEditors;
	}

}
