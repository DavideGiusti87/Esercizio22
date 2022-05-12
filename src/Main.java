import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Lists 02
Exercise: lists 2

define a testing class with a main() method where you:
define a List of integers called divisorsOf52 that contains all the divisors of 52
define a List of integers called randomNumbers that contains the following numbers: 1, 60, 13, 12
use a specific method of List for appending all the elements of divisorsOf52 at the bottom of randomNumbers
print the elements of randomNumbers and the number of items inside randomNumbers
find the positions of the duplicates and remove them, leaving just 1 occurrence of a specific integer
print again the elements of randomNumbers and the number of items inside randomNumbers
sort randomNumbers in descending order using Collections.sort()
print again the elements of randomNumbers
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> divisorsOf52 = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(4);
                add(13);
                add(26);
                add(52);
            }
        };

        List<Integer> randomNumbers = new ArrayList<Integer>(){
            {
                add(1);
                add(60);
                add(13);
                add(12);
            }
        };
        randomNumbers.addAll(divisorsOf52);
        System.out.println(randomNumbers.toString());
        System.out.println(randomNumbers.size());


       List<Integer>index = new ArrayList<>();
/*
        for (int i=0;i< 4;i++){
            for (int j=0; j< divisorsOf52.size();j++){
                if (randomNumbers.get(i).equals(divisorsOf52.get(j))){
                    //randomNumbers.remove(i);
                    index.add(i);
                }
            }
        }
        index.sort(Collections.reverseOrder());
        System.out.println(index.toString());
        for (int i=0;i<index.size();i++){
            randomNumbers.remove(index.get(i));
        }
*/

        randomNumbers.remove(2);
        randomNumbers.remove(0);
        System.out.println(randomNumbers.toString());
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers.toString());
    }
}