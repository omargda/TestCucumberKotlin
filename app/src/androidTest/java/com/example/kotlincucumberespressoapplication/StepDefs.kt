package com.example.kotlincucumberespressoapplication

import android.content.Context
import android.media.AudioManager
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.cucumber.gherkin.Main
import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import org.junit.Rule
import org.junit.runner.RunWith

class StepDefs {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(
        MainActivity::class.java
    )

    private lateinit var audioManager: AudioManager

    @io.cucumber.java.Before
    fun setUp() {
        ActivityScenarioRule(
            MainActivity::class.java
        ).scenario.onActivity { activity: MainActivity? ->
            if (activity != null) {
                audioManager = activity.getSystemService(Context.AUDIO_SERVICE) as AudioManager
            }
        }
    }

    @Given("User opened app")
    fun opened() {
        onView(isRoot())
    }

    @When("User presses button")
    fun buttonPressed() {

    }
}