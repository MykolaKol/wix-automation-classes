package enums;

/**
 * Created by nikolayk on 11/13/16
 */
public enum Beer {
    HEINEKEN(BeerType.LAGER, 5.0),
    GUINESS(BeerType.STOUT, 4.2),
    CORONA(BeerType.LAGER, 4.6),
    BUDWEISER(BeerType.LAGER, 5.0)
    ;

    private final double alcoContent;

    private final BeerType type;

    private Beer(BeerType type, double alcoContent){
        this.alcoContent = alcoContent;
        this.type=type;
    }

    public BeerType type(){
        return this.type;
    }

    public double alcoContent(){
        return this.alcoContent;
    }

    @Override
    public String toString(){
        String toPrint = super.toString();
        toPrint = toPrint.substring(0, 1).toUpperCase() + toPrint.substring(1).toLowerCase();
        return toPrint;
    }
}
