public class MyClass {   
 private String value;   
 public MyClass(String value) {
 this.value = value;
 }   
 public String getValue() {
 return value;
 }
 public static void main(String[] args) {       
 MyClass myInstance = new MyClass("blue");        
 System.out.println("Value: " + myInstance.getValue());
    }
}
