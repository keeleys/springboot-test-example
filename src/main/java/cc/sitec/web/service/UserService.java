package cc.sitec.web.service;

import cc.sitec.web.bean.User;

/**
 *@author 凉水
 *@date 2020/5/28 15:26
 **/
public interface UserService {
	/**
	 * 获取所有用户
	 * @return
	 */
	User findById(Integer id);
}
