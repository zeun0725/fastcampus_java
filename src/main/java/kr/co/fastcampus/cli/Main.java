package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.sql.SQLException;
@Slf4j
class Main{
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws ClassNotFoundException {
		log.info("hello world!");
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}

		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml", "bean.xml");
		A a1 = context.getBean("A", A.class);
		A a2 = context.getBean("A", A.class);
		log.info("result: " + (a1 == a2));  //true  -> spring 은 싱글톤이 디폴트 // false -> scope="prototype" 넣어주기

//		Dao dao = context.getBean("dao",Dao.class);
//
//		dao.run();






	}
}
