/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treenode;

/**
 *
 * @author goyal
 */
public class Main {
    public static void main(String[] args) {
        Integer[] input = {1, null, 2, 3};
        Treenode root = TreeBuilder.buildTree(input);
        Solution solution = new Solution();
        System.out.println(solution.inorderTraversal(root));  // Output: [1, 3, 2]
    }
}

