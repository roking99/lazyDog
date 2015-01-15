package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.CommonUser;
import cn.lazyDog.model.CommonUser.CommonUserModel;
import cn.lazyDog.tools.Pagination;




public interface CommonUserDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commonUser
	 */
	void save(CommonUser commonUser);

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
	 * @param commonUser
	 */
	void update(CommonUser commonUser);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	CommonUser findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commonUserModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(CommonUserModel commonUserModel, int pageNo,
			int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<CommonUser> queryList(CommonUserModel queryModel);


}
