public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doors = 2;
        myHouse.windows = 4;
        myHouse.size = 10;

        House myHouse2 = new House(2,4,10);
        myHouse2.doors = 2;
        myHouse2.windows = 4;
        myHouse2.size = 10;

        System.out.println("The cuantity of doors into house is: " + myHouse.doors);
        myHouse.openDoor();

        double area2 =  myHouse2.calculateArea();

        System.out.println("The area of the house2 is: " + area2);
    }
}
