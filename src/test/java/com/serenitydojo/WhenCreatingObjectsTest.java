package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
//import static com.serenitydojo.Dog.DOG_NOISE;

public class WhenCreatingObjectsTest {
    @Test
    public void creating_dog(){
        Dog fido = new Dog("Fido","Bone",5);
        Assert.assertEquals(fido.getName(),"Fido");
        Assert.assertEquals(fido.getFavoriteToy(),"Bone");
        Assert.assertEquals(fido.getAge(),5);
        System.out.println("Fido makes the noise '" + fido.makeNoise() + "'");
        fido.IsFed=true;
        fido.makeNoise();
        Assert.assertEquals(fido.makeNoise(),"Miau" );
           
    }

}
