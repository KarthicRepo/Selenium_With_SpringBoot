package com.karthi.seleniumspring.alltests.flight;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = "app.locale=en")  // where app.locale is defined in the FlightApp Bean,
public class FlightTest_EN extends FlightTest {
}
