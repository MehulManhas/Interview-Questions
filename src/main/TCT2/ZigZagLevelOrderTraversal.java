package TCT2;

import java.util.*;

public class ZigZagLevelOrderTraversal {

    ArrayList<ArrayList<Integer>> levelOrderTraversalOutput = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        levelOrderTraversal(A);
        return levelOrderTraversalOutput;
    }

    public void levelOrderTraversal(TreeNode A){
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(A);


        while (!nodeQueue.isEmpty()){

            int queueSize = nodeQueue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            for(int i=0; i<queueSize; i++){

                TreeNode currentNode = nodeQueue.poll();

                if(currentNode.left != null){
                    nodeQueue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    nodeQueue.add(currentNode.right);
                }

                currentLevel.add(currentNode.val);
            }

            levelOrderTraversalOutput.add(currentLevel);
        }

        int level = 0;

        for(int i=0; i<levelOrderTraversalOutput.size(); i++){
            if(level%2 != 0){
                Collections.reverse(levelOrderTraversalOutput.get(level));
            }
            level++;
        }
    }
}
