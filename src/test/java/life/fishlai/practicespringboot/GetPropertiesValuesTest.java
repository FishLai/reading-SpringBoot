package life.fishlai.practicespringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GetPropertiesValuesTest {
    @Autowired
    private GetPropertiesValues getPropertiesValues;

    @Test
    public void getName(){
        System.out.println(getPropertiesValues.getName());
    }

    @Test
    public void get_age(){
        System.out.println(getPropertiesValues.getAge());
    }

    @Test
    public void getAddress(){
        System.out.println(getPropertiesValues.getAddress());
    }
}
