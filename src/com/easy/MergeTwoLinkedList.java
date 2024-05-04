package com.easy;
class ListNode
{
    int val ;
    ListNode next ;
    ListNode(int val )
    {
        this.val =val ;
    }
}

public class MergeTwoLinkedList {
    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1)  ;
        l1.next = new ListNode(2) ;
        l1.next.next = new ListNode(4) ;
        ListNode l2 = new ListNode(1)  ;
        l2.next = new ListNode(3) ;
        l2.next.next = new ListNode(4) ;

        printList( mergerTwoList(l1 ,l2 ));
    }
    public static ListNode mergerTwoList(ListNode l1 , ListNode l2)
    {
        if( l1 != null && l2 != null )
        {
            if( l1.val < l2.val )
            {
                l1.next = mergerTwoList( l1.next , l2 );
                return l1 ;
            }
            else {
                l2.next = mergerTwoList( l1 , l2.next );
                return l2 ;
            }
        }
        return  l1 == null ? l2 : l1 ;
    }
    public static void printList(ListNode list)
    {
        ListNode temp = list ;
        while( temp != null )
        {
            System.out.print( temp.val + " ==> ");
           temp = temp.next ;
        }
    }
}
