package  cn.lazyDog.manager.SystemLog;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.tools.Pagination;
import cn.lazyDog.dao.SystemLogDao;
import cn.lazyDog.entity.SystemLog;
import cn.lazyDog.model.SystemLog.SystemLogModel;


@Service("systemLogManager")
public class SystemLogManagerImpl implements SystemLogManager {

	@Autowired
	private SystemLogDao systemLogDao;

	@Override
	public void add (SystemLog systemLog) {
		// TODO Auto-generated method stub
		systemLogDao.save(systemLog);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		systemLogDao.deleteById(id);
	}

	@Override
	public void update (SystemLog systemLog) {
		// TODO Auto-generated method stub
		systemLogDao.update(systemLog);
	}

	@Override
	public SystemLog findById (String id) {
		// TODO Auto-generated method stub
		return systemLogDao.findById(id);
	}

	@Override
	public Pagination queryPage (SystemLogModel systemLogModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return systemLogDao.queryPage(systemLogModel, pageNo, pageSize);
	}

	@Override
	public List<SystemLog> queryList (SystemLogModel queryModel) {
		// TODO Auto-generated method stub
		return systemLogDao.queryList(queryModel);
	}
 }
