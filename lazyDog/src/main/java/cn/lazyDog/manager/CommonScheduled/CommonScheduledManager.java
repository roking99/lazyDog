package  cn.lazyDog.manager.CommonScheduled;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.CommonScheduled;
import cn.lazyDog.model.CommonScheduled.CommonScheduledModel;


public interface CommonScheduledManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(CommonScheduled commonScheduled);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (CommonScheduled commonScheduled) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public CommonScheduled findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (CommonScheduledModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<CommonScheduled> queryList (CommonScheduledModel queryModel) ;



}
