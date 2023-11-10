public class Test {
    public static void main(String[] args) {
        Bog bog = new Bog();
        System.out.println("bog.getStatus() = " + bog.getStatus());
        bog.laan();
        System.out.println("bog.getStatus() = " + bog.getStatus());
        bog.aflever();
        System.out.println("bog.getStatus() = " + bog.getStatus());
        bog.laan();
        bog.reserver();
        System.out.println("bog.getStatus() = " + bog.getStatus());
        bog.aflever();
        System.out.println("bog.getStatus() = " + bog.getStatus());

    }
}
