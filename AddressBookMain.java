public class AddressBookMain {
        public static void main(String[] args) {
            ContactDetails contactDetails = new ContactDetails();

            //setting the value of contact details
            contactDetails.setfName("Mohit");
            contactDetails.setlName("Raj");
            contactDetails.setEmailId("Rajmohit.129@gmail.com");
            contactDetails.setPhoneNumber("6202968551");
            contactDetails.setAddress("Patna");
            contactDetails.setZip(800001);
            contactDetails.setCity("Patna");
            contactDetails.setState("Bihar");

            System.out.println("Details of Person" +contactDetails);
        }
    }

