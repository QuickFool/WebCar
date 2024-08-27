package web.models;

public class Car {

    private String models;

    private String series;

    private String price;

    public Car(String models, String series, String price) {
        this.models = models;
        this.series = series;
        this.price = price;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("models='").append(models).append('\'');
        sb.append(", series='").append(series).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
