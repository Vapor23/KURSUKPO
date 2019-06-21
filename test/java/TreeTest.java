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
    public void testDefaultConstructor() {
        Tree t1 = new Tree();
        Assert.assertNull(t1.mRoot);
    }

    @Test
    public void testIntegerConstructor() {
        Tree t1 = new Tree(1);
        Assert.assertNotNull(t1.mRoot);
    }
    

    @Test
    public void testEqualTreesEqualHashCodes() {
        Tree t1 = new Tree(10);
        t1.insert(2, 12);
        Tree t2 = new Tree(10);
        t2.insert(2, 12);
        Assert.assertEquals(t1.hashCode(), t2.hashCode());
    }   


    @Test
    public void testToStringEmpty() {
        Tree t1 = new Tree();
        Assert.assertEquals("[]", t1.toString());
    }

    @Test
    public void testToStringSingleNode() {
        Tree t1 = new Tree(1);
        Assert.assertEquals("[1]", t1.toString());
    }

    @Test
    public void testToStringManyNodes() {
        Tree t1 = new Tree(1);
        t1.insert(12, 56, 7, 2, 1);
        Assert.assertEquals("[1, 1, 2, 7, 12, 56]", t1.toString());
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