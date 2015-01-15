package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.TourScheduledDao;
import cn.lazyDog.entity.TourScheduled;
import cn.lazyDog.model.ToourScheduled.TourScheduledModel;
import cn.lazyDog.tools.Pagination;


@Repository("tourScheduledDao")
public class TourScheduledDaoImpl  implements TourScheduledDao{

	@Override
	public void save(TourScheduled tourScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TourScheduled tourScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TourScheduled findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(TourScheduledModel tourScheduledModel,
			int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TourScheduled> queryList(TourScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
