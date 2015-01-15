package  cn.lazyDog.model.FitNessScheduled;


import java.io.Serializable;
import java.util.Calendar;


public class FitnessScheduledModel { 

	/** 
	* 名称
	*/ 
	private		String	name;
	/** 
	* 周期
	*/ 
	private		String	round;
	/** 
	* 目标
	*/ 
	private		String	target;
	/** 
	* 计划来源；0：系统推荐;1：用户自定义
	*/ 
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


}
