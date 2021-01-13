package kr.co.fastcampus.cli.di;

public class Main {
    public static void main(String[] args) {
//        boolean condition = true;
//        B b = new B(condition);
//        A a = new A(b);
//        a.print();

        //IoC 를 이용해 객체들의 관계를 설정
//        ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml");
//        A a = context.getBean("a", A.class);
        new A().print();

    }
}
