package kononikhin.Service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {

    public String getFortuneMessage() {

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Heavy traffic now!";
    }

    public String getForuneOld() {
       return getFortuneMessage();
    }


    public String getFortune(boolean academicBoolean) {

        if (academicBoolean) {
            throw new RuntimeException("This is an academic exception!");
        }

        return getFortuneMessage();

    }
}
