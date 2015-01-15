package  cn.lazyDog.entity;



import cn.lazyDog.base.BaseEntity;


public class SystemLog extends BaseEntity { 

	private		String	userName;
	private		java.util.Calendar	createDate;
	private		String	ip;
	private		String	content;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}
