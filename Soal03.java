package Lab01;

public class Soal03 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        
        int sentenceLength = sentence.length();

        //Picking two random index and a substring from the sentence
        int beginIndex = (int) (Math.random() * sentenceLength);
        int endIndex = beginIndex + (int) (Math.random() * (sentenceLength - beginIndex));
        String correctAnswer = sentence.substring(beginIndex, endIndex + 1);
        
        //Printing the question
        System.out.print("What is the substring from index " + beginIndex + " to " + endIndex + "? ");
        String answer = input.nextLine();
        
        //Checking the answer and choosing the correct response 
        if (answer.equals(correctAnswer)){
            System.out.println("Correct! You're really good at this!");
        }
        else{
            System.out.println("Incorrect. The correct answer would be: " + correctAnswer);
        }
    }
}
