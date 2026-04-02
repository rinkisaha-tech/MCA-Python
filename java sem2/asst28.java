
import java.util.Scanner;


class textAnalyzer{
    void textAnalyze(String text){
        int wordCnt = 0;
        int vowelCnt = 0;
        int digitCnt = 0;
        int specialCharCnt = 0;

        String[] words = text.trim().split("\\s+");
        wordCnt = words.length;
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                vowelCnt++;
            else if (Character.isDigit(ch))
                digitCnt++;
            else if (!Character.isLetter(ch) && !Character.isWhitespace(ch))
                specialCharCnt++;
        }

        System.out.println("Text Stat");
        System.out.println("Total Words = " + wordCnt);
        System.out.println("Total Vowel = " + vowelCnt);
        System.out.println("Total Digits = " + digitCnt);
        System.out.println("Total Special Character = " + specialCharCnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String inputText = sc.nextLine();

        textAnalyzer t = new textAnalyzer();

        t.textAnalyze(inputText);

        sc.close();
    }
}