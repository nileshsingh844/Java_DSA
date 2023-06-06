//we will use merge sort,time: O(nlogn), space: O(logn)

//first we will check the base condition, if list empty or singleton, return head
//split from mid, we will split list into two half l1 and l2, using splitAtMid 
//then, we will sort the splitted list, calling recursive function
//after we will declare and dummy node and res, and merge the lists comparinf l1
//and l2 and appending to res accordingly
//at end, if l2 is not empty, point res next to l2, else point res next to l1
//return dummy next

class Solution {

    public ListNode splitAtMid(ListNode head){
        ListNode slow, fast, pre;
        slow = fast = head;
        pre = null;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return slow;
    }
    public ListNode sortList(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return head;
        }
        //split from mid
        ListNode l1 = head;
        ListNode l2 = splitAtMid(head);

        //sort the list
        l1 = sortList(l1);
        l2 = sortList(l2);

        //merge the sorted list
        ListNode dummy = new ListNode();
        ListNode res = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                res.next = l1;
                l1 = l1.next;
            }else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        if(l2 != null){
            res.next = l2;
        }else{
            res.next = l1;
        }

        return dummy.next;
    }
}

