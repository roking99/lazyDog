package  cn.lazyDog.manager.CommonRole;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.dao.CommonRoleDao;
import cn.lazyDog.entity.CommonRole;
import cn.lazyDog.model.CommonRole.CommonRoleModel;
import cn.lazyDog.tools.Pagination;


@Service("commonRoleManager")
public class CommonRoleManagerImpl implements CommonRoleManager {

	@Autowired
	private CommonRoleDao commonRoleDao;

	@Override
	public void add (CommonRole commonRole) {
		// TODO Auto-generated method stub
		commonRoleDao.save(commonRole);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		commonRoleDao.deleteById(id);
	}

	@Override
	public void update (CommonRole commonRole) {
		// TODO Auto-generated method stub
		commonRoleDao.update(commonRole);
	}

	@Override
	public CommonRole findById (String id) {
		// TODO Auto-generated method stub
		return commonRoleDao.findById(id);
	}

	@Override
	public Pagination queryPage (CommonRoleModel commonRoleModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return commonRoleDao.queryPage(commonRoleModel, pageNo, pageSize);
	}

	@Override
	public List<CommonRole> queryList (CommonRoleModel queryModel) {
		// TODO Auto-generated method stub
		return commonRoleDao.queryList(queryModel);
	}
 }
