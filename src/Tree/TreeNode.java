package Tree;

import CLinkedList.CList;
import Objects.FileObject;

public class TreeNode<T> {
    // node fields
    private T data;
    private TreeNode<T> parent;
    private CList<TreeNode<T>> children;
    private CList<FileObject> files;

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

    public void setChildren(CList<TreeNode<T>> children) {
        this.children = children;
    }

    public CList<TreeNode<T>> getChildren() {
        return this.children;
    }

    public void setFiles(CList<FileObject> files) {
        this.files = files;
    }

    public CList<FileObject> getFiles() {
        return this.files;
    }
}
