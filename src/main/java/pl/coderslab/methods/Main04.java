package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {
        String surname = "Korczak";
        String resultOfMethod = createName("Maciek", surname, "Air");
        System.out.println(resultOfMethod);
    }

    public static String createName(String name, String surname, String nickname){
        String joinedName = name + " " + nickname + " " + surname;
        return joinedName;
    }
}
