//Programmed by Nina Matsukura Bernardino
//Class will represent a person that is associated with an insurance policy
//Step 1: Move the appropriate fields and methods of the Policy class into the PolicyHolder class
public class PolicyHolder{
   //Attributes
   private String firstName;
   private String lastName;
   private int age;
   private String smokerStatus;
   private double height; //inches
   private double weight; //pounds
   
   //Sets default values for attributes (no-arg constructor)
   public PolicyHolder(){
      firstName = "";
      lastName = "";
      age = 0; 
      smokerStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   //Contructor to initialize all fields with defaults
   public PolicyHolder(String firstName, String lastName, int age, String smokerStatus, double height, double weight){
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokerStatus = smokerStatus;
      this.height = height;
      this.weight = weight;     
   }
   
   //Setters and Getters
   //Holder first name 
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   public String getFirstName(){
      return firstName;
   }
   //Holder last name 
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   public String getLastName(){
      return lastName;
   }
   //Holder age
   public void setAge(int age){
      this.age = age;
   }
   public int getAge(){
      return age;
   }
   //Smoker status
   public void setSmokerStatus(String smokerStatus){
      this.smokerStatus = smokerStatus;
   }
   public String getSmokerStatus(){
      return smokerStatus;
   }
   //Holder height
   public void setHeight(double height){
      this.height = height;
   }
   public double getHeight(){
      return height;
   }
   //Holder weight
   public void setWeight(double weight){
      this.weight = weight;
   }
   public double getWeight(){
      return weight;
   }

   /**
      Method calculates BMI of the policyholder (no parameters)   
      @return The BMI of the policyholder
   */
   public double calculateBMI(){
      return (holderWeight * 703)/(holderHeight*holderHeight);
   }
 
}   
