Feature: Book an appointment in Openmrs

Scenario Outline: Login into Openmrs page with valid and invalid credentials

Given user launch Chrome browser
When user opens Url "https://qa-refapp.openmrs.org/openmrs/login.htm"
And user enter the username in the "<username>" in the email field
And user enter the password in the "<password>" in the password field
And user click inpatient ward
And user click login button
Then user can view Dashboard page

Examples:

|username|password|
|A|12345|
|B|2345|
|Admin|Admin123|

Scenario: Register a patient details

Given user click Register to enter details
When user enter firstname in the given field
And user click familyname to enter family name 
And user enter family name in the family name field
And user click arrow button to navigate to next page
And User select gender
And user click arrow button to go next page 
And user enter birthdate in the date field
And user select birthmonth using dropdown
And user click birthyear button
And user enter birthyear in the year field
And user click arrow button
And user click country name to enter country name
And user enter country name
And user click arrow button to go next page
And click phonenumber button
And enter phonenumber
And user click arrow button to navigate to next page
And user click arrow button to navigate to next page
And user click submit to confirm
Then user verify patient details registered or not

Scenario: Capture patinent vitals

Given user click start visit to enter vitals details
When user click confirm button using alert
And user click capture vitals menu
And user enter heigth
And user click arrow button to navigate to next page
And user click weight button
And user enter weight in the field
And user click arrow button to navigate to next page
And user click arrow button to navigate to next page
And user click temp to enter temperature
And user enter temp in the field
And user click arrow button to navigate to next page
And user click pulse to enter pulse
And user enter pulse in the field
And user click arrow button to navigate to next page
And user click arrow button to navigate to next page
And user click blood pres min to enter level
And user enter min blood pressure
And user click high blood pres button enter blood pres
And user enter high blood pres level
And user click arrow button to navigate to next page
And user click arrow button to navigate to next page
And user click save form button
And user click save button to save the details
And user click patientname to check the deatils
Then user verify patient medical details registered or not

Scenario: Delete patient details and logout

Given user click delete patient
When user write reason for delete
And user click confirm button to delete
When user click patient details to delete
And user click logout button
