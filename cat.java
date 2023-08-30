package homework1;

public class cat {
    private String name;
    private int age;
   public cat(String name, int age, int weight) {
       this.name = name;
       this.age = age;
   }

   public cat() {
   }
   public void sayMeow() {
       System.out.println("Мяу!");
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }
   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }
  
   }