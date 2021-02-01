package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

@Slf4j
class Main{
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		log.info("hello world!");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");

		Dao dao = context.getBean(Dao.class);
		log.info("" + dao);
		dao.run();
		context.close();

	}
}
