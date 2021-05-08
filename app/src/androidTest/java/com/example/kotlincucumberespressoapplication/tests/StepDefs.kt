package com.example.kotlincucumberespressoapplication.tests

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.kotlincucumberespressoapplication.MainActivity
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StepDefs {

    @get:Rule
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java, true, false)


    @Given("User opened app")
    fun opened() {
        activityRule.launchActivity(Intent())

        onView(isRoot())
    }

    @When("User presses button")
    fun buttonPressed() {

    }
}