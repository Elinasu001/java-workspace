# 🧑🏻‍💻 Java Basic Projects

자바(JAVA) 기초 수업에서 작성한 실습 코드와 과제를 정리한 저장소입니다.
객체 지향 프로그래밍의 기초와 JAVA 문법을 학습하며 점진적으로 실력을 향상시키는 것을 목표로 합니다.

---
:pencil2: 박수현

:paperclip: [JAVA 공부 기록 노션](https://ubiquitous-woodpecker-cc5.notion.site/JAVA-Basic-Projects-23f8e71b864f8041ba8bedf905319dc2?pvs=4) :pencil2:
---

## 📘 학습 내용 요약
01_Variable
- 변수 (Variable)
  - 원시자료형
    - 논리자료형, 숫자자료형, 문자열
  - 참조형
    - 주소값
  - 변수 선언 방법
  - **형변환 (Casting)** ⭐
    - 자동형 변환 (Promotion)
    - 강제형 변환 (Type Casting)
- 상수 (Constant)
- 스캐너 (Scanner)
---
02_Operator
- 연산자 (Operator)
  - 산술 연산자 (Arithmetic)
  - 증감 연산자 (InDecrease)
    - 전위 연산
    - 후위 연산
  - 복합 연산자 (Compund)
  - 논리(값) 부정 연산자 (LogicalNagation)
  - 비교 연산자(관계 연산자) (Comparison)
    - 동등 비교
    - 대소 비교
  - 논리 연산자 (Logical)
  - 삼항 연산자 (Triple)
---
03_Condition
- 조건문
  - (단일) If문
  - If ~ Else If ~ Else문
  - Switch문
- 조건문(Loop)
  - For문
    - 향상된 for문
  - While문
    - 정수 중 짝수의 합계 구하기
    - 랜덤 합계 구하기(Math.random())
  - Do ~ While문
- Escape
  - Break
    - Break(Math.random())
    - Break(Scanner)
  - Continue
    - 회원가입 서비스
---
04_Array
- Array
  - hasCode()
  - 로또번호_Arrays.toString()
  - Exception
    - 배열범위문제(ArrayIndexOutOfBounds)
    - null 배열처리(NullPointerException)
    - 타입호환성(AraayStoreException)
  - Scanner_중복 변수 처리_최소값 출력
  - G.C (Garbage Collector)
  - 일반적인 사용 방식
  - 배열 복사
    - **얕은 복사**
    - 깊은 복사
      - System.arraycopy()
      - Arrays.copyOf()
      - clone()

---

**객체 지향 프로그래밍** ⭐
- 역사
- Object(객체)
  - Abstraction(추상화)
  - 객체 생성 (Object(이론적의미) / instance화(기술적의미))
  - 설계도
  - Scanner
    - 강아지 케어
  - Encapsulation(캡슐화)
    - Information Hiding(정보 은닉)
      - 객체의 내부적 관점 / 외부적 관점
    - Setter()_DTO 전 VO로 진행
       - 개인 실습과제
        - CreateChallenge
        - ChallengeUser
        - UserPoint
        - GymUser
        - LectureProgress
      - this()
      - 매개변수를 이용한 제어
      - 이름 및 주소 수정하기
    - Getter()
      - 모든 필드 반환 메소드
    - 정리_Coffee
  - Controller
    - 전역 변수
      - 필드(멤버 변수, 인스턴스 변수)
      - 클래스 변수(static)
      - 상수 필드(final)
    - 지역 변수
    - AccessModifier(접근제어자 / 접근제한자)
      - **(+)public
      - (#)protected
      - (~)default
      - **(-)private
  - Constructor(생성자)
    - **기본 생성자(매개 변수 없음)**
      - JVM
    - **매개변수가 존재하는 생성자**
      - 한 개
      - 두 개
     - 개인 과제_ver.2
        - CreateChallenge
        - ChallengeUser
        - UserPoint
        - GymUser
        - LectureProgress
  - Method Controller
    - **얕은 복사**
  - **Method Overloading(메소드 오버로딩)**
    - Static Binding(정적 바인딩)
    - 동적 바인딩
  - 실습 : MVC(모델)_Model View Controller
    - model은 데이터 다룰 경우 생성
    - 리모컨 동작
  - 과제 : 클래스다이어그램
- ObjectArray(객체배열)
  - 중복제거 및 확장성
  - 객체배열실습과제(mvc)
- Inheritance(상속(확장)) ( == Heredity )
  - 부모/자식 클래스
  - Overriding(오버라이딩)_**정적**바인딩
    - @Override
  - toString()
  -  **Polymorphism(다형성)** :cherry_blossom:
      - 메모리
      - 클래스 형 변환
        - 배열 사용
      - Overriding(오버라이딩)_**동적**바인딩
        - @Override
      - 다형성
        - 변수/배열/다형성
        - abstract(추상 메소드)
        - Interface(인터페이스(구현))
          - implements(구현)
        - abstract(추상메소드) vs Interface(인터페이스)
    - 상속실습과제
---

**Excepiton(예외 처리)**
- Excepiton
  - RuntimeException
    - e.printStackTrace(); :  개발 및 디버깅 과정 o, 프로덕션 환경 x
    - InputMismatchException
    - NullPointerException
    - ArrayIndexOutOfBoundsException
    - ClassCastException
    - AritmeticException
    - NegativeArraySizeException
      ...
  - CheckedException
    - BufferedReader
    - IOException
    - try~catch
      - try~catch~finally (return해도 무조건 지킬 수 있는 방법)
    - throws
---

**API(Application Programming Interface)**
- API
  - Java API
    - java.lang 패키지
      - Object
        - Math 클래스(수학)
        - **String 클래스(문자열 클래스)** ⭐
           1. 생성자를 호출해서 문자열(String) 객체를 생성(**new**)하는 방법 :heavy_check_mark:
            - 오버라이딩
              - toString(), equals(), hashCode()
            - 정말 참조형 변수 식별할 수 있는 값을 알아내는 법
              - System.identityHashCode(참조형변수)
           2. 문자열 리터럴(**" "**) 대입 방식 :heavy_multiplication_x:
          - String Constant Pool
          - StringBuffer
            - append
            - 동시제어기능(Thread-Safe)
          - StringBuilder (보편적 사용) :heavy_check_mark:
            - append
          - 문자열과 관련된 메소드들
            - 문자열.length() : int (길이반환)
            - 문자열 .charAt(int index) : char (추출)
            - 문자열.substring(int beginindex) : String (자르기)
              - beginindex/endindex
            - 문자열.indexOf(str) : int (몇번인덱스?)
            - 문자열.toCharArray() : char[] (한행 씩 출력)
            - char[] -> String
              - System.out.println(String.valueOf(chArr));
            - 문자열.replace(char old, char new) : String (치환)
            - 문자열.trim() : (String 공백문자 날리기)
            - 문자열.toUpperCase() : String (전부 대문자로 바꾸기)
            - 문자열.toLowerCase() : String (전부 소문자로 바꾸기)
            - 자열.split(String 구분자) : String[] (문자열 분리시키기)
            -  java.util.StringTokenizer 클래스를 사용하는 방법
              - 보통 전체 토큰을 사용하고 싶을 경우 : hasMoreTokens 사용
      - Wrapper Class
        - 기본자료형 -> 참조자료형
        - Boolean, Character, Byte, Short, Integer, Long, Float, Double
        - Integer
          - 정렬구조시 : compareTo()
        - 파싱(parsing)
          - parseInt, parseDouble ...
    - java.io 패키지
      - I/O(Input/Output)
        - createNewFile() (파일 생성 메소드), (경로지정)
          - isFile(), getName(), getParent(), getAbsoluteFile()... (파일 클래스에서 제공하는 메소드)
        - mkDir() (폴더 생성 메소드)
        - **Stream(스트림)**
          - 스트림의 특징
          - 스트림의 구분
            - 스트림의 사이즈
              - 바이트 스트림
              - 문자 스트림
            - 외부매체와의 직접적인 연결 여부
              - 기반 스트림
              - 보조 스트림
          - 파일
            - DAO(Data Access Object)
              - FileByteDao
                - FileOutputStream
                  - write() : 1Byte
                - FileInputStream
                  - read() : 1Byte
              - FileCharDao
              - Tip
                - SimpleDateFormat
                - .close()  자원 반납
                - try ~ catch ~ finally 구문 (자원 반납)
                - try ~ with ~ resource 구문 (자원 반납을 해주는 간결한 코드)
                  - 대전제, closeable 구현할 것
              - assist
                - BufferedDao
                - ObjectDao
                - Serializable (직렬화)
                  
---         
- **자바의 컬렉션** ⭐⭐⭐
  - Collection Framework
    - 배열과 컬렉션의 차이점과 컬렉션을 사용하는 이유
    - ArrayList 와 LikedList
    - ArrayList
      - 요소 추가
      - 요소 수정
      - 요소 삭제
      - 요소 삭제 및 반환
      - 리스트의 해당 인덱스 위치에 담긴 요소 반환하는 메소드
      - 리스트 자르기
      - 리스트에 요소 추가하기
      - 리스트에 현재 요소가 있는지 없는지 판별하는 메소드
    - Generic
      - 요소 타입 제한
      - 형 변환 절차 없애기
    - HashSet
    - HashMap
    - Properties
      - Map
      - XML
        
---
**MVC 패턴에 ArrayList 적용하기(Model-View-Controller)**
-MVC
  - 알아두기(정처기) : GoF 디자인 패턴
  - 정형화 된 디자인 패턴
    - Model
    - View
      - CRUD
        - Create
        - Read
        - Update
        - Delete
    - Controller
---
**NetWork**
  - 네트워크(Network)
  - 통신 장치
  - 주소 체계
  - Server 와 Client
  - InetAddress 클래스
  - 도메인 네임(Domain Name)
  - Client-Server Model
  - 소켓(Socket)
    - ServerSocket
    - [SERVER](https://github.com/Elinasu001/java-workspace.git) 와 [CLIENT](https://github.com/Elinasu001/client-workspace.git) 연결
---
🛠 개발 환경
AWS JDK 2021
Eclipse 2024.06
Eclipse(IDE)
