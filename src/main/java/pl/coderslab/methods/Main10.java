package pl.coderslab.methods;

public class Main10 {

    public static void main(String[] args) {
        int goalsATeamHome = 1;
        int goalsATeamVisit = 5;
        int goalsBTeamHome = 0;
        int goalsBTeamVisit = 6;
        String winner = footballWin(goalsATeamHome, goalsATeamVisit, goalsBTeamHome, goalsBTeamVisit);
        if (winner == "1") {
            System.out.println("Zwycięzcą jest zespół A");
        } else if (winner == "2") {
            System.out.println("Zwycięzcą jest zespół B");
        } else if (winner == "X") {
            System.out.println("Padł remis");
        } else
            System.out.println("Błąd");
    }

    public static String footballWin(int goalsATeamHome, int goalsATeamVisit, int goalsBTeamHome, int goalsBTeamVisit) {
        int goalsATeam = goalsATeamHome + goalsATeamVisit;
        int goalsBTeam = goalsBTeamHome + goalsBTeamVisit;
        if (goalsATeam > goalsBTeam || (goalsATeam == goalsBTeam && goalsATeamVisit > goalsBTeamVisit)) {
            return "1";
        } else if (goalsBTeam > goalsATeam || (goalsATeam == goalsBTeam && goalsBTeamVisit > goalsATeamVisit)) {
            return "2";
        } else
            return "X";
    }
}