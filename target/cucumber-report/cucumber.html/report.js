$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/wcht/org/resources/featurefile/AboutUs.feature");
formatter.feature({
  "line": 2,
  "name": "About Us functionality",
  "description": "As a user I want to visit www.wcht.org.uk website",
  "id": "about-us-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AboutUs"
    }
  ]
});
formatter.before({
  "duration": 52721787600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to abous us page successfully",
  "description": "",
  "id": "about-us-functionality;user-should-navigate-to-abous-us-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on close button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on about us link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to abous us page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AboutUsTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 97309800,
  "status": "passed"
});
formatter.match({
  "location": "HomeTestSteps.iClickOnCloseButton()"
});
formatter.result({
  "duration": 303306300,
  "status": "passed"
});
formatter.match({
  "location": "AboutUsTestSteps.iClickOnAboutUsLink()"
});
formatter.result({
  "duration": 1304796400,
  "status": "passed"
});
formatter.match({
  "location": "AboutUsTestSteps.iShouldNavigateToAbousUsPageSuccessfully()"
});
formatter.result({
  "duration": 44601600,
  "status": "passed"
});
formatter.after({
  "duration": 684940900,
  "status": "passed"
});
formatter.before({
  "duration": 46372518300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should navigate to jobs and careers page successfully",
  "description": "",
  "id": "about-us-functionality;user-should-navigate-to-jobs-and-careers-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on close button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on about us link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on jobs and careers link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should navigate to jobs and careers page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AboutUsTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 26800,
  "status": "passed"
});
formatter.match({
  "location": "HomeTestSteps.iClickOnCloseButton()"
});
formatter.result({
  "duration": 293080900,
  "status": "passed"
});
formatter.match({
  "location": "AboutUsTestSteps.iClickOnAboutUsLink()"
});
formatter.result({
  "duration": 1507392400,
  "status": "passed"
});
formatter.match({
  "location": "AboutUsTestSteps.iClickOnJobsAndCareersLink()"
});
formatter.result({
  "duration": 10615067100,
  "status": "passed"
});
formatter.match({
  "location": "AboutUsTestSteps.iShouldNavigateToJobsAndCareersPageSuccessfully()"
});
formatter.result({
  "duration": 49033300,
  "status": "passed"
});
formatter.after({
  "duration": 698103000,
  "status": "passed"
});
});