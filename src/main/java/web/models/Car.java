package web.models;

public class Car {

    private String models;

    private String series;

    private int price;

    public Car(String models) {
        this.models = models;
    }

    public Car(String models, String series, int price) {
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
