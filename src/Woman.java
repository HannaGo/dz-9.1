public class Woman extends Person{
    protected String maidenName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.maidenName = lastName;
    }

    public boolean isRetired() {
        return age >= 60;
    }

    public void registerPartnership(Man partner) {
        this.partner = partner;
        partner.partner = this;
        this.lastName = partner.lastName;
    }

    public void deregisterPartnership(boolean revertLastName) {
        if (revertLastName) {
            this.lastName = maidenName;
        }
        this.partner = null;
    }

}
