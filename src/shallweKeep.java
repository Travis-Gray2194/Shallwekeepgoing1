//Travis Gray
//Write an application that asks a user if they want to continue, and only stops when they type 'n'.
//Validate your code! (Cater for values that are not 'y' or 'n')



import java.util.Scanner;

public class shallweKeep {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char ch1 = 110;//ASCII code for n
        String text="n";
        String text2 = new String("n");
        int letter;
        System.out.println("Type a letter");
        text = keyboard.nextLine();


//Notes: equals() & equalsIgnoreCase() and Both of these methods are used for comparing two strings.
// The only difference between them is that the equals() methods considers the case while equalsIgnoreCase() methods ignores the case during comparison.
// For e.g. The equals() method would return false if we compare the strings “TEXT” and “text” however equalsIgnoreCase() would return true.
        while(!text.equalsIgnoreCase("N")){
            System.out.println("Do you want to continue");
            keyboard.nextLine();


        }
        }
}



