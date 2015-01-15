package  cn.lazyDog.model.CommonUser;


import java.io.Serializable;
import java.util.Calendar;


public class CommonUserModel { 

	/** 
	* 真实姓名
	*/ 
	private		String	name;
	/** 
	* 登录密码
	*/ 
	private		String	password;
	/** 
	* 登录名
	*/ 
	private		String	loginName;
	/** 
	* 性别
	*/ 
	private		String	gender;
	/** 
	* 联系电话
	*/ 
	private		String	phone;
	/** 
	* 邮件
	*/ 
	private		String	mail;


	public	String	 getName(){ 
		return name;
	}

	public	void	setName(String	 name){
		this.name	=	name;
	}


	public	String	 getPassword(){ 
		return password;
	}

	public	void	setPassword(String	 password){
		this.password	=	password;
	}


	public	String	 getLoginName(){ 
		return loginName;
	}

	public	void	setLoginName(String	 loginName){
		this.loginName	=	loginName;
	}


	public	String	 getGender(){ 
		return gender;
	}

	public	void	setGender(String	 gender){
		this.gender	=	gender;
	}


	public	String	 getPhone(){ 
		return phone;
	}

	public	void	setPhone(String	 phone){
		this.phone	=	phone;
	}


	public	String	 getMail(){ 
		return mail;
	}

	public	void	setMail(String	 mail){
		this.mail	=	mail;
	}


}
