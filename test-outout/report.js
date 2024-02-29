$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactCredentials.feature");
formatter.feature({
  "line": 3,
  "name": "ContactCredentials",
  "description": "",
  "id": "contactcredentials",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Validate whether user is able to fill contact us form for website section",
  "description": "",
  "id": "contactcredentials;validate-whether-user-is-able-to-fill-contact-us-form-for-website-section",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Regression_TC_01"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Application Home Page \"\u003cTcNo\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Application Page Tittle is Property Management Software \"\u003cTcNo\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Sign In button \"\u003cTcNo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Residents Login button \"\u003cTcNo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is directed to Resident portal page \"\u003cTcNo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on view the website button \"\u003cTcNo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user fills the contact us form \"\u003cTcNo\u003e\" \"\u003cname\u003e\" \"\u003cemail\u003e\" \"\u003cpropertyname\u003e\" \"\u003cpropertyURL\u003e\" \"\u003ccategory\u003e\" \"\u003cMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "contactcredentials;validate-whether-user-is-able-to-fill-contact-us-form-for-website-section;",
  "rows": [
    {
      "cells": [
        "TcNo",
        "name",
        "email",
        "propertyname",
        "propertyURL",
        "category",
        "Message"
      ],
      "line": 17,
      "id": "contactcredentials;validate-whether-user-is-able-to-fill-contact-us-form-for-website-section;;1"
    },
    {
      "cells": [
        "Regression_TC_01",
        "standard_user",
        "standarduser@gmail.com",
        "testproperty",
        "testproperty.com",
        "Design",
        "GoodDesign"
      ],
      "line": 18,
      "id": "contactcredentials;validate-whether-user-is-able-to-fill-contact-us-form-for-website-section;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Validate whether user is able to fill contact us form for website section",
  "description": "",
  "id": "contactcredentials;validate-whether-user-is-able-to-fill-contact-us-form-for-website-section;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Regression_TC_01"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Application Home Page \"Regression_TC_01\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Application Page Tittle is Property Management Software \"Regression_TC_01\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Sign In button \"Regression_TC_01\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Residents Login button \"Regression_TC_01\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is directed to Resident portal page \"Regression_TC_01\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on view the website button \"Regression_TC_01\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user fills the contact us form \"Regression_TC_01\" \"standard_user\" \"standarduser@gmail.com\" \"testproperty\" \"testproperty.com\" \"Design\" \"GoodDesign\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_01",
      "offset": 34
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_is_on_Application_Home_Page(String)"
});
formatter.result({
  "duration": 23093902300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_01",
      "offset": 57
    }
  ],
  "location": "ContactCredentialsStepDefinition.application_Page_Tittle_is_Property_Management_Software(String)"
});
formatter.result({
  "duration": 29242000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_01",
      "offset": 31
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_clicks_on_Sign_In_button(String)"
});
formatter.result({
  "duration": 6991895600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_01",
      "offset": 39
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_clicks_on_Residents_Login_button(String)"
});
formatter.result({
  "duration": 34593009700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_01",
      "offset": 42
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_is_directed_to_Resident_portal_page(String)"
});
formatter.result({
  "duration": 14036000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_01",
      "offset": 40
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_clicks_on_view_the_website_button(String)"
});
formatter.result({
  "duration": 228623800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_01",
      "offset": 32
    },
    {
      "val": "standard_user",
      "offset": 51
    },
    {
      "val": "standarduser@gmail.com",
      "offset": 67
    },
    {
      "val": "testproperty",
      "offset": 92
    },
    {
      "val": "testproperty.com",
      "offset": 107
    },
    {
      "val": "Design",
      "offset": 126
    },
    {
      "val": "GoodDesign",
      "offset": 135
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_fills_the_contact_us_form(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1802995400,
  "status": "passed"
});
});