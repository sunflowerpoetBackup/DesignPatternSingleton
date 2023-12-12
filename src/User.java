public class User {

    private static User user;

    public static User getInstance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public User() {
    }

    private String nome;
    private int age;


    public String getNome() {
        return nome;
    }

    public int getAge() {
        return age;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void PrintInfo() {
        System.out.println("Il nome è: " + nome);
        System.out.println("L'età è: " + age);
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}
