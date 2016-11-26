package enums;

/**
 * Created by nikolayk on 11/13/16
 */
public enum BeerType {
    STOUT,
    LAGER;

    @Override
    public String toString(){
        String toPrint = super.toString();
        toPrint = toPrint.substring(0, 1).toUpperCase() + toPrint.substring(1).toLowerCase();
        return toPrint;
    }
}
