public class StringOperation {
    public static void main(String[] args) {
        String apple = "I love apples";     // makes a string
        System.out.println(apple);         // prints "I love apples"
        System.out.println(apple.toUpperCase()); //prints "I LOVE APPLES"
        System.out.println(apple.length()); //prints the number of characters in "I love apples"
        System.out.println(apple.substring(0, 4)); //prints the characters between 0 - 4 
        System.out.println(apple.toLowerCase()); //prints lowercase version of "I love apples"

        String tables = " and 2 organes!";      //makes another string
        int lock = tables.length(); //makes string a variable 
        System.out.println(lock); //prints amount of characters in " and 2 oranges!"
        System.out.println(apple + tables);     //prints "I love apples and 2 oranges!"

        String age = "I am ";   //makes a string 
        int x = 17; //makes a varible x = 17
        System.out.println(age + x + " years old."); //prints "I am 17 years old"

        System.out.println("my mom said  \"Hello\"."); //prints " my mom said "Hello"."
        
        System.out.println("Name\t\tAddress"); //prints name and address with 2 tabs worth of space betweenn
        System.out.println("\"I love air!\""); //prints ""I love air!""
    } 
}