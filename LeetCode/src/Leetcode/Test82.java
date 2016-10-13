package Leetcode;

public class Test82 {
	
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        	return null;
        ListNode head1=new ListNode(0);
        head1.next=head;
        ListNode node=head1,sec=head1.next,chil;
        while(sec!=null)
        {
        	chil=sec.next;
        	if(chil!=null)
        		if(chil.val==sec.val)
        		{
        			while(chil.val==sec.val)
        			{
        				chil=chil.next;
        				if(chil==null)
        				{
        					node.next=null;
        					break;
        				}
        			}
        			node.next=chil;
        		}
        		else
        			node=sec;
        	else
        		return head1.next;
        	if(node!=null)
        		sec=chil;
        	else
        		return head1.next;
        }
        return head1.next;
    }
	

	public static void main(String[] args) {
		// Remove Duplicates from Sorted List II 
		Test82 test=new Test82();
		ListNode[] lists=new ListNode[]{new ListNode(1),new ListNode(1),new ListNode(2),new ListNode(3),
				new ListNode(3),new ListNode(4),new ListNode(5),new ListNode(6)};
		ListNode head=new GetInstance().GetListNode(lists, 0, 2);
		head=test.deleteDuplicates(head);
		while(head!=null)
			{
		System.out.print(head.val+"   ");
		head=head.next;
			}
	}

}
