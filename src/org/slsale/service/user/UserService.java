package org.slsale.service.user;

import org.slsale.pojo.user.User;

public interface UserService {
	//��¼
	public User getLoginUser(User user)throws Exception;
	//ע��
	public int addUser(User user)throws Exception;
}
