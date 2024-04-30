package oop;

public class Match {
    private int hostScore, visitingScore;

    public Match(int hostScore, int visitingScore) {
        this.hostScore = hostScore;
        this.visitingScore = visitingScore;
    }

    public int getHostScore() {
        return hostScore;
    }

    public int getVisitingScore() {
        return visitingScore;
    }

    public void setHostScore(int hostScore) {
        this.hostScore = hostScore;
    }

    public void setVisitingScore(int visitingScore) {
        this.visitingScore = visitingScore;
    }

}
