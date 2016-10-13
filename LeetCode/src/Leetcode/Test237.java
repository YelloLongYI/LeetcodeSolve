package Leetcode;

public class Test237 {

    public void deleteNode(ListNode node) {
        if(node==null)
        	return ;
        ListNode p;
        p=node.next.next;
        while(p!=null)
        {   	
        	node.val=node.next.val;
        	node=node.next;
        	p=p.next;
        }
        node.val=node.next.val;
        node.next=null;
    }
	
	public static void main(String[] args) {
		// Delete Node in a Linked List 
		Test237 test=new Test237();
		ListNode[] lists=new ListNode[]{new ListNode(0),new ListNode(1),
				new ListNode(2)};
		lists[0].next=lists[1];
		lists[1].next=lists[2];
		PrintResult pr=new PrintResult();
		test.deleteNode(lists[0]);
		pr.printlist(lists[0]);

	}

}
