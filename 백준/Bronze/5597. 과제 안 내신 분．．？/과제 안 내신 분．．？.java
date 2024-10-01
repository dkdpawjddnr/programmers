import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for(int i=1; i<=30; i++){
            set.add(i);
        }
        for(int j=1; j<=28;j++){
            int b = sc.nextInt();
            if(set.contains(b)) set.remove(b);
        }
        int min =   set.stream().min(Integer :: compareTo).get();
        int max =   set.stream().max(Integer :: compareTo).get();
        System.out.println(min);
        System.out.println(max);
    }

}