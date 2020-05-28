package cc.sitec.web.service;

import cc.sitec.web.bean.User;
import org.springframework.stereotype.Service;

/**
 *@author 凉水
 *@date 2020/5/28 15:29
 **/
@Service
public class UserServiceImpl implements UserService {
	@Override
	public User findById(Integer id) {
		User user = new User();
		user.setId(0);
		return user;
	}
}
