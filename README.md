## 주요 기능 목록
* java-racingcar-precourse/src/main/java/racingcar/domain
    - /car/Name.java : Car의 이름 관리
    - /car/Position.java : Car의 위치 관리
    - /car/Car.java : 자동차 경주 게임에 참여하는 자동차
    - /car/Cars.java : 자동차 경주 게임에 참여하는 모든 자동차들의 List

    - /Game.java : 게임의 준비, 시작, 종료 등 게임을 구성하고 있다.
    - /Racing.java : 경주 게임이 진행되는데 필요한 자동차 움직이기, 1등 판별, 출력을 구성하고 있다.
    
* java-racingcar-precourse/src/main/java/racingcar/exception
    - /InvalidCarException.java : 자동차와 관련된 exception 처리
    - /InvalidUserInputException.java : 사용자 입력 값에 대한 exception 처리
    
* java-racingcar-precourse/src/main/java/racingcar/view
    - /InputView.java : 게임 시작 시 사용자가 입력해야 하는 값들에 대한 처리를 한다.
        
* java-racingcar-precourse/src/main/java/util/
    - /Util.java : 자동차 경주게임에서 사용할 util 클래스
    - /ValidationUtil.java : 해당 클래스를 통해 validation 체크를 하고 오류 발생 시 throw Exception 시킨다.
    

## 테스트 코드 목록
* java-racingcar-precourse/src/test/java/racingcar/domain
    - /car/CarTest.java : Car 생성(Name, Position 생성 등)과 Cars에 추가되는 로직에 대한 테스트 코드
    - /car/PositionTest.java : Car가 움직일때에 대한 테스트 코드
    - /RacingCarTest.java
    
* java-racingcar-precourse/src/test/java/racingcar/view
    - InputViewTest.java : 사용자 입력 값에 대한 테스트 코드
    