/* 해당 프로젝트는 스프링 부트 프로젝트
 * 엄밀히 말하면 스프링 프레임워크 프로젝트 아니다.
 * 자바 배포시에는 코드 자체가 올라가는 것이 아니라 .jar 파일이 올라간다.
 * */
/* 웹 서버(Tomcat) vs 웹 애플리케이션 (Tomcat + Spring)
 * 두 개념을 나눈다는 것은 Tomcat을 갈아끼울 수 있음을 의미 → undertow
 *
 * Tomcat의 경우 엔드포인트까지 읽어서 라우팅 → 복잡한 라우팅
 * 이때 중간 브릿지 역할을 하는 것이 Servlet (라우팅 등을 관리하는 통신 리소스)
 * ex. API 호출 → 톰캣 → Servlet이 /member 라는 엔드포인트 처리 → Spring(MemberController.class)
 * */

/* 외부에서 접근 시에 경로 */
package com.sparta.msa.lesson;

/* 비영리 기관(org)인 스프링 재단에서 제공 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 스프링에서는 Application(annotation)이 붙은 메인 클래스가 실행해야 프로그램이 켜진다. */
/* 객체지향에서 클래스는 그 자체로 실행 불가. 인스턴스화가 되어야 실행이 된다.
 * 아래 "LessonApplication"를 인스턴스화시킬 곳이 없다. 즉, main() 메서드를 실행시킬 수 없어 나온 개념이
 * "static" => 메서드 앞에 static이 붙으면 프로그램이 시작될 때 강제적으로 인스턴스화하여 실행될 수 있도록 함
 * */
@SpringBootApplication
public class LessonApplication {

	public static void main(String[] args) {
    /* 스프링 컨테이너를 실행하는 메서드
     * run() 메서드는 직접 종료하지 않는 한 계속 실행되도록 하는 역할한다.
     * 앞으로 작성하게 될 코드는 모두 run() 메서드 안에서 실행하게 된다.
     * */
		SpringApplication.run(LessonApplication.class, args);
	}

}
