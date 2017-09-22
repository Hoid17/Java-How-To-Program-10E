// Creates random sentences with a list of words
// @Author: Adam Janecka
package pkg14_05;

public class RandomSentences {

    public static void main(String[] args) {
        
        // create lists of words
        String[] article = {"the ", "a ", "one ", "some ", "any "};
        String[] noun = {"boy ", "girl ", "dog ", "town ", "car "};
        String[] verb = {"drove ", "jumped ", "ran ", "walked ", "skipped "};
        String[] preposition = {"to ", "from ", "over ", "under ", "on "};
        
        // randomly create 20 sentences
        // Order article - noun - verb - preposition - article - noun
        for (int i = 1; i <= 20; i++)
        {
            int article1 = (int)(Math.random() * 5);
            int noun1 = (int)(Math.random() * 5);
            int verb1 = (int)(Math.random() * 5);
            int preposition1 = (int)(Math.random() * 5);
            int article2 = (int)(Math.random() * 5);
            int noun2 = (int)(Math.random() * 5);
            
            String sentence = "";
            sentence += article[article1] + noun[noun1] + verb[verb1]
                    + preposition[preposition1] + article[article2]
                    + noun[noun2];
            
            // Make first letter uppercase
            sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
            System.out.print(sentence.trim() + ".\n");
        }
        System.out.println();
    } // end method main
} // end class RandomSentences
