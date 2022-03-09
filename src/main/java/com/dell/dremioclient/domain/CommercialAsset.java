package com.dell.dremioclient.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * @author Namrata_Kumari
 *
 */
@Data
@ToString
@Entity
@Table(name = "TABLE_NAME", schema = "SCHEMA_NAME")
public class CommercialAsset implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7845889010051348750L;
	
	@Id
	@Column(name = "ASSET_ID")
	private String assetId;
	
	@Column(name = "ACCNT_ID")
	private Long accountId;
	
	@Column(name = "ACCNT_NAME")
	private String accntName;
	
	@Column(name = "SITE_ID")
	private Long siteId;
	
	@Column(name = "CUSTOM_SITE_NAME")
	private String siteName;
	
	@Column(name = "GROUP_ID")
	private Long groupId;
	
	@Column(name = "GROUP_NAME")
	private String groupName;
	
	@Column(name = "WARRANTY_CODE")
	private String warrantyCode;
	
	@Column(name = "WARRANTY_DESC")
	private String warrantyDesc;
	
	@Column(name = "CNTRCT_END_DATE_GMT")
	private Date expiryDate;

	@Column(name = "SAC_VERSION")
	private String sacVersion;
}
