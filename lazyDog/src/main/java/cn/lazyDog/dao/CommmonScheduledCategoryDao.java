package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.CommmonScheduledCategory;
import cn.lazyDog.model.SchduledCategory.CommmonScheduledCategoryModel;
import cn.lazyDog.tools.Pagination;




public interface CommmonScheduledCategoryDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	CommmonScheduledCategory findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commmonScheduledCategory
	 */
	void save(CommmonScheduledCategory commmonScheduledCategory);

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
	 * @param commmonScheduledCategory
	 */
	void update(CommmonScheduledCategory commmonScheduledCategory);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param commmonScheduledCategoryModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(
			CommmonScheduledCategoryModel commmonScheduledCategoryModel,
			int pageNo, int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<CommmonScheduledCategory> queryList(
			CommmonScheduledCategoryModel queryModel);


}
