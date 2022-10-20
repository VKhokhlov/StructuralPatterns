public class BinFacade {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println(bins.sum("1010", "0101"));
        System.out.println(bins.mult("1010", "0101"));
    }
}
