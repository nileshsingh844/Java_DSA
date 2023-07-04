//we will solve using two pointer approach
//first we will create an arraylist of arraylist result, then two pointers left and right
//make lest pointto head and tail point to last node using current
//until left equals right and left crosses right that is, left != right next,
//declare sum, equal left data + right data,
//if sum equals target, declare arrayist pair, add left data then right data to pair
//add pair to result, and shift left to next, right to prev
//if sum < target, shift left to left next, else right to right prev
//return result

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node left = head;
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        Node right = current;
        while(left != right && left != right.next){
            int sum  = left.data + right.data;
            
            if(sum == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                result.add(pair);
                
                left = left.next;
                right = right.prev;
            }else if(sum < target){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return result;
    }
}
        

