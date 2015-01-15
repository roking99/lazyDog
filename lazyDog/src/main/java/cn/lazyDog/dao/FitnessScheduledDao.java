package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.FitnessScheduled;
import cn.lazyDog.model.FitNessScheduled.FitnessScheduledModel;
import cn.lazyDog.tools.Pagination;




public interface FitnessScheduledDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param fitnessScheduled
	 */
	void save(FitnessScheduled fitnessScheduled);

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
	 * @param fitnessScheduled
	 */
	void update(FitnessScheduled fitnessScheduled);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	FitnessScheduled findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param fitnessScheduledModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(FitnessScheduledModel fitnessScheduledModel,
			int pageNo, int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<FitnessScheduled> queryList(FitnessScheduledModel queryModel);


}
