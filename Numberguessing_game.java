import java.util.Scanner;
class program
{
    public static void numberguessing()
    {
        Scanner sc=new Scanner(System.in);

        int limit,round,score,g_num,u_num;
        
        score=0;
        round=3;

        while(round!=0)
        {
            if(round==3)
            {
                limit=10;
            }
            else if(round==2)
            {
                limit=5;
            }
            else
            {
                limit=3;
            }
        
            g_num=1+(int)(100*Math.random());
        
            System.out.println("You are in round "+(3-round+1)+" and you have "+limit+" chances for your guess");
            while(limit!=0)
            {
                System.out.println("Enter your guess:");
                u_num=sc.nextInt();
                limit--;

                if(u_num==g_num)
                {
                    System.out.println("You guessed the right number!");
                    break;
                }
                else if(u_num<g_num)
                {
                    System.out.println("You guess is less than the number!");
                }
                else
                {
                    System.out.println("You guess is more than the number!");
                }
            }
            score=score+limit*10;
            round--;
        }
        System.out.println("You score is "+score+"/180");
        sc.close();
    }
    public static void main(String[] args)
    {
        numberguessing();
    }
}
