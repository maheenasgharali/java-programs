public class method {
   
    public static void main(String[] args) {
       int a = 11;
       int b = 6;
       int c = maxFunction(a, b);
       System.out.println("MaximumValue = " + c);
    }
 
   
    public static int maxFunction(int n1, int n2) {
       int max;
       if (n1 < n2)
          max = n2;
       else
          max = n1;
 
       return max; 
    }
 }