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

        public void setName(String n){
            name = n;
        }
        public void setEmail(String e){
             email = e;
        }
        public void setAge(int a ){
            age = a;
        }
        public void setActivity(boolean i){
            isActive = i;

        }


// Create a method that displays user info nicely formatted
        public void displayInfo() {
            System.out.println("name is         :  " + name);
            System.out.println("age is          :  " + age);
            System.out.println("email is        :  " + email);
            System.out.println("activety status :" + (isActive? "active": "not active"));
// Print user information in a nice format
        }
        // Main method for testing
        public static void main(String[] args) {
            javaHadil outer = new javaHadil();
            UserInfo u1 = outer.new UserInfo("hadil", "had33l-@outlook.com", 20,true);
            UserInfo u2 = outer.new UserInfo("mariam", "mariam-@outlook.com", 45,false);
            UserInfo u3 = outer.new UserInfo("danial", "danial-@outlook.com", 40,true);


// Display their information
// Test your getters and setters

        }
    }

}
