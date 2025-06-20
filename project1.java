import java.io.*;
import java.util.*;
class game extends Thread
{
public static void main(String [] args) throws InterruptedException
{
Scanner sc=new Scanner(System.in);
String move,s;
int i;
char c[]=new char[1000];
//computer moves
while(true)
	{
String moves[]={"Rock" ,"Paper", "Scissor"};
String computermove=moves[new Random().nextInt(moves.length)];
System.out.println("coumputer has choosen its move");
System.out.println("");
System.out.println("now its your turn");
System.out.println(" ");

//player moves
while(true)
	{

System.out.println("enter your  move");
System.out.println(" ");
System.out.println("''Rock''\n''Paper''\n''Scissor'' ");
System.out.println(" ");
move=sc.nextLine();
if(move.equals("Rock") || move.equals("Paper") || move.equals("Scissor") )
{
System.out.println(" ");
break;
}
else
{
System.out.println("enter the valid move ''the first letter should be capital '' ");
}
	}
//loading
while(true)
	{

for(i=0;i<1;i++)
{

Thread.sleep(1000);
System.out.print("L");
Thread.sleep(1000);
System.out.print("O");
Thread.sleep(1000);
System.out.print("A");
Thread.sleep(1000);
System.out.print("D");
Thread.sleep(1000);
System.out.print("I");
Thread.sleep(1000);
System.out.print("N");
Thread.sleep(1000);
System.out.print("G");
Thread.sleep(1000);
System.out.print(".");
Thread.sleep(1000);
System.out.print(".");
Thread.sleep(1000);
System.out.print(".");
Thread.sleep(1000);
System.out.print(".");
Thread.sleep(1000);
System.out.print(".");
System.out.println();
}
Thread.sleep(1000);
break;
	}
System.out.println("computer choosen :"+computermove);

//winning
while(true)
	{
if(move.equals(computermove))
{
System.out.println("the game ends with Tie!");
break;
}
else if(move.equals("Rock"))
{
if(computermove=="Paper")
{
System.out.println("computer wins");
System.out.println("Better luck nexttime");
break;
}
else
{
System.out.println("player wins");
System.out.println("congratulations!!!");
break;
}
}
else if(move.equals("Paper"))
{
if(computermove=="Scissor")
{
System.out.println("computer wins");
System.out.println("Better luck nexttime");
break;
}
else
{
System.out.println("player wins");
System.out.println("Congratulations!!!");
break;
}
}
else if(move.equals("Scissor"))
{
if(computermove=="Rock")
{
System.out.println("computer wins");
System.out.println("Better luck nexttime");
break;
}
else
{
System.out.println("player wins");
System.out.println("congratulations!!!");
break;
}
}

	}
System.out.println(" if you want to play again ");
System.out.println("");
System.out.println("type '' Yes '' or ''No'' ");
System.out.println(" ");

s=sc.nextLine();
//playagain
while(true)
	{
if(s.equals("yes") || s.equals("Yes") || s.equals("no") || s.equals("No") )
{
System.out.println();
System.out.println("");
break;
}
else
{
System.out.println("enter the valid move");
}
	}
if(s.equals("no") || s.equals("No") )
{
System.out.println("");
break;
}
}
}
}