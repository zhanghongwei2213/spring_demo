package cn.tx.dao.impl;

import cn.tx.dao.UserDao;

public class UserDaoImpl implements UserDao {
	
	public void init(){
		System.out.println("bean被创建了");
	}
	public void destroy(){
		System.out.println("bean被销毁了");
	}


	public UserDaoImpl() {
		System.out.println("我被创建了");
		System.out.println("aaa");
		System.out.println("bbb");
		System.out.println("ccc");
	}



	@Override
	public void saveUser() {
		System.out.println("用户被保存");
	}

}
