package DAA;

public class RecursivelyAdd {
    public int recursiveAdd(int num){
        int result = 0;
        result += recursiveAdd(num/2);
        return result;
    }
    public static void main(String[] args) {
        int a = 123;
        RecursivelyAdd obj = new RecursivelyAdd();
        System.out.println(obj.recursiveAdd(a));
    }
}
