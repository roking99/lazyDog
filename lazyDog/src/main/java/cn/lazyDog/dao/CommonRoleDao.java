package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.CommonRole;
import cn.lazyDog.model.CommonRole.CommonRoleModel;
import cn.lazyDog.tools.Pagination;




public interface CommonRoleDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commonRole
	 */
	void save(CommonRole commonRole);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 */
	void deleteById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commonRole
	 */
	void update(CommonRole commonRole);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	CommonRole findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commonRoleModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(CommonRoleModel commonRoleModel, int pageNo,
			int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<CommonRole> queryList(CommonRoleModel queryModel);


}
