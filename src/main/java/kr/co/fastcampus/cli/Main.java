package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

@Slf4j
class Main{
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		log.info("hello world!");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		B b = context.getBean(B.class);
		log.info("" + b);
		context.close();

	}
}
