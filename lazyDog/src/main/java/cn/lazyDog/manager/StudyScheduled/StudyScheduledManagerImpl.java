package  cn.lazyDog.manager.StudyScheduled;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.tools.Pagination;
import cn.lazyDog.dao.StudyScheduledDao;
import cn.lazyDog.entity.StudyScheduled;
import cn.lazyDog.model.StudyScheduled.StudyScheduledModel;


@Service("studyScheduledManager")
public class StudyScheduledManagerImpl implements StudyScheduledManager {

	@Autowired
	private StudyScheduledDao studyScheduledDao;

	@Override
	public void add (StudyScheduled studyScheduled) {
		// TODO Auto-generated method stub
		studyScheduledDao.save(studyScheduled);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		studyScheduledDao.deleteById(id);
	}

	@Override
	public void update (StudyScheduled studyScheduled) {
		// TODO Auto-generated method stub
		studyScheduledDao.update(studyScheduled);
	}

	@Override
	public StudyScheduled findById (String id) {
		// TODO Auto-generated method stub
		return studyScheduledDao.findById(id);
	}

	@Override
	public Pagination queryPage (StudyScheduledModel studyScheduledModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return studyScheduledDao.queryPage(studyScheduledModel, pageNo, pageSize);
	}

	@Override
	public List<StudyScheduled> queryList (StudyScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return studyScheduledDao.queryList(queryModel);
	}
 }
