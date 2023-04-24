package complete.adapter;

import complete.adapter.adapter.SquarePegAdapter;
import complete.adapter.round.RoundHole;
import complete.adapter.round.RoundPeg;
import complete.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
    public static void main(String[] args) {
        //TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
        RoundHole rhole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        //TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
        if (rhole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }
        //TO-DO: Create 2 instances of SquarePeg with 2 different widths
        SquarePeg speg1 = new SquarePeg(10);
        SquarePeg speg2 = new SquarePeg(15);

        //Note: You can't make RoundHole instance "fit" with SquarePeg instance
        //Therefore, we need to use Adapter for solving the problem.

        //TO-DO: Create 2 corresponding instances of SquarePegAdapter
        SquarePegAdapter squarePegAdapter_1 = new SquarePegAdapter(speg1);
        SquarePegAdapter squarePegAdapter_2 = new SquarePegAdapter(speg2);

        //TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance
        //show a suitable message
        if (rhole.fits(squarePegAdapter_1)) {
            System.out.println("Rhole fits correctly with small RoundPegAdapter instance");
        }
        //TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance
        //show a suitable message
        if (!rhole.fits(squarePegAdapter_2)) {
            System.out.println("Rhole cannot fits with big RoundPegAdapter instance");
        }

    }
}