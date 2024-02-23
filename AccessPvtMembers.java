class Test {

    // private variables
    private int age;
    private String name;
  
    // initialize age
    public void setAge(int age) {
      this.age = age;
    }
  
    // initialize name
    public void setName(String name) {
      this.name = name;
    }
  
    // access age
    public int getAge() {
      return this.age;
    }
  
    // access name
    public String getName() {
      return this.name;
    }
  
  }
  
  class AccessPvtMembers {
    public static void main(String[] args) {
      // create an object of Test
      Test test = new Test();
  
      // set value of private variables
      test.setAge(22);
      test.setName("Hemant");
  
      // get value of private variables
      System.out.println("Age: " + test.getAge());
      System.out.println("Name: " + test.getName());
    }
  }