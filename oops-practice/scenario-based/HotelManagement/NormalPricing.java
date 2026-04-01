package scenario_based.HotelManagement;

class NormalPricing implements PricingStrategy {
    public double calculatePrice(double basePrice, int days) {
        return basePrice * days;
    }
}
