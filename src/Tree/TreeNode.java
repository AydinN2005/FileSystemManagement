package Tree;

import LinkedList.CLinkedList;
import Objects.FileObject;
import helper.Constants;

public class TreeNode<T> {
    // node fields
    private T data;
    private TreeNode<T> parent;
    private CLinkedList<TreeNode<T>> children;
    private CLinkedList<FileObject> files;

    // getters and setters
    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public TreeNode<T> getParent() {
        return this.parent;
    }

    public void setChildren(CLinkedList<TreeNode<T>> children) {
        this.children = children;
    }

    public CLinkedList<TreeNode<T>> getChildren() {
        return this.children;
    }

    public void setFiles(CLinkedList<FileObject> files) {
        this.files = files;
    }

    public CLinkedList<FileObject> getFiles() {
        return this.files;
    }
}
