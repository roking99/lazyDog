package  cn.lazyDog.manager.ToourScheduled;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.TourScheduled;
import cn.lazyDog.model.ToourScheduled.TourScheduledModel;


public interface TourScheduledManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(TourScheduled tourScheduled);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (TourScheduled tourScheduled) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public TourScheduled findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (TourScheduledModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<TourScheduled> queryList (TourScheduledModel queryModel) ;



}
