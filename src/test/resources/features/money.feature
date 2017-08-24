Feature: use ATM get money
Scenario Outline: solid money
 Given accountBalance "<accountBalance>" yuan
 When takeOut "<withdrawAmount>" yuan
 Then receivedAmount "<receivedAmount>" yuan
 And remainingBalance "<remainingBalance>" yuan
 Examples:
 | accountBalance | withdrawAmount | receivedAmount | remainingBalance |
 | 1100 | 100 | 100 | 1000 |
 | 500 | 500 | 500 | 0 |
