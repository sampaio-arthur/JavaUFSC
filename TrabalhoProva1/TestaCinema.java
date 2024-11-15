public class TestaCinema {
    public static void main(String[] args) {
        SalaDeCinema sala01 = new SalaDeCinema("A", 45);

        System.out.println(sala01);
        System.out.println("----------");

        for (int i = 0; i < 50; i++) {
            sala01.ocupaPoltrona();
        }

        System.out.println("----------");
        System.out.println(sala01);
    }
}
