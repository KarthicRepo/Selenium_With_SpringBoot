$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/search.feature");
formatter.feature({
  "name": "Google Search feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "I want to search on google search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the google page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003ckeyword\u003e\" as a keyword",
  "keyword": "When "
});
formatter.step({
  "name": "I should be on the search result page",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see at least \u003cresultCount\u003e results",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword",
        "resultCount"
      ]
    },
    {
      "cells": [
        "Selenium",
        "2"
      ]
    },
    {
      "cells": [
        "Java",
        "5"
      ]
    },
    {
      "cells": [
        "Spring",
        "7"
      ]
    },
    {
      "cells": [
        "Golang",
        "6"
      ]
    }
  ]
});
formatter.scenario({
  "name": "I want to search on google search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iAmOnTheGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Selenium\" as a keyword",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iEnterAsAKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the search result page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iClickOnTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see at least 2 results",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iShouldSeeAtLeastResults(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to search on google search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iAmOnTheGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Java\" as a keyword",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iEnterAsAKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the search result page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iClickOnTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see at least 5 results",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iShouldSeeAtLeastResults(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to search on google search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iAmOnTheGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Spring\" as a keyword",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iEnterAsAKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the search result page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iClickOnTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see at least 7 results",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iShouldSeeAtLeastResults(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to search on google search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iAmOnTheGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Golang\" as a keyword",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iEnterAsAKeyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the search result page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iClickOnTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see at least 6 results",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.GoogleSearchDefn.iShouldSeeAtLeastResults(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("classpath:features/visa_registration.feature");
formatter.feature({
  "name": "verify visa registration feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Register users for visa using the provided data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the VISA registration form",
  "keyword": "Given "
});
formatter.step({
  "name": "I select my country \"\u003cfromCountry\u003e\" and to country \"\u003ctoCountry\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I enter my dob as \"\u003cdateOfBirth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter my name as \"\u003cfirsName\u003e\" and \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter my contact details as \"\u003cemail\u003e\" and \"\u003cphone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter comments as \"\u003ccomments\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I submit the form",
  "keyword": "And "
});
formatter.step({
  "name": "I should see the confirmation number",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Scenarios",
  "rows": [
    {
      "cells": [
        "fromCountry",
        "toCountry",
        "dateOfBirth",
        "firsName",
        "lastName",
        "email",
        "phone",
        "comments"
      ]
    },
    {
      "cells": [
        "Isle of Man",
        "Mali",
        "2011-05-31",
        "Kraig",
        "Wiza",
        "Kraig@nobody.com",
        "1-000-884-1373",
        "comment1"
      ]
    },
    {
      "cells": [
        "Lithuania",
        "Mexico",
        "2001-01-01",
        "Houston",
        "Kertzmann",
        "Houston@nobody.com",
        "284.864.6580",
        ""
      ]
    },
    {
      "cells": [
        "Somalia",
        "Greece",
        "2004-07-02",
        "Ruthie",
        "Stamm",
        "Ruthie@nobody.com",
        "1-209-813-9712",
        "comment2"
      ]
    },
    {
      "cells": [
        "Christmas Island",
        "French Southern Territories",
        "2019-04-05",
        "Shonna",
        "Nolan",
        "Shonna@nobody.com",
        "(162) 387-0305",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register users for visa using the provided data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the VISA registration form",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iAmOnTheVISARegistrationForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I select my country \"Isle of Man\" and to country \"Mali\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSelectMyCountryAndToCountry(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my dob as \"2011-05-31\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyDobAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my name as \"Kraig\" and \"Wiza\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyNameAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my contact details as \"Kraig@nobody.com\" and \"1-000-884-1373\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyContactDetailsAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter comments as \"comment1\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterCommentsAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I submit the form",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSubmitTheForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see the confirmation number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iShouldSeeTheConfirmationNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Register users for visa using the provided data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the VISA registration form",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iAmOnTheVISARegistrationForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I select my country \"Lithuania\" and to country \"Mexico\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSelectMyCountryAndToCountry(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my dob as \"2001-01-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyDobAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my name as \"Houston\" and \"Kertzmann\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyNameAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my contact details as \"Houston@nobody.com\" and \"284.864.6580\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyContactDetailsAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter comments as \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterCommentsAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I submit the form",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSubmitTheForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see the confirmation number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iShouldSeeTheConfirmationNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Register users for visa using the provided data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the VISA registration form",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iAmOnTheVISARegistrationForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I select my country \"Somalia\" and to country \"Greece\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSelectMyCountryAndToCountry(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my dob as \"2004-07-02\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyDobAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my name as \"Ruthie\" and \"Stamm\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyNameAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my contact details as \"Ruthie@nobody.com\" and \"1-209-813-9712\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyContactDetailsAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter comments as \"comment2\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterCommentsAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I submit the form",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSubmitTheForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see the confirmation number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iShouldSeeTheConfirmationNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Register users for visa using the provided data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the VISA registration form",
  "keyword": "Given "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iAmOnTheVISARegistrationForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I select my country \"Christmas Island\" and to country \"French Southern Territories\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSelectMyCountryAndToCountry(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my dob as \"2019-04-05\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyDobAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my name as \"Shonna\" and \"Nolan\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyNameAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter my contact details as \"Shonna@nobody.com\" and \"(162) 387-0305\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterMyContactDetailsAsAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter comments as \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iEnterCommentsAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I submit the form",
  "keyword": "And "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iSubmitTheForm()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should see the confirmation number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.karthi.seleniumspring.alltests.bdd.stepdefns.VisaRegisterStepDefn.iShouldSeeTheConfirmationNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});