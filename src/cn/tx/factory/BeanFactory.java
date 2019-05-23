package cn.tx.factory;

import cn.tx.model.User;

public class BeanFactory {
	
	/**
	 * 创建静态工厂方法创建user对象
	 * @return
	 */
	public static User createUser(){
		return new User();
	}

}
