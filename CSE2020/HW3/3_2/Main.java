// 텔레비전을 나타내는 Television 클래스를 작성하라.
// 각 텔레비전은 브랜드 이름, 전원, 채널 번호, 볼륨(음량)을 가진다.
// Television.java 에 주석을 읽고 다음 메소드들을 추가 작성하라. 
// getChannel : 현재 채널을 반환한다. 
// getBrandName : 브랜드명을 반환한다. 
// getVolume : 현재 볼륨을 반환한다. 
// getPower : 현재 전원 상태를 반환한다. 
// setChannel : TV의 채널 번호를 주어진 값으로 변경. 
// setBrandName : TV의 브랜드명을 주어진 값으로 변경. 
// setVolume : TV의 볼륨을 주어진 값으로 변경. 
// incrementChannel : TV의 채널을 1만큼 증가시킨다. 
// decrementChannel : TV의 채널을 1만큼 감소시킨다. 
// incrementVolume : TV의 볼륨을 1만큼 증가시킨다. 
// decrementVolume : TV의 볼륨을 1만큼 감소시킨다. 

class Main {
  public static void main(String[] args) {
    Television tv1 = new Television(); 
    tv1.setBrandName("samsung");
    tv1.setPowered(true);
    tv1.setVolume(10);
    tv1.setChannel(11);
    System.out.println(tv1);
  }
}