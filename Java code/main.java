package callOfDuty;

import java.util.Scanner;

public class CallOfDutyGame {
    public static void main(String[] args) {

        Base base = new Base();
        Weapon missile = new Missile(base);
        Weapon rocketLauncher = new RocketLauncher(base);

        Scanner input = new Scanner(System.in);

        Base.note();

        String c;

        do {

            base.placeAllTargetRandomly();

            while (!base.isGameOver(missile,rocketLauncher)  && !base.win()) {
                base.print();
            }

            System.out.print("Want to play again? Y/N: ");
            input.nextLine();
            c = input.nextLine();

        } while (c.equalsIgnoreCase("Y"));

    }
}

//If you want the complete code, then contact me.
