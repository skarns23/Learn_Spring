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
  </details
