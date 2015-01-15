package  cn.lazyDog.manager.SchduledCategory;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.CommmonScheduledCategory;
import cn.lazyDog.model.SchduledCategory.CommmonScheduledCategoryModel;


public interface CommmonScheduledCategoryManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(CommmonScheduledCategory commmonScheduledCategory);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (CommmonScheduledCategory commmonScheduledCategory) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public CommmonScheduledCategory findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (CommmonScheduledCategoryModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<CommmonScheduledCategory> queryList (CommmonScheduledCategoryModel queryModel) ;



}
