package  cn.lazyDog.manager.FitNessScheduled;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.FitnessScheduled;
import cn.lazyDog.model.FitNessScheduled.FitnessScheduledModel;


public interface FitnessScheduledManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(FitnessScheduled fitnessScheduled);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (FitnessScheduled fitnessScheduled) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public FitnessScheduled findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (FitnessScheduledModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<FitnessScheduled> queryList (FitnessScheduledModel queryModel) ;



}
