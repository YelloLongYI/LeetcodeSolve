package Leetcode;

public class Test160 {
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int length1=0,length2=0;
        ListNode node=headA;
        while(node!=null)
        {
        	length1++;
        	node=node.next;
        }
        node=headB;
        while(node!=null)
        {
        	length2++;
        	node=node.next;
        }
        int diff=length1-length2;
        ListNode node1,node2;
        if(diff>0)
        {
        	node1=headA;
        	node2=headB;
        }
        else
        {
        	node1=headB;
        	node2=headA;
        }
        for(int count=1;count<=Math.abs(diff);count++)
        	node1=node1.next;
        while(node1!=null)
        {
        	if(node1==node2)
        		return node1;
        	node1=node1.next;
        	node2=node2.next;
        }
        return node1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
