package com.donas.pitila.core.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Localizacao {

    private Double latitude;
    private Double longitude;

    public Localizacao() {
    }

    public Localizacao(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
