package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.SystemLogDao;
import cn.lazyDog.entity.SystemLog;
import cn.lazyDog.model.SystemLog.SystemLogModel;
import cn.lazyDog.tools.Pagination;


@Repository("systemLogDao")
public class SystemLogDaoImpl  implements SystemLogDao{

	@Override
	public void save(SystemLog systemLog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SystemLog systemLog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SystemLog findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(SystemLogModel systemLogModel, int pageNo,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SystemLog> queryList(SystemLogModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
