package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.FitnessScheduledDao;
import cn.lazyDog.entity.FitnessScheduled;
import cn.lazyDog.model.FitNessScheduled.FitnessScheduledModel;
import cn.lazyDog.tools.Pagination;


@Repository("fitnessScheduledDao")
public class FitnessScheduledDaoImpl  implements FitnessScheduledDao{

	@Override
	public void save(FitnessScheduled fitnessScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FitnessScheduled fitnessScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FitnessScheduled findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(FitnessScheduledModel fitnessScheduledModel,
			int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FitnessScheduled> queryList(FitnessScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
