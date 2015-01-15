package  cn.lazyDog.model.CommonScheduled;


import java.io.Serializable;
import java.util.Calendar;


public class CommonScheduledModel { 

	/** 
	* 计划名
	*/ 
	private		String	name;
	/** 
	* 计划内容
	*/ 
	private		String	content;
	/** 
	* 计划创建时间
	*/ 
	private		java.util.Calendar	createTime;
	/** 
	* 实际结束时间
	*/ 
	private		java.util.Calendar	endTime;
	/** 
	* 预计开始时间
	*/ 
	private		java.util.Calendar	scheduledBeginTime;
	/** 
	* 预计结束时间
	*/ 
	private		java.util.Calendar	scheduledEndTime;
	/** 
	* 计划类型
	*/ 
	private		String	type;
	/** 
	* 实际开始时间
	*/ 
	private		java.util.Calendar	beginTime;
	/** 
	* 计划执行进度
	*/ 
	private		String	progress;
	/** 
	* 计划周期
	*/ 
	private		String	round;
	/** 
	* 计划类别，外键 关联计划类别表ID
	*/ 
	private		String	category;


	public	String	 getName(){ 
		return name;
	}

	public	void	setName(String	 name){
		this.name	=	name;
	}


	public	String	 getContent(){ 
		return content;
	}

	public	void	setContent(String	 content){
		this.content	=	content;
	}


	public	java.util.Calendar	 getCreateTime(){ 
		return createTime;
	}

	public	void	setCreateTime(java.util.Calendar	 createTime){
		this.createTime	=	createTime;
	}


	public	java.util.Calendar	 getEndTime(){ 
		return endTime;
	}

	public	void	setEndTime(java.util.Calendar	 endTime){
		this.endTime	=	endTime;
	}


	public	java.util.Calendar	 getScheduledBeginTime(){ 
		return scheduledBeginTime;
	}

	public	void	setScheduledBeginTime(java.util.Calendar	 scheduledBeginTime){
		this.scheduledBeginTime	=	scheduledBeginTime;
	}


	public	java.util.Calendar	 getScheduledEndTime(){ 
		return scheduledEndTime;
	}

	public	void	setScheduledEndTime(java.util.Calendar	 scheduledEndTime){
		this.scheduledEndTime	=	scheduledEndTime;
	}


	public	String	 getType(){ 
		return type;
	}

	public	void	setType(String	 type){
		this.type	=	type;
	}


	public	java.util.Calendar	 getBeginTime(){ 
		return beginTime;
	}

	public	void	setBeginTime(java.util.Calendar	 beginTime){
		this.beginTime	=	beginTime;
	}


	public	String	 getProgress(){ 
		return progress;
	}

	public	void	setProgress(String	 progress){
		this.progress	=	progress;
	}


	public	String	 getRound(){ 
		return round;
	}

	public	void	setRound(String	 round){
		this.round	=	round;
	}


	public	String	 getCategory(){ 
		return category;
	}

	public	void	setCategory(String	 category){
		this.category	=	category;
	}


}
