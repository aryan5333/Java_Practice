public class LinkedListdemo3 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode f=l1,s=l2;
        ListNode head=null,last=null;
        int carry=0;

        while(f!=null||s!=null){
            int sum=carry;
            if(f !=null){
                sum+=f.val;
                f=f.next;
            }
            if(s!= null){
               sum+=s.val;
               s=s.next;

            }
            int val=sum%10;
            carry=sum/10;

            if(head==null){
                head=new ListNode(val);
                last=head;
            }
            else{
                last.next=new ListNode(val);
                last=last.next;
            }

        }
        if(carry > 0){
            last.next=new ListNode(carry);
            last=last.next;
        }
        return head;
        
        
        
        
    }
}
    
}
