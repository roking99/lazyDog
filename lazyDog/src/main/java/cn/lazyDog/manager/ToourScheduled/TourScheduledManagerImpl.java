package  cn.lazyDog.manager.ToourScheduled;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.tools.Pagination;
import cn.lazyDog.dao.TourScheduledDao;
import cn.lazyDog.entity.TourScheduled;
import cn.lazyDog.model.ToourScheduled.TourScheduledModel;


@Service("tourScheduledManager")
public class TourScheduledManagerImpl implements TourScheduledManager {

	@Autowired
	private TourScheduledDao tourScheduledDao;

	@Override
	public void add (TourScheduled tourScheduled) {
		// TODO Auto-generated method stub
		tourScheduledDao.save(tourScheduled);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		tourScheduledDao.deleteById(id);
	}

	@Override
	public void update (TourScheduled tourScheduled) {
		// TODO Auto-generated method stub
		tourScheduledDao.update(tourScheduled);
	}

	@Override
	public TourScheduled findById (String id) {
		// TODO Auto-generated method stub
		return tourScheduledDao.findById(id);
	}

	@Override
	public Pagination queryPage (TourScheduledModel tourScheduledModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return tourScheduledDao.queryPage(tourScheduledModel, pageNo, pageSize);
	}

	@Override
	public List<TourScheduled> queryList (TourScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return tourScheduledDao.queryList(queryModel);
	}
 }
