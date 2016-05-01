
public class ParseValue {

    public Boolean ParseRPV (int a) {
        if (a <= 0) {
            return false;
        }
        if (a > 16) {
            return false;
        }
        return true;
    }
}
