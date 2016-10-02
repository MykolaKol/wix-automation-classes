package inner_classes;

/**
 * Created by nikolayk on 10/2/16
 */
public class main {
    public static void main(String[] args) {
        TennisMatch match = new TennisMatch("Efratt", "Nikolay", "Roi");
        match.setFirstPScore(3);
        match.setSecondPScore(6);

        System.out.println(match);
        System.out.println(match.getJudge());
        System.out.println(match.getFirstP());
        System.out.println(match.getSecondP());
        System.out.println(match.getWinnerInfo());

    }
}
