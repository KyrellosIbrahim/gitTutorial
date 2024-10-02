class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The average is: " +
                average(numbers));
    }
    public static double average(int[] nums) {
        double sum = 0.0;
        for(int num : nums) {
            sum += num;
        }
        return sum/nums.length;
    }
}