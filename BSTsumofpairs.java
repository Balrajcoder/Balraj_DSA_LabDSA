package org.example.spring;

import java.util.Scanner;

public class BSTsumofpairs {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Enter the no of nodes in BST");
        /*    ***To dynamically give input***  */
/*----------------------------------------------- */

        Scanner input =new Scanner(System.in);
        int nodecount= input.nextInt();

        for(int i=0;i<nodecount;i++)
        {
            tree.insert(input.nextInt());
        }
/*-----------------------------------------------
      *** Hardcoded input***

        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(10);
        tree.insert(30);
        tree.insert(50);
        tree.insert(70);

 ----------------------------------------------- */
        boolean test
                = tree.isPairPresent(tree.root, tree.root, 130);
        if (!test)
            System.out.println("No such values are found!");
    }
}
