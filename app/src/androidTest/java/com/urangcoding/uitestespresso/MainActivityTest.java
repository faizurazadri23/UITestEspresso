package com.urangcoding.uitestespresso;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    private final String dummyAlas = "7";
    private final String dummyTinggi = "4";
    private final String fieldEmpty = "Alas Wajib diisi";

    @Before
    public void setup() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void assertLuas(){
        onView(withId(R.id.input_alas)).perform(typeText(dummyAlas), closeSoftKeyboard());
        onView(withId(R.id.input_tinggi)).perform(typeText(dummyTinggi), closeSoftKeyboard());

        onView(withId(R.id.btn_submit)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_submit)).perform(click());

        onView(withId(R.id.hasil)).check(matches(isDisplayed()));

    }
}