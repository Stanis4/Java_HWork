public class MainProgramm {
    public static void main(String[] args){
        MyInt a1= new MyInt(4);
        MyInt a2= new MyInt();
        a2 =a1;
        a1.displayNum();
        a2.displayNum();
    }
}

