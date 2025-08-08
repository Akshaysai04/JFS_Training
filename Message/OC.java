class OC {
  int i; 
  static int j; 
  
  void print1() {
    System.out.println(i); 
    System.out.println(j); 
  }
  
  static void print2() {
    // System.out.println(i); 
    System.out.println(j); 
  }
  // non-static inner class
  class NSIC {
    void print3() {
      System.out.println(i);
      System.out.println(j); 
    }
    /* 
    static void print4() {
      // System.out.println(i); // Yes
      System.out.println(j); // Yes      
    }
    */
  }
  
  // static inner class
  static class SIC {  
    void print5() {
      // System.out.println(i); 
      System.out.println(j);       
    }
    static void print6() {
      // System.out.println(i); // Yes
      System.out.println(j); // Yes      
    }
  }
} // end of OC