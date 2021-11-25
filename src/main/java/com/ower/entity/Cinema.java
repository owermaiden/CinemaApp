package com.ower.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cinema extends BaseEntity{

    private String name;
    private String sponsorName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;

    // Adding @OnetoMany is not a best practice... We have to drop the table with mappedBy.. anyway.. So there is no need...


}
