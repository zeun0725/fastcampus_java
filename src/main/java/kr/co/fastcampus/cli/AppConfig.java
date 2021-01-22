package kr.co.fastcampus.cli;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Configuration annotation -> 스프링 설정을 관리하는 빈이라는 것을 알려주는 어노테이션
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    @Qualifier("b1")
    public B appBeanB1(){
        return new B();
    }

    @Bean
    @Qualifier("b2")
    public B appBeanB2(){
        return new B();
    }

}
