 public class Grandeur {

        // 멤버변수(속성)
        public String color;
        public String gear;
        public int price;

        // 생성자 , 생성자는 여러 개 일 수 있다.
        public Grandeur() {
            System.out.println("Grandeur constructor");
        }
        // 메서드

        public void run() {
            System.out.println("--run--");
        }

        public void stop() {
            System.out.println("--stop--");
        }

        public void info() {
            System.out.println("--info--");
            System.out.println("color : " + color);
            System.out.println("gear : " + gear);
            System.out.println("price : " + price);


        }



}
