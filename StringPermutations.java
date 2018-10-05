import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    if(args.length<1){
      System.out.println("Usage: Java Permutations [word]");
      return;
    }
    //Getting The word

    String word = args[0];

    //Create Empty Array List indices
  ArrayList<Integer> indices = new ArrayList<Integer>();

  //Arraylist initialization

  ArrayList<String> permutations = Main.getPermutations(word, indices);
   //Display permutations

   System.out.println(permutations);

   return;
  }
  public static ArrayList<String> getPermutations(String word, ArrayList<Integer> indices){

    int length = word.length();

    ArrayList<String> toReturn = new ArrayList<String>();

    //If all the characters are considered then we are done

    if(indices.size() == length){
      toReturn.add("");
      return toReturn;
    }

    //Iterating over each character to find the permutation

    for(int i=0;i<length;i++){

      //Skip if index is already considered

      if(indices.contains(i)) continue;

      //Duplicate ArrayList of indices that have already been considered

      ArrayList<Integer> newIndices = new ArrayList<Integer>();
      for(int index : indices){

        newIndices.add(index);

      }
      newIndices.add(i);

      //String Permutation calculation using recursion

      ArrayList<String> permutations = getPermutations(word, newIndices);

      //Adding the current character before the permutation of the rest of the word

      //If we are considering A right now the permutations will be [bc, cb]

      //Adding A before before the permutations

      for(String str: permutations){

        toReturn.add(word.charAt(i) + str);
        
      }
    }
    return toReturn;
  }
}
