import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        String GameStart; // ถ้าตอบ Yes คือ เริ่มเกมส์ ถ้า ตอบ NO คือไม่
        String name1 ; // name1 เก็บค่าที่รับจากผู้ใช้ โดย scanner
        String name2 ;
            Scanner myobj = new Scanner(System.in);
            System.out.println("Game Start");
            GameStart = myobj.nextLine();
            if (GameStart.equals("yes"))
            {
                Scanner myName = new Scanner(System.in);
                System.out.println("Enter your name");
                name1 = myName.nextLine();
                Player player1 = new Player(name1);
                System.out.println("Player 1 is : " + name1);
                System.out.println("Your budget is : "+ player1.init_budget);
            }
            else
            {
                System.out.println("");
                System.exit(0);
            }
        }






}


