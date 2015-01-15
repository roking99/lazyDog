package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.StudyScheduled;
import cn.lazyDog.model.StudyScheduled.StudyScheduledModel;
import cn.lazyDog.tools.Pagination;




public interface StudyScheduledDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param studyScheduled
	 */
	void save(StudyScheduled studyScheduled);

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
	 * @param studyScheduled
	 */
	void update(StudyScheduled studyScheduled);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	StudyScheduled findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param studyScheduledModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(StudyScheduledModel studyScheduledModel, int pageNo,
			int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<StudyScheduled> queryList(StudyScheduledModel queryModel);


}
