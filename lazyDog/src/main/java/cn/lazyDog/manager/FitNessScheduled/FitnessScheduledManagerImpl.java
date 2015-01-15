package  cn.lazyDog.manager.FitNessScheduled;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.tools.Pagination;
import cn.lazyDog.dao.FitnessScheduledDao;
import cn.lazyDog.entity.FitnessScheduled;
import cn.lazyDog.model.FitNessScheduled.FitnessScheduledModel;


@Service("fitnessScheduledManager")
public class FitnessScheduledManagerImpl implements FitnessScheduledManager {

	@Autowired
	private FitnessScheduledDao fitnessScheduledDao;

	@Override
	public void add (FitnessScheduled fitnessScheduled) {
		// TODO Auto-generated method stub
		fitnessScheduledDao.save(fitnessScheduled);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		fitnessScheduledDao.deleteById(id);
	}

	@Override
	public void update (FitnessScheduled fitnessScheduled) {
		// TODO Auto-generated method stub
		fitnessScheduledDao.update(fitnessScheduled);
	}

	@Override
	public FitnessScheduled findById (String id) {
		// TODO Auto-generated method stub
		return fitnessScheduledDao.findById(id);
	}

	@Override
	public Pagination queryPage (FitnessScheduledModel fitnessScheduledModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return fitnessScheduledDao.queryPage(fitnessScheduledModel, pageNo, pageSize);
	}

	@Override
	public List<FitnessScheduled> queryList (FitnessScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return fitnessScheduledDao.queryList(queryModel);
	}
 }
