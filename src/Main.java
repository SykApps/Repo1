public class Main {
    public static void main(String[] args){
        System.out.println("hello world!");
        Zak use = new Zak("My Real Name");
        use.realName = "hello";
        System.out.println(use.realName);
        //use.setName("Oh this is my actual name");
        System.out.println(use.getName());
    }
}
