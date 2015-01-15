package  cn.lazyDog.manager.SystemLog;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.SystemLog;
import cn.lazyDog.model.SystemLog.SystemLogModel;


public interface SystemLogManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(SystemLog systemLog);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (SystemLog systemLog) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public SystemLog findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (SystemLogModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<SystemLog> queryList (SystemLogModel queryModel) ;



}
