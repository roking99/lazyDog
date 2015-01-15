package  cn.lazyDog.manager.CommonUser;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lazyDog.tools.Pagination;
import cn.lazyDog.dao.CommonUserDao;
import cn.lazyDog.entity.CommonUser;
import cn.lazyDog.model.CommonUser.CommonUserModel;


@Service("commonUserManager")
public class CommonUserManagerImpl implements CommonUserManager {

	@Autowired
	private CommonUserDao commonUserDao;

	@Override
	public void add (CommonUser commonUser) {
		// TODO Auto-generated method stub
		commonUserDao.save(commonUser);
	}

	@Override
	public void deleteById (String id){
		// TODO Auto-generated method stub
		commonUserDao.deleteById(id);
	}

	@Override
	public void update (CommonUser commonUser) {
		// TODO Auto-generated method stub
		commonUserDao.update(commonUser);
	}

	@Override
	public CommonUser findById (String id) {
		// TODO Auto-generated method stub
		return commonUserDao.findById(id);
	}

	@Override
	public Pagination queryPage (CommonUserModel commonUserModel, int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return commonUserDao.queryPage(commonUserModel, pageNo, pageSize);
	}

	@Override
	public List<CommonUser> queryList (CommonUserModel queryModel) {
		// TODO Auto-generated method stub
		return commonUserDao.queryList(queryModel);
	}
 }
