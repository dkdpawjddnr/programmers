import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Loc> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new Loc(in.nextInt(), in.nextInt()));
        }
        Collections.sort(list, new Comparator<Loc>() {
            @Override
            public int compare(Loc o1, Loc o2) {
                if(o1.y == o2.y)
                    return o1.x - o2.x;
                else
                    return o1.y - o2.y;
            }
        });
        for(Loc i : list)
            System.out.println(i);
    }
}
class Loc{
    int x;
    int y;

    public Loc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}