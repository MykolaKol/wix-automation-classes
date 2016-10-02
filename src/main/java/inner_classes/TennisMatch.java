package inner_classes;

/**
 * Created by nikolayk on 10/2/16
 */
public class TennisMatch {

    private Player firstP;
    private Player secondP;
    private Judge judge;

    public TennisMatch(String firstPlayerName, String secondPlayerName, String judgeName) {
        firstP = new Player(firstPlayerName);
        secondP = new Player(secondPlayerName);
        judge = new Judge(judgeName);
    }
    @Override
    public String toString(){
        return "Player 1: " + this.getFirstP().getName() + ", " + "\nPlayer 2: " + this.getSecondP().getName() + ", " + "\nJudge: " + this.getJudge().getName()
                + ", " + "\nScore: " + this.getFirstP().getScore() + ":" + this.getSecondP().getScore() + ".\n";
    }

    public String getWinnerInfo(){
        return this.getJudge().defineWinner(this.getFirstP(), this.getSecondP()) + ". Judge is: " + getJudge().getName() + ".";
    }

    public void setFirstPScore(int score){
        getFirstP().setScore(score);
    }

    public void setSecondPScore(int score) {
        getSecondP().setScore(score);
    }

    public Player getFirstP() {
        return firstP;
    }

    public Player getSecondP() {
        return secondP;
    }

    public Judge getJudge() {
        return judge;
    }


    private class Player {
        private int score;
        private String name;

        public Player(String name) {
            this.name = name;
            this.score = 0;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getName() {
            return name;
        }


        @Override
        public String toString() {
            return "Player name is: " + this.getName() + ". " + "His score is: " + this.getScore();
        }
    }

    private class Judge {
        private String name;

        public Judge(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
        return "Judge of the match is: " + this.getName();
        }

        public String getName() {
            return name;
        }

        public String defineWinner(Player firstPlayer, Player secondPlayer) {
            String winner = firstPlayer.score > secondPlayer.score ? "The winner is " + firstPlayer.getName() :
                    firstPlayer.score < secondPlayer.score ? "The winner is " + secondPlayer.getName() : "It\'s a tie";
            return winner;
        }

    }
}
