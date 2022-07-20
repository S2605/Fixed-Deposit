package Main_Runner;

import LibGloabal.BaseClass;
import org.testng.annotations.Test;

public class EmailSending {

    @Test
     public void f1(){
        BaseClass bs=new BaseClass();
        bs.emailSend();
    }


}
