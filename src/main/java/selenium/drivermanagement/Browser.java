package selenium.drivermanagement;

public enum Browser {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    SAFARI("safari"),
    OPERA("opera");

    private final String browserName;

    Browser(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }

    public static Browser fromString(String browserName) {
        for (Browser browser : Browser.values()) {
            if (browser.browserName.equalsIgnoreCase(browserName)) {
                return browser;
            }
        }
        throw new IllegalArgumentException("No enum constant " + Browser.class.getCanonicalName() + "." + browserName);
    }
}
