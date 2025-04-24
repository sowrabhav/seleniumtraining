
#java -Dwebdriver.gecko.driver="/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/drivers/geckodriver" \
#     -jar "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/drivers/selenium-server-standalone-3.141.0.jar" \
#     -role node \
#     -hub http://localhost:4444/grid/register


     java -Dwebdriver.gecko.driver="$(pwd)/../drivers/geckodriver" \
          -Dwebdriver.chrome.driver="$(pwd)/../drivers/chromedriver" \
          -Dwebdriver.ie.driver="$(pwd)/../drivers/IEDriverServer.exe" \
          -Dwebdriver.edge.driver="$(pwd)/../drivers/msedgedriver" \
          -jar "$(pwd)/../drivers/selenium-server-standalone-3.141.0.jar" \
          -role node \
          -hub http://localhost:4444/grid/register
