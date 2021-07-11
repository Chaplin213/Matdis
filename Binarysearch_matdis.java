/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch_matdis;

import java.util.Stack;

public class Binarysearch_matdis {
    
 public static class TreeNode
 {
  int data;
  TreeNode left;
  TreeNode right;
  TreeNode(char data)
  {
   this.data=data;
  }
 }

 public void preorder(TreeNode root) {
    if(root !=  null) {

      System.out.printf("%c ",root.data);
      preorder(root.left);
      preorder(root.right);
    }
  }
 
 public void postOrder(TreeNode root) {
  if(root !=  null) {
   postOrder(root.left);
   postOrder(root.right);
   System.out.printf("%c ",root.data);
  }
 }

 public void inOrder(TreeNode root) {
  if(root !=  null) {
   inOrder(root.left); 
   System.out.printf("%c ",root.data);
   inOrder(root.right);
  }
 }
 
 
 public static void main(String[] args)
 {
  Binarysearch_matdis bi=new Binarysearch_matdis();

  TreeNode rootNode=createBinaryTree();
  System.out.println(" PreOrder Tree :");
  bi.preorder(rootNode);
  System.out.println();
  System.out.println("-------------------------");
  System.out.println(" PostOrder Tree :");
  bi.postOrder(rootNode);
  System.out.println();
  System.out.println("-------------------------");
  System.out.println(" InOrder Tree:");
  bi.inOrder(rootNode);
 }
 public static TreeNode createBinaryTree()
 {  
  TreeNode rootNode =new TreeNode('H');
  TreeNode nodeB=new TreeNode('I');
  TreeNode nodeC=new TreeNode('J');
  TreeNode nodeD=new TreeNode('K');
  TreeNode nodeE=new TreeNode('L');
  TreeNode nodeF=new TreeNode('M');
  TreeNode nodeG=new TreeNode('N');
  TreeNode nodeH=new TreeNode('O');     
  TreeNode nodeI=new TreeNode('P');
  TreeNode nodeJ=new TreeNode('Q');

  rootNode.left=nodeB;
  rootNode.right=nodeC;
  nodeB.left=nodeD;
  nodeB.right=nodeE;
  nodeC.left=nodeF;
  
  nodeD.left=nodeG;
  nodeD.right=nodeH;
  nodeE.left=nodeI;
  nodeF.right=nodeJ;
  
  return rootNode;
 }
}