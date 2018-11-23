$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/feature/demo.feature");
formatter.feature({
  "line": 1,
  "name": "Write Shopping Review",
  "description": "",
  "id": "write-shopping-review",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4878695366,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I\u0027ve a valid set of data and access",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDemo.ValidUserCheck()"
});
formatter.result({
  "duration": 215092425,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Shopping Write Review Process",
  "description": "",
  "id": "write-shopping-review;shopping-write-review-process",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@ShoppingWriteReview"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Home page Display",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter Shopping Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select Brands Category",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Select Acteon Category",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select Prduct named RISKONTROL Adapter LU INOX",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click Write a Review",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter Valid Data",
  "rows": [
    {
      "cells": [
        "Name",
        "aditya"
      ],
      "line": 15
    },
    {
      "cells": [
        "Email",
        "add@add.com"
      ],
      "line": 16
    },
    {
      "cells": [
        "Location",
        "Acukland"
      ],
      "line": 17
    },
    {
      "cells": [
        "Title",
        "Doctor"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click Submit",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDemo.registrationDisplay()"
});
formatter.result({
  "duration": 9640988313,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.EnterShoppingPage()"
});
formatter.result({
  "duration": 3947821800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.SelectBrandsCategory()"
});
formatter.result({
  "duration": 2873672158,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.SelectActeonCategory()"
});
formatter.result({
  "duration": 2660338621,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.SelectProduct()"
});
formatter.result({
  "duration": 1610042215,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.click_WriteReview()"
});
formatter.result({
  "duration": 303742380,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.enterValidData(DataTable)"
});
formatter.result({
  "duration": 923786435,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.click_Submit()"
});
formatter.result({
  "duration": 109154174,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionDemo.close()"
});
formatter.result({
  "duration": 98707,
  "status": "passed"
});
formatter.write("Finishied scenario");
formatter.after({
  "duration": 2760626398,
  "status": "passed"
});
});