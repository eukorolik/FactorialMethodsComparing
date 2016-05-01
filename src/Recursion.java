
public class Recursion {

    public int fact(int num) {
        return (num == 0) ? 1 : num * fact(num - 1);
    }
}
