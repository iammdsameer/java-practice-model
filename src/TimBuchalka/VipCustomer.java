package TimBuchalka;

public class VipCustomer {

    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Default", 0d, "default@test.com");
    }

    public VipCustomer(String name, double limit) {
        this("Default", limit, "default@test.com");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        VipCustomer sita = new VipCustomer();
        System.out.println(sita.getName() + " is limited to " +
                            sita.getLimit() + " contacted from " + sita.getEmail());

        VipCustomer harry = new VipCustomer("Harry", 1000);
        System.out.println(harry.getName() + " is limited to " +
                harry.getLimit() + " contacted from " + harry.getEmail());

        VipCustomer sameer = new VipCustomer("Sameer", 1000000d, "sam@vip.com");
        System.out.println(sameer.getName() + " is limited to " +
                sameer.getLimit() + " contacted from " + sameer.getEmail());
    }
}
