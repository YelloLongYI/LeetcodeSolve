package Leetcode;

public class Test23 {
	
	public ListNode merge2lists(ListNode l1,ListNode l2)
	{
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
	
	public ListNode merge(ListNode[] lists,int low,int high)
	{
		if(low==high)
			return lists[low];
		if(high-low==1)
			return merge2lists(lists[low],lists[high]);
		int mid=(low+high)/2;
		return merge2lists(merge(lists,low,mid),merge(lists,mid+1,high));
	}
	
    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists.length==0)
    		return null;
    	return merge(lists,0,lists.length-1);
    }

	public static void main(String[] args) {
		Test23 test=new Test23();
		ListNode[] lists=new ListNode[]{new ListNode(1),new ListNode(2),
				new ListNode(5),new ListNode(3),new ListNode(-1)};
		PrintResult pr=new PrintResult();
		ListNode list=test.mergeKLists(lists);
		pr.printlist(list);

	}
}
