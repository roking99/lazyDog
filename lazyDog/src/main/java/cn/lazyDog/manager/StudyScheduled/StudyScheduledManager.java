package  cn.lazyDog.manager.StudyScheduled;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.StudyScheduled;
import cn.lazyDog.model.StudyScheduled.StudyScheduledModel;


public interface StudyScheduledManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(StudyScheduled studyScheduled);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (StudyScheduled studyScheduled) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public StudyScheduled findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (StudyScheduledModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<StudyScheduled> queryList (StudyScheduledModel queryModel) ;



}
