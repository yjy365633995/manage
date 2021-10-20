package org.nari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProcurementBiddingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcurementBiddingApplication.class);
    }
}
