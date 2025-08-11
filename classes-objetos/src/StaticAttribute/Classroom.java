package StaticAttribute;
import java.util.Arrays;

public class Classroom {
    private String[] listOfStudentsName;
    private static String classRoomName = "Math 1";

    public Classroom(String[] listOfStudentsName) {
        this.listOfStudentsName = listOfStudentsName;
    }

    public void showInfo() {
        System.out.println("Student: " + Arrays.toString(listOfStudentsName) + " | ClassRoom: " + classRoomName);
    }

    public String[] getListOfStudentsName() {
        return listOfStudentsName;
    }

    public void setListOfStudentsName(String[] listOfStudentsName) {
        this.listOfStudentsName = listOfStudentsName;
    }

    public static String getClassRoomName() {
        return classRoomName;
    }

    public static void setClassRoomName(String classRoomName) {
        Classroom.classRoomName = classRoomName;
    }


}
