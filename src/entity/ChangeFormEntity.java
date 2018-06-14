package entity;

import java.math.BigDecimal;
import java.util.Date;

public class ChangeFormEntity {

	private String id;
	
	private String baseInfoId;
	
	/**
	 * 变化属性
	 */
	private String changeAttrId;
	
	/**
	 * 标识
	 */
	private String changeAttrCode;
	
	/**
	 * 变化属性名称
	 */
	private String changeAttrName;
	/**
	 * 所属变化组
	 */
	private String changeBelong;
	
	/**
	 * 变化值
	 */
	private String changeNewVal;
	
	/**
	 * 原始值
	 */
	private String changeOldVal;
	
	/**
	 * 变化生效时间
	 */
	private Date changeTime;
	
	private String piId;
	
	private String title;
	
	private String businessProcess;
	
	/**
	 * 批次ID
	 */
	private String sid;
	
	/**
	 * 站址编码
	 */
	private String psid;

	private Integer hide;
	
	private BigDecimal status;
	
	
	public BigDecimal getStatus() {
        return status;
    }


    public void setStatus(BigDecimal status) {
        this.status = status;
    }


    public Integer getHide() {
		return hide;
	}


	public void setHide(Integer hide) {
		this.hide = hide;
	}


	public String getPsid() {
		return psid;
	}


	public void setPsid(String psid) {
		this.psid = psid;
	}


	/**
	 * 扩展数据1
	 */
	private String extend1;
	
	
	/**
	 * 扩展数据2
	 */
	private String extend2;
	
	
	/**
	 * 扩展数据3
	 */
	private String extend3;

	public String getChangeBelong() {
		return changeBelong;
	}

	public void setChangeBelong(String changeBelong) {
		this.changeBelong = changeBelong;
	}

	public String getBusinessProcess() {
		return businessProcess;
	}


	public void setBusinessProcess(String businessProcess) {
		this.businessProcess = businessProcess;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getBaseInfoId() {
		return baseInfoId;
	}


	public void setBaseInfoId(String baseInfoId) {
		this.baseInfoId = baseInfoId;
	}

	public String getChangeAttrId() {
		return changeAttrId;
	}


	public void setChangeAttrId(String changeAttrId) {
		this.changeAttrId = changeAttrId;
	}


	public String getChangeAttrName() {
		return changeAttrName;
	}


	public void setChangeAttrName(String changeAttrName) {
		this.changeAttrName = changeAttrName;
	}

	public String getChangeNewVal() {
		return changeNewVal;
	}


	public void setChangeNewVal(String changeNewVal) {
		this.changeNewVal = changeNewVal;
	}


	public String getChangeOldVal() {
		return changeOldVal;
	}


	public void setChangeOldVal(String changeOldVal) {
		this.changeOldVal = changeOldVal;
	}


	public Date getChangeTime() {
		return (Date) changeTime.clone();
	}


	public void setChangeTime(Date changeTime) {
		this.changeTime = (Date)changeTime.clone();
	}


	public String getExtend1() {
		return extend1;
	}


	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}


	public String getExtend2() {
		return extend2;
	}


	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}


	public String getExtend3() {
		return extend3;
	}


	public void setExtend3(String extend3) {
		this.extend3 = extend3;
	}

	public String getPiId() {
		return piId;
	}


	public void setPiId(String piId) {
		this.piId = piId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getChangeAttrCode() {
		return changeAttrCode;
	}


	public void setChangeAttrCode(String changeAttrCode) {
		this.changeAttrCode = changeAttrCode;
	}

}
