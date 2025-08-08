
class Client {    
        public static void main(String rags[]){
            A a=AFactory.getInstance(rags[0]);
            a.print(rags[1]);
        }
}
