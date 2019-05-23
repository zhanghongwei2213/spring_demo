package cn.tx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tx.dao.UserDao;
import cn.tx.model.User;

public class BeanTest {
	ApplicationContext ctx;
	@Before
	public void setUp(){
		//spring的初始化
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
	@SuppressWarnings("unused")
	@Test
	public void test() {
		
		//默认情况下在spring容器中获得的同一个的bean都是同一个实例，不会再去创建
		UserDao userDao  = (UserDao) ctx.getBean("userDao");
		UserDao userDao1  = (UserDao) ctx.getBean("userDao");
		System.out.println(userDao);
		System.out.println(userDao1);
		System.out.println(userDao==userDao1);
	}
	@Test
	public void test1() {
		
		User user  = (User) ctx.getBean("user");
		System.out.println(user);
	}
	@Test
	public void test2() {
		
		User user  = (User) ctx.getBean("user1");
		System.out.println(user);
	}
	
	/**
	 * bean的生命周期和spring的容器（ApplicationContext）同声同死
	 */
	@Test
	public void test3() {
		
		//默认情况下在spring容器中获得的同一个的bean都是同一个实例，不会再去创建
		@SuppressWarnings("unused")
		UserDao userDao  = (UserDao) ctx.getBean("userDao");
		((AbstractApplicationContext) ctx).close();
	}

}
