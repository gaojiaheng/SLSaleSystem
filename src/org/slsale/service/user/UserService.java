package org.slsale.service.user;

import org.slsale.pojo.user.User;

public interface UserService {
	//µÇÂ¼
	public User getLoginUser(User user)throws Exception;
	//×¢²á
	public int addUser(User user)throws Exception;
}
