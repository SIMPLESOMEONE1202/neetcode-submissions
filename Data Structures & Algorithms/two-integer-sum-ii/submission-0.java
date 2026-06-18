class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        while(i < j){//condition ki two pointer valid rahe
            if(numbers[i] + numbers[j] == target){//agar sum = target hai direct return
                return new int[]{i +1, j+1};
            }

            else if(numbers[i] + numbers[j] > target){
                //agar sum > target se zyada hai to logic ke hisaab se hum peeche se pointer kam karenge kyunki array sorted hai ascending order me and isliye bade number ko kam karenge
                j--;
            }

            else{
                //agar sum < target hai toh sorted way me peeche wala pointer largest hai aage wale ko aur bada karenge
                i++;
            }
        }

        return new int[]{i+1 , j+1};
    }
}
