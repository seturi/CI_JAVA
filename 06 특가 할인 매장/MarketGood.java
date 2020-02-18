public class MarketGood {
    // 코드를 입력하세요.
    private String name;
    private int retailPrice;
    private int discountRate;
    
    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100) {
            discountRate = 0;
        }
        this.discountRate = discountRate;
    }
    
    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRetailPrice() {
        return retailPrice;
    }
    
    public int getDiscountRate() {
        return discountRate;
    }
    
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
    
    public int getDiscountedPrice() {
        return retailPrice * (100 - discountRate) / 100;
    }
}