package com.xtremelabs.droidsugar.fakes;

import android.view.ViewGroup;
import android.widget.Gallery;
import com.xtremelabs.droidsugar.DroidSugarAndroidTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(DroidSugarAndroidTestRunner.class)
public class LayoutParamsTest {
    @Test
    public void testConstructor() throws Exception {
        DroidSugarAndroidTestRunner.addProxy(ViewGroup.LayoutParams.class, FakeLayoutParams.class);

        Gallery.LayoutParams layoutParams = new Gallery.LayoutParams(123, 456);
        assertThat(layoutParams.width, equalTo(123));
        assertThat(layoutParams.height, equalTo(456));
    }
}