package  cn.lazyDog.manager.JobScheduled;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.tools.Pagination;
import cn.lazyDog.dao.JobScheduledDao;
import cn.lazyDog.entity.JobScheduled;
import cn.lazyDog.model.JobScheduled.JobScheduledModel;


@Service("jobScheduledManager")
public class JobScheduledManagerImpl implements JobScheduledManager {

	@Autowired
	private JobScheduledDao jobScheduledDao;

	@Override
	public void add (JobScheduled jobScheduled) {
		// TODO Auto-generated method stub
		jobScheduledDao.save(jobScheduled);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		jobScheduledDao.deleteById(id);
	}

	@Override
	public void update (JobScheduled jobScheduled) {
		// TODO Auto-generated method stub
		jobScheduledDao.update(jobScheduled);
	}

	@Override
	public JobScheduled findById (String id) {
		// TODO Auto-generated method stub
		return jobScheduledDao.findById(id);
	}

	@Override
	public Pagination queryPage (JobScheduledModel jobScheduledModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return jobScheduledDao.queryPage(jobScheduledModel, pageNo, pageSize);
	}

	@Override
	public List<JobScheduled> queryList (JobScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return jobScheduledDao.queryList(queryModel);
	}
 }
