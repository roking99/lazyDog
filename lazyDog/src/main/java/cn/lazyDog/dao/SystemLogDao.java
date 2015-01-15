package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.SystemLog;
import cn.lazyDog.model.SystemLog.SystemLogModel;
import cn.lazyDog.tools.Pagination;




public interface SystemLogDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param systemLog
	 */
	void save(SystemLog systemLog);

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
	 * @param systemLog
	 */
	void update(SystemLog systemLog);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	SystemLog findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param systemLogModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(SystemLogModel systemLogModel, int pageNo, int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<SystemLog> queryList(SystemLogModel queryModel);


}
