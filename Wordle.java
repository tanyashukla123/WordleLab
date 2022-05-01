public class Wordle
{
private final String wordle;
private String[] alphabet;

  public Wordle (String word)
  {
    wordle=word;
    alphabet=new String[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z];
  }
 
  
  public static String inputAGuess (count)
  {
    int countGuess=count;
    String guess=" ";
    Scanner input = new Scanner(System.in);
    System.out.println("This is guess number " + countGuess + ". Guess the Wordle for today: ");
    guess = input.nextLine();
    return guess;
  }
  
  
  public String playWordle()
  {
    String guess= " ";
    char[] charGuess= new char[];
    String[] solution= new String[];
    while(count!=7 && solution.length!=6)
    {
      guess = inputAGuess(i);
      charGuess = covertToArray(guess);
      count++;
      for(int i=0; i<charGuess.length; i++)
      {
        if(wordle.contains(charGuess[i] && wordle.substring(i,i+1).equals(charGuess[i])){
          solution.add(i);
        }
        
          else if(wordle.contains(charGuess[i]){
            for(int j=0; j<alphabet.length; j++){
              if(alphabet[j].equals(charGuess[i]){
                alphabet[j]=alphabet[j].toLowerCase();
              }
            }
           }
                 
           else if(!wordle.contains(charGuess[i]){
              for(int k=0; k<alphabet.length; k++){
                if(alphabet[k].equals(charGuess[i]){
                  alphabet[k]=" ";
                }
              }
           }        
            
      }
                   
      System.out.println("Here are your correct letter guesses: " + solution);
      System.out.println("Here are your incorrect guesses: " + alphabet + " If the spot is blank, the letter is not contained in the Wordle. If the spot is lower case, the letter is in the wordle, but in a different spot than you guessed.");
          
    }
                   
    if(solution.length==6){
      return "Congratulations, you got the Wordle!";
    }
    
    else if(solution.length!=6){
      return "Sorry, you are out of tries!";
    }
                   
                   
  }
  
  
  public char[] convertToArray(String guess)
  {
    char[] characters = new char[];
    for(int i=0; i<guess.length(); i++)
    {
      characters.add(i);
    }
    return characters;
  }
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
      
      
   
