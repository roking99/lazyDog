package  cn.lazyDog.model.SchduledCategory;


import java.io.Serializable;
import java.util.Calendar;


public class CommmonScheduledCategoryModel { 

	/** 
	* 
	*/ 
	private		String	name;
	/** 
	* 是否系统提供；1：是，0：否
	*/ 
	private		int	isSystem;


	public	String	 getName(){ 
		return name;
	}

	public	void	setName(String	 name){
		this.name	=	name;
	}


	public	int	 getIsSystem(){ 
		return isSystem;
	}

	public	void	setIsSystem(int	 isSystem){
		this.isSystem	=	isSystem;
	}


}
