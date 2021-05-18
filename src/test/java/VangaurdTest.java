import org.junit.Test;

public class VangaurdTest {

    VangaurdTest test = new VangaurdTest();

    @Test
    public void test1(){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        if (b1 && b2 || b2 && b3 || b2)
            System.out.println("ok");
        if (b1 && b2 || b2 && b3 || b2)
            System.out.println("donkey");
    }

}
