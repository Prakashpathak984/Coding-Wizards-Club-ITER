/*
Joey, a so-called artist from the show “Days of our Life’s” lived with Chandler, a man who has
to do something with calculations, in an apartment in Manhattan. They had a duck and a chick
as their pets. Since then, Joey wishes chick to be more like duck. In order to do so, he decides to
slowly transcribe chick's DNA into RNA. But he has to write a very short code in order to do the
transcription so as not to make chick aware of the change.

The four nucleotides found in DNA are adenine (A), cytosine (C), guanine (G) and thymine (T).
The four nucleotides found in RNA are adenine (A), cytosine (C), guanine (G) and uracil (U).

Given a DNA strand, its transcribed RNA strand is formed by replacing each nucleotide with its
complement:
• G --> C
• C --> G
• T --> A
• A --> U
*/

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String dna = sc.nextLine ();
    dna=dna.toUpperCase();
    sc.close ();
    String rna = "";
    int flag=0;
    for (int i = 0; i < dna.length(); i++)
     {
	    if (dna.charAt (i) == 'A')
	        rna = rna + 'U';
	    else if (dna.charAt (i) == 'T')
	        rna = rna + 'A';
    	else if (dna.charAt (i) == 'C')
	        rna = rna + 'G';
    	else if (dna.charAt (i) == 'G')
	        rna = rna + 'C';
	    else
	    {
	        flag=1;
	        break;
	    }
    }
    if (flag==1)
      System.out.println ("Invalid Input");
    else
      System.out.println (rna);
  }
}
