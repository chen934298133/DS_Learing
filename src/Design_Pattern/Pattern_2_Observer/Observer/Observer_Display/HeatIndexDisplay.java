package Design_Pattern.Pattern_2_Observer.Observer.Observer_Display;

import Design_Pattern.Pattern_2_Observer.Observer.DisplayElement.DisplayElement;
import Design_Pattern.Pattern_2_Observer.Observer.Observer.Observer;
import Design_Pattern.Pattern_2_Observer.Observer.Subject.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex;
    private Subject subject;

    public HeatIndexDisplay(Subject weatherData){
        this.subject = weatherData;
        weatherData.registerObserver(this);
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    public void show(float t, float rh){
        System.out.println("Heat index is " + computeHeatIndex(t, rh));
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }
}
