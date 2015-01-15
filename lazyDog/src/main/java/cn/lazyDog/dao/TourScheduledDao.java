package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.TourScheduled;
import cn.lazyDog.model.ToourScheduled.TourScheduledModel;
import cn.lazyDog.tools.Pagination;




public interface TourScheduledDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param tourScheduled
	 */
	void save(TourScheduled tourScheduled);

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
	 * @param tourScheduled
	 */
	void update(TourScheduled tourScheduled);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	TourScheduled findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param tourScheduledModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(TourScheduledModel tourScheduledModel, int pageNo,
			int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<TourScheduled> queryList(TourScheduledModel queryModel);


}
