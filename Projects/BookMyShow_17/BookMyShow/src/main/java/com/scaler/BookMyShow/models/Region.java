package com.scaler.BookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Region extends BaseModel{
    private String name;
}
