package org.slsale.dao.user;

import org.slsale.pojo.user.User;

public interface UserMapper {
	//��¼
	public User getLoginUser(User user)throws Exception;
	//ע��(�����û�)
	public int addUser(User user)throws Exception;
}
