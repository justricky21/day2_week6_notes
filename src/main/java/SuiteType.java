public enum SuiteType {
    SPADE(3, "Spade"),
    HEART(2, "Heart"),
    DIAMOND(1, "Diamond"),
    CLUB(0, "Club");

    private int value;
    private final String name;
    SuiteType(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getValue(){
        return this.value;
    }


}
