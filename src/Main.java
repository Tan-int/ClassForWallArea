public class Main {
    public static void main(String[] args) {
        // Testing the class Wall
        Wall areaOne = new Wall(9.4, 7.2);
        System.out.println("The width is " + areaOne.getWidth() + " , the height is: " + areaOne.getHeight());
        System.out.println("The area is: " + areaOne.getArea() + "\n");

        //Testing for negative parameters
        Wall areaTwo = new Wall(-1,-6);
        Wall areaThree = new Wall(-1, 7);
        Wall areaFour = new Wall(16, -1);

        //Any negative parameters are set to zero
        System.out.println("Both parameters are negative, so the width is: " + areaTwo.getWidth() + " and the height is: " + areaTwo.getHeight());
        System.out.println("The width parameter is negative, so the width is: " + areaThree.getWidth() + " and the height is: " + areaThree.getHeight());
        System.out.println("The height parameter is negative, so the width is: " + areaFour.getWidth() + " and the height is: " + areaFour.getHeight());
    }
}
