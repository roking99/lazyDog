package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.StudyScheduledDao;
import cn.lazyDog.entity.StudyScheduled;
import cn.lazyDog.model.StudyScheduled.StudyScheduledModel;
import cn.lazyDog.tools.Pagination;


@Repository("studyScheduledDao")
public class StudyScheduledDaoImpl  implements StudyScheduledDao{

	@Override
	public void save(StudyScheduled studyScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(StudyScheduled studyScheduled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StudyScheduled findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(StudyScheduledModel studyScheduledModel,
			int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudyScheduled> queryList(StudyScheduledModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
