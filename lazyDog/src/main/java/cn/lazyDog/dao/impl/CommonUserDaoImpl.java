package  cn.lazyDog.dao.impl;



import java.util.*;

import org.springframework.stereotype.Repository;

import cn.lazyDog.dao.CommonUserDao;
import cn.lazyDog.entity.CommonUser;
import cn.lazyDog.model.CommonUser.CommonUserModel;
import cn.lazyDog.tools.Pagination;


@Repository("commonUserDao")
public class CommonUserDaoImpl  implements CommonUserDao{

	@Override
	public void save(CommonUser commonUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CommonUser commonUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CommonUser findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination queryPage(CommonUserModel commonUserModel, int pageNo,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommonUser> queryList(CommonUserModel queryModel) {
		// TODO Auto-generated method stub
		return null;
	}


	}
