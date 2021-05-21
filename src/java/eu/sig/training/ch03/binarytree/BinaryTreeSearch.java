package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) return depth;
        return nodeValue < node.getValue() ? searchBranch(nodeValue, node.getLeft())
                : searchBranch(nodeValue, node.getRight());
    }

    private static int searchBranch(int nodeValue, BinaryTreeNode<Integer> side) {
        if (side == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + calculateDepth(side, nodeValue);
        }
    }
}