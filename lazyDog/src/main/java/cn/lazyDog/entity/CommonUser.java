package  cn.lazyDog.entity;



import cn.lazyDog.base.BaseEntity;


public class CommonUser extends BaseEntity { 

	private		String	name;
	private		String	password;
	private		String	loginName;
	private		String	gender;
	private		String	phone;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}
