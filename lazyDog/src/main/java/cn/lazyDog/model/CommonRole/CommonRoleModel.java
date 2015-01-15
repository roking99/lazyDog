package  cn.lazyDog.model.CommonRole;


import java.io.Serializable;
import java.util.Calendar;


public class CommonRoleModel { 

	/** 
	* 角色名
	*/ 
	private		String	name;
	/** 
	* 创建时间
	*/ 
	private		java.util.Calendar	createDate;
	/** 
	* 描述
	*/ 
	private		String	description;
	/** 
	* 是否是管理员 1：是 0：否
	*/ 
	private		String	isAdmin;
	/** 
	* 是否功能授权 1：是 0：否
	*/ 
	private		String	isFunction;
	/** 
	* 是否数据授权 1：是 0：否
	*/ 
	private		String	isData;


	public	String	 getName(){ 
		return name;
	}

	public	void	setName(String	 name){
		this.name	=	name;
	}


	public	java.util.Calendar	 getCreateDate(){ 
		return createDate;
	}

	public	void	setCreateDate(java.util.Calendar	 createDate){
		this.createDate	=	createDate;
	}


	public	String	 getDescription(){ 
		return description;
	}

	public	void	setDescription(String	 description){
		this.description	=	description;
	}


	public	String	 getIsAdmin(){ 
		return isAdmin;
	}

	public	void	setIsAdmin(String	 isAdmin){
		this.isAdmin	=	isAdmin;
	}


	public	String	 getIsFunction(){ 
		return isFunction;
	}

	public	void	setIsFunction(String	 isFunction){
		this.isFunction	=	isFunction;
	}


	public	String	 getIsData(){ 
		return isData;
	}

	public	void	setIsData(String	 isData){
		this.isData	=	isData;
	}


}
