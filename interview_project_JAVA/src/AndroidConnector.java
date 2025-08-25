package src;

/**
 * This class provides methods for interacting with a fake Android device.
 * This class works as expected and does not need to be updated.
 */
public class AndroidConnector {
    private String deviceDsn;

    public AndroidConnector(String deviceDsn) {
        this.deviceDsn = deviceDsn;
    }

    public void clickElement(String locatorType, String locatorValue) {
        System.out.printf("\tSuccessfully clicked on element with locatorType: %s and value: %s\n", locatorType, locatorValue);
    }

    public boolean checkElementPresence(String locatorType, String locatorValue) {
        System.out.printf("\tFound an element with locatorType: %s and value: %s\n", locatorType, locatorValue);
        return true;
    }

    public String getTextFromAppVersionElement(String locatorType, String locatorValue) {
        System.out.printf("\tExtracting app version text from element with locatorType: %s and value: %s\n", locatorType, locatorValue);
        if ("ID".equals(locatorType) && "app_version_element_id".equals(locatorValue)) {
            return "1.6.41rc" + deviceDsn.charAt(deviceDsn.length() - 1);
        } else {
            throw new IllegalArgumentException("Unsupported locator for getting app version text");
        }
    }
}
