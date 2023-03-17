class AddressBook {
    //Variable declaration
    private String Fname, Lname, Address, City, state1, Email;
    private long Pno;

    //public getter and setter methods for each data member
    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    // for last name
    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    // for address
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    //State
    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    // city
    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    //

    // Email
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;

    }

    // phone number
    public long getPno()
    {
        return Pno;
    }
    public void setPno(long Pno)
    {
        this.Pno = Pno;
    }
}  public class Main {
    public static void main(String[] args) {
        //create instance of Address Book
        AddressBook ab=new AddressBook();
        //set values for data members through setter methods
        ab.setFname("Mahendras sigh");
        ab.setLname("Dhoni");
        ab.setAddress("xyx");
        ab.setState1("Jharkhand");
        ab.setEmail("xyz@gamil.com");
        ab.setCity("Ranchi");
        ab.setPno(987654321);
        //read data member values through getter methods
        System.out.println("First name:" +ab.getFname());
        System.out.println("Last name :" +ab.getLname());
        System.out.println("Address   :" +ab.getAddress());
        System.out.println("State     :" +ab.getState1());
        System.out.println("Email id  :" +ab.getEmail());
        System.out.println("City      :" +ab.getCity());
        System.out.println("Phone no  :" +ab.getPno());
    }
}