public class A{
    private A(int value){
        this.value=value;
    }
    public int getValue(){
       return value; 
    }
    public void display(){
        Systen.out.println("Value"+value);
    }
    public static A createInstance(int value){
        
    }
}