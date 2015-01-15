package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.JobScheduledDao;
import cn.lazyDog.entity.JobScheduled;
import cn.lazyDog.model.JobScheduled.JobScheduledModel;
import cn.lazyDog.tools.Pagination;


@Repository("jobScheduledDao")
public class JobScheduledDaoImpl  implements JobScheduledDao{

	@Override
	public void save(JobScheduled jobScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(JobScheduled jobScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JobScheduled findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(JobScheduledModel jobScheduledModel,
			int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobScheduled> queryList(JobScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
