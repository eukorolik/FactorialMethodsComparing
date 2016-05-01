
public class Iteration {

    public int fact(int num) {

        int result = num;

        while(num>1)
        {
            num -= 1;
            result *= num;
        }
        return result;
    }
}

