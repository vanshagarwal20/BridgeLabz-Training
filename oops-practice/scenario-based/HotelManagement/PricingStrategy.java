package scenario_based.HotelManagement;

interface PricingStrategy {
    double calculatePrice(double basePrice, int days);
}
