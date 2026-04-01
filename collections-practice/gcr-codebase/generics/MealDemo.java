package generics;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() { return "Vegetarian"; }
}

class KetoMeal implements MealPlan {
    public String getMealType() { return "Keto"; }
}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void generate() {
        System.out.println("Meal Plan: " + plan.getMealType());
    }
}

class MealUtil {
    static <T extends MealPlan> void validate(T plan) {
        System.out.println(plan.getMealType() + " plan validated");
    }
}

public class MealDemo {
    public static void main(String[] args) {
        Meal<VegetarianMeal> meal = new Meal<>(new VegetarianMeal());
        MealUtil.validate(meal.plan);
        meal.generate();
    }
}

