package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.CommonScheduledDao;
import cn.lazyDog.entity.CommonScheduled;
import cn.lazyDog.model.CommonScheduled.CommonScheduledModel;
import cn.lazyDog.tools.Pagination;


@Repository("commonScheduledDao")
public class CommonScheduledDaoImpl  implements CommonScheduledDao{

	@Override
	public void save(CommonScheduled commonScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CommonScheduled commonScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CommonScheduled findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(CommonScheduledModel commonScheduledModel,
			int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommonScheduled> queryList(CommonScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
