//Author Jerald Huang
//Date 2025-08-25

public class StringPractice {
    public static void main(String[] args) {
        //question 1 
        String s = "The number of rabbits is ";
        int argh = 129;
        String report = s + argh;
        System.out.println(report + "."); //prints "The number of rabbits is 129."

        //question 2
        String p = "Groovy Dude?";
        System.out.println( p.toUpperCase( ) ); //prints the uppercase version

        //question 3
        String g = "Computer Science is for nerds";
        System.out.println(g.toLowerCase()); //prints small letters for the sentence "Computer Science is for nerds" 

        //question 4
        String c;
        String m = "The Gettysburg Address";
        c = m.substring(4); 
        System.out.println(c); //Prints "Gettysburg Address"

        //question 5
        String b = "Four score and seven years ago,";
        String j = b.substring(7, 12); 
        System.out.println(j); //prints characters 7 - 12 "ore a"

        //question 6 
        int orange;
        String surface = "Surface tension";
        orange = surface.length( ); 
        System.out.println(orange); //prints the number of characters in "Surface tension" (15)

        //question 7
        String k = "Look here!";
        int count = k.length();
        System.out.println("\"" + k + "\" has " + count + " characters.");  //prints ""Look here!" has 10 characters."

        //question 8
        String men = "good";
        System.out.println("All \"" + men + "\" men should come to the aid of their country."); //prints "All "good" men should come to the aid of their country. 

        //question 9
        System.out.println("Hello\nHello again"); //prints "Hello" and "Hello again" on 2 differnt lines

        //question 10
        System.out.println("A backslash looks like this \\, ...right?");

        //question 11
        String pq = "Eddie Haskel"; //makes string pq = "Eddie Haskel"
        int hm = pq.length( ); //makes a varible hm = the length of pq (11 characters) 
        String ed = pq.substring(hm - 4); //makes a string ed which takes the substring of pq from hm - 4 where hm is - to 11
        System.out.println(ed); //prints skel 

        //question 12
        String human = "Herman Munster"; //creates string human
        char fifthChar = human.charAt(5);   //stores the 5th character in human string 
        System.out.println(fifthChar); //prints fifthChar 5th character in Herman Munster
        }
    }