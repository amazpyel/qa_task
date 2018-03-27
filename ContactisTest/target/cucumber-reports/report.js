$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Contact form",
  "description": "Description: The purpose of this feature is to test contact form",
  "id": "contact-form",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Customer opens contact form",
  "description": "",
  "id": "contact-form;customer-opens-contact-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he goes to Contact Page he sees name field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "he sees phone field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "he sees email field",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 12421733374,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageSteps.user_sees_name_field()"
});
formatter.result({
  "duration": 75925998,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageSteps.user_sees_phone_number_field()"
});
formatter.result({
  "duration": 42845209,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageSteps.user_sees_email_field()"
});
formatter.result({
  "duration": 36718482,
  "status": "passed"
});
formatter.after({
  "duration": 2840468248,
  "status": "passed"
});
});