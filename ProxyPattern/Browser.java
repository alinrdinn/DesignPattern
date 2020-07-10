package ProxyPattern;

import java.util.Scanner;

public class Browser {

    /**
     * Send a request to ISP
     *
     * @param site
     */
    public void sendRequest() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the site URL: ");
        String site = scnr.next();
        String response = this.getInternetProvider().getResource(site);
        this.loadResponse(response);
    }

    private void loadResponse(String response) {
        System.out.println(response);
    }

    private ISP getInternetProvider() {
        return new NetworkSettings().getInternet();
    }
}
