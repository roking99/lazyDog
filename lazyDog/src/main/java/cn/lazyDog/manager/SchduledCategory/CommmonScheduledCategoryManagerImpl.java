package  cn.lazyDog.manager.SchduledCategory;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.dao.CommmonScheduledCategoryDao;
import cn.lazyDog.entity.CommmonScheduledCategory;
import cn.lazyDog.model.SchduledCategory.CommmonScheduledCategoryModel;
import cn.lazyDog.tools.Pagination;


@Service("commmonScheduledCategoryManager")
public class CommmonScheduledCategoryManagerImpl implements CommmonScheduledCategoryManager {

	@Autowired
	private CommmonScheduledCategoryDao commmonScheduledCategoryDao;

	@Override
	public void add (CommmonScheduledCategory commmonScheduledCategory) {
		// TODO Auto-generated method stub
		commmonScheduledCategoryDao.save(commmonScheduledCategory);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		commmonScheduledCategoryDao.deleteById(id);
	}

	@Override
	public void update (CommmonScheduledCategory commmonScheduledCategory) {
		// TODO Auto-generated method stub
		commmonScheduledCategoryDao.update(commmonScheduledCategory);
	}

	@Override
	public CommmonScheduledCategory findById (String id) {
		// TODO Auto-generated method stub
		return commmonScheduledCategoryDao.findById(id);
	}

	@Override
	public Pagination queryPage (CommmonScheduledCategoryModel commmonScheduledCategoryModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return commmonScheduledCategoryDao.queryPage(commmonScheduledCategoryModel, pageNo, pageSize);
	}

	@Override
	public List<CommmonScheduledCategory> queryList (CommmonScheduledCategoryModel queryModel) {
		// TODO Auto-generated method stub
		return commmonScheduledCategoryDao.queryList(queryModel);
	}
 }
