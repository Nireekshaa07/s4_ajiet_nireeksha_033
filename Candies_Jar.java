// Maximum candies the jar can hold
// Minimum candies that should remain in jar
class Main {
    public static void main(String[] args) {
        int N = 10; 
        int K = 5;  
        int candies = N;
        int order = 4; 
        if (order > (candies - K)) {
            System.out.println("INVALID INPUT");
        } else {
            candies = candies - order;
            System.out.println("Number of Candies Sold: " + order);
            System.out.println("Number of Candies available: " + candies);
            if (candies == K) {
                candies = N;
            }
        }
    }
}
