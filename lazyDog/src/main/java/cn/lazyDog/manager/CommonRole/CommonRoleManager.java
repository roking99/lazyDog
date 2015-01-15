package  cn.lazyDog.manager.CommonRole;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.CommonRole;
import cn.lazyDog.model.CommonRole.CommonRoleModel;


public interface CommonRoleManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(CommonRole commonRole);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (CommonRole commonRole) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public CommonRole findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (CommonRoleModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<CommonRole> queryList (CommonRoleModel queryModel) ;



}
