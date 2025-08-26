// Author: Jerald Huang (A period)
// Date: 2025-08-26

public class NameThatCelebrity {
        public static void main(String[] args){
            String s1 = "Allan Alda";
            String s2 = "John Wayne";
            String s3 = "Gregory Peck";

            String cut1 = s1.substring(2, s1.length() - 3);
            String cut2 = s2.substring(2, s2.length() - 3);
            String cut3 = s3.substring(2, s3.length() - 3);

            System.out.println(s1 + ">>>" + cut1);
            System.out.println(s2 + ">>>" + cut2);
            System.out.println(s3 + ">>>" + cut3);
        }
}