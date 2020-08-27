public class DemoFinalVariable {
    public static void main (String[] args){
        FinalVariable obj = new FinalVariable();
       // obj.x = 25; Não pode alterar algo que é declarado como final!
        System.out.println(obj.x);

    }
}
