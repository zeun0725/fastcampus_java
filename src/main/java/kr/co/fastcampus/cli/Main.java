package kr.co.fastcampus.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

class Main{
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		logger.info("hello world!");
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
		Dao2 dao2 = context.getBean("dao2",Dao2.class);
		dao2.run();





	}
}
