package  cn.lazyDog.dao;



import java.util.List;

import cn.lazyDog.entity.JobScheduled;
import cn.lazyDog.model.JobScheduled.JobScheduledModel;
import cn.lazyDog.tools.Pagination;




public interface JobScheduledDao {

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param jobScheduled
	 */
	void save(JobScheduled jobScheduled);

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
	 * @param jobScheduled
	 */
	void update(JobScheduled jobScheduled);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param id
	 * @return
	 */
	JobScheduled findById(String id);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param jobScheduledModel
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	Pagination queryPage(JobScheduledModel jobScheduledModel, int pageNo,
			int pageSize);

	/**
	 * @author LuoJin
	 * @data   2015年1月15日
	 *
	 * @param queryModel
	 * @return
	 */
	List<JobScheduled> queryList(JobScheduledModel queryModel);


}
