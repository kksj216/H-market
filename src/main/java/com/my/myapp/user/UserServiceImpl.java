package com.my.myapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.myapp.BoardVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	@Override
	public int insertUser(UserVO vo) {
		return userDAO.insertUser(vo);
	}

}
