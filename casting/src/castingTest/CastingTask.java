package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스

// 사용자가 선택한 영상이
// 1. 애니메이션이라면, "자막 지원" 기능 사용
// 2. 영화라면, "4D" 기능 사용
// 3. 드라마라면, "굿즈" 기능 사용
public class CastingTask {
//	각 장르별 클래스에 extends Video를 붙여주면서 up casting
   public void getService(Video video) {
//	   각 장르별로 down casting
      if(video instanceof Animation) {
//    Animation 타입의 animation객체를 만들고 그 안에 Animation타입의 video객체를 넣어줌
         Animation animation = (Animation) video;
         animation.printSubtitle();
      }
      else if(video instanceof Drama) {
         Drama drama = (Drama) video;
         drama.sellGoods();
      }
      else if(video instanceof Film) {
         Film film = (Film) video;
         film.shake();
      }
   }
   
   public static void main(String[] args) {
      CastingTask castingTask = new CastingTask();
      Video[] videos = {
         new Drama(),
         new Animation(),
         new Film()
      };
      
      for (int i = 0; i < videos.length; i++) {
         castingTask.getService(videos[i]);
      }
   }
}












