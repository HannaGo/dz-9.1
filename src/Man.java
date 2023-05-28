public class Man extends Person{
    public Man(String firstName, String lastName, int age, Boolean partner) {
        super(firstName, lastName, age);
    }

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);

    }

    public boolean isRetired(){
        return getAge() >= 65;
    }

    public void registerPartnership(Woman partner) {
        this.partner = partner;
        partner.partner = this;
        partner.lastName = this.lastName;
    }

    public void deregisterPartnership(boolean revertLastName) {
        if (revertLastName && partner != null) {
            partner.lastName = partner.maidenName;
        }
        this.partner = null;
    }


}
