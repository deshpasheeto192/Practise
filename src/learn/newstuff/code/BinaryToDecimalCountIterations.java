package learn.newstuff.code;

public class BinaryToDecimalCountIterations {
    public static void main(String[] args) {
        BinaryToDecimalCountIterations test = new BinaryToDecimalCountIterations();
        System.out.println("Decimal to binary completed in "+test.solution("111")+" steps!"); //decimal number 51
    }
        public int solution(String S) {
            // write your code in Java SE 8
            int decimal = Integer.parseInt(S,2);

            int count = 1;
            while(decimal/2!=0) {
                if(decimal%2==0) {
                    decimal = decimal/2;
                    // System.out.println(decimal);
                    count++;
                } else {
                    decimal -= 1;
                    //System.out.println(decimal);
                    count++;
                }
            }
            return count;
        }
    }
