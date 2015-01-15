package  cn.lazyDog.entity;



import cn.lazyDog.base.BaseEntity;


public class JobScheduled extends BaseEntity { 

	private		String	name;
	private		String	round;
	private		String	target;
	private		int	scheduledSource;


	public	String	 getName(){ 
		return name;
	}

	public	void	setName(String	 name){
		this.name	=	name;
	}


	public	String	 getRound(){ 
		return round;
	}

	public	void	setRound(String	 round){
		this.round	=	round;
	}


	public	String	 getTarget(){ 
		return target;
	}

	public	void	setTarget(String	 target){
		this.target	=	target;
	}


	public	int	 getScheduledSource(){ 
		return scheduledSource;
	}

	public	void	setScheduledSource(int	 scheduledSource){
		this.scheduledSource	=	scheduledSource;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}
