// To find and print the number under 1 million which produces the longest collatz series

public class Main
{
  public static void main (String []args)
  {
    int maxlen = 0;
    int iNum = 0;
    for (int i = 2; i <= 1000000; i++)
    {
	    int len = 1;
	    long num= i;
	    while (num > 1)
	    {
	        if ((num % 2) == 0)
	            num = num / 2;
	        else
		        num = num * 3 + 1;
	        len++;
	    }
	    if (len > maxlen)
	    {
	        maxlen = len;
	        iNum = i;
	    }
    }
    System.out.println (iNum);
  }
}

