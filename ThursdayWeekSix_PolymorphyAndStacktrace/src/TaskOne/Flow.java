package TaskOne;
public class Flow {
    public void methodA(String input){
        System.out.println("1");
    }
    public void methodB(boolean x){
        if(x) {
            System.out.println("3");
        }else{
            methodD(7,2);
        }
    }
    public String[] methodC(String[] letters){
        System.out.println("b");
        return letters;
    }
    public void methodD(int i, int j){
        String[] letters = {"s","c","r"};
    }
}
