package Leetcode;

public class Test19 {
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head==null)
    		return null;
    	ListNode first=head,last=head;
    	for(int count=0;count<n+1;count++)
    	{
    		if(last!=null)
    			last=last.next;
    		else
    			return first.next;  //如果删除的是头结点，返回头结点下一个
    	}
    	while(last!=null)
    	{
    		first=first.next;
    		last=last.next;
    	}
    	first.next=first.next.next;
    	return head;
    }

	public static void main(String[] args) {
		Test19 test=new Test19();
		ListNode[] lists=new ListNode[]{new ListNode(1),new ListNode(2),
				new ListNode(3),new ListNode(4),new ListNode(5)};
		ListNode head=new ListNode(0);
		head.next=lists[0];
//		lists[0].next=lists[1];
//		lists[1].next=lists[2];
//		lists[2].next=lists[3];
//		lists[3].next=lists[4];
//		lists[0].next=lists[0].next.next;
		PrintResult pr=new PrintResult();
		ListNode list=test.removeNthFromEnd(head, 2);
		pr.printlist(list);

	}

}
