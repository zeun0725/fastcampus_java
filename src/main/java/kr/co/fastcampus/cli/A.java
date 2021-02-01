package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

@Slf4j
@Named("a")
public class A {
    @Autowired private B b;
    @Autowired private ApplicationContext context;
    @Value("${catalog.name}") String catalogName;
    @Value("#{systemProperties['java.home']}") String property;

    @PostConstruct
    void init(){
        log.error("A post construct");
    }

    @PreDestroy
    void destroy(){
        log.error("A pre destroy");
    }

}
