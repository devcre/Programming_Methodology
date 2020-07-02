public class City {
  // 도시 이름
  private String cityName;
  // 도시 인구
  private int population;
  // 도시의 인구 증가율 (%)
  private double growthRate;
  
  public City(int populationIn, double growthRateIn, String cityNameIn) {
    population = populationIn;
    growthRate = growthRateIn; 
    cityName = cityNameIn;
  }
  
  
  // 주어진 연도 후의 예상 인구를 계산한다
  public int computeFuturePopulation(int years) {
    // 예상 인구
    double populationAmount = population;
    // 연도
    int count = years;
    // 주어진 연도 후의 예상 인구를 계산한다 
    //여기에 코드를 삽입하세요
    for(int i=0; i< years; i++){
      populationAmount += growthRate * populationAmount / 100;
    }
    // 예상 인구를 반환한다
    // 여기에 코드를 삽입하세요
    return (int)populationAmount;
      
  }
  // 도시 이름을 주어진 값으로 변경한다 
  public void setName(String newName) {
    // 여기에 코드를 삽입하세요
    this.cityName = newName;
  }
  // 도시 인구를 주어진 값으로 변경 
  // 도시 인구 증가율을 주어진 값으로 변경 
  // 도시 이름을 반환한다 
  public String getName() {
    // 여기에 코드를 삽입하세요
    return this.cityName;
  }
  // 도시 인구를 반환한다
  public int getPopulation() {
    // 여기에 코드를 삽입하세요
    return this. population;
  }
  // 도시 인구 증가율을 반환한다 
  public double getGrowthRate() {
    // 여기에 코드를 삽입하세요
    return this.growthRate;
  }
  
}