package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// main 클래스로 사용.
// @SpringBootApplication 으로 인해 스프링 부트의 자도설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정.
// @SpringBootApplication 이 있는 위치 설정을 읽어가기 떄문이다. 이 클래스는 항상 프로젝트 최상단에 위치해야함.
@SpringBootApplication
public class Application {
    // SpringApplication.run으로 인해 내장 was를 실행한다.
    // 내장 was란 별도로 외부에 was를 두지 않고 어플리케이션을 실행할 때 내부에서 was를 실행하는 것을 말한다.
    // 이렇게 되면 항상 서버에 톰캣을 설치할 필요가 없게 된다. 스프링부트로 만들어진 Jar 파일(실행 가능한 Java 패키징 파일을 실행하면 된다.
    // 스프링부트는 내장 was를 사용하는 것을 권장한다. 이유는 `언제 어디서든 같은 환경에서 스프링 부트를 배포`할수 있기 때문이다.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
