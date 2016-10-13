package Leetcode;

public class Test328 {
	public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
        	return head;
        ListNode odd_head=head,even_head=head.next,odd_node=odd_head,even_node=even_head;
        while(odd_node!=null){
        	if(even_node.next!=null){
        		odd_node.next=even_node.next;
        		odd_node=odd_node.next;
        		if(odd_node.next!=null){
        			even_node.next=odd_node.next;
        			even_node=even_node.next;
        		}else{
        			even_node.next=odd_node.next;
        			break;
        		}
        	}else
        		break;
        }
        odd_node.next=even_head;
        return odd_head;
    }
	
	public static void main(String[] args){
		Test328 test=new Test328();
		int[] arr=new int[]{1};
		ListNode head=GetInstance.GetListNode(arr, 0, arr.length-1);
		PrintResult.printlist(head);
		ListNode res=test.oddEvenList(head);
		PrintResult.printlist(res);
	}
}
