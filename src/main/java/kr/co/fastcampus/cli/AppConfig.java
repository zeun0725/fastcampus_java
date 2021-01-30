package kr.co.fastcampus.cli;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Configuration annotation -> 스프링 설정을 관리하는 빈이라는 것을 알려주는 어노테이션
@Configuration
@ComponentScan(basePackages = "kr.co.fastcampus.cli")
public class AppConfig {

}
