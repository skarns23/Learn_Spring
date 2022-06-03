# 📌 [Learn_Spring]



<details>
<summary> 2022.5.9(MON) </summary>

<div markdown = "1">

## 📝Intellij 단축키

- Alt + 1  : 키를 누르면 프로젝트창으로 포커스를 옮김 
- Space : 프로젝트 창에서 클래스 파일에 Space를 누르면 미리보기 기능을 제공
- ctrl + shift + F12 : 에디터 창을 최대로 키우기
- ctrl + tab : 에디터 창 이동 
- ctrl + alt +Insert : 에디터에서 새 파일 생성
- alt + Insert : 프로젝트 창에서 새 파일 생성
- ctrl + 방향키 : 단어단위 이동
- home, end : 라인 시작/끝 이동
- page up, page down : 페이지 위/아래 이동
- ctrl + w , ctrl + shift + w : 코드 선택영역 확장 / 축소
- ctrl + /, ctrl + shift + / : 한 줄 주석 / 블록 주석
- ctrl + alt + i : 자동 인덴트 처리
- ctrl + B : 코드의 사용처를 알 수 있음
- ctrl + shift + F : 경로내 검색 ( 코드 검색 유용 )
- shift 2번 : 전체 검색 ( IntelliJ 기능 찾을 때 유용 )
- ctlr + E : 최근에 열었던 파일 열기
- ctrl + J : Live template  ex) psvm, sout
- alt + enter : Quick fix
- F2, shift + F2 : 코드 별 이슈로 이동
- ctrl + alt + O : Import 최적화
- alt +Ins : 코드 생성 
- ctrl + o, ctrl + I : 메소드 자동완성 (override, implement)
- shift + ctrl + enter : 구문 자동완성 
- ctrl 2번 : Run anything
- ctrl + shift + F10, shift + F10 : 에디터 실행, 실행
- ctrl + F2 : 실행 중지
- ctrl +D, ctrl + y : 라인 복사, 라인 삭제
- ctrl + P : 메소드의 파라미터를 알 수 있음 
- ctrl + shift + i : 메소드의 간단한 정의를 볼 수 있음  
</div>
</details>

<details>
<summary> 2022.5.10(TUE) </summary>
<div markdown = "1">
    
## 📝 IntelliJ 단축키 응용
    
 ### 테스트 코드
 - alt + entet : 생성
 - ctrl + shift + T : 테스트 코드 이동
 - ctrl + shift + F10 : 선택된 테스트 실행
 - ctrl + F2 : 실행 중지
   
  ### 리팩토링
  - F6 : 클래스 이동
  - ctrl + shift + F6 : 타입 변경 ( 메소드와 파라미터 둘다에 적용가능 )
  - ctrl +F6 : 메소드 시그니처 변경 ( 메소드 시그니처는 메소드의 반환 값, 타입 파라미터, 파라미터 등 )
  - shift + F6 : 변수 이름 변경
  - ctrl + alt + shift + T : 리팩토링에 관련된 메소드들을 볼 수 있음
    
  ### 디버깅
  - ctrl + F8 : 브레이크 포인트 설정
  - ctrl + shift + F8 : 브레이크 포인트 보기 
  - shift + F9 : 디버깅 모드 실행
  - F7 : step into ( 코드의 정의 및 함수 내부로 들어감 )
  - F8 : step over ( 다음 줄의 코드를 바로 실행 )
  - F9 : Resume Program ( 다음 브레이크 포인트로 이동 )
   
  ### Git
  - alt + ` : 사용할 수 있는 Git 메소드를 보여줌
  
## 📝 Todo List 만들기
  
 ### 필요 기능
  - Todo 아이템 추가 : POST method 활용, body에 뭘 추가할지 title 필요 , end point = /
  - 전체 Todo 리스트 조회 : GET method 활용, end point = /
  - Todo 아이템 조회 : GET method 활용, end point = /{:id}
  - Todo 아이템 수정 : PATCH method 활용 , body에 수정할 내용 ,end point = /{:id}
  - 전체 Todo 리스트 삭제 : DELETE method 활용, end point = /
  - Todo 아이템 하나 삭제 : DELETE method 활용, end point = /{:id}

  </div>
 </details>
    

<details>
<summary> 2022.5.29(SUN) </summary>
<div markdown = "1">

<details>
  <summary> 📝 객체지향 4대 특성 </summary>
  <div markdonw = "2">
     
### 1. 캡슐화
- 객체의 속성을 보호학 위해서 사용
- 속성이 선언되었으나, 해당 속성으 상태를 변경하는 method가 없으면 잘못 선언된 속성
- 실물 객체으 기능으 모두 제공
- 각각의 method는 서로 관련이 있어야 함
- 객체 안의 method는 객체 안으 속성을 처리행 함
- 장점 : 추상화 제공, 재사용성 향상, 유지보수의 효율성 향상, 무결성 제공
- 무결성 : 캡슐화 코딩의 경우 변수는 private, method는 public으로 선언하여 사용하는데public method의 경우 입력된 매개변수를 Validation 후 실행하기때문에 값의 유효성 검증이 가능함

### 2. 상속
- 프로그램 구조에 대한 이해도 향상 : 최상위 클래스의 구조를 보고, 하위 클래스의 동작을 이해할 수 있다.
- 재사용성 향상 : 상속을 이용, 해당 클래스에 필요한 속성 및 메소드를 모두 정의하지 않아도 된다.
- 확정성 향상 : 일관된 형태의 클래스 객체를 추가할 수 있다.
- 유지보수성 향상

### 3. 다형성
- 하나의 개체가 여러 개의 형태로 바뀌는 것

### 4. 추상화
- 객체지향에서의 추상화는 모델링
- 구체적으로 공통적인 부분, 또는 특정 특성을 분리해서 재조합하는 것
  </div>
  </details>
 <details>
  <summary> 📝  객체지향 설계 5원칙 SOLID </summary>
  <div markdonw = "2">

### 응집도와 결합도
- 응집도 : 하나의 모듈 내부에 존재하는 구성 요소들의 기능적 관련성
- 결합도 : 모듈간의 상호 의존 정도
- 좋은 소프트웨어 설계를 위해서는 결합도는 낮추고 응집도는 높여야 한다.

### SRP 단일 책임 원칙
- 어떠한 클래스를 변경해야 하는 이유는 한가지 뿐 이어야 한다.

### OCP (Open Closed Principle) 개방 폐쇄 원칙
- 자신의 확장에는 열려있고, 주변의 변화에 대해서는 닫혀있어야 한다. Ex) JDBC

### LSP 리스코프 치환 원칙
- 서브 타입은 언제나 자신의 기반 타입으로 교체할 수 있어야한다.

### ISP 인터페이스 분리 원칙
- 클라이언트는 자신이 사용하지 않는 method에 의존 관계를 맺으면 안된다.

### DIP 의존 역전 원칙
- 자신보다 변하기 쉬운 것에 의존하지 말아야한다.
   </div>
  </details>

  </div>
  </details>
<details>
    <summary> 2022.5.30(MON) </summary>
    <div markdown = "1">
<details>
<summary> 📝 디자인패턴 </summary>
<div markdown = “2”>
    
- 자주 사용하는 설계 패턴을 정형화 해서 이를 유형별로 가장 최적의 방법으로 개발을 할 수 있도록 정해둔 설계
- 대표적 디자인 패턴 GoF
- 소프트웨어 설계시 기존에 경험이 중요하나 모든 사람들이 경험을 가질 수는 없으므로 지식을 공유하기 위해 나온 GoF( Gang of Four)의 디자인 패턴이다.
- 객체지향 개념에 따른 설계 중 재사용할 경우 유용한 설계를 디자인 패턴으로 정리 해둔 것이다.

### 장점
- 개발자간의 원활한 소통
- 소프트웨어 구조 파악 용이
- 재사용을 통한 개발 시간 단축
- 설계 변경 요쳥에 대한 유여한 대처

### 단점
- 객체지향 설계 / 구현
- 초기 투자 비용 부담

<details>
<summary> GoF의 대표적 3가지 패턴 </summary>
<div markdown = “3”>
    
#### 1. 생성 패턴
- 객체를 생성하는 것과 관련된 패턴
- 객체의 생성과 변경이 전체 시스템에 미치는 영향을 최소화, 코드의 유연성 향상

* Factory Method
* Singleton
* Prototype
* Builder
* Abstract Factory
* Chaining

#### 2. 구조 패턴
    
- 프로그램 내의 자료구조나 인터페이스 구조 등 프로그램 구조를 설계하는데 활용될 수 있다.
- 객체들의 구성을 통해 더 큰 구조를 만들 수 있게 해준다.
- 큰 규모의 시스템의 경우 많은 클래스들이 서로 의존성을 가지게 되는데, 복잡한 구조를 개발 하기 쉽게 만들어 주고, 유지 보수 하기 쉽게 만들어 준다.

* Adapter
* Composite
* Bridge
* Decorator
* Facade
* Flyweight
* Proxy

#### 3. 행위 패턴
    
- 반복적으로 사용되는 객체들의 상호작용을 패턴화한 것
- 클래스나 객체들이 상호작용하는 방법과 책임을 분산하는 방법을 제공
- 행위 관련 패턴을 사용하여 독립적으로 일을 처리하고자 할 때 사용

* Template Method
* Interpreter
* Iterator
* Observer
* Strategy
* Visitor
* Chain of responsibility
* Command
* Mediator
* State
* Memento

</div>
</details>
<details>
<summary>  Singleton patter </summary>
<div markdown = “3”>

- 어떠한 객체가 유일하게 1개만 존재해야 할 때 사용한다.
- 주로 서로 자원을 공유 할 때 사용한다. ex) 프린터, TCP Socket 통신에서 서버와 연결된 connect 객체
- 구현 방법 : default 생성자를 private로 막음, getInstance()라는 Method를 통해 생성된 객체를 가져오거나 없는 경우 생성한다.
</div>
</details>

<details>
<summary> Adapter pattern </summary>
<div markdown = “3”>
    
- 실생활에서 100v를 220v로 변환해주거나, 반대로 변환해주는 것을 예로 들 수 있다.
- 호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.
- SOLID 중 OCP 개방폐쇄 원칙을 따른다. 
</div>
</details>

<details>
<summary> Proxy pattern</summary>
<div markdown = “3”>

- Proxy는 대리인 이라는 뜻으로써, 뭔가를 대신해서 처리하는 것
- Proxy Class를 통해서 대신 전달하는 형태로 설계되며, 실제 Client는 Proxy로부터 결과를 받는다
- Cache의 기능으로도 활용 가능
- SOLID중에서 개방폐쇄원칙과 의존 역전 원칙을 따른다. 
</div>
</details>
<details>
<summary> Decorator pattern</summary>
<div markdown = “3”>
    
- 데코레이터 패턴은 기존 뼈대는 유지하되, 이후 필요한 형태로 꾸밀 때 사용한다.
- 확장이 필요한 경우 상속의 대안으로 활용
- SOLID 중에서 개방폐쇄 원칙과 의존 역전 원칙을 따른다.
</div>
</details>

<details>
<summary> Observer pattern </summary>
<div markdown = “3”>
    
- 관찰자 패턴은 변화가 일어났을 때, 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것이다.
- 예시로 event listener에서 해당 패턴을 사용하고 있다.
</div>
</details>

<details>
<summary> Façade pattern </summary>
<div markdown = “3”>
    
- Façade는 건물의 앞쪽 정면이라는 뜻으로 뒤에는 무엇이 있는지 모르는 상태를 뜻한다. 여러 개의 객체와 실제 사용하는 서브 객체의 사이에 복잡한 의존관계가 있는 경우, 중간에 Façade라는 객체를 두고, 여기서 제공하는 interface만을 활용하여 기능을 사용하는 방식이다. 
    
- Façade는 자신이 가지고 있는 각 클래스의 기능을 명확히 알아야한다. 
</div>
</details>

<details>
<summary> Strategy pattern </summary>
<div markdown = “3”>
    
- 전략 패턴으로 불리며, 객체지향의 꽃이다.
- 유사한 행위들을 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 전략만 변경 하여, 유연하게 확장이 가능하게 한다.
- SOLID	 중 개방폐쇄 원칙(OCP)와 의존 역전 원칙(DIP)를 따른다.
- 필요 요소
	1) 전략 메서드를 가진 전략 객체
	2) 전략 객체를 사용하는 컨텍스트
	3) 전략 객체를 생성해 컨텍스트에 주입하는 클라이언트
</div>
</details>

</div>
</details>
	</div>
	</details>
<details>
<summary> 2022.06.01(WEN) </summary>
<div markdown = “1”>


<details>
<summary> 📝 웹 개발이론 </summary>
<div markdown = “2”> 

Web (World Wide Web, WWW, W3)으로 인터넷에 연결된 컴퓨터를 통해 사람들이 정보를 공유할 수 있는 전 세계적인 정보공간을 의미 
Web의 용도 
- Web Site : google, naver, daum 등 HTML로 구성된 여러 사이트들
- API (Application Programming Interface) * Web Service : Kakao Open API 등, 오픈 API
- User Interface : Chrome, Safari, Explorer, Smart Watch 등 

Web의 기본 3가지 요소
- URI (Uniform Resource Identifier) : 리소스 식별자 -> 특정 사이트, 특정 쇼핑 목록, 동영상 목록 등 모든 정보에 접근 할 수 있는 정보 
- HTTP (Hpyertext Transfer Protocol) : GET, POST, DELETE 등 메소드를 통한 어플리케이션 컨트롤
- HTML (Hyper Text Markup Language) : XML을 바탕으로한 범용 문서 포멧
</div>
</details>

<details>
<summary> 📝 REST란? </summary>
<div markdown = “2”>

REST (Representational State Transfer : 자원의 상태 전달) – 네트워크 아키텍처
REST의 6가지 아키텍처
- Client, Server : 클라이언트와 서버가 서로 독립적으로 분리 되어 있어야한다.
- Stateless : 요청에 대해서 클라이언트의 상태를 서버에 저장하지 않는다. Ex) 햄버거가게에서 햄버거주문 후 콜라를 주문하는 경우 햄버거에 콜라를 추가해서 줄 수 있으나, 클라이언트에 서버 정보를 저장하지 않아야 하기 때문에 요청을  햄버거주세요 -> 햄버거 + 콜라주세요라고 해야한다
- Cache : 클라이언트는 서버의 응답을 임시저장 할 수 있어야 한다. 클라이언트가 Cache를 활용하여 응답을 재사용할 수 있어야 하며, 이를 통해서 서버의 부하를 낮춘다.
- 계층화 : 서버와 클라이언트 사이에 방화벽, 게이트웨이, Proxy 등 다양한 계층 형태로 구성이 가능해야 하며, 이를 확장 할 수 있어야 한다.
- 인터페이스 일관성 : 인터페이스의 일관성을 지키고, 아키텍처를 단순화시켜 작은 단위로 분리하여, 클라이언트, 서버가 독립적으로 개선 될 수 있어야 한다. 서버, 클라이언트에 변경이 생겨도 서로 영향을 주어서는 안된다.
- Code On Demmand (Optional) : 자바 애플릿, 자바스크립트, 플래시 등 특정한 기능을 서버로부터 클라이언트가 전달받아 코드를 실행할 수 있어야 한다.

인터페이스의 일관성에 따른, REST 활용여부 판단
- 자원의 식별 : 웹 기반의 REST에서는 리소스 접근을 할 때 URI를 사용,  https://foo.co.kr/user/100에서 Resource : user이며 식별자는 100이다.
- 메시지를 통한 리소스 조작 : Web에서는 다양한 방식으로 데이터를 전달 할 수 있다. 대표적으로 HTML, XML, JSON, TEXT 등 이 있다. 이 중에서 데이터 타입을 알려주기 위해서 HTTP Header 부분에 content-type 을 통해서 데이터의 타입을 지정해 줄 수 있다.
- 자기서술적 메시지 : 요청 하는 데이터가 어떻게 처리 되어져야 하는지 충분한 데이터를 포함 할 수 있어야 한다. HTTP 기반의 REST에서는 HTTP Method와 Header 정보, 그리고 URI의 포함되는 정보로 표현이 가능하며, 담지 못 한 정보들은 URI의 메시지를 통하여 표현한다.
- Application 상태에 대한 엔진으로써 하이퍼미디어 : REST API를 개발할 때 단순히 Client 요청에 대한 데이터만 응답 해주는 것이 아닌 관련된 리소스에 대한 Link 정보까지 같이 포함 되어져야 한다. (실제 현업에서는 잘 사용하고 있지 않음)
</div>
</details>


<details>
<summary> 📝 URI 설계 패턴 </summary>
<div markdown = “2”>

- URI (Uniform Resource Identifier) : 인터넷에서 특정 자원을 나타내는 주소 값, 해당 값은 유일하다. (응답은 달라질 수 있다.
- URL (Uniform Resource Locator) : 인터넷 상에서의 자원, 특정 파일이 어디에 위치하는지 식별 하는 주소 
- URL은 URI의 하위 개념이다.
<details>
<summary>  URI 설계 원칙 </summary>
<div markdown = “3”>
 
- 슬래시 구분자 ‘/’는 계층 관계를 나타내는 데 사용한다.
- URI 마지막 문자로 ‘/’는 포함하지 않는다.
- 하이픈 ‘-‘은 URI의 가독성을 높이는데 사용한다.
- 밑줄 ‘_’은 사용하지 않는다.
- URI 경로에는 소문자가 적합하다.
- 파일 확장자는 URI에 포함하지 않는다.
- 프로그래밍 언어에 의존적인 확장자를 사용하지 않는다.
- 구현에 의존적인 경로를 사용하지 않는다.
- 세션 ID를 포함하지 않는다.
- 프로그래밍 언어의 Method명을 이용하지 않는다.
- 명사에 단수형 보다는 복수형을 사용해야 한다. 컬렉션에 대한 표현은 복수로 사용
- 컨트롤러 이름으로는 동사나 동사구를 이용한다.
- 경로 부분 중 변하는 부분은 유일한 값으로 대체 한다.
- CRUD 기능을 나타내는 것은 URI에 사용하지 않는다.
- URI Query Parameter 디자인 : URI 쿼리 부분으로 컬렉션 결과에 대해서 필터링 할 수 있다.
- URI 쿼리는 컬렉션의 결과를 페이지로 구분하여 나타내는데 사용한다.
- API에 있어서 서브 도메인은 일관성 있게 사용해야 한다.
- 클라이언트 개발자 포탈 서브 도메인은 일관성 있게 만든다. (개발 환경에서 테스트를 하기위해활용.
</div>
</details>
</div>
</details>

<details>
<summary> 📝 HTTP Protocol </summary>
<div markdown = “2”>

- 규정된 Web에서 데이터를 주고 받는 프로토콜 
- 이름에는 하이퍼텍스트 전송용 프로토콜로 정의되어 있으나, 실제로는 HTML, XML, JSON, Image, Voice, JS 등 다양한 컴퓨터에서 다룰 수 있는 것은 모두 전송이 가능하다.
- HTTP는 TCP를 기반으로 한 REST의 특징을 모두 구현하고 있는 Web 기반의 프로토콜이다.
- HTTP는 메시지를 주고 (Request) 받는 (Response) 형태의 통신 방법입니다.
- HTTP의 요청을 하는 8가지 Method (REST구현을 위한 인터페이스로 활용)
 
</div>
</details>
</div>
</details>

<details>
<summary> 2022.06.02(THU) </summary>
<div markdown = “1”>
	
### 스프링 부트란?
- 단순히 실행되며, 프로덕션 제품 수준의 스프링 기반 어플리케이션을 쉽게 만들 수 있다.
- Spring Boot 어플리케이션에는 Spring 구성이 거의 필요 하지 않다.
- Spring Boot java -jar로 실행하는 Java 어플리케이션을 만들 수 있다.

### 스프링 부트의 목표
- Spring 개발에 대해 빠르고, 광범위하게 적용할 수 있는 환경 구축
- 기본값 설정이 되어있어 특별한 설정을 할 필요가 없다.
- 대규모 프로젝트에 공통적인 비 기능을 제공. Ex) 보안, 모니터링 등등
- XML 구성 요구사항이 없다. Spring Boot의 경우 어노테이션 기반

- Spring-Boot의 Controller 중 GetMapping에 대한 공부를 진행하였습니다. 
<details>
<summary> GetMapping 공부 코드 </summary>
<div markdown = “2”>

```JAVA
@RestController // 해당 Class는  REST API를 처리하는 Controller
@RequestMapping("/api") // RequestMapping은 URI를 지정해주는 어노테이
public class ApiController {

    @GetMapping("/hello") // 해당 주소가 http://localhost:8080/api/hello에 맵
    public String hello(){
            return "hello spring boot!";
    }

    @GetMapping(path = "/get/hello") //경로를 지정해주는 방식 http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }

    //@RequestMapping("/get/hi") // 모든 메소드가 맵핑됨 get, post, put, delete 등
    @RequestMapping(path = "/get/hi",method = RequestMethod.GET) //해당 방식을 이용할 경우 get 메소드만 맵핑됨
    public String hi(){
        return "get hi";
    }

    // http://localhost:8080/api/path-variable/{name} name값은 변화하는 값
    @GetMapping("/path-variable/{name}")//변수를 받을때는 {}를 활용하고 안에는 변수명을 적용
    public String PathVariable(@PathVariable(name = "name") String pathName){// 매개변수로 똑같은 변수를 받는다.
        // @PathVariable String name은 같은 이름일 경우 해당 방식은 다른 이름인데 부여해야할 경우
        return "Hello "+pathName;
    }


    //query parameter의 경우 '?'로 시작하고 key = value형태이며 이어지는 경우 &를 통해 연결한다.
    //http://localhost:8080/api/query-param?user=steve&email=stev@naver.com&age=30
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String>queryParam){//해당방식의 경우 들어오는 key에 대해서 모두 받을 수 있으나, key가 무엇인지 모름
        //RequestParam이라는 어노테이션붙여야 함 key=value형태이기때문에 Map으로 담을 수 있다.
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
            sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
        });
        return sb.toString();
    }

    @GetMapping("/query-param2")
     public String queryParam2(@RequestParam String name,@RequestParam String email, @RequestParam int age){
       //들어오는 key를 알고있다면 쓸 수 있는 명시적 방법 대신 key값이 늘면 힘듬
        return name+" "+email+" "+age;

    }

    //dto방식 현업에서 가장많이 사용함 스프링부트에서는 객체가 들어오면 query-param에 대한 판단
    // key에 있는 변수들을 객체의 변수들과 매칭을 한다.
    @GetMapping("/query-param3")
    public String queryParam3(UserRequest userRequest){
        return userRequest.toString();
    }
```
</div>
</details>
</div>
</details>

