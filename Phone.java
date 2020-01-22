public class Phone{
   private String name;
   private double creditLimit;
   private String emailAddress;

   public Phone(){
     this("Hein Zaw Aung", 20000 , "hein@hotmail.com");
   }

   public Phone(String name     , String emailAddress) {
      this(name, 2000 , emailAddress);
   }

   public Phone(String name, double creditLimit, String emailAddress) {
      this.name = name;
      this.creditLimit = creditLimit;
      this.emailAddress = emailAddress;
   }

   public String getName() {
      return name;
   }

   public double getCreditLimit() {
      return creditLimit;
   }

   public String getEmailAddress() {
      return emailAddress;
   }
}