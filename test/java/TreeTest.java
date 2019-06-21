import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

    @Test
    public void testInsertToEmptyTree() {
        Tree t1 = new Tree();
        t1.insert(1);
        Assert.assertEquals(1, t1.mRoot.mValue);
    }

 

    @Test
    public void testSingleRotateLeft() {
        Tree t1 = new Tree(10);
        t1.insert(14, 56);
        Assert.assertEquals(t1.mRoot.mValue, 14);
        Assert.assertEquals(t1.mRoot.mLeft.mValue, 10);
        Assert.assertEquals(t1.mRoot.mRight.mValue, 56);
    }

    @Test
    public void testSingleRotateRight() {
        Tree t1 = new Tree(10);
        t1.insert(2, 1);
        Assert.assertEquals(t1.mRoot.mValue, 2);
        Assert.assertEquals(t1.mRoot.mLeft.mValue, 1);
        Assert.assertEquals(t1.mRoot.mRight.mValue, 10);
    }
}