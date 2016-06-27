package com.epicodus.madlibs;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class GameActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

//
//    @Test
//    public void validateUserInput() {
//        onView(withId(R.id.startGameButton)).perform(click());
//        onView(withId(R.id.noun)).perform(typeText("dog"))
//                .check(matches(withText("dog")));
//        onView(withId(R.id.adjective)).perform(typeText("hot"))
//                .check(matches(withText("hot")));
//        onView(withId(R.id.verb)).perform(typeText("swim"))
//                .check(matches(withText("swim")));
//
//    }

    @Test
    public void resultPage() {
        onView(withId(R.id.startGameButton)).perform(click());
        onView(withId(R.id.noun)).perform(typeText("dog"))
                .check(matches(withText("dog")));
        onView(withId(R.id.adjective)).perform(typeText("hot"))
                .check(matches(withText("hot")));
        onView(withId(R.id.verb)).perform(typeText("swim"))
                .check(matches(withText("swim")));
        onView(withId(R.id.playButton)).perform(click());
        String noun = "dog";
        String verb = "swim";
        String adjective = "hot";

        onView(withId(R.id.results)).check(matches
                (withText("I think you are " + adjective + " and I " + verb + " you a lot with " + noun + "!")));
    }

}
