/******************************************************************************
A game development company wants to design a brain game application for kids. There are different types of tasks to be designed for the game. Among all the tasks, there is one task in which each digit of an exisiting number has to be replaced with another digit. Consider the following table:

Existing Numbers: 0 1 2 3 4 5 6 7 8 9

Replace By: 9 8 7 6 5 4 3 2 1 0



Input : An integer N

Output : An integer with replaced values



Constraints :

1) 0 <= N <=1000000

2) If N value is out of above range Print ("Wrong Input")



Sample Input 1 : 105671

Sample Output 1 : 894328

Sample Input 2 : 1000001

Sample Output 2 : Wrong Input


*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scn = new Scanner (System.in);

    int n = scn.nextInt ();

    int[] arr = new int[10];

    if (n == 0)
      {
	System.out.println (9);
      }

    for (int i = 0; i < 10; i++)
      {
	arr[i] = 9 - i;
      }

    int ans = 0;
    int newn;
    int pow = 1;

    while (n != 0)
      {

	int r = n % 10;
	newn = arr[r];
	ans = ans + (newn * pow);
	pow = pow * 10;
	n = n / 10;


      }

    System.out.println (ans);
  }
}
