// Location.java는 위도와 경도로 표현하는 위치 Location 클래스의 정의를 담고 있다. 

// 클래스에서 distance 함수 내부를 정의하라. 두 위도 lat1, lat2 두 경도 lon1, lon2 가 주어졌을 때 두 지점 사이의 거리(km)은 다음과 같이 구할 수 있다: 

// R × arccos(cos(rad(90−lat1)) × cos(rad(90−lat2)) + sin(rad(90−lat1)) × sin(rad(90−lat2)) × cos(rad(lon1−lon2)))

// 여기서 R은 지구의 반지름 (distance 메소드에 이미 정의된 RADIUS_EARTH 변수)이고 rad 는 decimal degree 로 받은 위도와 경도를 radian 으로 바꿔주는 함수이다. 

// 바람직한 입출력 예제는 다음과 같다:
// Location loc1 = new Location(37.567, 126.978); 
// Location loc2 = new Location(35.179,129.076); 
// System.out.println(loc1.distance(loc2)); // 325.23184366269084 출력

class Main {
  public static void main(String[] args) {
    Location loc1 = new Location(37.567, 126.978); 
    Location loc2 = new Location(35.179,129.076); 
    System.out.println(loc1.distance(loc2)); // 325.23184366269084 출력
  }
}