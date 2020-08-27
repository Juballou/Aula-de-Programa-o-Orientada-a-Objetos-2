public class DemoInterfaces implements FirstInterface, SecondInterface{

    @Override
    public void myMethod(){
        System.out.println("Some Text...");
    }

    @Override
    public void myOtherMethod(){
        System.out.println("Some other text...");
    }
}
