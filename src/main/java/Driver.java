public class Driver {
        String name;
        int licenseId;

        public Driver(String name, int licenseId){
            this.name = name;
            this.licenseId = licenseId;
        }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseId=" + licenseId +
                '}';
    }
}
