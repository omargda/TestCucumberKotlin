package com.example.kotlincucumberespressoapplication.tests


import cucumber.api.CucumberOptions
import cucumber.api.android.CucumberAndroidJUnitRunner

@CucumberOptions(glue =["com.example.kotlincucumberespressoapplication.tests"], features = ["features"])
public class RunCucumberTest : CucumberAndroidJUnitRunner()