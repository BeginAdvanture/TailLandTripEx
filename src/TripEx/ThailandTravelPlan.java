package TripEx;
import java.util.Scanner;

public class ThailandTravelPlan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("이름을 입력하세요: ");
    String name = sc.nextLine();
 
    
    System.out.print("여행 일정을 적어주십시오.: ");
    int days = sc.nextInt();
    System.out.println(name+ "\n님의 여행일정입니다." );
    
    System.out.println("Day 1: 호텔에서 쉬세요");
    
    if (days >= 2) {
      System.out.println("Day 2: 동물원 방문 및 야시장 관람");
    }
    if (days >= 3) {
      System.out.println("Day 3: 카오산로드로 이동 후 유적지 관람");
    }
    for (int i = 4; i <= days; i++) {
      System.out.println("Day " + i + ": 가이드를 통해 여행을 즐기세요");
    }
  }
}