package application;

public enum CakeTaste {
    STRAWBERRY_CHOCOLATE("Strawberry-Chocolate Cake. Ingredients: (Strawberries, Cherries, Chocolate Biscuits, Strawberry Cream.) ",
            55, 85),
    CHERRY("Cherry Cake. Ingredients:(Cherries, Chocolate, Cream). ",
            49,90),
    FORREST_FRUITS("Forrest Fruits Cake. Ingredients: (Biscuits, Forrest Fruits, Blueberries, Chocolate.) ",
            60,101);

    public final String ingredients;
    public final double smallPrice;
    public final double largePrice;

    CakeTaste(String ingredients, double smallPrice, double largePrice) {
        this.ingredients = ingredients;
        this.smallPrice = smallPrice;
        this.largePrice = largePrice;
    }

    public String getIngredients() {
        return ingredients;
    }

    public double getSmallPrice() {
        return smallPrice;
    }

    public double getLargePrice() {
        return largePrice;
    }
}
