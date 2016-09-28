package com.example.pacewisdom.myapplication;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by pacewisdom on 28/9/16.
 */
@Config(emulateSdk = 18,reportSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class UserTest {
  @Test
    public void UsernameTest(){
      User user=new User();
      user.setName("foo");
      Assert.assertEquals("foo",user.getName());
  }

}
