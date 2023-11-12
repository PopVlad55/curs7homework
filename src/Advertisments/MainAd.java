package Advertisments;

public class MainAd {
    public static void main(String[] args) {
        Advertisment facebookAd = new FacebookAd();
        Advertisment emailAd = new EmailAd();
        Advertisment printAd = new PrintAd();

        facebookAd.show();
        emailAd.show();
        printAd.show();
    }
}
