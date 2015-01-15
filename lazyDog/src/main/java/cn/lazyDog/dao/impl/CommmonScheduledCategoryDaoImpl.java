package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.CommmonScheduledCategoryDao;
import cn.lazyDog.entity.CommmonScheduledCategory;
import cn.lazyDog.model.SchduledCategory.CommmonScheduledCategoryModel;
import cn.lazyDog.tools.Pagination;


@Repository("commmonScheduledCategoryDao")
public class CommmonScheduledCategoryDaoImpl  implements CommmonScheduledCategoryDao{

	@Override
	public CommmonScheduledCategory findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(CommmonScheduledCategory commmonScheduledCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CommmonScheduledCategory commmonScheduledCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pagination queryPage(
			CommmonScheduledCategoryModel commmonScheduledCategoryModel,
			int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommmonScheduledCategory> queryList(
			CommmonScheduledCategoryModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
