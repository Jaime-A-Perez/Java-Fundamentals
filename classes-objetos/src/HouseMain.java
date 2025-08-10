public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.setDoors(2);;
        myHouse.setWindows(4);
        myHouse.setSize(10);

        House myHouse2 = new House(2,4,10);

        System.out.println("The uantity of doors into house is: " + myHouse.getDoors());
        myHouse.openDoor();

        double area2 =  myHouse2.calculateArea();

        System.out.println("The area of the house2 is: " + area2);
    }
}
