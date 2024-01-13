public class StudentTester {
    public static void main(String[] args) {

        Student sam = new Student("Sam Ismail", 26);
        Student dave = new Student("Dave Turner", 16);
        Student eli = new Student("Eli Goldsworth", 24);
        Student claire = new Student("Claire Edwards", 21);
        Student jimmy = new Student("Jimmy Brooks", 25);

        sam.over20();
        dave.over20();
        eli.over20();
        claire.over20();
        jimmy.over20();


    }
}
