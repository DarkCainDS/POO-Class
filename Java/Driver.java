 class Driver extends Account {
        public Driver(String name, String document, String email, String password){
            super(name, document, email, password);
        }
        void printDataDriver(){
            System.out.prinln("Driver license: " + document + "Name driver: " + name + "E-mail: " + email + "Password: " + password);
        }
}
