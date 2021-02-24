import java.util.ArrayList;
public class WordGame{
    private ArrayList<String> answers;
    private int score;
    private char letter;

    public WordGame(char letter){
        answers = new ArrayList<>();
        score = 0;
        this.letter = letter;
    }
    public boolean isRealWord(String word){
       /* implementation not shown: returns true or false
If the word is a real word in the dictionary */
    }
    public int linearSearch(String word, String[] wordList){
/* implementation not shown: returns the index where the word was found or -1 if it was not found  */
    }
    public void calculateScore(String[] usedAnswers){
      /* part b */
      for(int i = 0; i < answers.length; i++) {
        if(letter == answers.get(i).charAt(0)) {
          if(isRealWord(answers.get(i))) {
            if (linearSearch(answers.get(i), usedAnswers) != -1) {
              score += answers.get(i).length();
            }
          } else {
            score--;
          }
        } else {
          score--;
        }
      }
    }
 
    /* other methods and constructors not shown */
}
