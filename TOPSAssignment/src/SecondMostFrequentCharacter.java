package StringDemo;
import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentCharacter 
{
    public static void main(String[] args) 
    {
        String str = "successes";
        System.out.println("The given string is: " + str);

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray())
        {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        char firstChar = ' ', secondChar = ' ';

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) 
        {
            int frequency = entry.getValue();
            if (frequency > firstMax)
            {
                secondMax = firstMax;
                secondChar = firstChar;
                firstMax = frequency;
                firstChar = entry.getKey();
            } 
            else if (frequency > secondMax && frequency != firstMax) 
            {
                secondMax = frequency;
                secondChar = entry.getKey();
            }
        }

        if (secondChar != ' ') 
        {
            System.out.println("The second most frequent char in the string is: " + secondChar);
        } 
        else
        {
            System.out.println("There is no second most frequent character.");
        }
    }
}
