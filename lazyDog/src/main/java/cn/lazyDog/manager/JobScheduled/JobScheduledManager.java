package  cn.lazyDog.manager.JobScheduled;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.JobScheduled;
import cn.lazyDog.model.JobScheduled.JobScheduledModel;


public interface JobScheduledManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(JobScheduled jobScheduled);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (JobScheduled jobScheduled) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public JobScheduled findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (JobScheduledModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<JobScheduled> queryList (JobScheduledModel queryModel) ;



}
