Narrative:
In order to know delivery costs
As a unregister user
I want to register in system to order the product and find out how much is delivery costs

Scenario: 	Order the products less than 1500 uah
Given home page http://rozetka.com.ua/
And the user has entered login, password
And the user choose item
When user buy item, that costs less then 1500 uah
Then delivery will cost:
|message|
|бесплатно|

Scenario: 	Order the products more or equal than 1500 uah
Given home page http://rozetka.com.ua/
And the user has entered login, password
And the user choose item with price more then or equal 1500 uah
When user buy item, that costs more or equal than 1500 uah
Then delivery will cost:
|message|
|бесплатно|

Scenario: 	Order the products more or equal than 20000 uah
Given home page http://rozetka.com.ua/
And the user has entered login, password
And the user choose item with price more then or equal 20000 uah
When user buy item, that costs more or equal than 20000 uah
Then delivery will cost:
|message|
|бесплатно|
And we also have free gift

