package AlgorithmMadeUpExamples;

public class Question3 {
    
    // Java method which returns words starts and finishes with same letter which are inside an array

    // This program is actually checking the chars so it is case sensetive. If you don't want it to be case sensetive check
    // NOTE part after the code (37th row)
    public static void main(String[] args) {
        
        // Declaring array and calling method
        String[] array = { "Caner", "Taner", "Nalan", "eleme"};
        sameLetter(array);

    }

    // Declaring method
    public static void sameLetter(String[] array) {

        // For loop to reach each element of array
        for(int i=0; i<array.length; i++) {

            // Checking the elements first and last char
            if(array[i].charAt(0) == array[i].charAt(array[i].length()-1)){

                // If they are same printing
                System.out.println(array[i]);

            } 

        }

    }

}

    // NOTE: If you don't want the program to be case sensetive before the if inside the for (24th row) you can add another
    // if to check if the letters are uppercase or lowercase then you can fix them to lower or upper case to check actual letters
    // not the chars.