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
    
