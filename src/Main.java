import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Name your droid");
        Droid robot = new Droid(myObj.nextLine());
        System.out.println("Android's name is: "+ robot);
        System.out.println("What task do you want him to perform?");
        System.out.println("His current energy is" + robot.energyReport());

        while (robot.batteryLevel >= 1) {
            System.out.println("What task do you want him to perform?");
            System.out.println("His current energy is" + robot.energyReport());
            robot.performTask(myObj.nextLine());
            if(robot.batteryLevel == 0){
                System.out.println("Robot died");
            }
        }


   }
}