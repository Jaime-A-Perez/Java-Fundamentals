package StaticAttribute;

public class MainClassRoom {
    public static void main(String[] args) {
        Classroom classroom1 = new Classroom(new String[]{"Juan", "Maria"});
        Classroom classroom2 = new Classroom(new String[]{"John", "Mary"});

        classroom1.showInfo();
        classroom2.showInfo();

        Classroom.setClassRoomName("Science");

        classroom1.showInfo();
        classroom2.showInfo();
    }
}
