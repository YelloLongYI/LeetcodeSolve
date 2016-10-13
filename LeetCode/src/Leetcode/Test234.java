package Leetcode;

public class Test234 {
	
	public boolean isPalindrome(ListNode head) {
		if(head==null)
			return true;
        ListNode node1=head,node2=head;
        while(node2.next!=null&&node2.next.next!=null){
    		node1=node1.next;
    		node2=node2.next.next;
        }
        node1=node1.next;
        ListNode pre=null,next;
        while(node1!=null){
        	next=node1.next;
        	node1.next=pre;
        	pre=node1;
        	node1=next;
        }
        while(pre!=null){
        	if(pre.val!=head.val)
        		return false;
        	pre=pre.next;
        	head=head.next;
        }
        return true;
    }
    
    

	public static void main(String[] args) {
		// Palindrome Linked List 
		Test234 test=new Test234();
		ListNode[] lists=new ListNode[]{new ListNode(1),
				new ListNode(1),new ListNode(2),new ListNode(1),new ListNode(3)};
		lists[0].next=lists[1];
		lists[1].next=lists[2];
		lists[2].next=lists[3];
		//lists[3].next=lists[4];
		
		System.out.println(test.isPalindrome(lists[0]));

	}

}
