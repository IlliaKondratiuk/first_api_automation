package data;

public enum Curr {
    EUR("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=EUR&json"),
    USD("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD&json"),
    CAD("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=CAD&json");

    final String link;
    Curr(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }
}
