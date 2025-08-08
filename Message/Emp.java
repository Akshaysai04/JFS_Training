class Emp{
    int eid;
    String ename;
    double sal;
    String desig;    
    Emp(int eid,String ename,double sal,String desig){
        this.eid=eid;
        this.ename=ename;
        this.sal=sal;
        this.desig=desig;
    }
    public String toString(){
        return eid+" "+ename+" "+sal+" "+desig;
    }   
}