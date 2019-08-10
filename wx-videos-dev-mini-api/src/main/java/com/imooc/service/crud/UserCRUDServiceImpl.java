package com.imooc.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;

import tk.mybatis.mapper.common.RowBoundsMapper;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class UserCRUDServiceImpl implements UserCRUDService {

	@Autowired
	private UsersMapper userMapper;
	
	@Override
	public void saveUser(Users user) {
		userMapper.insertSelective(user);
//		userMapper.insert(user);
	}

	@Override
	public void updateUser(Users user) {
//		userMapper.updateByPrimaryKey(user);
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void updateUserExample(Users user) {
		
		Example example = new Example(Users.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("id", "1001");
		criteria.andLike("username", "%imooc%");
		
		userMapper.updateByExampleSelective(user, example);
	}

	@Override
	public void delete() {
		Users user = new Users();
		user.setId("180426GBZDFBCM80");
		user.setNickname("39021389");
		userMapper.delete(user);
		
	}

}
