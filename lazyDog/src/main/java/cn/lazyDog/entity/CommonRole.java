package  cn.lazyDog.entity;



import cn.lazyDog.base.BaseEntity;


public class CommonRole extends BaseEntity { 

	private		String	name;
	private		java.util.Calendar	createDate;
	private		String	description;
	private		String	isAdmin;
	private		String	isFunction;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}
