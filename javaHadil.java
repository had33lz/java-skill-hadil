public class javaHadil {

    public class UserInfo {
String name, email;
int age;
boolean isActive;

// Create constructor that takes all parameters

        public UserInfo(String n, String e, int a, boolean i){
            name = n;
            email = e;
            age = a;
            isActive =  i;

        }
// Create getter and setter methods for all variables
        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
        public int getAge(){
            return age;
        }
        public boolean getActivity(){
            return isActive;
        }

        public String setName(String n){
            name = n;
        }
        public String setEmail(String e){
             email = e;
        }
        public int setAge(int a ){
            age = a;
        }
        public boolean setActivity(boolean i){
            i = isActive;

        }


// Create a method that displays user info nicely formatted
        public void displayInfo() {
            System.out.println("name is         :  " + name);
            System.out.println("age is          :  " + age);
            System.out.println("email is        :  " + email);
            System.out.println("activety status :" + isActive);
// Print user information in a nice format
        }
        // Main method for testing
        public static void main(String[] args) {
UserInfo u1 = new UserInfo("hadil", "had33l-@outlook.com", "20", true);

// Display their information
// Test your getters and setters

        }
    }

}
