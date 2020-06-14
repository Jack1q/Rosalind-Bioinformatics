import java.util.*;

public class FindingaSharedMotif
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    // first, handle FASTA-formatted strings into data structure
    ArrayList<String> dnaStrings = new ArrayList<>();
    String currentValue = "";
    while (s.hasNext())
    {
      String text = s.next();
      if (text.contains(">"))
      {
        if (currentValue.length() > 0)
        {
          dnaStrings.add(currentValue);
          currentValue = "";
        }
      }
      else
        currentValue += text;
    }
    dnaStrings.add(currentValue);
    String sequence1 = dnaStrings.get(0);
    String sequence2 = dnaStrings.get(1);
    
    ArrayList<String> substrings = new ArrayList<>();
    for (int i = 0; i < sequence1.length(); i++)
      for (int j = i + 1; j < sequence1.length() + 1; j++)
        // Ignore 1 len strings, add those common between sequence1 and sequence2
        if (Math.abs(i - j) > 1 && sequence2.contains(sequence1.substring(i, j)))
          substrings.add(sequence1.substring(i, j));

    // sort arraylist reversely by length
    for (int i = 0; i < substrings.size() - 1; i++)
        for (int j = 0; j < substrings.size() - 1; j++)
            if (substrings.get(j).length() < substrings.get(j + 1).length()) {
                String temp = substrings.get(j);
                substrings.set(j, substrings.get(j+1));
                substrings.set(j+1,temp);
            }
 
    // now iterate through this arraylist.
    // find the first one that works. return that.
    String answer = "";
    boolean found = false;
    for (int i = 0; i < substrings.size() && !found; i++)
    {
      boolean allContain = true;
      for (int j = 2; j < dnaStrings.size(); j++)
        if (!dnaStrings.get(j).contains(substrings.get(i)))
          allContain = false;
      if (allContain)
      {
        found = true;
        answer = substrings.get(i);
      }
    }
    System.out.print(answer);
    
  }
}
