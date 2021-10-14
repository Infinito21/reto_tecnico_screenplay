# Author: Jackier David Buelvas Julio
# language:en
  @stories
  Feature: uTest
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Sign up for uTest
  Given than brandon wants to register in uTest
  When Make registration form in Utest
    | firtName      | lastName      | email                     | optMonth | optDay    | optYear     | zip    | password   |
    | Jackier David | Buelvas Julio | jbuelvasjulio23@gmail.com | number:1 | number:23 | number:1997 | 706010 | 123AA123aa |
  Then confirmation of successful registration
    | verification                         |
    | First, please check your email inbox |

