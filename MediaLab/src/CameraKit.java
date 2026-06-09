public class CameraKit extends Equipment {
    private int lensCount;
    private boolean hasTripod;

    public CameraKit(String id, String name, double baseDailyPrice, int lensCount, boolean hasTripod) {
        super(id, name, baseDailyPrice);
        this.lensCount = lensCount;
        this.hasTripod = hasTripod;
    }

    @Override
    public double calculateDailyPrice() {
        double price = getBaseDailyPrice() + (10 * lensCount);
        if (hasTripod) price += 15;
        return price;
    }

    @Override
    public String getType() { return "CameraKit"; }
}