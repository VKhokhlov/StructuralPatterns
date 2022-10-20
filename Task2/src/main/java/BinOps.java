public class BinOps {
    public String sum(String a, String b) throws NumberFormatException {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int res = intA + intB;

        return Integer.toBinaryString(res);
    }

    public String mult(String a, String b) throws NumberFormatException {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int res = intA * intB;

        return Integer.toBinaryString(res);
    }
}