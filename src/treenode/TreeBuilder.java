/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treenode;

/**
 *
 * @author goyal
 */
import java.util.*;

public class TreeBuilder {
    public static Treenode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;

        Treenode root = new Treenode(values[0]);
        Queue<Treenode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < values.length) {
            Treenode current = queue.poll();

            if (i < values.length && values[i] != null) {
                current.left = new Treenode(values[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                current.right = new Treenode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }
}
