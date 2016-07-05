public class WordTester{
 
 public static void main(String [] args){
  Word w1 = new Word();
  w1.setWord("supercalifragilisticexpialidocious");
  Word w2 = new Word(w1.subWord(0,5));
  Word w3 = new Word(w2);
  Word w4 = new Word();
  w4 = w3;  
  
  //Testing constructor execution
  System.out.println("Word 1: \n -------------\n" + w1.toString());
  System.out.println();
  System.out.println("Word 2: \n -------------\n" + w2.toString());
  System.out.println();
  System.out.println("Word 3: \n -------------\n" + w3.toString());
  System.out.println();
  System.out.println("Word 4: \n -------------\n" + w4.toString());
  System.out.println();
  
  //Testing comparator methods
  System.out.println("Is Word 2 equal to Word 3? " + w2.equals(w3));
  System.out.println("Is Word 3 equal to Word 4? " + w3.equals(w4));
  System.out.println("Is Word 2 equal to Word 4? " + w4.equals(w2));
  System.out.println("Is Word 3 the same object as Word 4? " + (w3==w4));
  System.out.println("Is Word 2 the same object as Word 4? " + (w4==w2));
  System.out.println("Difference between Word 1 and Word 2: "+ w1.compareTo(w2));
  System.out.println("Difference between Word 2 and Word 3: "+ w2.compareTo(w3));
  System.out.println("Difference between Word 1 and Word 4: "+ w1.compareTo(w4));
  
  System.out.println();
  System.out.println();
  
  //Testing manipulator methods
  w1.setWord(w1.subWord(5,9));
  System.out.println("Word 1: \n -------------\n" + w1.toString());
  System.out.println();
  
  w2.setWord(w1.getWord());
  System.out.println("Word 2: \n -------------\n" + w2.toString());
  System.out.println();
  
  w4.setWord(w1.subWord(2));
  System.out.println("Word 3: \n -------------\n" + w3.toString());
  System.out.println();
  System.out.println("Word 4: \n -------------\n" + w4.toString());
  System.out.println();
  
  //Testing comparator methods
  System.out.println("Is Word 2 equal to Word 3? " + w2.equals(w3));
  System.out.println("Is Word 3 equal to Word 4? " + w3.equals(w4));
  System.out.println("Is Word 2 equal to Word 4? " + w4.equals(w2));
  System.out.println("Is Word 3 the same object as Word 4? " + (w3==w4));
  System.out.println("Is Word 2 the same object as Word 4? " + (w4==w2));
  System.out.println("Difference between Word 1 and Word 2: "+ w1.compareTo(w2));
  System.out.println("Difference between Word 2 and Word 3: "+ w2.compareTo(w3));
  System.out.println("Difference between Word 1 and Word 4: "+ w1.compareTo(w4));
  //Testing toCharArray
  boolean testa = false;
  char[] x = w1.toCharArray();
  char[] y = w1.getWord().toCharArray();
  for (int i = 0; i < x.length; i++)
  {
          testa = x[i] == y[i];
  }
  System.out.println("Is the toCharArray method working? " + (testa ? "Yes" : "No"));

  //Testing extra Credit
  
  // System.out.println("Before replacing al with bob: " + w1.getWord());
  // w1.replace("al", "bob");  
  // System.out.println("After replacing al with bob: " + w1.getWord());
  // System.out.println("Does cali contain bob? " + new Word("cali").contains("bob"));
  // System.out.println("Does cbobi contain bob? " + new Word("cbobi").contains("bob"));
 }
}
