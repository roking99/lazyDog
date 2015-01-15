package  cn.lazyDog.entity;



import cn.lazyDog.base.BaseEntity;


public class CommmonScheduledCategory extends BaseEntity { 

	private		String	name;
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

	/* (non-Javadoc)
	 * @see cn.lazyDog.base.BaseEntity#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}
