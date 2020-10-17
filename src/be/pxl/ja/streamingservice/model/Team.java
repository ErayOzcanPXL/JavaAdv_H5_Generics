package be.pxl.ja.streamingservice.model;

import java.util.List;
import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team> {
    private String name;
    public int played;
    public int won;
    public int lost;
    public int tied;
    private List<T> members;

    public Team(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getPlayed() {
        return this.played;
    }

    public int getWon() {
        return this.won;
    }

    public int getLost() {
        return this.lost;
    }

    public int getTied() {
        return this.tied;
    }

    public List<T> getMembers() {
        return this.members;
    }

    public void addPlayer(T player) {
        members.add(player);
    }

    public int numberOfPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won++;
            opponent.lost++;
        } else if (theirScore > ourScore) {
            opponent.won++;
            this.lost++;
        } else {
            this.tied++;
            opponent.tied++;
        }

        this.played++;
        opponent.played++;
    }

    public int ranking() {
        return (this.won * 3) + this.tied;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Team opponent) {
        return opponent.ranking() - this.ranking();
    }
}
