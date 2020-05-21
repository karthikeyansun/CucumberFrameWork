$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/ExpressionExample.feature");
formatter.feature({
  "line": 1,
  "name": "Regular expression example",
  "description": "",
  "id": "regular-expression-example",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "regular expression",
  "description": "",
  "id": "regular-expression-example;regular-expression",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "i have 1 laptop",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "i have a 7.5 GPA",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"Arya\" is elder to \"Agni\" and \"Riya\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "RegularExpressionExampleDefinitions.i_have_laptop(int)"
});
formatter.result({
  "duration": 179798100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7.5",
      "offset": 9
    }
  ],
  "location": "RegularExpressionExampleDefinitions.i_have_a_GPA(float)"
});
formatter.result({
  "duration": 1371500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arya",
      "offset": 1
    },
    {
      "val": "Agni",
      "offset": 20
    },
    {
      "val": "Riya",
      "offset": 31
    }
  ],
  "location": "RegularExpressionExampleDefinitions.is_elder_to_and(String,String,String)"
});
formatter.result({
  "duration": 1560000,
  "status": "passed"
});
});