package  cn.lazyDog.manager.CommonUser;



import cn.lazyDog.tools.Pagination;
import cn.lazyDog.entity.CommonUser;
import cn.lazyDog.model.CommonUser.CommonUserModel;


public interface CommonUserManager { 



	/** 
	*   add  
	* @throws ManagerException 
	*/ 
	 public void add(CommonUser commonUser);


	/** 
	*   delete  
	* @throws ManagerException 
	*/ 
	 public void deleteById (String id);


	/** 
	*   update  
	* @throws ManagerException 
	*/ 
	 public void update (CommonUser commonUser) ;


	/** 
	*   According to the ID query 
	* @throws ManagerException 
	*/ 
	 public CommonUser findById (String id) ;


	/** 
	*   queryPage  
	* @throws ManagerException 
	*/ 
	 public Pagination queryPage (CommonUserModel queryModel ,int pageNo, int pageSize);


	/** 
	*   queryList  
	* @throws ManagerException 
	*/ 
	 public java.util.List<CommonUser> queryList (CommonUserModel queryModel) ;



}
