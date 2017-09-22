// Create random limericks
// @Author: Adam Janecka
package pkg14_06;

public class Limericks {

    public static void main(String[] args) {
       
        // create lists of words
        String[] article = {"the ", "a ", "one ", "some ", "any "};
        String[] noun = {"boy ", "girl ", "dog ", "town ", "car "};
        String[] verb = {"drove ", "jumped ", "ran ", "walked ", "skipped "};
        String[] preposition = {"to ", "from ", "over ", "under ", "on "};
        String[] rhyme1 = {"cat ", "rat ", "bat ", "mat "};
        String[] rhyme2 = {"dog ", "log ", "fog ", "cog "};
        
        // randomly create 20 sentences
        // Order article - noun - verb - preposition - article - noun
        for (int i = 0; i < 20; i++)
        {
            int article1 = (int)(Math.random() * 5);
            int noun1 = (int)(Math.random() * 5);
            int verb1 = (int)(Math.random() * 5);
            int preposition1 = (int)(Math.random() * 5);
            int article2 = (int)(Math.random() * 5);
            int rhyme3 = (int)(Math.random() * 4);
                                 
            // Separate the limericks 
            if (i % 5 == 0)
                System.out.println();
            
            String sentence = "";
            if (i % 5 == 0 || i % 5 == 1 || i % 5 == 4)
            sentence += article[article1] + noun[noun1] + verb[verb1]
                    + preposition[preposition1] + article[article2]
                    + rhyme1[rhyme3];
            else
                sentence += article[article1] + noun[noun1] + verb[verb1]
                    + preposition[preposition1] + article[article2]
                    + rhyme2[rhyme3];
            
            // Make first letter uppercase
            sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
            System.out.print(sentence.trim() + ".\n");

        }
        System.out.println();
    } // end method main
} // end class Limericks
