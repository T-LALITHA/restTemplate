package com.ssd.resttemplate.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;


@Data
public class Root {

    private String city;
    private String date;
    private String eliminator;
    private Long id;
    private String method;
    private String neutralVenue;
    private String playerOfMatch;
    private String result;
    private Integer resultMargin;
    private String team1;
    private String team2;
    private String tossDecision;
    private String tossWinner;
    private String umpire1;
    private String umpire2;
    private String venue;
    private String winner;


}
