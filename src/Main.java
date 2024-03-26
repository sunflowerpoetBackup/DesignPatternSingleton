//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e
// poi si stamperanno a video

public class Main {
    public static void main(String[] args) {

        User user1 = User.getInstance();
        User user2 = User.getInstance();

        System.out.println("FIRST user data: " + user1); //singleton

        user2.setNome("Anna");
        user2.setAge(23);

        System.out.println("SECOND user data: " + user2);
    }
}
