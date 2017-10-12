import org.junit.*;

public class Test {
    @org.junit.Test
public void  some_test(){
    Student s = new Student("",1,"",34,"");
    Assert.assertEquals(s.getUsername(), (s.getName() + s.getAge()).replaceAll("\\s+","").toLowerCase());
    }
}

//Username; name + age