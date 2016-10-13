package Leetcode;

public class Test203 {
	
    public ListNode removeElements(ListNode head, int val) {
    	if(head==null)
    		return null;
    	ListNode head1=new ListNode(0);
    	head1.next=head;
        ListNode node1=head1,node2=node1.next;
        while(node2!=null)
        {
        	if(node2.val==val)
        	{
        		node1.next=node2.next;
        		node2=node2.next;
        		continue;
        	}
        	node1=node1.next;
        	node2=node2.next;
        }
        return head1.next;
    }

	public static void main(String[] args) {
		// Remove Linked List Elements 
		Test203 test=new Test203();
		GetInstance gi=new GetInstance();
		ListNode head=gi.GetListNode(new int[]{1,2,6,3,4,5,6}, 0, 6);
		head=test.removeElements(head, 6);
		System.out.println(head.val);

	}

}
