package  cn.lazyDog.model.SystemLog;


import java.io.Serializable;
import java.util.Calendar;


public class SystemLogModel { 

	/** 
	* 用户名
	*/ 
	private		String	userName;
	/** 
	* 生成时间
	*/ 
	private		java.util.Calendar	createDate;
	/** 
	* IP地址
	*/ 
	private		String	ip;
	/** 
	* 日志内容
	*/ 
	private		String	content;
	/** 
	* 操作模块
	*/ 
	private		String	model;


	public	String	 getUserName(){ 
		return userName;
	}

	public	void	setUserName(String	 userName){
		this.userName	=	userName;
	}


	public	java.util.Calendar	 getCreateDate(){ 
		return createDate;
	}

	public	void	setCreateDate(java.util.Calendar	 createDate){
		this.createDate	=	createDate;
	}


	public	String	 getIp(){ 
		return ip;
	}

	public	void	setIp(String	 ip){
		this.ip	=	ip;
	}


	public	String	 getContent(){ 
		return content;
	}

	public	void	setContent(String	 content){
		this.content	=	content;
	}


	public	String	 getModel(){ 
		return model;
	}

	public	void	setModel(String	 model){
		this.model	=	model;
	}


}
