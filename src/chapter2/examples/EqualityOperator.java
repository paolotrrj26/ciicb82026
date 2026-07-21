package chapter2.examples;

class File {
    //just used for sample
}

public class EqualityOperator {
    
    public static void main(String[] args) {
        File x = new File();
        File y = new File();
        File z = x;
        System.out.println(x == y);
        System.out.println(x == z);
    }
}
