package application;

public enum CakeTaste {
    STRAWBERRY_CHOCOLATE("Strawberries, Chocolate"),
    CHERRY("cherries, chocolate"),
    FORREST_FRUITS("Blueberries, chocolate");

    public final String ingredients;

    private CakeTaste(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }
}
