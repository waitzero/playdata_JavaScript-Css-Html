package dev.syntax.steop06collecttion.basic;

public class Mouse {
   
   private int age;
   private String name;
   private String address;
   private String company;
   
   
   
   public Mouse(int age, String name, String address, String company) {
      super();
      this.age = age;
      this.name = name;
      this.address = address;
      this.company = company;
   }
   public int getAge() {
      return age;
   }
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public String getCompany() {
      return company;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public void setCompany(String company) {
      this.company = company;
   }
   @Override
   public String toString() {
      return "Mouse [age=" + age + ", name=" + name + ", address=" + address + ", company=" + company + "]";
   }
   
   
}