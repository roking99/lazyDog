package  cn.lazyDog.entity;



import cn.lazyDog.base.BaseEntity;


public class CommonScheduled extends BaseEntity { 

	private		String	name;
	private		String	content;
	private		java.util.Calendar	createTime;
	private		java.util.Calendar	endTime;
	private		java.util.Calendar	scheduledBeginTime;
	private		java.util.Calendar	scheduledEndTime;
	private		String	type;
	private		java.util.Calendar	beginTime;
	private		String	progress;
	private		String	round;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}
