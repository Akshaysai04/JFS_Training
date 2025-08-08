class PBR {
    public static void main(String args[]){
        Emp e1=new Emp(1,"ABC",500000.00,"Developer");
        int i[]={1,2,3,4,5};
        PBR pbr=new PBR();
        pbr.passByReference(e1,i);
        System.out.println(e1);
        for(int j:i){
            System.out.print(j+" ");
        }
        System.out.println();4
    }    
    void passByReference(Emp e,int j[]){
        e.ename="XYZ";
        e.sal=20000.00;
        e.desig="Designer";
        j[3]=40;
        j[4]=50;
    }
}
