class OCICClient {
  public static void main(String rags[]) {
    // how to access non-static method of outer class?
    OC oc=new OC();
    oc.print1();
    
    // how to access static method of outer class?
    OC.print2();
    
    // how to access non-static method of non-static inner class?
    // first of all know how to instantiate non-static inner class?
    OC.NSIC ocnsic=oc.new NSIC();
    ocnsic.print3();
    
    // how to access non-static method of static inner class?
    // how to create object of static inner class
    OC.SIC ocsic=new OC.SIC();
    ocsic.print5();
    
    // how to access static method of static inner class
    OC.SIC.print6();
  }  
}