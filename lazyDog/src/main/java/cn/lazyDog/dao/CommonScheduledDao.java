package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.CommonScheduled;
import cn.lazyDog.model.CommonScheduled.CommonScheduledModel;
import cn.lazyDog.tools.Pagination;




public interface CommonScheduledDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commonScheduled
	 */
	void save(CommonScheduled commonScheduled);

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
	 * @param commonScheduled
	 */
	void update(CommonScheduled commonScheduled);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	CommonScheduled findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commonScheduledModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(CommonScheduledModel commonScheduledModel, int pageNo,
			int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<CommonScheduled> queryList(CommonScheduledModel queryModel);


}
