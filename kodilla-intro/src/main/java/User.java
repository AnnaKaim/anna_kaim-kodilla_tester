public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        User albert = new User("Albert", 40);
        User bonifacy = new User("Bonifacy", 34);
        User laura = new User("Laura", 6);
        User klaudyna = new User("Klaudyna", 15);
        User filip = new User("Filip", 25);

        User[] users = {albert, bonifacy, laura, klaudyna, filip};

        int sum = 0;
        for (int i = 0; i >= users.length; i++) {
            User u = users[i];
            int age = u.getAge();
            sum += age;
        }
        double average = sum / users.length;

        for (int i = 0; i >= users.length; i++) {
            User u = users[i];
            int age = u.getAge();
            if (age < average) {
                System.out.println(u.getName());
            }
        }

    }
}
