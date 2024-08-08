package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 苍镜月
 * @version 1.0
 * @implNote 该类代表每位运动员单个项目单场比赛结果
 */
public class Contest {
    private String totalPoints;
    private int rank;
    private String fullName;
    private List<String> dives;

    public String getScore() {
        StringBuilder score = new StringBuilder();
        for (int i = 0; i < dives.size(); i++) {
            if (i == dives.size() - 1) {
                score.append(dives.get(i)).append(" = ");
                break;
            }
            score.append(dives.get(i)).append(" + ");
        }
        score.append(totalPoints);
        return score.toString();
    }

    @Override
    public String toString() {
        return "Full Name:" + fullName + "\n" +
                "Rank:" + rank + "\n" +
                "Score:" + getScore() + "\n" +
                "-----";
    }

    public Contest(String totalPoints, int rank, String fullName, List<String> dives) {
        this.totalPoints = totalPoints;
        this.rank = rank;
        this.fullName = fullName;
        this.dives = dives;
    }

    public String getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getDives() {
        return dives;
    }

    public void setDives(List<String> dives) {
        this.dives = dives;
    }
}
