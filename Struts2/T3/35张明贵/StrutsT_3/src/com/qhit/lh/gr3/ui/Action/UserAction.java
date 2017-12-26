package com.qhit.lh.gr3.ui.Action;

import com.opensymphony.xwork2.Action;
import com.qhit.lh.gr3.ui.user.User;


public class UserAction  implements Action{

	@Override
	public String execute() throws Exception {
		private User user;
		// TODO Auto-generated method stub
		return null;
	}
	public User getUser() {
		return user;
	}
	public viod SetUser(User user) {
		this.getUser=user;
	}
}
