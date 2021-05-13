/******************************************************************************
  
                              TCS DCA   Q-1
                  Take string as an input and print if it contains all alphabets 

*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scn = new Scanner (System.in);

    String s = scn.nextLine ();

    String ls = s.toLowerCase ();

    String lsR = ls.replace (" ", "");

      Set < Character > hsc = new HashSet <> ();

    char[] ch = lsR.toCharArray ();

    for (char c:ch)
      {

	if (Character.isLetter (c))
	  hsc.add (c);

      }

    if (hsc.size () == 26)
      System.out.println ("All");

    else
      System.out.println ("not All");


  }
}

