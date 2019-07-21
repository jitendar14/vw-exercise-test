
  Background:
    Given user is on the LandingPage

    Scenario Outline: Verify the retailers that have services-available are only displayed when user searches for a retailer based on their
    location & Search is being performed with no services selected

    When User navigate to retailer page
    Then User should see that Search by location field is available
    When user search for a retailer based on the "<location>"
    Then User should see the only retailers that have the 'services available' are displayed

      | Available services  |
    And Users verifies the list of 'Available Services'
       | New cars         |
       |Userd cars        |
       |Motability        |
       |MOT               |
       |Local Business    |

    Examples:
      |Location  |
      |Dagenham  |


