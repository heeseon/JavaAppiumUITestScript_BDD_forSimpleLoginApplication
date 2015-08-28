$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Valid Login",
  "description": "",
  "id": "valid-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6764317460,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Passing valid credentials and log in into the application",
  "description": "",
  "id": "valid-login;passing-valid-credentials-and-log-in-into-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter id as \"domich\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password as \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the success message \"Logined\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_am_on_the_landing_page()"
});
formatter.result({
  "duration": 1063454577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "domich",
      "offset": 15
    }
  ],
  "location": "LoginSteps.I_enter_id_as(String)"
});
formatter.result({
  "duration": 6839784891,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 21
    }
  ],
  "location": "LoginSteps.I_enter_password_as(String)"
});
formatter.result({
  "duration": 6768083297,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_click_login_button()"
});
formatter.result({
  "duration": 382815223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logined",
      "offset": 34
    }
  ],
  "location": "LoginSteps.I_should_see_the_success_message(String)"
});
formatter.result({
  "duration": 1041164682,
  "status": "passed"
});
formatter.after({
  "duration": 811684793,
  "status": "passed"
});
});