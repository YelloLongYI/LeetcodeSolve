package Leetcode;

public class Test21 {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode node=head;
        while(l1!=null&&l2!=null)
        {
        	if(l1.val<l2.val)
        	{
        		node.next=l1;
        		l1=l1.next;
        	}
        	else
        	{
        		node.next=l2;
        		l2=l2.next;
        	}
        	node=node.next;
        }
        if(l1==null)
        	node.next=l2;
        if(l2==null)
        	node.next=l1;
        return head.next;
    }

	public static void main(String[] args) {
		Test21 test=new Test21();
	}

}
