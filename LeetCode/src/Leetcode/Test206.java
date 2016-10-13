package Leetcode;
import java.util.*;

public class Test206 {

    public ListNode reverseList(ListNode head) 
    {
    	if(head==null)
    		return null;
    	if(head.next==null)
    		return head;
    	ListNode p,q,r;
    	p=head;
    	q=p.next;
    	r=q.next;
    	p.next=null;
    	while(r!=null)
    	{
    		q.next=p;
    		p=q;
    		q=r;
    		r=r.next;
    	}
    	q.next=p;
    	return q;	
    }
    
    public ListNode create(int[] nums)
    {
    	ListNode head=new ListNode(0);
    	ListNode node=head;
    	for(int i=0;i<nums.length;i++)
    	{
    		ListNode temp=new ListNode(nums[i]);
    		node.next=temp;
    		node=node.next;
    	}
    	return head;
    }
 
	public static void main(String[] args) {
		//Reverse Linked List 
		Test206 test=new Test206();
		int[] nums=new int[]{1,2,3,4,5};
		ListNode head=test.create(nums);
		ListNode node=test.reverseList(head);
		System.out.println();
		while(node!=null)
		{
			System.out.print(node.val+"   ");
			node=node.next;
		}
		System.out.println("ok");
	}

}
