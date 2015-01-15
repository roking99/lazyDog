package  cn.lazyDog.manager.CommonScheduled;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.tools.Pagination;
import cn.lazyDog.dao.CommonScheduledDao;
import cn.lazyDog.entity.CommonScheduled;
import cn.lazyDog.model.CommonScheduled.CommonScheduledModel;


@Service("commonScheduledManager")
public class CommonScheduledManagerImpl implements CommonScheduledManager {

	@Autowired
	private CommonScheduledDao commonScheduledDao;

	@Override
	public void add (CommonScheduled commonScheduled) {
		// TODO Auto-generated method stub
		commonScheduledDao.save(commonScheduled);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		commonScheduledDao.deleteById(id);
	}

	@Override
	public void update (CommonScheduled commonScheduled) {
		// TODO Auto-generated method stub
		commonScheduledDao.update(commonScheduled);
	}

	@Override
	public CommonScheduled findById (String id) {
		// TODO Auto-generated method stub
		return commonScheduledDao.findById(id);
	}

	@Override
	public Pagination queryPage (CommonScheduledModel commonScheduledModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return commonScheduledDao.queryPage(commonScheduledModel, pageNo, pageSize);
	}

	@Override
	public List<CommonScheduled> queryList (CommonScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return commonScheduledDao.queryList(queryModel);
	}
 }
