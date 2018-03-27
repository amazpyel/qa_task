Feature: Contact form
Description: The purpose of this feature is to test contact form

Scenario: Customer opens contact form
    Given user is on Home Page
    When he goes to Contact Page he sees name field
    And he sees phone field
    And he sees email field