package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.CommonRoleDao;
import cn.lazyDog.entity.CommonRole;
import cn.lazyDog.model.CommonRole.CommonRoleModel;
import cn.lazyDog.tools.Pagination;


@Repository("commonRoleDao")
public class CommonRoleDaoImpl  implements CommonRoleDao{

	@Override
	public void save(CommonRole commonRole) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CommonRole commonRole) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CommonRole findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(CommonRoleModel commonRoleModel, int pageNo,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommonRole> queryList(CommonRoleModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
