class AFactory{
    static A getInstance(String type){
        if(type.equalsIgnoreCase("B"))
            return new B();
        else if(type.equalsIgnoreCase("C"))
            return new C();
            else{
            new IllegalArgumentException("Wrong type object requested");
            return null;
            }
    }
    }
    





