import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int area = 0;//넓이
        int x, y;//입력받을 좌표

        boolean[][] paper = new boolean[101][101];//도화지

        for(int i = 0; i<n; i++)
        {
            //좌표를 입력받는다
            x = scanner.nextInt();
            y = scanner.nextInt();

            //x, y좌표 + 10 범위를 돌면서 칠해져 있지 않으면 칠한다
            for(int j = x; j<x+10; j++)
            {
                for(int k = y; k<y+10; k++)
                {
                    //칠해져 있지 않다면
                    if(!paper[j][k])
                    {
                        paper[j][k] = true;//칠한다
                        area++;//총 넓이 증가
                    }
                }
            }
        }

        System.out.print(area);
    }
}