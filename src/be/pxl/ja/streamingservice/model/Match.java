package be.pxl.ja.streamingservice.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Match {
    public static void main(String[] args) {
        List<Team<SoccerPlayer>> teams = new ArrayList<>();
        Team<SoccerPlayer> team1 = new Team<>("team_1");
        Team<SoccerPlayer> team2 = new Team<>("team_2");
        teams.add(team1);
        teams.add(team2);

        SoccerPlayer player1 = new SoccerPlayer("player_1");
        team1.addPlayer(player1);

        team1.matchResult(team2, 5, 3);
        team2.matchResult(team1, 1, 1);
        team2.matchResult(team1, 4, 1);
        team1.matchResult(team2, 0, 2);

        System.out.println(team1.ranking());
        System.out.println(team2.ranking());
        System.out.println();

        Collections.sort(teams);
        System.out.println(teams);
    }
}
