package machine;

public class CoffeeCups {
    private final int WATER = 200;
    private final int MILK = 50;
    private final int COFFEE = 15;
    private int water;
    private int milk;
    private int coffee;

    public CoffeeCups(int water, int milk, int coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
    }

    public int getMinCups() {
        int[] inputArray = new int[3];
        inputArray[0] = water / WATER;
        inputArray[1] = milk / MILK;
        inputArray[2] = coffee / COFFEE;

        int minCups = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minCups) {
                minCups = inputArray[i];
            }
        }
        return minCups;
    }

    public int getMaxCups() {
        int[] inputArray = new int[3];
        inputArray[0] = water / WATER;
        inputArray[1] = milk / MILK;
        inputArray[2] = coffee / COFFEE;

        int maxCups = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxCups) {
                maxCups = inputArray[i];
            }
        }
        return maxCups;
    }

}
