package scenario_based.HotelManagement;

class SeasonalPricing implements PricingStrategy {
    public double calculatePrice(double basePrice, int days) {
        return (basePrice * days) * 1.25;
    }
}
