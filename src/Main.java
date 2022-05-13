import java.util.*;

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

/*
    /----------------------RIMUOVERE DIRETTAMENTE----------------------/
        //randomNumbers.remove(2);
        //randomNumbers.remove(0);


    /----------------------RIMOZIONE CON ITERATORE---------------------/
    Obbliga alla creazione di un nuovo arrayList e lo snippet è il più lungo

       List<Integer>tempList = new ArrayList<>();

        for (Integer n:randomNumbers){
            if(!tempList.contains(n)){
                tempList.add(n);

            }
        }
        randomNumbers.clear();
        randomNumbers.addAll(tempList);


    /--------------------RIMOZIONE CON LinkedHashSet-------------------/
    Obbliga alla creazione di un Set

        Set<Integer> tempSet = new LinkedHashSet<>(randomNumbers);
        randomNumbers.clear();
        randomNumbers.addAll(tempSet);


    /-----------------RIMOZIONE CON stream().distinct()----------------/
    Obbliga alla creazione di un nuovo arrayList. Lo snippet è il più corto ma più complesso da capire

        List<Integer> newList = randomNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println(newList.toString());
*/

        List<Integer>tempList = new ArrayList<>();

        for (Integer n:randomNumbers){
            if(!tempList.contains(n)){
                tempList.add(n);

            }
        }
        randomNumbers.clear();
        randomNumbers.addAll(tempList);

        System.out.println(randomNumbers.toString());
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers.toString());
    }
}