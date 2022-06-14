public class ZadanieOne {
    public static void main(String[] args) {
        String User;
        int age;
        String name;
        User user  = new User( name: "Alex1", age: 30);
        System.out.println(user);

        User user1  = new User( name: "Alex2", age: 30);
        System.out.println(user1);

        System.out.println(user.equals(user1));
    }
}
